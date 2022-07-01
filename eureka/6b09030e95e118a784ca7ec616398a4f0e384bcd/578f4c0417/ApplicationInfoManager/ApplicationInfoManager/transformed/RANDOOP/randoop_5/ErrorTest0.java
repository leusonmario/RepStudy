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
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.add("", "/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder0.setStatusPageUrl("172.20.26.3", "");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig2 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int3 = myDataCenterInstanceConfig2.getLeaseExpirationDurationInSeconds();
        java.lang.String str4 = myDataCenterInstanceConfig2.getNamespace();
        java.lang.String str5 = myDataCenterInstanceConfig2.getStatusPageUrl();
        boolean boolean6 = myDataCenterInstanceConfig2.isNonSecurePortEnabled();
        applicationInfoManager0.config = myDataCenterInstanceConfig2;
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus8 = com.netflix.appinfo.InstanceInfo.InstanceStatus.STARTING;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.setInstanceStatus(instanceStatus8);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setIPAddr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setHomePageUrl("/Status", "/");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = com.netflix.appinfo.ApplicationInfoManager.instance;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.refreshDataCenterInfoIfRequired();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.setHomePageUrl("inesserver2.windows.cin.ufpe.br", "/healthcheck");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        java.lang.String[] strArray1 = new java.lang.String[] { "172.20.26.3" };
        com.netflix.appinfo.InstanceInfo.Builder builder2 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo9 = builder4.getRawInstance();
        instanceInfo9.setLastUpdatedTimestamp();
        com.netflix.appinfo.InstanceInfo instanceInfo11 = new com.netflix.appinfo.InstanceInfo(instanceInfo9);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus12 = instanceInfo9.getStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo9);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        com.netflix.appinfo.InstanceInfo.Builder builder1 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder3 = builder1.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder3.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder3.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo8 = builder3.getRawInstance();
        instanceInfo8.setIsDirty();
        instanceInfo8.setIsDirty(false);
        boolean boolean12 = instanceInfo8.isDirty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = com.netflix.appinfo.InstanceInfo.getZone(strArray0, instanceInfo8);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setCountryId((int) '#');
        com.netflix.appinfo.InstanceInfo.Builder builder9 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType16 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setActionType(actionType16);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder6.setActionType(actionType16);
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setVIPAddress("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder18.setSecureVIPAddress("/healthcheck");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder22.setHomePageUrl("172.20.26.3", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder3 = builder0.setHealthCheckUrlsForDeser("/healthcheck", "HI!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder3.setHomePageUrl("hi!", "/healthcheck");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.InstanceInfo.Builder builder1 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder3 = builder1.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder3.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder3.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo8 = builder3.getRawInstance();
        int int9 = instanceInfo8.getPort();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = instanceInfo8.getMetadata();
        java.lang.String str11 = instanceInfo8.getId();
        com.netflix.appinfo.InstanceInfo.ActionType actionType12 = com.netflix.appinfo.InstanceInfo.ActionType.ADDED;
        instanceInfo8.setActionType(actionType12);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = instanceInfo8.getMetadata();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.registerAppMetadata(strMap14);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.add("", "/");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setLastUpdatedTimestamp((long) (short) 10);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus15 = com.netflix.appinfo.InstanceInfo.InstanceStatus.OUT_OF_SERVICE;
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setOverriddenStatus(instanceStatus15);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder0.setOverriddenStatus(instanceStatus15);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder0.setIsCoordinatingDiscoveryServer(true);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setSecureVIPAddress("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder19.setHealthCheckUrls("na", "na", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setVIPAddressDeser("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.MODIFIED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setActionType(actionType5);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setSecureVIPAddressDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setNamespace("unknown");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder10.setStatusPageUrl("", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setCountryId((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder8.setHomePageUrl("unknown", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        boolean boolean7 = builder2.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder8 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder10.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo15 = builder10.getRawInstance();
        instanceInfo15.setLastUpdatedTimestamp();
        com.netflix.appinfo.InstanceInfo instanceInfo17 = new com.netflix.appinfo.InstanceInfo(instanceInfo15);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus18 = instanceInfo15.getStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder2.setOverriddenStatus(instanceStatus18);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setPort(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder19.setHomePageUrl("172.20.26.3", "/");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setASGName("");
        boolean boolean14 = builder9.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder15 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder17.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo22 = builder17.getRawInstance();
        instanceInfo22.setLastUpdatedTimestamp();
        com.netflix.appinfo.InstanceInfo instanceInfo24 = new com.netflix.appinfo.InstanceInfo(instanceInfo22);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus25 = instanceInfo22.getStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder9.setOverriddenStatus(instanceStatus25);
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder4.setStatus(instanceStatus25);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus28 = com.netflix.appinfo.InstanceInfo.InstanceStatus.OUT_OF_SERVICE;
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder27.setStatus(instanceStatus28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder29.setStatusPageUrl("hi!", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setASGName("");
        boolean boolean14 = builder9.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder15 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder17.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo22 = builder17.getRawInstance();
        instanceInfo22.setLastUpdatedTimestamp();
        com.netflix.appinfo.InstanceInfo instanceInfo24 = new com.netflix.appinfo.InstanceInfo(instanceInfo22);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus25 = instanceInfo22.getStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder9.setOverriddenStatus(instanceStatus25);
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder4.setStatus(instanceStatus25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder4.setStatusPageUrl("/Status", "HI!");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setIPAddr("/healthcheck");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder4.setHomePageUrl("inesserver2.windows.cin.ufpe.br", "/healthcheck");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.add("/", "hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder9.setOverriddenStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setVIPAddress("HI!");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder17.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo22 = builder17.getRawInstance();
        instanceInfo22.setIsDirty();
        int int24 = instanceInfo22.getPort();
        java.util.Set<java.lang.String> strSet25 = instanceInfo22.getHealthCheckUrls();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus26 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        instanceInfo22.setStatusWithoutDirty(instanceStatus26);
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder12.setOverriddenStatus(instanceStatus26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder31 = builder12.setHomePageUrl("unknown", "");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        boolean boolean7 = builder2.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder8 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder10.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo15 = builder10.getRawInstance();
        instanceInfo15.setLastUpdatedTimestamp();
        com.netflix.appinfo.InstanceInfo instanceInfo17 = new com.netflix.appinfo.InstanceInfo(instanceInfo15);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus18 = instanceInfo15.getStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder2.setOverriddenStatus(instanceStatus18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder2.setHealthCheckUrls("172.20.26.3", "HI!", "172.20.26.3");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig2 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int3 = myDataCenterInstanceConfig2.getLeaseExpirationDurationInSeconds();
        java.lang.String str4 = myDataCenterInstanceConfig2.getNamespace();
        java.lang.String str5 = myDataCenterInstanceConfig2.getStatusPageUrl();
        boolean boolean6 = myDataCenterInstanceConfig2.isNonSecurePortEnabled();
        applicationInfoManager0.config = myDataCenterInstanceConfig2;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.refreshDataCenterInfoIfRequired();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.add("/", "hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder9.setOverriddenStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setVIPAddress("HI!");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setVIPAddress("/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder16.setHomePageUrl("hi!", "172.20.26.3");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        java.lang.String[] strArray1 = new java.lang.String[] { "inesserver2.windows.cin.ufpe.br:80" };
        com.netflix.appinfo.InstanceInfo.Builder builder2 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.ActionType actionType7 = com.netflix.appinfo.InstanceInfo.ActionType.ADDED;
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setActionType(actionType7);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setAppName("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo11 = builder10.getRawInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo11);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder2.getRawInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder2.setHealthCheckUrls("172.20.26.3", "HI!", "/healthcheck");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setCountryId(0);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder2.setASGName("na");
        com.netflix.appinfo.InstanceInfo instanceInfo11 = builder10.getRawInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder10.setHealthCheckUrls("/", "inesserver2.windows.cin.ufpe.br:80", "");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setLastUpdatedTimestamp(10L);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setNamespace("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setLastDirtyTimestamp((long) 0);
        boolean boolean13 = builder10.isInitialized();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder10.setStatusPageUrl("na", "hi!");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        java.lang.String[] strArray6 = new java.lang.String[] { "HI!", "/healthcheck", "inesserver2.windows.cin.ufpe.br:80", "na", "hi!", "/healthcheck" };
        com.netflix.appinfo.InstanceInfo.Builder builder7 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder9.setCountryId(0);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder9.setASGName("na");
        com.netflix.appinfo.InstanceInfo instanceInfo18 = builder17.getRawInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = com.netflix.appinfo.InstanceInfo.getZone(strArray6, instanceInfo18);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setIPAddr("/healthcheck");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setHomePageUrl("inesserver2.windows.cin.ufpe.br", "/Status");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        java.lang.String[] strArray3 = new java.lang.String[] { "172.20.26.3", "na", "inesserver2.windows.cin.ufpe.br:80" };
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig5 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int6 = myDataCenterInstanceConfig5.getLeaseExpirationDurationInSeconds();
        java.lang.String str7 = myDataCenterInstanceConfig5.getIpAddress();
        java.lang.String str8 = myDataCenterInstanceConfig5.getStatusPageUrl();
        java.lang.String str10 = myDataCenterInstanceConfig5.getHostName(true);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager11 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig13 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int14 = myDataCenterInstanceConfig13.getLeaseExpirationDurationInSeconds();
        java.lang.String str15 = myDataCenterInstanceConfig13.getNamespace();
        java.lang.String str16 = myDataCenterInstanceConfig13.getStatusPageUrl();
        applicationInfoManager11.config = myDataCenterInstanceConfig13;
        com.netflix.appinfo.InstanceInfo.Builder builder18 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder20.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder20.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo25 = builder20.getRawInstance();
        instanceInfo25.setLastUpdatedTimestamp();
        com.netflix.appinfo.InstanceInfo instanceInfo27 = new com.netflix.appinfo.InstanceInfo(instanceInfo25);
        applicationInfoManager11.instanceInfo = instanceInfo25;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager29 = new com.netflix.appinfo.ApplicationInfoManager((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig5, instanceInfo25);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus30 = instanceInfo25.getOverriddenStatus();
        java.lang.String str31 = instanceInfo25.getHomePageUrl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str32 = com.netflix.appinfo.InstanceInfo.getZone(strArray3, instanceInfo25);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder2.setStatusPageUrl("HI!", "unknown");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.add("", "/");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setLastUpdatedTimestamp((long) (short) 10);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus15 = com.netflix.appinfo.InstanceInfo.InstanceStatus.OUT_OF_SERVICE;
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setOverriddenStatus(instanceStatus15);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder0.setOverriddenStatus(instanceStatus15);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder0.setIsCoordinatingDiscoveryServer(true);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setSecureVIPAddress("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder21.add("inesserver2.windows.cin.ufpe.br", "/healthcheck");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder21.setHomePageUrl("UNKNOWN", "UNKNOWN");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setSecurePort(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder6.setHomePageUrl("inesserver2.windows.cin.ufpe.br:80", "UNKNOWN");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.add("/", "hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder9.setOverriddenStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder9.setAppGroupName("inesserver2.windows.cin.ufpe.br:80");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder14.setHomePageUrl("/", "");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        java.lang.String[] strArray6 = new java.lang.String[] { "/healthcheck", "HI!", "", "hi!", "/Status", "/" };
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig8 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int9 = myDataCenterInstanceConfig8.getLeaseExpirationDurationInSeconds();
        java.lang.String str10 = myDataCenterInstanceConfig8.getIpAddress();
        java.lang.String str11 = myDataCenterInstanceConfig8.getStatusPageUrl();
        java.lang.String str13 = myDataCenterInstanceConfig8.getHostName(true);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager14 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig16 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int17 = myDataCenterInstanceConfig16.getLeaseExpirationDurationInSeconds();
        java.lang.String str18 = myDataCenterInstanceConfig16.getNamespace();
        java.lang.String str19 = myDataCenterInstanceConfig16.getStatusPageUrl();
        applicationInfoManager14.config = myDataCenterInstanceConfig16;
        com.netflix.appinfo.InstanceInfo.Builder builder21 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder23.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder23.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo28 = builder23.getRawInstance();
        instanceInfo28.setLastUpdatedTimestamp();
        com.netflix.appinfo.InstanceInfo instanceInfo30 = new com.netflix.appinfo.InstanceInfo(instanceInfo28);
        applicationInfoManager14.instanceInfo = instanceInfo28;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager32 = new com.netflix.appinfo.ApplicationInfoManager((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig8, instanceInfo28);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus33 = instanceInfo28.getOverriddenStatus();
        java.lang.String str34 = instanceInfo28.getHomePageUrl();
        com.netflix.appinfo.InstanceInfo.Builder builder35 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo28);
        com.netflix.appinfo.LeaseInfo leaseInfo36 = instanceInfo28.getLeaseInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str37 = com.netflix.appinfo.InstanceInfo.getZone(strArray6, instanceInfo28);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setStatusPageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setSecurePort(7001);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setIPAddr("172.20.26.3");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder12.setHomePageUrl("inesserver2.windows.cin.ufpe.br:80", "UNKNOWN");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastUpdatedTimestamp((long) (short) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setVIPAddress("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setAppName("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setSecurePort(7002);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setHealthCheckUrls("172.20.26.3", "/Status", "hi!");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setVIPAddressDeser("unknown");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder2.setHomePageUrl("/Status", "hi!");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager1 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig3 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int4 = myDataCenterInstanceConfig3.getLeaseExpirationDurationInSeconds();
        java.lang.String str5 = myDataCenterInstanceConfig3.getNamespace();
        java.lang.String str6 = myDataCenterInstanceConfig3.getStatusPageUrl();
        applicationInfoManager1.config = myDataCenterInstanceConfig3;
        com.netflix.appinfo.InstanceInfo.Builder builder8 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder10.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo15 = builder10.getRawInstance();
        instanceInfo15.setIsDirty();
        com.netflix.appinfo.InstanceInfo.ActionType actionType17 = instanceInfo15.getActionType();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager18 = new com.netflix.appinfo.ApplicationInfoManager((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig3, instanceInfo15);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder21.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo26 = builder21.getRawInstance();
        int int27 = instanceInfo26.getPort();
        java.util.Map<java.lang.String, java.lang.String> strMap28 = instanceInfo26.getMetadata();
        java.lang.String str29 = instanceInfo26.getId();
        com.netflix.appinfo.InstanceInfo.ActionType actionType30 = com.netflix.appinfo.InstanceInfo.ActionType.ADDED;
        instanceInfo26.setActionType(actionType30);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus32 = instanceInfo26.getStatus();
        applicationInfoManager18.setInstanceStatus(instanceStatus32);
        com.netflix.appinfo.InstanceInfo instanceInfo34 = applicationInfoManager18.getInfo();
        com.netflix.appinfo.InstanceInfo instanceInfo35 = applicationInfoManager18.getInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder36 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder38 = builder36.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder40 = builder38.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder42 = builder38.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo43 = builder38.getRawInstance();
        int int44 = instanceInfo43.getPort();
        java.util.Map<java.lang.String, java.lang.String> strMap45 = instanceInfo43.getMetadata();
        instanceInfo43.unsetIsDirty((long) 7002);
        java.lang.String str48 = instanceInfo43.getHomePageUrl();
        applicationInfoManager18.instanceInfo = instanceInfo43;
        boolean boolean50 = instanceInfo43.isDirty();
        boolean boolean51 = instanceInfo43.isDirty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str52 = com.netflix.appinfo.InstanceInfo.getZone(strArray0, instanceInfo43);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        java.lang.String[] strArray6 = new java.lang.String[] { "172.20.26.3", "hi!", "/Status", "inesserver2.windows.cin.ufpe.br:80", "inesserver2.windows.cin.ufpe.br:80", "/healthcheck" };
        com.netflix.appinfo.InstanceInfo.Builder builder7 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo14 = builder9.getRawInstance();
        instanceInfo14.setLastUpdatedTimestamp();
        int int16 = instanceInfo14.getCountryId();
        instanceInfo14.setIsDirty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = com.netflix.appinfo.InstanceInfo.getZone(strArray6, instanceInfo14);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setIPAddr("HI!");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig6 = new com.netflix.appinfo.MyDataCenterInstanceConfig("172.20.26.3");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = myDataCenterInstanceConfig6.getMetadataMap();
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setMetadata(strMap7);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setVIPAddress("UNKNOWN");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder8.setHealthCheckUrls("UNKNOWN", "inesserver2.windows.cin.ufpe.br", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        java.lang.String[] strArray2 = new java.lang.String[] { "inesserver2.windows.cin.ufpe.br", "inesserver2.windows.cin.ufpe.br" };
        com.netflix.appinfo.InstanceInfo.Builder builder3 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder3.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder5.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo10 = builder5.getRawInstance();
        int int11 = instanceInfo10.getPort();
        java.lang.Long long12 = instanceInfo10.isDirtyWithTime();
        instanceInfo10.setIsDirty();
        com.netflix.appinfo.InstanceInfo.ActionType actionType14 = com.netflix.appinfo.InstanceInfo.ActionType.ADDED;
        instanceInfo10.setActionType(actionType14);
        com.netflix.appinfo.DataCenterInfo dataCenterInfo16 = instanceInfo10.getDataCenterInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = com.netflix.appinfo.InstanceInfo.getZone(strArray2, instanceInfo10);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setCountryId((int) '#');
        com.netflix.appinfo.InstanceInfo.Builder builder9 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType16 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setActionType(actionType16);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder6.setActionType(actionType16);
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setVIPAddress("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder20.setStatusPageUrlForDeser("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder20.setStatusPageUrl("inesserver2.windows.cin.ufpe.br", "na");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setIPAddr("");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder4.setHealthCheckUrlsForDeser("/Status", "/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder11.setHealthCheckUrls("inesserver2.windows.cin.ufpe.br", "/", "HI!");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap1 = applicationInfoManager0.listeners;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig3 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int4 = myDataCenterInstanceConfig3.getLeaseExpirationDurationInSeconds();
        java.lang.String str5 = myDataCenterInstanceConfig3.getNamespace();
        java.lang.String str6 = myDataCenterInstanceConfig3.getStatusPageUrl();
        boolean boolean7 = myDataCenterInstanceConfig3.isNonSecurePortEnabled();
        boolean boolean8 = myDataCenterInstanceConfig3.getSecurePortEnabled();
        int int9 = myDataCenterInstanceConfig3.getLeaseRenewalIntervalInSeconds();
        applicationInfoManager0.config = myDataCenterInstanceConfig3;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig12 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int13 = myDataCenterInstanceConfig12.getLeaseExpirationDurationInSeconds();
        java.lang.String str14 = myDataCenterInstanceConfig12.getNamespace();
        java.lang.String str15 = myDataCenterInstanceConfig12.getStatusPageUrl();
        java.lang.String str16 = myDataCenterInstanceConfig12.getNamespace();
        java.lang.String str17 = myDataCenterInstanceConfig12.getNamespace();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = myDataCenterInstanceConfig12.getMetadataMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.registerAppMetadata(strMap18);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.ADDED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setLastUpdatedTimestamp((long) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder4.setStatusPageUrl("/healthcheck", "HI!");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.add("", "/");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.setPort(80);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager8 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int11 = myDataCenterInstanceConfig10.getLeaseExpirationDurationInSeconds();
        java.lang.String str12 = myDataCenterInstanceConfig10.getNamespace();
        java.lang.String str13 = myDataCenterInstanceConfig10.getStatusPageUrl();
        applicationInfoManager8.config = myDataCenterInstanceConfig10;
        com.netflix.appinfo.InstanceInfo.Builder builder15 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder17.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo22 = builder17.getRawInstance();
        instanceInfo22.setIsDirty();
        com.netflix.appinfo.InstanceInfo.ActionType actionType24 = instanceInfo22.getActionType();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager25 = new com.netflix.appinfo.ApplicationInfoManager((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig10, instanceInfo22);
        com.netflix.appinfo.InstanceInfo.Builder builder26 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder26.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder28.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder28.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo33 = builder28.getRawInstance();
        int int34 = instanceInfo33.getPort();
        java.util.Map<java.lang.String, java.lang.String> strMap35 = instanceInfo33.getMetadata();
        java.lang.String str36 = instanceInfo33.getId();
        com.netflix.appinfo.InstanceInfo.ActionType actionType37 = com.netflix.appinfo.InstanceInfo.ActionType.ADDED;
        instanceInfo33.setActionType(actionType37);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus39 = instanceInfo33.getStatus();
        applicationInfoManager25.setInstanceStatus(instanceStatus39);
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder0.setOverriddenStatus(instanceStatus39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder45 = builder0.setHealthCheckUrls("", "/healthcheck", "");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setVIPAddressDeser("172.20.26.3");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder4.setHomePageUrl("http://inesserver2.windows.cin.ufpe.br:80/Status", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.add("", "/");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setLastUpdatedTimestamp((long) (short) 10);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus15 = com.netflix.appinfo.InstanceInfo.InstanceStatus.OUT_OF_SERVICE;
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setOverriddenStatus(instanceStatus15);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder0.setOverriddenStatus(instanceStatus15);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder0.setIsCoordinatingDiscoveryServer(true);
        boolean boolean20 = builder19.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder19.setSecureVIPAddressDeser("HI!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder19.setStatusPageUrl("inesserver2.windows.cin.ufpe.br:80", "/Status");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setCountryId(0);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setIPAddr("/");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setLastDirtyTimestamp(1636104110819L);
        com.netflix.appinfo.InstanceInfo instanceInfo13 = builder12.getRawInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder12.setHealthCheckUrls("/Status", "/Status", "172.20.26.3");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setSecurePort(10);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setSID("na");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setPort(7001);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder8.setHomePageUrl("inesserver2.windows.cin.ufpe.br:80", "");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.add("/", "hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder9.setOverriddenStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setVIPAddress("HI!");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setStatusPageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder14.setIsCoordinatingDiscoveryServer(false);
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setAppName("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder20.setHomePageUrl("HI!", "NA");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setSecurePort((int) ' ');
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setNamespace("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setSecureVIPAddressDeser("/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setHealthCheckUrls("inesserver2.windows.cin.ufpe.br:80", "hi!", "UNKNOWN");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setCountryId((int) '#');
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setSID("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setIPAddr("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder17.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo22 = builder17.getRawInstance();
        instanceInfo22.setIsDirty();
        com.netflix.appinfo.InstanceInfo.ActionType actionType24 = instanceInfo22.getActionType();
        int int25 = instanceInfo22.getPort();
        boolean boolean26 = instanceInfo22.isDirty();
        com.netflix.appinfo.InstanceInfo.Builder builder27 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder27.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder31 = builder29.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder33 = builder29.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo34 = builder29.getRawInstance();
        int int35 = instanceInfo34.getPort();
        java.util.Map<java.lang.String, java.lang.String> strMap36 = instanceInfo34.getMetadata();
        instanceInfo34.unsetIsDirty((long) 7002);
        com.netflix.appinfo.InstanceInfo.Builder builder39 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder39.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder43 = builder41.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder45 = builder41.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder47 = builder45.setCountryId((int) '#');
        com.netflix.appinfo.InstanceInfo.Builder builder48 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder50 = builder48.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder52 = builder48.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder54 = builder52.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType55 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder56 = builder54.setActionType(actionType55);
        com.netflix.appinfo.InstanceInfo.Builder builder57 = builder45.setActionType(actionType55);
        instanceInfo34.setActionType(actionType55);
        instanceInfo22.setActionType(actionType55);
        com.netflix.appinfo.InstanceInfo.Builder builder60 = builder14.setActionType(actionType55);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder63 = builder60.setHomePageUrl("inesserver2.windows.cin.ufpe.br:80", "na");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.add("/", "hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder9.setOverriddenStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setVIPAddress("HI!");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setStatusPageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder14.setPort(30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder14.setHealthCheckUrls("/", "172.20.26.3", "unknown");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setCountryId((int) '#');
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setSID("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setIPAddr("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setSecureVIPAddressDeser("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder14.setHomePageUrl("na", "na");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.ADDED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setLastDirtyTimestamp(1636104108261L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder4.setStatusPageUrl("/healthcheck", "/Status");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setIsCoordinatingDiscoveryServer(true);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setASGName("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setVIPAddress("na");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder8.setHomePageUrl("inesserver2.windows.cin.ufpe.br", "UNKNOWN");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.add("/", "hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder9.setOverriddenStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setVIPAddress("HI!");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setStatusPageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder14.setPort(30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder18.setHealthCheckUrls("/Status", "/", "/healthcheck");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setCountryId((int) '#');
        com.netflix.appinfo.InstanceInfo.Builder builder9 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder18.setASGName("");
        boolean boolean23 = builder18.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder24 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder24.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder26.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder26.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo31 = builder26.getRawInstance();
        instanceInfo31.setLastUpdatedTimestamp();
        com.netflix.appinfo.InstanceInfo instanceInfo33 = new com.netflix.appinfo.InstanceInfo(instanceInfo31);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus34 = instanceInfo31.getStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder35 = builder18.setOverriddenStatus(instanceStatus34);
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder13.setStatus(instanceStatus34);
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder6.setStatus(instanceStatus34);
        com.netflix.appinfo.InstanceInfo.Builder builder38 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder40 = builder38.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder42 = builder40.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder44 = builder40.setASGName("");
        boolean boolean45 = builder40.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder46 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder48 = builder46.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder50 = builder48.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder52 = builder48.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo53 = builder48.getRawInstance();
        instanceInfo53.setLastUpdatedTimestamp();
        com.netflix.appinfo.InstanceInfo instanceInfo55 = new com.netflix.appinfo.InstanceInfo(instanceInfo53);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus56 = instanceInfo53.getStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder57 = builder40.setOverriddenStatus(instanceStatus56);
        com.netflix.appinfo.InstanceInfo.Builder builder58 = builder6.setOverriddenStatus(instanceStatus56);
        com.netflix.appinfo.InstanceInfo.Builder builder60 = builder6.setSecurePort((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder62 = builder60.setHomePageUrlForDeser("172.20.26.3");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder65 = builder60.setHomePageUrl("unknown", "172.20.26.3");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setCountryId((int) '#');
        com.netflix.appinfo.InstanceInfo.Builder builder9 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType16 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setActionType(actionType16);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder6.setActionType(actionType16);
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setVIPAddress("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder18.setSecureVIPAddress("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder22.setIPAddr("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder24.setIPAddr("UNKNOWN");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder26.setHealthCheckUrls("", "http://inesserver2.windows.cin.ufpe.br:80/Status", "UNKNOWN");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastUpdatedTimestamp((long) (short) 10);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus7 = com.netflix.appinfo.InstanceInfo.InstanceStatus.OUT_OF_SERVICE;
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setOverriddenStatus(instanceStatus7);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setSecureVIPAddressDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setSecureVIPAddressDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder10.setAppGroupName("/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder14.setHealthCheckUrls("eureka.", "172.20.26.3", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppName("HI!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setVIPAddressDeser("HI!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder0.setHealthCheckUrls("hi!", "HI!", "/Status");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setCountryId((int) '#');
        com.netflix.appinfo.InstanceInfo.Builder builder9 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType16 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setActionType(actionType16);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder6.setActionType(actionType16);
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setVIPAddress("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder20.setLastDirtyTimestamp(1636104108672L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder20.setHomePageUrl("HI!", "");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setVIPAddressDeser("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.MODIFIED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setActionType(actionType5);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setSecureVIPAddressDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setAppName("eureka.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder8.setStatusPageUrl("inesserver2.windows.cin.ufpe.br", "hi!");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setSecurePort((int) ' ');
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setNamespace("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setSecureVIPAddressDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setLastUpdatedTimestamp(1636104107816L);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setNamespace("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder8.setCountryId(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder8.setHomePageUrl("inesserver2.windows.cin.ufpe.br", "/");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder2.getRawInstance();
        int int8 = instanceInfo7.getPort();
        long long9 = instanceInfo7.getLastUpdatedTimestamp();
        long long10 = instanceInfo7.getLastUpdatedTimestamp();
        com.netflix.appinfo.InstanceInfo.Builder builder11 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setLastDirtyTimestamp(1636104126104L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder11.setStatusPageUrl("", "/");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        boolean boolean7 = builder2.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder8 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder10.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo15 = builder10.getRawInstance();
        instanceInfo15.setLastUpdatedTimestamp();
        com.netflix.appinfo.InstanceInfo instanceInfo17 = new com.netflix.appinfo.InstanceInfo(instanceInfo15);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus18 = instanceInfo15.getStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder2.setOverriddenStatus(instanceStatus18);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setPort(1);
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setPort((int) (byte) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder21.setStatusPageUrlForDeser("HI!");
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder25.setIsCoordinatingDiscoveryServer(true);
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder27.setLastDirtyTimestamp(0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder29.setStatusPageUrl("/healthcheck", "eureka.");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setIPAddr("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setNamespace("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setSecureVIPAddress("/healthcheck");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder8.setHomePageUrl("UNKNOWN", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setIPAddr("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setNamespace("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setSecureVIPAddressDeser("na");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setSecureVIPAddress("/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder8.setStatusPageUrl("eureka.", "172.20.26.3");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType7 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setActionType(actionType7);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setASGName("UNKNOWN");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder10.setStatusPageUrl("", "/");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        boolean boolean7 = builder2.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder8 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder10.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo15 = builder10.getRawInstance();
        instanceInfo15.setLastUpdatedTimestamp();
        com.netflix.appinfo.InstanceInfo instanceInfo17 = new com.netflix.appinfo.InstanceInfo(instanceInfo15);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus18 = instanceInfo15.getStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder2.setOverriddenStatus(instanceStatus18);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setPort(1);
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setPort((int) (byte) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder21.setStatusPageUrlForDeser("HI!");
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder25.setNamespace("na");
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder27.setIsCoordinatingDiscoveryServer(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder27.setStatusPageUrl("inesserver2.windows.cin.ufpe.br", "/");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setLastUpdatedTimestamp(10L);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setNamespace("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setLastUpdatedTimestamp(1636104124545L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder12.setHomePageUrl("", "/Status");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType7 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setActionType(actionType7);
        boolean boolean9 = builder8.isInitialized();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setHomePageUrl("eureka.", "172.20.26.3");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setStatusPageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setSecurePort(7001);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder8.setHomePageUrl("http://inesserver2.windows.cin.ufpe.br:80/Status", "hi!");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastUpdatedTimestamp((long) (short) 10);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus7 = com.netflix.appinfo.InstanceInfo.InstanceStatus.OUT_OF_SERVICE;
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setOverriddenStatus(instanceStatus7);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int11 = myDataCenterInstanceConfig10.getLeaseExpirationDurationInSeconds();
        java.lang.String str12 = myDataCenterInstanceConfig10.getIpAddress();
        java.lang.String str13 = myDataCenterInstanceConfig10.getStatusPageUrl();
        java.lang.String str15 = myDataCenterInstanceConfig10.getHostName(true);
        java.lang.String str17 = myDataCenterInstanceConfig10.getHostName(false);
        java.lang.String str18 = myDataCenterInstanceConfig10.getHealthCheckUrl();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo19 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder8.setDataCenterInfo(dataCenterInfo19);
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder8.setHomePageUrlForDeser("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder22.setSecureVIPAddressDeser("unknown");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder22.setHomePageUrl("http://inesserver2.windows.cin.ufpe.br:80/Status", "");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setCountryId((int) '#');
        com.netflix.appinfo.InstanceInfo.Builder builder9 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType16 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setActionType(actionType16);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder6.setActionType(actionType16);
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setVIPAddress("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder20.setStatusPageUrlForDeser("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder20.setHealthCheckUrls("/Status", "unknown", "");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.ADDED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setAppGroupName("/healthcheck");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder8.setStatusPageUrl("unknown", "HI!");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.add("", "/");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.setASGName("");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager8 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int11 = myDataCenterInstanceConfig10.getLeaseExpirationDurationInSeconds();
        java.lang.String str12 = myDataCenterInstanceConfig10.getNamespace();
        java.lang.String str13 = myDataCenterInstanceConfig10.getStatusPageUrl();
        applicationInfoManager8.config = myDataCenterInstanceConfig10;
        com.netflix.appinfo.InstanceInfo.Builder builder15 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder17.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo22 = builder17.getRawInstance();
        instanceInfo22.setIsDirty();
        com.netflix.appinfo.InstanceInfo.ActionType actionType24 = instanceInfo22.getActionType();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager25 = new com.netflix.appinfo.ApplicationInfoManager((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig10, instanceInfo22);
        com.netflix.appinfo.InstanceInfo.Builder builder26 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder26.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder28.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder28.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo33 = builder28.getRawInstance();
        instanceInfo33.setLastUpdatedTimestamp();
        com.netflix.appinfo.InstanceInfo instanceInfo35 = new com.netflix.appinfo.InstanceInfo(instanceInfo33);
        applicationInfoManager25.instanceInfo = instanceInfo33;
        instanceInfo33.setSID("hi!");
        com.netflix.appinfo.LeaseInfo leaseInfo39 = instanceInfo33.getLeaseInfo();
        java.lang.String str40 = instanceInfo33.getVersion();
        java.lang.String str41 = instanceInfo33.getStatusPageUrl();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus43 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("unknown");
        instanceInfo33.setStatusWithoutDirty(instanceStatus43);
        com.netflix.appinfo.InstanceInfo.Builder builder45 = builder0.setOverriddenStatus(instanceStatus43);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder48 = builder0.setStatusPageUrl("hi!", "NA");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setStatusPageUrlForDeser("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setHealthCheckUrls("hi!", "na", "/");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setLastUpdatedTimestamp(10L);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setNamespace("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setLastDirtyTimestamp((long) 0);
        boolean boolean13 = builder10.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder10.setAppName("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder10.setLastUpdatedTimestamp(1636104117098L);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setLastDirtyTimestamp((long) 30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder17.setHomePageUrl("na", "/Status");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastUpdatedTimestamp((long) (short) 10);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus7 = com.netflix.appinfo.InstanceInfo.InstanceStatus.OUT_OF_SERVICE;
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setOverriddenStatus(instanceStatus7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder8.setStatusPageUrl("http://inesserver2.windows.cin.ufpe.br:80/Status", "/");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setSecurePort(10);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setSID("na");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setPort(7001);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setHealthCheckUrls("172.20.26.3", "/", "hi!");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setLastUpdatedTimestamp(10L);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setNamespace("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setLastDirtyTimestamp((long) 0);
        boolean boolean13 = builder10.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder10.setAppName("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder10.setLastDirtyTimestamp(1636104107816L);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setHomePageUrlForDeser("unknown");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder19.setHealthCheckUrls("NA", "172.20.26.3", "/");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setLastUpdatedTimestamp(10L);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setNamespace("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setLastDirtyTimestamp((long) 0);
        boolean boolean13 = builder10.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder10.setAppName("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder10.setLastUpdatedTimestamp(1636104117098L);
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder17.setHealthCheckUrlsForDeser("unknown", "/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder17.setPort((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder17.setStatusPageUrl("na", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setVIPAddressDeser("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.MODIFIED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setActionType(actionType5);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setAppGroupName("/healthcheck");
        boolean boolean9 = builder8.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder8.setSID("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setPort((int) (short) 100);
        com.netflix.appinfo.InstanceInfo instanceInfo14 = builder13.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder13.setSecureVIPAddress("/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder13.setHealthCheckUrls("http://inesserver2.windows.cin.ufpe.br:80/Status", "/Status", "NA");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setSecurePort(10);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setIPAddr("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setIsCoordinatingDiscoveryServer(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder6.setHomePageUrl("/", "HI!");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setCountryId((int) '#');
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setSID("172.20.26.3");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder6.setHealthCheckUrls("NA", "NA", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        boolean boolean7 = builder2.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder2.setSecureVIPAddressDeser("HI!");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setSID("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setNamespace("inesserver2.windows.cin.ufpe.br");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder9.setHomePageUrl("http://inesserver2.windows.cin.ufpe.br:80/Status", "HI!");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder2.getRawInstance();
        int int8 = instanceInfo7.getPort();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = instanceInfo7.getMetadata();
        instanceInfo7.unsetIsDirty((long) 7002);
        java.util.Set<java.lang.String> strSet12 = instanceInfo7.getHealthCheckUrls();
        com.netflix.appinfo.InstanceInfo.Builder builder13 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setASGName("inesserver2.windows.cin.ufpe.br");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder15.setStatusPageUrl("/", "unknown");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder2.getRawInstance();
        int int8 = instanceInfo7.getPort();
        long long9 = instanceInfo7.getLastUpdatedTimestamp();
        long long10 = instanceInfo7.getLastUpdatedTimestamp();
        com.netflix.appinfo.InstanceInfo.Builder builder11 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setLastDirtyTimestamp(1636104126104L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder13.setHealthCheckUrls("/healthcheck", "unknown", "na");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setStatusPageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setLastDirtyTimestamp(1L);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setVIPAddress("HI!");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setLastUpdatedTimestamp(1636104117098L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder14.setStatusPageUrl("/", "hi!");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setSecurePort((int) ' ');
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setNamespace("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setSecureVIPAddressDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setLastUpdatedTimestamp(1636104107816L);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setNamespace("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder8.setCountryId(0);
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setIsCoordinatingDiscoveryServer(false);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder14.setIPAddr("http://inesserver2.windows.cin.ufpe.br:80/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder14.setHealthCheckUrls("unknown", "inesserver2.windows.cin.ufpe.br:80", "hi!");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.ADDED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder4.setHealthCheckUrls("172.20.26.3", "UNKNOWN", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.add("", "/");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.setPort(80);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager8 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int11 = myDataCenterInstanceConfig10.getLeaseExpirationDurationInSeconds();
        java.lang.String str12 = myDataCenterInstanceConfig10.getNamespace();
        java.lang.String str13 = myDataCenterInstanceConfig10.getStatusPageUrl();
        applicationInfoManager8.config = myDataCenterInstanceConfig10;
        com.netflix.appinfo.InstanceInfo.Builder builder15 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder17.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo22 = builder17.getRawInstance();
        instanceInfo22.setIsDirty();
        com.netflix.appinfo.InstanceInfo.ActionType actionType24 = instanceInfo22.getActionType();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager25 = new com.netflix.appinfo.ApplicationInfoManager((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig10, instanceInfo22);
        com.netflix.appinfo.InstanceInfo.Builder builder26 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder26.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder28.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder28.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo33 = builder28.getRawInstance();
        int int34 = instanceInfo33.getPort();
        java.util.Map<java.lang.String, java.lang.String> strMap35 = instanceInfo33.getMetadata();
        java.lang.String str36 = instanceInfo33.getId();
        com.netflix.appinfo.InstanceInfo.ActionType actionType37 = com.netflix.appinfo.InstanceInfo.ActionType.ADDED;
        instanceInfo33.setActionType(actionType37);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus39 = instanceInfo33.getStatus();
        applicationInfoManager25.setInstanceStatus(instanceStatus39);
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder0.setOverriddenStatus(instanceStatus39);
        com.netflix.appinfo.InstanceInfo.Builder builder43 = builder41.setSecurePort((int) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder45 = builder43.setNamespace("HI!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder48 = builder43.setHomePageUrl("unknown", "unknown");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastUpdatedTimestamp((long) (short) 10);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus7 = com.netflix.appinfo.InstanceInfo.InstanceStatus.OUT_OF_SERVICE;
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setOverriddenStatus(instanceStatus7);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setSID("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder6.setHomePageUrl("inesserver2.windows.cin.ufpe.br", "/healthcheck");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder2.getRawInstance();
        instanceInfo7.setIsDirty();
        java.lang.String str9 = instanceInfo7.getAppGroupName();
        instanceInfo7.setSID("na");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus12 = instanceInfo7.getOverriddenStatus();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = instanceInfo7.getMetadata();
        java.lang.String str14 = instanceInfo7.getAppGroupName();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = instanceInfo7.getMetadata();
        instanceInfo7.setIsDirty(false);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setIPAddr("UNKNOWN");
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder18.setIsCoordinatingDiscoveryServer(false);
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder18.setSecureVIPAddress("UNKNOWN");
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder24.setAppName("http://inesserver2.windows.cin.ufpe.br:80/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder26.setHomePageUrl("inesserver2.windows.cin.ufpe.br", "NA");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.add("", "/");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setLastUpdatedTimestamp((long) (short) 10);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus15 = com.netflix.appinfo.InstanceInfo.InstanceStatus.OUT_OF_SERVICE;
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setOverriddenStatus(instanceStatus15);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder0.setOverriddenStatus(instanceStatus15);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder0.setIsCoordinatingDiscoveryServer(true);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder0.setLastDirtyTimestamp(1636104145628L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder21.setHealthCheckUrls("na", "hi!", "/");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setCountryId((int) '#');
        com.netflix.appinfo.InstanceInfo.Builder builder9 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder18.setASGName("");
        boolean boolean23 = builder18.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder24 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder24.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder26.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder26.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo31 = builder26.getRawInstance();
        instanceInfo31.setLastUpdatedTimestamp();
        com.netflix.appinfo.InstanceInfo instanceInfo33 = new com.netflix.appinfo.InstanceInfo(instanceInfo31);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus34 = instanceInfo31.getStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder35 = builder18.setOverriddenStatus(instanceStatus34);
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder13.setStatus(instanceStatus34);
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder6.setStatus(instanceStatus34);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder37.setHealthCheckUrls("172.20.26.3", "UNKNOWN", "/Status");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setStatusPageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setLastDirtyTimestamp(1L);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setVIPAddress("HI!");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder12.setHealthCheckUrlsForDeser("/", "/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setSecurePort(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder15.setHealthCheckUrls("unknown", "eureka.", "HI!");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder2.getRawInstance();
        int int8 = instanceInfo7.getPort();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = instanceInfo7.getMetadata();
        java.lang.String str10 = instanceInfo7.getId();
        com.netflix.appinfo.InstanceInfo.ActionType actionType11 = com.netflix.appinfo.InstanceInfo.ActionType.ADDED;
        instanceInfo7.setActionType(actionType11);
        java.util.Set<java.lang.String> strSet13 = instanceInfo7.getHealthCheckUrls();
        com.netflix.appinfo.InstanceInfo.Builder builder14 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder14.setStatusPageUrl("UNKNOWN", "unknown");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setIPAddr("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setNamespace("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setSecureVIPAddressDeser("na");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setSecureVIPAddress("/Status");
        boolean boolean13 = builder8.isInitialized();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder8.setStatusPageUrl("/healthcheck", "");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        boolean boolean7 = builder2.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder2.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setASGName("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder9.setHomePageUrl("/Status", "HI!");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        java.lang.String[] strArray6 = new java.lang.String[] { "HI!", "UNKNOWN", "eureka.", "UNKNOWN", "/healthcheck", "NA" };
        com.netflix.appinfo.InstanceInfo.Builder builder7 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo14 = builder9.getRawInstance();
        instanceInfo14.setIsDirty();
        java.lang.String str16 = instanceInfo14.getAppGroupName();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo17 = instanceInfo14.getDataCenterInfo();
        java.lang.String str18 = instanceInfo14.getASGName();
        int int19 = instanceInfo14.getSecurePort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = com.netflix.appinfo.InstanceInfo.getZone(strArray6, instanceInfo14);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.add("", "/");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setLastUpdatedTimestamp((long) 80);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setPort((int) '4');
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setPort((int) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder11.setNamespace("unknown");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder11.setStatusPageUrl("NA", "NA");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.add("", "/");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setLastUpdatedTimestamp((long) 80);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setPort((int) '4');
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setStatusPageUrlForDeser("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setVIPAddress("/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder13.setHealthCheckUrls("/Status", "UNKNOWN", "HI!");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastUpdatedTimestamp((long) (short) 10);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus7 = com.netflix.appinfo.InstanceInfo.InstanceStatus.OUT_OF_SERVICE;
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setOverriddenStatus(instanceStatus7);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int11 = myDataCenterInstanceConfig10.getLeaseExpirationDurationInSeconds();
        java.lang.String str12 = myDataCenterInstanceConfig10.getIpAddress();
        java.lang.String str13 = myDataCenterInstanceConfig10.getStatusPageUrl();
        java.lang.String str15 = myDataCenterInstanceConfig10.getHostName(true);
        java.lang.String str17 = myDataCenterInstanceConfig10.getHostName(false);
        java.lang.String str18 = myDataCenterInstanceConfig10.getHealthCheckUrl();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo19 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder8.setDataCenterInfo(dataCenterInfo19);
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder8.setHomePageUrlForDeser("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder8.setLastDirtyTimestamp(1636104165101L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder8.setHealthCheckUrls("eureka.", "", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder2.getRawInstance();
        int int8 = instanceInfo7.getPort();
        long long9 = instanceInfo7.getLastUpdatedTimestamp();
        long long10 = instanceInfo7.getLastUpdatedTimestamp();
        java.lang.String str11 = instanceInfo7.getSID();
        java.util.Set<java.lang.String> strSet12 = instanceInfo7.getHealthCheckUrls();
        com.netflix.appinfo.InstanceInfo.Builder builder13 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder13.setHealthCheckUrls("", "eureka.", "");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.add("", "/");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.setPort(80);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager8 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int11 = myDataCenterInstanceConfig10.getLeaseExpirationDurationInSeconds();
        java.lang.String str12 = myDataCenterInstanceConfig10.getNamespace();
        java.lang.String str13 = myDataCenterInstanceConfig10.getStatusPageUrl();
        applicationInfoManager8.config = myDataCenterInstanceConfig10;
        com.netflix.appinfo.InstanceInfo.Builder builder15 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder17.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo22 = builder17.getRawInstance();
        instanceInfo22.setIsDirty();
        com.netflix.appinfo.InstanceInfo.ActionType actionType24 = instanceInfo22.getActionType();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager25 = new com.netflix.appinfo.ApplicationInfoManager((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig10, instanceInfo22);
        com.netflix.appinfo.InstanceInfo.Builder builder26 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder26.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder28.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder28.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo33 = builder28.getRawInstance();
        int int34 = instanceInfo33.getPort();
        java.util.Map<java.lang.String, java.lang.String> strMap35 = instanceInfo33.getMetadata();
        java.lang.String str36 = instanceInfo33.getId();
        com.netflix.appinfo.InstanceInfo.ActionType actionType37 = com.netflix.appinfo.InstanceInfo.ActionType.ADDED;
        instanceInfo33.setActionType(actionType37);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus39 = instanceInfo33.getStatus();
        applicationInfoManager25.setInstanceStatus(instanceStatus39);
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder0.setOverriddenStatus(instanceStatus39);
        com.netflix.appinfo.InstanceInfo.Builder builder43 = builder0.setNamespace("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder46 = builder43.setStatusPageUrl("http://inesserver2.windows.cin.ufpe.br:80/Status", "/");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.add("", "/");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setLastUpdatedTimestamp((long) (short) 10);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus15 = com.netflix.appinfo.InstanceInfo.InstanceStatus.OUT_OF_SERVICE;
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setOverriddenStatus(instanceStatus15);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder0.setOverriddenStatus(instanceStatus15);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder0.setIsCoordinatingDiscoveryServer(true);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setSecureVIPAddress("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder21.add("inesserver2.windows.cin.ufpe.br", "/healthcheck");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder21.setHealthCheckUrls("UNKNOWN", "inesserver2.windows.cin.ufpe.br", "hi!");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setVIPAddressDeser("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.MODIFIED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setActionType(actionType5);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setSecureVIPAddressDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setStatusPageUrlForDeser("/healthcheck");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder8.setHomePageUrl("na", "/Status");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSecureVIPAddress("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder4.setHealthCheckUrlsForDeser("na", "HI!");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setNamespace("na");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setVIPAddressDeser("/healthcheck");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder11.setHomePageUrl("172.20.26.3", "hi!");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        boolean boolean7 = builder2.isInitialized();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder2.setStatusPageUrl("", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig2 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int3 = myDataCenterInstanceConfig2.getLeaseExpirationDurationInSeconds();
        java.lang.String str4 = myDataCenterInstanceConfig2.getNamespace();
        java.lang.String str5 = myDataCenterInstanceConfig2.getStatusPageUrl();
        applicationInfoManager0.config = myDataCenterInstanceConfig2;
        com.netflix.appinfo.InstanceInfo.Builder builder7 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo14 = builder9.getRawInstance();
        instanceInfo14.setIsDirty();
        com.netflix.appinfo.InstanceInfo.ActionType actionType16 = instanceInfo14.getActionType();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager17 = new com.netflix.appinfo.ApplicationInfoManager((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig2, instanceInfo14);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder20.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder20.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo25 = builder20.getRawInstance();
        instanceInfo25.setLastUpdatedTimestamp();
        com.netflix.appinfo.InstanceInfo instanceInfo27 = new com.netflix.appinfo.InstanceInfo(instanceInfo25);
        applicationInfoManager17.instanceInfo = instanceInfo25;
        instanceInfo25.setSID("hi!");
        java.lang.String str31 = instanceInfo25.getHostName();
        long long32 = instanceInfo25.getLastUpdatedTimestamp();
        java.lang.String str33 = instanceInfo25.getSID();
        com.netflix.appinfo.InstanceInfo.Builder builder34 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo25);
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder34.setASGName("HI!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder40 = builder36.setHealthCheckUrls("NA", "inesserver2.windows.cin.ufpe.br", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setCountryId((int) '#');
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setSID("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setNamespace("na");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setHealthCheckUrls("172.20.26.3", "HI!", "HI!");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setVIPAddressDeser("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.MODIFIED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setActionType(actionType5);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setAppGroupName("/healthcheck");
        boolean boolean9 = builder8.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder8.setSID("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setPort((int) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setAppName("/healthcheck");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder13.setStatusPageUrl("inesserver2.windows.cin.ufpe.br:80", "unknown");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        java.lang.String[] strArray2 = new java.lang.String[] { "/", "hi!" };
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager3 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig5 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int6 = myDataCenterInstanceConfig5.getLeaseExpirationDurationInSeconds();
        java.lang.String str7 = myDataCenterInstanceConfig5.getNamespace();
        java.lang.String str8 = myDataCenterInstanceConfig5.getStatusPageUrl();
        applicationInfoManager3.config = myDataCenterInstanceConfig5;
        com.netflix.appinfo.InstanceInfo.Builder builder10 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo17 = builder12.getRawInstance();
        instanceInfo17.setIsDirty();
        com.netflix.appinfo.InstanceInfo.ActionType actionType19 = instanceInfo17.getActionType();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager20 = new com.netflix.appinfo.ApplicationInfoManager((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig5, instanceInfo17);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder23.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder23.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo28 = builder23.getRawInstance();
        instanceInfo28.setLastUpdatedTimestamp();
        com.netflix.appinfo.InstanceInfo instanceInfo30 = new com.netflix.appinfo.InstanceInfo(instanceInfo28);
        applicationInfoManager20.instanceInfo = instanceInfo28;
        instanceInfo28.setSID("hi!");
        com.netflix.appinfo.LeaseInfo leaseInfo34 = instanceInfo28.getLeaseInfo();
        java.lang.String str35 = instanceInfo28.getVersion();
        instanceInfo28.setIsDirty();
        instanceInfo28.setLastDirtyTimestamp((java.lang.Long) 1636104114355L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str39 = com.netflix.appinfo.InstanceInfo.getZone(strArray2, instanceInfo28);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setHealthCheckUrls("inesserver2.windows.cin.ufpe.br", "eureka.", "NA");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastUpdatedTimestamp((long) (short) 10);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus7 = com.netflix.appinfo.InstanceInfo.InstanceStatus.OUT_OF_SERVICE;
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setOverriddenStatus(instanceStatus7);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int11 = myDataCenterInstanceConfig10.getLeaseExpirationDurationInSeconds();
        java.lang.String str12 = myDataCenterInstanceConfig10.getIpAddress();
        java.lang.String str13 = myDataCenterInstanceConfig10.getStatusPageUrl();
        java.lang.String str15 = myDataCenterInstanceConfig10.getHostName(true);
        java.lang.String str17 = myDataCenterInstanceConfig10.getHostName(false);
        java.lang.String str18 = myDataCenterInstanceConfig10.getHealthCheckUrl();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo19 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder8.setDataCenterInfo(dataCenterInfo19);
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder8.add("inesserver2.windows.cin.ufpe.br:80", "hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder23.setASGName("na");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder25.setHomePageUrl("NA", "na");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastUpdatedTimestamp((long) (short) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setVIPAddress("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setVIPAddress("");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder8.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setIsCoordinatingDiscoveryServer(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder16.setHomePageUrl("eureka.", "unknown");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSecureVIPAddress("/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder2.setStatusPageUrl("inesserver2.windows.cin.ufpe.br:80", "hi!");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus5 = com.netflix.appinfo.InstanceInfo.InstanceStatus.OUT_OF_SERVICE;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setStatus(instanceStatus5);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo14 = builder9.getRawInstance();
        int int15 = instanceInfo14.getPort();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = instanceInfo14.getMetadata();
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder0.setMetadata(strMap16);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setHomePageUrlForDeser("/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder17.setStatusPageUrl("/Status", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        java.lang.String[] strArray3 = new java.lang.String[] { "/Status", "HI!", "http://inesserver2.windows.cin.ufpe.br:80/Status" };
        com.netflix.appinfo.InstanceInfo.Builder builder4 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo11 = builder6.getRawInstance();
        int int12 = instanceInfo11.getPort();
        long long13 = instanceInfo11.getLastUpdatedTimestamp();
        instanceInfo11.setLastUpdatedTimestamp();
        java.lang.String str15 = instanceInfo11.getASGName();
        com.netflix.appinfo.InstanceInfo.Builder builder16 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder16.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus21 = com.netflix.appinfo.InstanceInfo.InstanceStatus.OUT_OF_SERVICE;
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder16.setStatus(instanceStatus21);
        instanceInfo11.setStatusWithoutDirty(instanceStatus21);
        int int24 = instanceInfo11.getCountryId();
        int int25 = instanceInfo11.getPort();
        java.lang.String str26 = instanceInfo11.getVIPAddress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str27 = com.netflix.appinfo.InstanceInfo.getZone(strArray3, instanceInfo11);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSecureVIPAddress("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder4.setHealthCheckUrlsForDeser("na", "HI!");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setNamespace("na");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setVIPAddressDeser("/healthcheck");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder9.setStatusPageUrl("unknown", "eureka.");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setCountryId((int) '#');
        com.netflix.appinfo.InstanceInfo.Builder builder9 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder18.setASGName("");
        boolean boolean23 = builder18.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder24 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder24.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder26.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder26.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo31 = builder26.getRawInstance();
        instanceInfo31.setLastUpdatedTimestamp();
        com.netflix.appinfo.InstanceInfo instanceInfo33 = new com.netflix.appinfo.InstanceInfo(instanceInfo31);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus34 = instanceInfo31.getStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder35 = builder18.setOverriddenStatus(instanceStatus34);
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder13.setStatus(instanceStatus34);
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder6.setStatus(instanceStatus34);
        com.netflix.appinfo.InstanceInfo.Builder builder38 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder40 = builder38.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder42 = builder40.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder44 = builder40.setASGName("");
        boolean boolean45 = builder40.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder46 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder48 = builder46.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder50 = builder48.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder52 = builder48.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo53 = builder48.getRawInstance();
        instanceInfo53.setLastUpdatedTimestamp();
        com.netflix.appinfo.InstanceInfo instanceInfo55 = new com.netflix.appinfo.InstanceInfo(instanceInfo53);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus56 = instanceInfo53.getStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder57 = builder40.setOverriddenStatus(instanceStatus56);
        com.netflix.appinfo.InstanceInfo.Builder builder58 = builder6.setOverriddenStatus(instanceStatus56);
        com.netflix.appinfo.InstanceInfo.Builder builder60 = builder6.setSecurePort((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder63 = builder6.setHomePageUrl("", "/Status");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.add("/", "hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder9.setOverriddenStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setVIPAddress("HI!");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder17.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo22 = builder17.getRawInstance();
        instanceInfo22.setIsDirty();
        int int24 = instanceInfo22.getPort();
        java.util.Set<java.lang.String> strSet25 = instanceInfo22.getHealthCheckUrls();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus26 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        instanceInfo22.setStatusWithoutDirty(instanceStatus26);
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder12.setOverriddenStatus(instanceStatus26);
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder12.setIPAddr("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder30.setSID("eureka.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder30.setHealthCheckUrls("http://inesserver2.windows.cin.ufpe.br:80/Status", "/healthcheck", "eureka.");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder2.getRawInstance();
        int int8 = instanceInfo7.getPort();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = instanceInfo7.getMetadata();
        instanceInfo7.unsetIsDirty((long) 7002);
        java.lang.String str12 = instanceInfo7.getHomePageUrl();
        java.lang.Boolean boolean13 = instanceInfo7.isCoordinatingDiscoveryServer();
        instanceInfo7.setIsDirty(true);
        java.lang.Long long16 = instanceInfo7.isDirtyWithTime();
        long long17 = instanceInfo7.getLastUpdatedTimestamp();
        com.netflix.appinfo.InstanceInfo.Builder builder18 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder18.setHomePageUrl("/healthcheck", "na");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        com.netflix.appinfo.InstanceInfo.Builder builder2 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo9 = builder4.getRawInstance();
        instanceInfo9.setIsDirty();
        com.netflix.appinfo.InstanceInfo.ActionType actionType11 = instanceInfo9.getActionType();
        instanceInfo9.setIsDirty();
        instanceInfo9.setLastDirtyTimestamp((java.lang.Long) 1636104165251L);
        int int15 = instanceInfo9.getPort();
        java.lang.String str16 = instanceInfo9.getASGName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo9);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        boolean boolean7 = builder2.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder2.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setASGName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setSID("UNKNOWN");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setLastUpdatedTimestamp(1636104190165L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder15.setHealthCheckUrls("eureka.", "hi!", "172.20.26.3");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.add("/", "hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder9.setOverriddenStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setVIPAddress("HI!");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setCountryId((int) ' ');
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder14.setIPAddr("/healthcheck");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder14.setStatusPageUrl("na", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setIPAddr("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setNamespace("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setSecureVIPAddressDeser("na");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setSecureVIPAddress("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder8.setVIPAddress("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setPort(7001);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder16.setHomePageUrl("/", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setLastUpdatedTimestamp(10L);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setNamespace("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setLastDirtyTimestamp((long) 0);
        boolean boolean13 = builder10.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder10.setAppName("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder10.setLastUpdatedTimestamp(1636104117098L);
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder17.setHealthCheckUrlsForDeser("unknown", "/healthcheck");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder17.setStatusPageUrl("172.20.26.3", "/");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setVIPAddressDeser("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.MODIFIED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setActionType(actionType5);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setSecureVIPAddressDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setNamespace("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setCountryId((int) (byte) 100);
        boolean boolean13 = builder12.isInitialized();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setHomePageUrl("na", "/");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.add("/", "hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setSecureVIPAddress("NA");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder9.setHealthCheckUrls("NA", "HI!", "");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.add("", "/");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.setPort(80);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder0.setHealthCheckUrlsForDeser("HI!", "hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder0.setCountryId(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setHealthCheckUrls("", "http://inesserver2.windows.cin.ufpe.br:80/Status", "eureka.");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder2.getRawInstance();
        instanceInfo7.setIsDirty();
        java.lang.String str9 = instanceInfo7.getAppGroupName();
        instanceInfo7.setSID("na");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus12 = instanceInfo7.getOverriddenStatus();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = instanceInfo7.getMetadata();
        java.lang.String str14 = instanceInfo7.getAppGroupName();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = instanceInfo7.getMetadata();
        instanceInfo7.setIsDirty(false);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setIPAddr("UNKNOWN");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder20.setStatusPageUrl("http://inesserver2.windows.cin.ufpe.br:80/Status", "");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus5 = com.netflix.appinfo.InstanceInfo.InstanceStatus.OUT_OF_SERVICE;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setStatus(instanceStatus5);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo14 = builder9.getRawInstance();
        int int15 = instanceInfo14.getPort();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = instanceInfo14.getMetadata();
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder0.setMetadata(strMap16);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder20.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder20.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo25 = builder20.getRawInstance();
        instanceInfo25.setIsDirty(true);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus28 = instanceInfo25.getStatus();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus29 = instanceInfo25.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder17.setStatus(instanceStatus29);
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder17.setSID("http://inesserver2.windows.cin.ufpe.br:80/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder35 = builder32.setHealthCheckUrlsForDeser("/", "UNKNOWN");
        com.netflix.appinfo.InstanceInfo instanceInfo36 = builder35.getRawInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder35.setHomePageUrl("eureka.", "/Status");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        boolean boolean7 = builder2.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder2.setSecureVIPAddressDeser("HI!");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder2.setPort((int) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setHomePageUrlForDeser("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setVIPAddress("unknown");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder13.setStatusPageUrl("", "eureka.");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        boolean boolean7 = builder2.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder8 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder10.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo15 = builder10.getRawInstance();
        instanceInfo15.setLastUpdatedTimestamp();
        com.netflix.appinfo.InstanceInfo instanceInfo17 = new com.netflix.appinfo.InstanceInfo(instanceInfo15);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus18 = instanceInfo15.getStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder2.setOverriddenStatus(instanceStatus18);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setPort(1);
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setPort((int) (byte) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder21.setStatusPageUrlForDeser("HI!");
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder25.setNamespace("na");
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder27.setIsCoordinatingDiscoveryServer(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder29.setHomePageUrl("UNKNOWN", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setIPAddr("HI!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder0.setHealthCheckUrls("", "NA", "http://inesserver2.windows.cin.ufpe.br:80/");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        java.lang.String[] strArray1 = new java.lang.String[] { "http://inesserver2.windows.cin.ufpe.br:80/" };
        com.netflix.appinfo.InstanceInfo.Builder builder2 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo9 = builder4.getRawInstance();
        instanceInfo9.setIsDirty();
        java.lang.String str11 = instanceInfo9.getAppGroupName();
        instanceInfo9.setSID("na");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus14 = instanceInfo9.getOverriddenStatus();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = instanceInfo9.getMetadata();
        java.lang.String str16 = instanceInfo9.getAppGroupName();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = instanceInfo9.getMetadata();
        instanceInfo9.setIsDirty(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo9);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setCountryId((int) '#');
        com.netflix.appinfo.InstanceInfo.Builder builder9 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType16 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setActionType(actionType16);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder6.setActionType(actionType16);
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setVIPAddress("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder20.setStatusPageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder20.add("/Status", "na");
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder20.add("http://inesserver2.windows.cin.ufpe.br:80/Status", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo instanceInfo29 = builder20.getRawInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder20.setHomePageUrl("", "");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setCountryId((int) '#');
        com.netflix.appinfo.InstanceInfo.Builder builder9 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType16 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setActionType(actionType16);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder6.setActionType(actionType16);
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setVIPAddress("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder18.setSecureVIPAddress("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder18.setSecureVIPAddressDeser("NA");
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder18.setAppName("eureka.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder18.setHomePageUrl("http://inesserver2.windows.cin.ufpe.br:80/", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setCountryId(0);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder2.add("http://inesserver2.windows.cin.ufpe.br:80/Status", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder2.setHomePageUrl("inesserver2.windows.cin.ufpe.br:80", "HI!");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setVIPAddressDeser("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.MODIFIED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setActionType(actionType5);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setSecureVIPAddressDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setNamespace("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setSecurePort((int) '4');
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setAppGroupName("inesserver2.windows.cin.ufpe.br:80");
        boolean boolean15 = builder12.isInitialized();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder12.setHomePageUrl("inesserver2.windows.cin.ufpe.br", "HI!");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setIPAddr("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setAppGroupName("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder11.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo16 = builder11.getRawInstance();
        instanceInfo16.setIsDirty();
        com.netflix.appinfo.InstanceInfo.ActionType actionType18 = instanceInfo16.getActionType();
        int int19 = instanceInfo16.getPort();
        boolean boolean20 = instanceInfo16.isDirty();
        com.netflix.appinfo.InstanceInfo.Builder builder21 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder23.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder23.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo28 = builder23.getRawInstance();
        int int29 = instanceInfo28.getPort();
        java.util.Map<java.lang.String, java.lang.String> strMap30 = instanceInfo28.getMetadata();
        instanceInfo28.unsetIsDirty((long) 7002);
        com.netflix.appinfo.InstanceInfo.Builder builder33 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder35 = builder33.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder35.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder35.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder39.setCountryId((int) '#');
        com.netflix.appinfo.InstanceInfo.Builder builder42 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder44 = builder42.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder46 = builder42.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder48 = builder46.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType49 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder50 = builder48.setActionType(actionType49);
        com.netflix.appinfo.InstanceInfo.Builder builder51 = builder39.setActionType(actionType49);
        instanceInfo28.setActionType(actionType49);
        instanceInfo16.setActionType(actionType49);
        com.netflix.appinfo.InstanceInfo.Builder builder54 = builder8.setActionType(actionType49);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder57 = builder8.setStatusPageUrl("/", "na");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setIPAddr("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setNamespace("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setSecureVIPAddressDeser("na");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setSecureVIPAddress("inesserver2.windows.cin.ufpe.br:80");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder12.setStatusPageUrl("http://inesserver2.windows.cin.ufpe.br:80/Status", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setVIPAddressDeser("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.MODIFIED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setActionType(actionType5);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setAppGroupName("/healthcheck");
        boolean boolean9 = builder8.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder8.setSID("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setPort((int) (short) 100);
        com.netflix.appinfo.InstanceInfo instanceInfo14 = builder13.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder13.setIPAddr("inesserver2.windows.cin.ufpe.br");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder13.setHealthCheckUrls("HI!", "eureka.", "unknown");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastUpdatedTimestamp((long) (short) 10);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus7 = com.netflix.appinfo.InstanceInfo.InstanceStatus.OUT_OF_SERVICE;
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setOverriddenStatus(instanceStatus7);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setSID("");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus12 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder10.setStatus(instanceStatus12);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder10.setSID("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder10.setAppName("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setSID("na");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder17.setHealthCheckUrls("inesserver2.windows.cin.ufpe.br:80", "hi!", "unknown");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType7 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setActionType(actionType7);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setNamespace("na");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setSecureVIPAddressDeser("172.20.26.3");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setHealthCheckUrls("http://inesserver2.windows.cin.ufpe.br:80/", "NA", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder2.getRawInstance();
        int int8 = instanceInfo7.getPort();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = instanceInfo7.getMetadata();
        instanceInfo7.unsetIsDirty((long) 7002);
        java.util.Set<java.lang.String> strSet12 = instanceInfo7.getHealthCheckUrls();
        com.netflix.appinfo.InstanceInfo.Builder builder13 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setASGName("inesserver2.windows.cin.ufpe.br");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder13.setStatusPageUrl("http://inesserver2.windows.cin.ufpe.br:80/", "UNKNOWN");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setIPAddr("HI!");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig6 = new com.netflix.appinfo.MyDataCenterInstanceConfig("172.20.26.3");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = myDataCenterInstanceConfig6.getMetadataMap();
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setMetadata(strMap7);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder4.setSecureVIPAddressDeser("/healthcheck");
        boolean boolean11 = builder10.isInitialized();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder10.setHomePageUrl("hi!", "");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setSecurePort((int) ' ');
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setNamespace("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setSecureVIPAddressDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setLastUpdatedTimestamp(1636104107816L);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setNamespace("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder15.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setSecurePort(10);
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setSID("na");
        com.netflix.appinfo.InstanceInfo.ActionType actionType24 = com.netflix.appinfo.InstanceInfo.ActionType.MODIFIED;
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder21.setActionType(actionType24);
        com.netflix.appinfo.InstanceInfo.Builder builder26 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder26.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder28.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder28.setASGName("");
        boolean boolean33 = builder28.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder34 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder34.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder38 = builder36.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder40 = builder36.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo41 = builder36.getRawInstance();
        instanceInfo41.setLastUpdatedTimestamp();
        com.netflix.appinfo.InstanceInfo instanceInfo43 = new com.netflix.appinfo.InstanceInfo(instanceInfo41);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus44 = instanceInfo41.getStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder45 = builder28.setOverriddenStatus(instanceStatus44);
        com.netflix.appinfo.InstanceInfo.Builder builder47 = builder45.setPort(1);
        com.netflix.appinfo.InstanceInfo.Builder builder49 = builder45.setLastUpdatedTimestamp((long) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder50 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder52 = builder50.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder54 = builder52.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder56 = builder52.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo57 = builder52.getRawInstance();
        int int58 = instanceInfo57.getPort();
        java.lang.Long long59 = instanceInfo57.isDirtyWithTime();
        instanceInfo57.setIsDirty();
        instanceInfo57.unsetIsDirty((long) (byte) 1);
        com.netflix.appinfo.InstanceInfo.ActionType actionType63 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        instanceInfo57.setActionType(actionType63);
        com.netflix.appinfo.InstanceInfo.Builder builder65 = builder49.setActionType(actionType63);
        com.netflix.appinfo.InstanceInfo.Builder builder66 = builder21.setActionType(actionType63);
        com.netflix.appinfo.InstanceInfo.Builder builder67 = builder12.setActionType(actionType63);
        com.netflix.appinfo.InstanceInfo.Builder builder69 = builder12.setIsCoordinatingDiscoveryServer(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder72 = builder12.setStatusPageUrl("na", "/Status");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setStatusPageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder6.setHealthCheckUrlsForDeser("", "/");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setIsCoordinatingDiscoveryServer(false);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig16 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int17 = myDataCenterInstanceConfig16.getLeaseExpirationDurationInSeconds();
        java.lang.String str18 = myDataCenterInstanceConfig16.getIpAddress();
        java.lang.String str19 = myDataCenterInstanceConfig16.getStatusPageUrl();
        java.lang.String str21 = myDataCenterInstanceConfig16.getHostName(true);
        java.lang.String str23 = myDataCenterInstanceConfig16.getHostName(false);
        java.lang.String str24 = myDataCenterInstanceConfig16.getHealthCheckUrl();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo25 = myDataCenterInstanceConfig16.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig26 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!", dataCenterInfo25);
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder11.setDataCenterInfo(dataCenterInfo25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder11.setStatusPageUrl("na", "");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder2.getRawInstance();
        int int8 = instanceInfo7.getPort();
        long long9 = instanceInfo7.getLastUpdatedTimestamp();
        instanceInfo7.setLastUpdatedTimestamp();
        java.lang.String str11 = instanceInfo7.getAppGroupName();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus12 = instanceInfo7.getOverriddenStatus();
        java.lang.String str13 = instanceInfo7.getSID();
        instanceInfo7.setIsCoordinatingDiscoveryServer();
        com.netflix.appinfo.InstanceInfo.Builder builder15 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder15.setHealthCheckUrls("172.20.26.3", "inesserver2.windows.cin.ufpe.br:80", "unknown");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setLastUpdatedTimestamp(10L);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setNamespace("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setLastDirtyTimestamp((long) 0);
        boolean boolean13 = builder10.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder10.setAppName("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder10.setLastUpdatedTimestamp(1636104117098L);
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder17.setHealthCheckUrlsForDeser("unknown", "/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder17.setPort((-1));
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder22.setAppName("/healthcheck");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder24.setHomePageUrl("na", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setStatusPageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder6.setHealthCheckUrlsForDeser("", "/");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder14.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo19 = builder14.getRawInstance();
        instanceInfo19.setIsDirty();
        instanceInfo19.setIsDirty(false);
        java.lang.Boolean boolean23 = instanceInfo19.isCoordinatingDiscoveryServer();
        java.util.Set<java.lang.String> strSet24 = instanceInfo19.getHealthCheckUrls();
        java.lang.String str25 = instanceInfo19.getSecureVipAddress();
        int int26 = instanceInfo19.getPort();
        java.lang.String str27 = instanceInfo19.getVIPAddress();
        instanceInfo19.setSID("");
        com.netflix.appinfo.InstanceInfo.Builder builder30 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder30.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder34 = builder32.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder32.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder38 = builder36.setCountryId((int) '#');
        com.netflix.appinfo.InstanceInfo.Builder builder39 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder39.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder43 = builder39.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder45 = builder43.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder46 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder48 = builder46.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder50 = builder48.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder52 = builder48.setASGName("");
        boolean boolean53 = builder48.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder54 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder56 = builder54.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder58 = builder56.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder60 = builder56.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo61 = builder56.getRawInstance();
        instanceInfo61.setLastUpdatedTimestamp();
        com.netflix.appinfo.InstanceInfo instanceInfo63 = new com.netflix.appinfo.InstanceInfo(instanceInfo61);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus64 = instanceInfo61.getStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder65 = builder48.setOverriddenStatus(instanceStatus64);
        com.netflix.appinfo.InstanceInfo.Builder builder66 = builder43.setStatus(instanceStatus64);
        com.netflix.appinfo.InstanceInfo.Builder builder67 = builder36.setStatus(instanceStatus64);
        com.netflix.appinfo.InstanceInfo.Builder builder68 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder70 = builder68.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder72 = builder70.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder74 = builder70.setASGName("");
        boolean boolean75 = builder70.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder76 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder78 = builder76.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder80 = builder78.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder82 = builder78.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo83 = builder78.getRawInstance();
        instanceInfo83.setLastUpdatedTimestamp();
        com.netflix.appinfo.InstanceInfo instanceInfo85 = new com.netflix.appinfo.InstanceInfo(instanceInfo83);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus86 = instanceInfo83.getStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder87 = builder70.setOverriddenStatus(instanceStatus86);
        com.netflix.appinfo.InstanceInfo.Builder builder88 = builder36.setOverriddenStatus(instanceStatus86);
        instanceInfo19.setOverriddenStatus(instanceStatus86);
        com.netflix.appinfo.InstanceInfo.PortType portType90 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        boolean boolean91 = instanceInfo19.isPortEnabled(portType90);
        com.netflix.appinfo.InstanceInfo.Builder builder93 = builder11.enablePort(portType90, false);
        com.netflix.appinfo.InstanceInfo.Builder builder95 = builder93.setSecureVIPAddress("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder99 = builder95.setHealthCheckUrls("/Status", "http://inesserver2.windows.cin.ufpe.br:80/", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setLastUpdatedTimestamp(10L);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setNamespace("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setLastDirtyTimestamp((long) 0);
        boolean boolean13 = builder10.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder10.setAppName("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder10.setLastUpdatedTimestamp(1636104117098L);
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder17.setHealthCheckUrlsForDeser("unknown", "/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder17.setPort((-1));
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder22.setAppName("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder24.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br:80");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder24.setHealthCheckUrls("/Status", "/healthcheck", "/");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setIPAddr("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setCountryId(30);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setLastDirtyTimestamp(1636104118529L);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setLastUpdatedTimestamp(1636104175891L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder8.setHealthCheckUrls("unknown", "/", "unknown");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setCountryId(0);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder2.setAppGroupName("na");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder2.setStatusPageUrl("", "http://inesserver2.windows.cin.ufpe.br:80/");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("na");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setIPAddr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder8.setHomePageUrl("", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.ADDED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setActionType(actionType5);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setLastUpdatedTimestamp((long) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setVIPAddress("/");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setCountryId((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder14.setStatusPageUrl("/Status", "/Status");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setCountryId((int) '#');
        com.netflix.appinfo.InstanceInfo.Builder builder9 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder18.setASGName("");
        boolean boolean23 = builder18.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder24 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder24.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder26.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder26.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo31 = builder26.getRawInstance();
        instanceInfo31.setLastUpdatedTimestamp();
        com.netflix.appinfo.InstanceInfo instanceInfo33 = new com.netflix.appinfo.InstanceInfo(instanceInfo31);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus34 = instanceInfo31.getStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder35 = builder18.setOverriddenStatus(instanceStatus34);
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder13.setStatus(instanceStatus34);
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder6.setStatus(instanceStatus34);
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder37.setAppGroupName("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder39.setAppName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder43 = builder41.setHomePageUrlForDeser("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder46 = builder43.setStatusPageUrl("inesserver2.windows.cin.ufpe.br", "HI!");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.add("", "/");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.setPort(80);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder8.add("", "/");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder8.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder16.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder20.setLastUpdatedTimestamp((long) (short) 10);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus23 = com.netflix.appinfo.InstanceInfo.InstanceStatus.OUT_OF_SERVICE;
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder22.setOverriddenStatus(instanceStatus23);
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder8.setOverriddenStatus(instanceStatus23);
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder0.setStatus(instanceStatus23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder0.setStatusPageUrl("", "/healthcheck");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setASGName("HI!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder8.setStatusPageUrl("/healthcheck", "http://inesserver2.windows.cin.ufpe.br:80/");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.add("/", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setHomePageUrl("unknown", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus5 = com.netflix.appinfo.InstanceInfo.InstanceStatus.OUT_OF_SERVICE;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setStatus(instanceStatus5);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder0.setIsCoordinatingDiscoveryServer(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder0.setHealthCheckUrls("/healthcheck", "inesserver2.windows.cin.ufpe.br", "/");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastUpdatedTimestamp((long) (short) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setStatusPageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setLastDirtyTimestamp(1636104137378L);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setVIPAddress("/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder12.setHomePageUrl("unknown", "/healthcheck");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.add("", "/");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.setASGName("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder7.setHealthCheckUrls("eureka.", "na", "172.20.26.3");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setASGName("");
        boolean boolean14 = builder9.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder15 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder17.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo22 = builder17.getRawInstance();
        instanceInfo22.setLastUpdatedTimestamp();
        com.netflix.appinfo.InstanceInfo instanceInfo24 = new com.netflix.appinfo.InstanceInfo(instanceInfo22);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus25 = instanceInfo22.getStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder9.setOverriddenStatus(instanceStatus25);
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder4.setStatus(instanceStatus25);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus28 = com.netflix.appinfo.InstanceInfo.InstanceStatus.OUT_OF_SERVICE;
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder27.setStatus(instanceStatus28);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig31 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int32 = myDataCenterInstanceConfig31.getLeaseExpirationDurationInSeconds();
        java.lang.String str33 = myDataCenterInstanceConfig31.getIpAddress();
        java.lang.String str34 = myDataCenterInstanceConfig31.getStatusPageUrl();
        java.lang.String str36 = myDataCenterInstanceConfig31.getHostName(true);
        java.util.Map<java.lang.String, java.lang.String> strMap37 = myDataCenterInstanceConfig31.getMetadataMap();
        com.netflix.appinfo.InstanceInfo.Builder builder38 = builder29.setMetadata(strMap37);
        com.netflix.appinfo.InstanceInfo.Builder builder40 = builder38.setSecureVIPAddress("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder44 = builder40.setHealthCheckUrls("/healthcheck", "hi!", "HI!");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setSecurePort(10);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setIPAddr("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder10.setSecurePort(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder14.setStatusPageUrl("hi!", "unknown");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus5 = com.netflix.appinfo.InstanceInfo.InstanceStatus.OUT_OF_SERVICE;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setStatus(instanceStatus5);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setLastUpdatedTimestamp(1636104113890L);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder10.add("/Status", "/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder10.setStatusPageUrl("default", "hi!");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setCountryId((int) '#');
        com.netflix.appinfo.InstanceInfo.Builder builder9 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder18.setASGName("");
        boolean boolean23 = builder18.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder24 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder24.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder26.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder26.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo31 = builder26.getRawInstance();
        instanceInfo31.setLastUpdatedTimestamp();
        com.netflix.appinfo.InstanceInfo instanceInfo33 = new com.netflix.appinfo.InstanceInfo(instanceInfo31);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus34 = instanceInfo31.getStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder35 = builder18.setOverriddenStatus(instanceStatus34);
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder13.setStatus(instanceStatus34);
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder6.setStatus(instanceStatus34);
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder37.setAppGroupName("inesserver2.windows.cin.ufpe.br");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder43 = builder37.setHealthCheckUrls("default", "http://inesserver2.windows.cin.ufpe.br:80/", "");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.add("", "/");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.setPort(80);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager8 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int11 = myDataCenterInstanceConfig10.getLeaseExpirationDurationInSeconds();
        java.lang.String str12 = myDataCenterInstanceConfig10.getNamespace();
        java.lang.String str13 = myDataCenterInstanceConfig10.getStatusPageUrl();
        applicationInfoManager8.config = myDataCenterInstanceConfig10;
        com.netflix.appinfo.InstanceInfo.Builder builder15 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder17.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo22 = builder17.getRawInstance();
        instanceInfo22.setIsDirty();
        com.netflix.appinfo.InstanceInfo.ActionType actionType24 = instanceInfo22.getActionType();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager25 = new com.netflix.appinfo.ApplicationInfoManager((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig10, instanceInfo22);
        com.netflix.appinfo.InstanceInfo.Builder builder26 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder26.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder28.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder28.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo33 = builder28.getRawInstance();
        int int34 = instanceInfo33.getPort();
        java.util.Map<java.lang.String, java.lang.String> strMap35 = instanceInfo33.getMetadata();
        java.lang.String str36 = instanceInfo33.getId();
        com.netflix.appinfo.InstanceInfo.ActionType actionType37 = com.netflix.appinfo.InstanceInfo.ActionType.ADDED;
        instanceInfo33.setActionType(actionType37);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus39 = instanceInfo33.getStatus();
        applicationInfoManager25.setInstanceStatus(instanceStatus39);
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder0.setOverriddenStatus(instanceStatus39);
        com.netflix.appinfo.InstanceInfo.Builder builder43 = builder41.setSecurePort((int) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder45 = builder43.setNamespace("HI!");
        com.netflix.appinfo.InstanceInfo.Builder builder47 = builder45.setAppName("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder49 = builder47.setHomePageUrlForDeser("inesserver2.windows.cin.ufpe.br");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder52 = builder49.setHomePageUrl("UNKNOWN", "unknown");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder2.setHomePageUrl("http://inesserver2.windows.cin.ufpe.br:80/Status", "/");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder2.getRawInstance();
        int int8 = instanceInfo7.getPort();
        long long9 = instanceInfo7.getLastUpdatedTimestamp();
        instanceInfo7.setLastUpdatedTimestamp();
        com.netflix.appinfo.InstanceInfo.Builder builder11 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder11.setHomePageUrl("/healthcheck", "UNKNOWN");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setAppName("na");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder11.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo16 = builder11.getRawInstance();
        int int17 = instanceInfo16.getPort();
        long long18 = instanceInfo16.getLastUpdatedTimestamp();
        long long19 = instanceInfo16.getLastUpdatedTimestamp();
        int int20 = instanceInfo16.getCountryId();
        int int21 = instanceInfo16.getSecurePort();
        java.util.Set<java.lang.String> strSet22 = instanceInfo16.getHealthCheckUrls();
        com.netflix.appinfo.LeaseInfo leaseInfo23 = instanceInfo16.getLeaseInfo();
        java.util.Map<java.lang.String, java.lang.String> strMap24 = instanceInfo16.getMetadata();
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder8.setMetadata(strMap24);
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder8.add("default", "172.20.26.3");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder28.setHealthCheckUrls("inesserver2.windows.cin.ufpe.br", "eureka.", "unknown");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastUpdatedTimestamp((long) (short) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setVIPAddress("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setVIPAddress("");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setSecureVIPAddressDeser("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder10.setIsCoordinatingDiscoveryServer(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder10.setHomePageUrl("hi!", "eureka.");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.add("/", "hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setSecureVIPAddress("NA");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder11.setHealthCheckUrlsForDeser("http://inesserver2.windows.cin.ufpe.br:80/Status", "HI!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder14.setStatusPageUrl("UNKNOWN", "/Status");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setCountryId((int) '#');
        com.netflix.appinfo.InstanceInfo.Builder builder9 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType16 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setActionType(actionType16);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder6.setActionType(actionType16);
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setVIPAddress("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder20.setHomePageUrlForDeser("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder20.setHealthCheckUrls("hi!", "/Status", "");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus5 = com.netflix.appinfo.InstanceInfo.InstanceStatus.OUT_OF_SERVICE;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setStatus(instanceStatus5);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo14 = builder9.getRawInstance();
        int int15 = instanceInfo14.getPort();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = instanceInfo14.getMetadata();
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder0.setMetadata(strMap16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder0.setHomePageUrl("na", "eureka.");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        boolean boolean7 = builder2.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder2.setSecureVIPAddressDeser("HI!");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder2.setAppName("HI!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder11.setHealthCheckUrls("http://inesserver2.windows.cin.ufpe.br:80/", "/", "");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setIPAddr("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setCountryId(30);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setLastDirtyTimestamp(1636104118529L);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder10.add("http://inesserver2.windows.cin.ufpe.br:80/", "inesserver2.windows.cin.ufpe.br:80");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder13.setStatusPageUrl("/healthcheck", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setVIPAddressDeser("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = com.netflix.appinfo.InstanceInfo.ActionType.MODIFIED;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setActionType(actionType5);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setAppGroupName("HI!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setHealthCheckUrls("172.20.26.3", "na", "/Status");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        boolean boolean7 = builder2.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder8 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder10.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo15 = builder10.getRawInstance();
        instanceInfo15.setLastUpdatedTimestamp();
        com.netflix.appinfo.InstanceInfo instanceInfo17 = new com.netflix.appinfo.InstanceInfo(instanceInfo15);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus18 = instanceInfo15.getStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder2.setOverriddenStatus(instanceStatus18);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setPort(1);
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setPort((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder21.setHomePageUrl("", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        boolean boolean7 = builder2.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder8 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder10.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo15 = builder10.getRawInstance();
        instanceInfo15.setLastUpdatedTimestamp();
        com.netflix.appinfo.InstanceInfo instanceInfo17 = new com.netflix.appinfo.InstanceInfo(instanceInfo15);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus18 = instanceInfo15.getStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder2.setOverriddenStatus(instanceStatus18);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setPort(1);
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder19.setLastUpdatedTimestamp((long) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder23.setAppGroupName("hi!");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager26 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig28 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int29 = myDataCenterInstanceConfig28.getLeaseExpirationDurationInSeconds();
        java.lang.String str30 = myDataCenterInstanceConfig28.getNamespace();
        java.lang.String str31 = myDataCenterInstanceConfig28.getStatusPageUrl();
        applicationInfoManager26.config = myDataCenterInstanceConfig28;
        com.netflix.appinfo.InstanceInfo.Builder builder33 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder35 = builder33.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder35.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder35.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo40 = builder35.getRawInstance();
        instanceInfo40.setIsDirty();
        com.netflix.appinfo.InstanceInfo.ActionType actionType42 = instanceInfo40.getActionType();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager43 = new com.netflix.appinfo.ApplicationInfoManager((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig28, instanceInfo40);
        java.lang.String str44 = instanceInfo40.getIPAddr();
        com.netflix.appinfo.InstanceInfo.Builder builder45 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder47 = builder45.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder49 = builder47.setVIPAddressDeser("unknown");
        com.netflix.appinfo.InstanceInfo.ActionType actionType50 = com.netflix.appinfo.InstanceInfo.ActionType.MODIFIED;
        com.netflix.appinfo.InstanceInfo.Builder builder51 = builder47.setActionType(actionType50);
        instanceInfo40.setActionType(actionType50);
        int int53 = instanceInfo40.getSecurePort();
        java.lang.Long long54 = instanceInfo40.getLastDirtyTimestamp();
        instanceInfo40.unsetIsDirty((long) 443);
        java.lang.String str57 = instanceInfo40.getStatusPageUrl();
        boolean boolean58 = instanceInfo40.isDirty();
        com.netflix.appinfo.InstanceInfo.ActionType actionType59 = instanceInfo40.getActionType();
        com.netflix.appinfo.InstanceInfo.ActionType actionType60 = instanceInfo40.getActionType();
        com.netflix.appinfo.InstanceInfo.Builder builder61 = builder23.setActionType(actionType60);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder65 = builder61.setHealthCheckUrls("inesserver2.windows.cin.ufpe.br", "eureka.", "NA");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setCountryId((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder8.setStatusPageUrl("default", "eureka.");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setStatusPageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setPort(0);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setCountryId(443);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setIsCoordinatingDiscoveryServer(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder12.setHealthCheckUrls("eureka.", "default", "unknown");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setSecurePort(10);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setSID("na");
        com.netflix.appinfo.InstanceInfo.ActionType actionType11 = com.netflix.appinfo.InstanceInfo.ActionType.MODIFIED;
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setActionType(actionType11);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder15.setASGName("");
        boolean boolean20 = builder15.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder21 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder23.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder23.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo28 = builder23.getRawInstance();
        instanceInfo28.setLastUpdatedTimestamp();
        com.netflix.appinfo.InstanceInfo instanceInfo30 = new com.netflix.appinfo.InstanceInfo(instanceInfo28);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus31 = instanceInfo28.getStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder15.setOverriddenStatus(instanceStatus31);
        com.netflix.appinfo.InstanceInfo.Builder builder34 = builder32.setPort(1);
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder32.setLastUpdatedTimestamp((long) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder37 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder37.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder39.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder43 = builder39.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo44 = builder39.getRawInstance();
        int int45 = instanceInfo44.getPort();
        java.lang.Long long46 = instanceInfo44.isDirtyWithTime();
        instanceInfo44.setIsDirty();
        instanceInfo44.unsetIsDirty((long) (byte) 1);
        com.netflix.appinfo.InstanceInfo.ActionType actionType50 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        instanceInfo44.setActionType(actionType50);
        com.netflix.appinfo.InstanceInfo.Builder builder52 = builder36.setActionType(actionType50);
        com.netflix.appinfo.InstanceInfo.Builder builder53 = builder8.setActionType(actionType50);
        com.netflix.appinfo.InstanceInfo.Builder builder54 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder56 = builder54.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder58 = builder56.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder60 = builder56.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo61 = builder56.getRawInstance();
        int int62 = instanceInfo61.getPort();
        java.lang.Long long63 = instanceInfo61.isDirtyWithTime();
        instanceInfo61.setIsDirty();
        instanceInfo61.unsetIsDirty((long) (byte) 1);
        com.netflix.appinfo.InstanceInfo.ActionType actionType67 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        instanceInfo61.setActionType(actionType67);
        com.netflix.appinfo.InstanceInfo.Builder builder69 = builder8.setActionType(actionType67);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder72 = builder69.setStatusPageUrl("", "na");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder2.getRawInstance();
        instanceInfo7.setIsDirty();
        instanceInfo7.setIsDirty(false);
        java.lang.Boolean boolean11 = instanceInfo7.isCoordinatingDiscoveryServer();
        com.netflix.appinfo.LeaseInfo leaseInfo12 = instanceInfo7.getLeaseInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder13 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setNamespace("http://inesserver2.windows.cin.ufpe.br:80/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder15.setHomePageUrl("UNKNOWN", "/Status");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setCountryId(0);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder2.setLastUpdatedTimestamp(1636104104211L);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setSecureVIPAddressDeser("http://inesserver2.windows.cin.ufpe.br:80/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder12.setHomePageUrl("inesserver2.windows.cin.ufpe.br", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setCountryId((int) '#');
        com.netflix.appinfo.InstanceInfo.Builder builder9 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType16 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setActionType(actionType16);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder6.setActionType(actionType16);
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setVIPAddress("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder20.setLastDirtyTimestamp(1636104108672L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder22.setHomePageUrl("default", "HI!");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder2.getRawInstance();
        instanceInfo7.setIsDirty();
        instanceInfo7.setIsDirty(false);
        java.lang.Boolean boolean11 = instanceInfo7.isCoordinatingDiscoveryServer();
        java.util.Set<java.lang.String> strSet12 = instanceInfo7.getHealthCheckUrls();
        com.netflix.appinfo.InstanceInfo.Builder builder13 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder14.setStatusPageUrl("HI!", "/HEALTHCHECK");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        java.lang.String[] strArray6 = new java.lang.String[] { "/healthcheck", "http://inesserver2.windows.cin.ufpe.br:80/", "/Status", "unknown", "unknown", "/Status" };
        com.netflix.appinfo.InstanceInfo.Builder builder7 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo14 = builder9.getRawInstance();
        int int15 = instanceInfo14.getPort();
        long long16 = instanceInfo14.getLastUpdatedTimestamp();
        long long17 = instanceInfo14.getLastUpdatedTimestamp();
        int int18 = instanceInfo14.getCountryId();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus19 = instanceInfo14.getOverriddenStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = com.netflix.appinfo.InstanceInfo.getZone(strArray6, instanceInfo14);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setCountryId((int) '#');
        com.netflix.appinfo.InstanceInfo.Builder builder9 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType16 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setActionType(actionType16);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder6.setActionType(actionType16);
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setVIPAddress("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder20.setStatusPageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder20.add("/Status", "na");
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder20.add("http://inesserver2.windows.cin.ufpe.br:80/Status", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder20.setAppName("/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder33 = builder30.setStatusPageUrl("/healthcheck", "NA");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.add("/", "hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder9.setOverriddenStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setVIPAddress("HI!");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder17.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo22 = builder17.getRawInstance();
        instanceInfo22.setIsDirty();
        int int24 = instanceInfo22.getPort();
        java.util.Set<java.lang.String> strSet25 = instanceInfo22.getHealthCheckUrls();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus26 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        instanceInfo22.setStatusWithoutDirty(instanceStatus26);
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder12.setOverriddenStatus(instanceStatus26);
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder12.setIPAddr("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder30.setStatusPageUrlForDeser("NA");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder35 = builder30.setStatusPageUrl("inesserver2.windows.cin.ufpe.br", "eureka.");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setLastUpdatedTimestamp(10L);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setNamespace("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setSecureVIPAddressDeser("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder12.setHomePageUrl("http://inesserver2.windows.cin.ufpe.br:80/", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setCountryId((int) '#');
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setAppGroupName("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setIPAddr("na");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setLastDirtyTimestamp(1636104230893L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder14.setHomePageUrl("NA", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setIPAddr("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setNamespace("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setSecureVIPAddressDeser("na");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setSecureVIPAddress("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder16.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder20.setCountryId((int) '#');
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder22.setAppGroupName("/healthcheck");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig28 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int29 = myDataCenterInstanceConfig28.getLeaseExpirationDurationInSeconds();
        java.lang.String str30 = myDataCenterInstanceConfig28.getIpAddress();
        java.lang.String str31 = myDataCenterInstanceConfig28.getStatusPageUrl();
        java.lang.String str33 = myDataCenterInstanceConfig28.getHostName(true);
        java.lang.String str35 = myDataCenterInstanceConfig28.getHostName(false);
        java.lang.String str36 = myDataCenterInstanceConfig28.getHealthCheckUrl();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo37 = myDataCenterInstanceConfig28.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig38 = new com.netflix.appinfo.MyDataCenterInstanceConfig("/Status", dataCenterInfo37);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig39 = new com.netflix.appinfo.MyDataCenterInstanceConfig("", dataCenterInfo37);
        com.netflix.appinfo.InstanceInfo.Builder builder40 = builder24.setDataCenterInfo(dataCenterInfo37);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig41 = new com.netflix.appinfo.MyDataCenterInstanceConfig("na", dataCenterInfo37);
        com.netflix.appinfo.InstanceInfo.Builder builder42 = builder12.setDataCenterInfo(dataCenterInfo37);
        com.netflix.appinfo.InstanceInfo.Builder builder44 = builder42.setLastDirtyTimestamp(1636104263792L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder47 = builder44.setStatusPageUrl("hi!", "/healthcheck");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setCountryId((int) '#');
        com.netflix.appinfo.InstanceInfo.Builder builder9 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder18.setASGName("");
        boolean boolean23 = builder18.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder24 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder24.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder26.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder26.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo31 = builder26.getRawInstance();
        instanceInfo31.setLastUpdatedTimestamp();
        com.netflix.appinfo.InstanceInfo instanceInfo33 = new com.netflix.appinfo.InstanceInfo(instanceInfo31);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus34 = instanceInfo31.getStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder35 = builder18.setOverriddenStatus(instanceStatus34);
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder13.setStatus(instanceStatus34);
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder6.setStatus(instanceStatus34);
        com.netflix.appinfo.InstanceInfo.Builder builder38 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder40 = builder38.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder42 = builder40.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder44 = builder40.setASGName("");
        boolean boolean45 = builder40.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder46 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder48 = builder46.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder50 = builder48.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder52 = builder48.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo53 = builder48.getRawInstance();
        instanceInfo53.setLastUpdatedTimestamp();
        com.netflix.appinfo.InstanceInfo instanceInfo55 = new com.netflix.appinfo.InstanceInfo(instanceInfo53);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus56 = instanceInfo53.getStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder57 = builder40.setOverriddenStatus(instanceStatus56);
        com.netflix.appinfo.InstanceInfo.Builder builder58 = builder6.setOverriddenStatus(instanceStatus56);
        com.netflix.appinfo.InstanceInfo.Builder builder60 = builder6.setSecurePort((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder62 = builder6.setLastDirtyTimestamp(1636104147125L);
        com.netflix.appinfo.InstanceInfo.Builder builder64 = builder62.setVIPAddressDeser("HI!");
        com.netflix.appinfo.InstanceInfo.Builder builder66 = builder64.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder68 = builder66.setSecureVIPAddress("/healthcheck");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder71 = builder66.setStatusPageUrl("HI!", "unknown");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setCountryId((int) '#');
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setAppGroupName("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setIPAddr("na");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder10.setPort((int) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder10.setNamespace("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setIsCoordinatingDiscoveryServer(true);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder21.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo26 = builder21.getRawInstance();
        instanceInfo26.setIsDirty();
        int int28 = instanceInfo26.getPort();
        java.lang.Boolean boolean29 = instanceInfo26.isCoordinatingDiscoveryServer();
        com.netflix.appinfo.LeaseInfo leaseInfo30 = instanceInfo26.getLeaseInfo();
        java.util.Map<java.lang.String, java.lang.String> strMap31 = instanceInfo26.getMetadata();
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder18.setMetadata(strMap31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder18.setHealthCheckUrls("hi!", "inesserver2.windows.cin.ufpe.br", "172.20.26.3");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus5 = com.netflix.appinfo.InstanceInfo.InstanceStatus.OUT_OF_SERVICE;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setStatus(instanceStatus5);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder0.setHealthCheckUrlsForDeser("eureka.", "eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setSecureVIPAddress("NA");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder9.setHealthCheckUrls("/HEALTHCHECK", "/HEALTHCHECK", "default");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setStatusPageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setPort(0);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setCountryId(443);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setCountryId(0);
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setASGName("NA");
        boolean boolean17 = builder14.isInitialized();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder14.setStatusPageUrl("http://inesserver2.windows.cin.ufpe.br:80/Status", "HI!");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.add("", "/");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.setPort(80);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager8 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int11 = myDataCenterInstanceConfig10.getLeaseExpirationDurationInSeconds();
        java.lang.String str12 = myDataCenterInstanceConfig10.getNamespace();
        java.lang.String str13 = myDataCenterInstanceConfig10.getStatusPageUrl();
        applicationInfoManager8.config = myDataCenterInstanceConfig10;
        com.netflix.appinfo.InstanceInfo.Builder builder15 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder17.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo22 = builder17.getRawInstance();
        instanceInfo22.setIsDirty();
        com.netflix.appinfo.InstanceInfo.ActionType actionType24 = instanceInfo22.getActionType();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager25 = new com.netflix.appinfo.ApplicationInfoManager((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig10, instanceInfo22);
        com.netflix.appinfo.InstanceInfo.Builder builder26 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder26.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder28.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder28.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo33 = builder28.getRawInstance();
        int int34 = instanceInfo33.getPort();
        java.util.Map<java.lang.String, java.lang.String> strMap35 = instanceInfo33.getMetadata();
        java.lang.String str36 = instanceInfo33.getId();
        com.netflix.appinfo.InstanceInfo.ActionType actionType37 = com.netflix.appinfo.InstanceInfo.ActionType.ADDED;
        instanceInfo33.setActionType(actionType37);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus39 = instanceInfo33.getStatus();
        applicationInfoManager25.setInstanceStatus(instanceStatus39);
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder0.setOverriddenStatus(instanceStatus39);
        com.netflix.appinfo.InstanceInfo.Builder builder43 = builder41.setSecurePort((int) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder45 = builder43.setNamespace("HI!");
        com.netflix.appinfo.InstanceInfo.Builder builder47 = builder43.setVIPAddressDeser("inesserver2.windows.cin.ufpe.br");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder50 = builder47.setStatusPageUrl("", "/HEALTHCHECK");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.add("", "/");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setLastUpdatedTimestamp((long) (short) 10);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus15 = com.netflix.appinfo.InstanceInfo.InstanceStatus.OUT_OF_SERVICE;
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setOverriddenStatus(instanceStatus15);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder0.setOverriddenStatus(instanceStatus15);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder0.setIsCoordinatingDiscoveryServer(true);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setSecureVIPAddress("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder21.add("inesserver2.windows.cin.ufpe.br", "/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder24.setIsCoordinatingDiscoveryServer(true);
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder24.setVIPAddress("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig30 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int31 = myDataCenterInstanceConfig30.getLeaseExpirationDurationInSeconds();
        java.lang.String str32 = myDataCenterInstanceConfig30.getNamespace();
        java.lang.String str33 = myDataCenterInstanceConfig30.getStatusPageUrl();
        boolean boolean34 = myDataCenterInstanceConfig30.isNonSecurePortEnabled();
        int int35 = myDataCenterInstanceConfig30.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo36 = myDataCenterInstanceConfig30.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder28.setDataCenterInfo(dataCenterInfo36);
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder28.setSID("http://inesserver2.windows.cin.ufpe.br:80/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder42 = builder28.setStatusPageUrl("http://inesserver2.windows.cin.ufpe.br:80/Status", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.add("", "/");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setLastUpdatedTimestamp((long) 80);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setPort((int) '4');
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setStatusPageUrlForDeser("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setVIPAddress("/");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setStatusPageUrlForDeser("");
        boolean boolean18 = builder17.isInitialized();
        com.netflix.appinfo.InstanceInfo instanceInfo19 = builder17.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder17.setAppGroupName("inesserver2.windows.cin.ufpe.br:80");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder21.setHealthCheckUrls("inesserver2.windows.cin.ufpe.br:80", "HI!", "eureka.");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setCountryId(0);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder2.setLastUpdatedTimestamp(1636104104211L);
        com.netflix.appinfo.InstanceInfo instanceInfo11 = builder2.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder2.setIPAddr("eureka.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder2.setHealthCheckUrls("/", "hi!", "HI!");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.add("", "/");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.setPort(80);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager8 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int11 = myDataCenterInstanceConfig10.getLeaseExpirationDurationInSeconds();
        java.lang.String str12 = myDataCenterInstanceConfig10.getNamespace();
        java.lang.String str13 = myDataCenterInstanceConfig10.getStatusPageUrl();
        applicationInfoManager8.config = myDataCenterInstanceConfig10;
        com.netflix.appinfo.InstanceInfo.Builder builder15 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder17.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo22 = builder17.getRawInstance();
        instanceInfo22.setIsDirty();
        com.netflix.appinfo.InstanceInfo.ActionType actionType24 = instanceInfo22.getActionType();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager25 = new com.netflix.appinfo.ApplicationInfoManager((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig10, instanceInfo22);
        com.netflix.appinfo.InstanceInfo.Builder builder26 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder26.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder28.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder28.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo33 = builder28.getRawInstance();
        int int34 = instanceInfo33.getPort();
        java.util.Map<java.lang.String, java.lang.String> strMap35 = instanceInfo33.getMetadata();
        java.lang.String str36 = instanceInfo33.getId();
        com.netflix.appinfo.InstanceInfo.ActionType actionType37 = com.netflix.appinfo.InstanceInfo.ActionType.ADDED;
        instanceInfo33.setActionType(actionType37);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus39 = instanceInfo33.getStatus();
        applicationInfoManager25.setInstanceStatus(instanceStatus39);
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder0.setOverriddenStatus(instanceStatus39);
        com.netflix.appinfo.InstanceInfo.Builder builder43 = builder41.setSecurePort((int) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder45 = builder43.setNamespace("HI!");
        com.netflix.appinfo.InstanceInfo.Builder builder47 = builder43.setVIPAddressDeser("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder49 = builder43.setASGName("inesserver2.windows.cin.ufpe.br");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder53 = builder49.setHealthCheckUrls("inesserver2.windows.cin.ufpe.br", "eureka.", "hi!");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setASGName("");
        boolean boolean14 = builder9.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder15 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder17.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo22 = builder17.getRawInstance();
        instanceInfo22.setLastUpdatedTimestamp();
        com.netflix.appinfo.InstanceInfo instanceInfo24 = new com.netflix.appinfo.InstanceInfo(instanceInfo22);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus25 = instanceInfo22.getStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder9.setOverriddenStatus(instanceStatus25);
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder4.setStatus(instanceStatus25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder4.setStatusPageUrl("UNKNOWN", "na");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastUpdatedTimestamp((long) (short) 10);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus7 = com.netflix.appinfo.InstanceInfo.InstanceStatus.OUT_OF_SERVICE;
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setOverriddenStatus(instanceStatus7);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setPort(0);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setSecureVIPAddressDeser("na");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder6.setLastDirtyTimestamp(1636104125978L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder6.setStatusPageUrl("172.20.26.3", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.add("", "/");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.setPort(80);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setLastUpdatedTimestamp(1636104177071L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder9.setHomePageUrl("HI!", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        boolean boolean7 = builder2.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder2.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setASGName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setSID("UNKNOWN");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder13.setHealthCheckUrls("inesserver2.windows.cin.ufpe.br", "HI!", "hi!");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastUpdatedTimestamp((long) (short) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setVIPAddress("/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder6.setStatusPageUrl("UNKNOWN", "/healthcheck");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "HI!", "/HEALTHCHECK", "172.20.26.3", "/" };
        com.netflix.appinfo.InstanceInfo.Builder builder6 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo13 = builder8.getRawInstance();
        int int14 = instanceInfo13.getPort();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = instanceInfo13.getMetadata();
        java.lang.String str16 = instanceInfo13.getId();
        instanceInfo13.setSID("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = com.netflix.appinfo.InstanceInfo.getZone(strArray5, instanceInfo13);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType7 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setActionType(actionType7);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setASGName("UNKNOWN");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder10.setStatusPageUrl("", "HI!");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastUpdatedTimestamp((long) (short) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setVIPAddress("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setIPAddr("/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder10.setStatusPageUrl("inesserver2.windows.cin.ufpe.br:80", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastUpdatedTimestamp((long) (short) 10);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus7 = com.netflix.appinfo.InstanceInfo.InstanceStatus.OUT_OF_SERVICE;
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setOverriddenStatus(instanceStatus7);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setSID("");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus12 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder10.setStatus(instanceStatus12);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder10.setSID("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setNamespace("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setLastUpdatedTimestamp(1636104141438L);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder17.setLastDirtyTimestamp(1636104123593L);
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setNamespace("NA");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder23.setStatusPageUrl("HI!", "HI!");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setASGName("HI!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setHealthCheckUrls("/HEALTHCHECK", "inesserver2.windows.cin.ufpe.br:80", "eureka.");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setStatusPageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setLastDirtyTimestamp(1L);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setVIPAddress("HI!");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder12.setHealthCheckUrlsForDeser("/", "/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder12.setHealthCheckUrls("HI!", "/Status", "na");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setSecurePort((int) ' ');
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setNamespace("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setSecureVIPAddressDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setLastUpdatedTimestamp(1636104107816L);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setNamespace("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder15.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setSecurePort(10);
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setSID("na");
        com.netflix.appinfo.InstanceInfo.ActionType actionType24 = com.netflix.appinfo.InstanceInfo.ActionType.MODIFIED;
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder21.setActionType(actionType24);
        com.netflix.appinfo.InstanceInfo.Builder builder26 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder26.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder28.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder28.setASGName("");
        boolean boolean33 = builder28.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder34 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder34.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder38 = builder36.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder40 = builder36.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo41 = builder36.getRawInstance();
        instanceInfo41.setLastUpdatedTimestamp();
        com.netflix.appinfo.InstanceInfo instanceInfo43 = new com.netflix.appinfo.InstanceInfo(instanceInfo41);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus44 = instanceInfo41.getStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder45 = builder28.setOverriddenStatus(instanceStatus44);
        com.netflix.appinfo.InstanceInfo.Builder builder47 = builder45.setPort(1);
        com.netflix.appinfo.InstanceInfo.Builder builder49 = builder45.setLastUpdatedTimestamp((long) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder50 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder52 = builder50.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder54 = builder52.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder56 = builder52.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo57 = builder52.getRawInstance();
        int int58 = instanceInfo57.getPort();
        java.lang.Long long59 = instanceInfo57.isDirtyWithTime();
        instanceInfo57.setIsDirty();
        instanceInfo57.unsetIsDirty((long) (byte) 1);
        com.netflix.appinfo.InstanceInfo.ActionType actionType63 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        instanceInfo57.setActionType(actionType63);
        com.netflix.appinfo.InstanceInfo.Builder builder65 = builder49.setActionType(actionType63);
        com.netflix.appinfo.InstanceInfo.Builder builder66 = builder21.setActionType(actionType63);
        com.netflix.appinfo.InstanceInfo.Builder builder67 = builder12.setActionType(actionType63);
        com.netflix.appinfo.InstanceInfo.Builder builder69 = builder67.setPort((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder72 = builder69.setStatusPageUrl("/Status", "unknown");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.add("", "/");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder0.setPort((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder9.setStatusPageUrl("eureka.", "/HEALTHCHECK");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        boolean boolean7 = builder2.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder8 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder10.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo15 = builder10.getRawInstance();
        instanceInfo15.setLastUpdatedTimestamp();
        com.netflix.appinfo.InstanceInfo instanceInfo17 = new com.netflix.appinfo.InstanceInfo(instanceInfo15);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus18 = instanceInfo15.getStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder2.setOverriddenStatus(instanceStatus18);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder2.setAppGroupName("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setHomePageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder23.setIPAddr("UNKNOWN");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder23.setStatusPageUrl("/healthcheck", "UNKNOWN");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastUpdatedTimestamp((long) (short) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setVIPAddress("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setVIPAddress("");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig12 = new com.netflix.appinfo.MyDataCenterInstanceConfig("172.20.26.3");
        java.util.Map<java.lang.String, java.lang.String> strMap13 = myDataCenterInstanceConfig12.getMetadataMap();
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder10.setMetadata(strMap13);
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setStatusPageUrlForDeser("/HEALTHCHECK");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder14.setHealthCheckUrls("inesserver2.windows.cin.ufpe.br:80", "172.20.26.3", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.add("", "/");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.setPort(80);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder0.setSecureVIPAddressDeser("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder9.add("172.20.26.3", "inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setAppName("eureka.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder12.setHomePageUrl("inesserver2.windows.cin.ufpe.br", "http://inesserver2.windows.cin.ufpe.br:80/");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setIsCoordinatingDiscoveryServer(true);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setASGName("http://inesserver2.windows.cin.ufpe.br:80/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder8.setHealthCheckUrls("/healthcheck", "/Status", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setLastDirtyTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setLastUpdatedTimestamp((long) (short) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setSecurePort((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setHealthCheckUrls("/Status", "eureka.", "hi!");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setVIPAddressDeser("inesserver2.windows.cin.ufpe.br:80");
        boolean boolean5 = builder4.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder4.setHomePageUrlForDeser("172.20.26.3");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder7.setHomePageUrl("hi!", "NA");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setIPAddr("HI!");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder5.add("", "/");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder5.setPort(80);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager13 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig15 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int16 = myDataCenterInstanceConfig15.getLeaseExpirationDurationInSeconds();
        java.lang.String str17 = myDataCenterInstanceConfig15.getNamespace();
        java.lang.String str18 = myDataCenterInstanceConfig15.getStatusPageUrl();
        applicationInfoManager13.config = myDataCenterInstanceConfig15;
        com.netflix.appinfo.InstanceInfo.Builder builder20 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder20.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder22.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder22.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo27 = builder22.getRawInstance();
        instanceInfo27.setIsDirty();
        com.netflix.appinfo.InstanceInfo.ActionType actionType29 = instanceInfo27.getActionType();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager30 = new com.netflix.appinfo.ApplicationInfoManager((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig15, instanceInfo27);
        com.netflix.appinfo.InstanceInfo.Builder builder31 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder33 = builder31.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder35 = builder33.setLastUpdatedTimestamp((long) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder33.setASGName("");
        com.netflix.appinfo.InstanceInfo instanceInfo38 = builder33.getRawInstance();
        int int39 = instanceInfo38.getPort();
        java.util.Map<java.lang.String, java.lang.String> strMap40 = instanceInfo38.getMetadata();
        java.lang.String str41 = instanceInfo38.getId();
        com.netflix.appinfo.InstanceInfo.ActionType actionType42 = com.netflix.appinfo.InstanceInfo.ActionType.ADDED;
        instanceInfo38.setActionType(actionType42);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus44 = instanceInfo38.getStatus();
        applicationInfoManager30.setInstanceStatus(instanceStatus44);
        com.netflix.appinfo.InstanceInfo.Builder builder46 = builder5.setOverriddenStatus(instanceStatus44);
        com.netflix.appinfo.InstanceInfo.Builder builder47 = builder0.setOverriddenStatus(instanceStatus44);
        com.netflix.appinfo.InstanceInfo.Builder builder49 = builder47.setLastDirtyTimestamp(1636104120875L);
        com.netflix.appinfo.InstanceInfo.Builder builder51 = builder47.setSecurePort(7001);
        com.netflix.appinfo.InstanceInfo.Builder builder53 = builder51.setVIPAddress("HI!");
        com.netflix.appinfo.InstanceInfo.Builder builder55 = builder51.setSecureVIPAddress("default");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder58 = builder51.setStatusPageUrl("inesserver2.windows.cin.ufpe.br:80", "na");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.add("", "/");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setASGName("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setNamespace("http://inesserver2.windows.cin.ufpe.br:80/");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setAppGroupName("unknown");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder11.setHealthCheckUrls("172.20.26.3", "na", "/healthcheck");
    }
}

