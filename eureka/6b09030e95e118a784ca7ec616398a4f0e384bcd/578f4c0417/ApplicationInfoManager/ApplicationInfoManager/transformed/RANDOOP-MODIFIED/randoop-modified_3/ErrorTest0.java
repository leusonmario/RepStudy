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
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig2 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager0.config = myDataCenterInstanceConfig2;
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus4 = com.netflix.appinfo.InstanceInfo.InstanceStatus.UP;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.setInstanceStatus(instanceStatus4);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder3 = builder0.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder3.setCountryId((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder5.setHealthCheckUrls("hi!", "/Status", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddress("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setHealthCheckUrls("eureka.", "unknown", "eureka.");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecurePort(7001);
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.add("eureka.", "172.20.26.3");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder5.setStatusPageUrl("eureka.", "eureka.");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder3 = builder0.setHomePageUrl("eureka.", "na");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecurePort(7001);
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.add("eureka.", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.setSecureVIPAddressDeser("unknown");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder7.setHealthCheckUrls("inesserver2.windows.cin.ufpe.br", "", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap1 = applicationInfoManager0.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo2 = applicationInfoManager0.instanceInfo;
        com.netflix.appinfo.InstanceInfo.Builder builder3 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder3.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder3.setHomePageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder8.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder11.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus19 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder15.setStatus(instanceStatus19);
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder20.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder20.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo25 = builder20.getRawInstance();
        boolean boolean26 = instanceInfo25.isDirty();
        boolean boolean27 = instanceInfo25.isDirty();
        instanceInfo25.setIsDirty(false);
        java.util.Map<java.lang.String, java.lang.String> strMap30 = instanceInfo25.getMetadata();
        com.netflix.appinfo.InstanceInfo.Builder builder31 = builder3.setMetadata(strMap30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.registerAppMetadata(strMap30);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setCountryId((int) (short) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) '4');
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setVIPAddress("/healthcheck");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder2.setStatusPageUrl("", "unknown");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setCountryId((int) (short) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setHomePageUrlForDeser("EUREKA.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder2.setHomePageUrl("unknown", "eureka.");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        java.lang.String[] strArray2 = new java.lang.String[] { "na", "inesserver2.windows.cin.ufpe.br" };
        com.netflix.appinfo.InstanceInfo.Builder builder3 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder3.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus14 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder10.setStatus(instanceStatus14);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder15.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo20 = builder15.getRawInstance();
        java.lang.String str21 = instanceInfo20.getIPAddr();
        com.netflix.appinfo.InstanceInfo.Builder builder22 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo20);
        instanceInfo20.setLastUpdatedTimestamp();
        com.netflix.appinfo.InstanceInfo.Builder builder24 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo20);
        java.lang.String str25 = instanceInfo20.getIPAddr();
        java.lang.String str26 = instanceInfo20.getHostName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str27 = com.netflix.appinfo.InstanceInfo.getZone(strArray2, instanceInfo20);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder1 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder1.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus12 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder8.setStatus(instanceStatus12);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder13.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo18 = builder13.getRawInstance();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus19 = instanceInfo18.getOverriddenStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.setInstanceStatus(instanceStatus19);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.InstanceInfo.Builder builder1 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder1.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus12 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder8.setStatus(instanceStatus12);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder13.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo18 = builder13.getRawInstance();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus19 = instanceInfo18.getOverriddenStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.setInstanceStatus(instanceStatus19);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = new com.netflix.appinfo.ApplicationInfoManager();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.refreshDataCenterInfoIfRequired();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecurePort(7001);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setHealthCheckUrls("unknown", "/", "eureka.");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap1 = applicationInfoManager0.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo2 = applicationInfoManager0.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager.instance = applicationInfoManager0;
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus4 = com.netflix.appinfo.InstanceInfo.InstanceStatus.UNKNOWN;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.setInstanceStatus(instanceStatus4);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setCountryId((int) (short) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) '4');
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setIPAddr("/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder4.setHealthCheckUrls("eureka.", "", "na");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.InstanceInfo.Builder builder1 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder1.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus12 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder8.setStatus(instanceStatus12);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder13.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo18 = builder13.getRawInstance();
        applicationInfoManager0.instanceInfo = instanceInfo18;
        applicationInfoManager0.unregisterStatusChangeListener("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.refreshDataCenterInfoIfRequired();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap1 = applicationInfoManager0.listeners;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.refreshDataCenterInfoIfRequired();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig2 = new com.netflix.appinfo.MyDataCenterInstanceConfig("eureka.");
        java.lang.String str3 = myDataCenterInstanceConfig2.getHealthCheckUrl();
        java.lang.String str5 = myDataCenterInstanceConfig2.getHostName(false);
        java.lang.String str6 = myDataCenterInstanceConfig2.getAppGroupName();
        applicationInfoManager0.config = myDataCenterInstanceConfig2;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.refreshDataCenterInfoIfRequired();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = com.netflix.appinfo.ApplicationInfoManager.instance;
        com.netflix.appinfo.InstanceInfo.Builder builder1 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder1.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus12 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder8.setStatus(instanceStatus12);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setAppGroupName("eureka.");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig17 = new com.netflix.appinfo.MyDataCenterInstanceConfig("eureka.");
        java.lang.String str18 = myDataCenterInstanceConfig17.getHealthCheckUrl();
        java.lang.String str20 = myDataCenterInstanceConfig17.getHostName(false);
        int int21 = myDataCenterInstanceConfig17.getLeaseRenewalIntervalInSeconds();
        java.util.Map<java.lang.String, java.lang.String> strMap22 = myDataCenterInstanceConfig17.getMetadataMap();
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder15.setMetadata(strMap22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.registerAppMetadata(strMap22);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder3 = builder0.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder3.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder3.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder7.setStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo17 = builder12.getRawInstance();
        java.lang.String str18 = instanceInfo17.getIPAddr();
        com.netflix.appinfo.InstanceInfo instanceInfo19 = new com.netflix.appinfo.InstanceInfo(instanceInfo17);
        com.netflix.appinfo.InstanceInfo.Builder builder20 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo19);
        java.lang.String str21 = instanceInfo19.getAppName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        instanceInfo19.setIsCoordinatingDiscoveryServer();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap1 = applicationInfoManager0.listeners;
        applicationInfoManager0.unregisterStatusChangeListener("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder4.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder7.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus15 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder11.setStatus(instanceStatus15);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder16.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo21 = builder16.getRawInstance();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus22 = instanceInfo21.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo instanceInfo23 = new com.netflix.appinfo.InstanceInfo(instanceInfo21);
        com.netflix.appinfo.InstanceInfo.Builder builder24 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder24.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder27.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder31 = builder27.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder33 = builder31.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus35 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder31.setStatus(instanceStatus35);
        com.netflix.appinfo.InstanceInfo.Builder builder38 = builder36.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder40 = builder36.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo41 = builder36.getRawInstance();
        java.lang.String str42 = instanceInfo41.getIPAddr();
        com.netflix.appinfo.InstanceInfo instanceInfo43 = new com.netflix.appinfo.InstanceInfo(instanceInfo41);
        com.netflix.appinfo.InstanceInfo instanceInfo44 = new com.netflix.appinfo.InstanceInfo(instanceInfo43);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus45 = instanceInfo44.getStatus();
        instanceInfo21.setOverriddenStatus(instanceStatus45);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.setInstanceStatus(instanceStatus45);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddress("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder2.setHomePageUrl("EUREKA.", "");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setHomePageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder5.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus16 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder12.setStatus(instanceStatus16);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder17.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo22 = builder17.getRawInstance();
        boolean boolean23 = instanceInfo22.isDirty();
        boolean boolean24 = instanceInfo22.isDirty();
        instanceInfo22.setIsDirty(false);
        java.util.Map<java.lang.String, java.lang.String> strMap27 = instanceInfo22.getMetadata();
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder0.setMetadata(strMap27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder31 = builder28.setHomePageUrl("unknown", "172.20.26.3");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecurePort(7001);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSecureVIPAddress("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setCountryId((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setHomePageUrl("", "unknown");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setCountryId((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setHealthCheckUrls("/", "EUREKA.", "http://inesserver2.windows.cin.ufpe.br:80/");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setCountryId((int) (short) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) '4');
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setVIPAddress("/healthcheck");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder2.setHealthCheckUrls("/healthcheck", "/", "unknown");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        java.lang.String[] strArray2 = new java.lang.String[] { "na", "172.20.26.3" };
        com.netflix.appinfo.InstanceInfo.Builder builder3 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder3.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus14 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder10.setStatus(instanceStatus14);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder15.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo20 = builder15.getRawInstance();
        java.lang.String str21 = instanceInfo20.getIPAddr();
        com.netflix.appinfo.InstanceInfo instanceInfo22 = new com.netflix.appinfo.InstanceInfo(instanceInfo20);
        com.netflix.appinfo.InstanceInfo instanceInfo23 = new com.netflix.appinfo.InstanceInfo(instanceInfo22);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus24 = instanceInfo23.getStatus();
        com.netflix.appinfo.InstanceInfo instanceInfo25 = new com.netflix.appinfo.InstanceInfo(instanceInfo23);
        java.lang.String str26 = instanceInfo23.getAppGroupName();
        com.netflix.appinfo.InstanceInfo instanceInfo27 = new com.netflix.appinfo.InstanceInfo(instanceInfo23);
        com.netflix.appinfo.InstanceInfo.ActionType actionType28 = com.netflix.appinfo.InstanceInfo.ActionType.ADDED;
        instanceInfo27.setActionType(actionType28);
        com.netflix.appinfo.InstanceInfo.Builder builder30 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str31 = com.netflix.appinfo.InstanceInfo.getZone(strArray2, instanceInfo27);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        java.lang.String[] strArray3 = new java.lang.String[] { "UNKNOWN", "na", "na" };
        com.netflix.appinfo.InstanceInfo.Builder builder4 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder4.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder7.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus15 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder11.setStatus(instanceStatus15);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder16.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo21 = builder16.getRawInstance();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus22 = instanceInfo21.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo instanceInfo23 = new com.netflix.appinfo.InstanceInfo(instanceInfo21);
        java.lang.String str24 = instanceInfo23.getAppGroupName();
        instanceInfo23.setLastDirtyTimestamp((java.lang.Long) 0L);
        java.lang.String str27 = instanceInfo23.getAppName();
        long long28 = instanceInfo23.getLastUpdatedTimestamp();
        java.util.Set<java.lang.String> strSet29 = instanceInfo23.getHealthCheckUrls();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str30 = com.netflix.appinfo.InstanceInfo.getZone(strArray3, instanceInfo23);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder3 = builder0.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder3.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder5.setVIPAddressDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder9.add("na", "inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder9.setLastDirtyTimestamp((long) (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder9.setHomePageUrl("", "/healthcheck");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder3 = builder0.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder3.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder3.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder7.setStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo17 = builder12.getRawInstance();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus18 = instanceInfo17.getOverriddenStatus();
        instanceInfo17.setIsDirty();
        java.lang.String str20 = instanceInfo17.getHomePageUrl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        instanceInfo17.setIsCoordinatingDiscoveryServer();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder3 = builder0.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder3.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder3.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder7.setStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo17 = builder12.getRawInstance();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus18 = instanceInfo17.getOverriddenStatus();
        java.lang.String str19 = instanceInfo17.getSID();
        java.lang.String str20 = instanceInfo17.getIPAddr();
        instanceInfo17.setSID("/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        instanceInfo17.setIsCoordinatingDiscoveryServer();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        java.lang.String[] strArray1 = new java.lang.String[] { "/Status" };
        com.netflix.appinfo.InstanceInfo.Builder builder2 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder2.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder5.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus13 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder9.setStatus(instanceStatus13);
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder14.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo19 = builder14.getRawInstance();
        java.lang.String str20 = instanceInfo19.getIPAddr();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo19);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        java.lang.String[] strArray1 = new java.lang.String[] { "UNKNOWN" };
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager2 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap3 = applicationInfoManager2.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo4 = applicationInfoManager2.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager5 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager5.config = myDataCenterInstanceConfig7;
        applicationInfoManager2.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig7);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap10 = applicationInfoManager2.listeners;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager11 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap12 = applicationInfoManager11.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo13 = applicationInfoManager11.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager14 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig16 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager14.config = myDataCenterInstanceConfig16;
        applicationInfoManager11.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig16);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap19 = applicationInfoManager11.listeners;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager20 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap21 = applicationInfoManager20.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo22 = applicationInfoManager20.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager23 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig25 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager23.config = myDataCenterInstanceConfig25;
        applicationInfoManager20.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig25);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap28 = applicationInfoManager20.listeners;
        applicationInfoManager11.listeners = strMap28;
        applicationInfoManager2.listeners = strMap28;
        com.netflix.appinfo.InstanceInfo instanceInfo31 = applicationInfoManager2.instanceInfo;
        com.netflix.appinfo.LeaseInfo leaseInfo32 = instanceInfo31.getLeaseInfo();
        java.lang.String str33 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo31);
        com.netflix.appinfo.InstanceInfo.Builder builder34 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder34.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder37.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder37.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder43 = builder41.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus45 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder46 = builder41.setStatus(instanceStatus45);
        com.netflix.appinfo.InstanceInfo.Builder builder48 = builder46.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder50 = builder46.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo51 = builder46.getRawInstance();
        boolean boolean52 = instanceInfo51.isDirty();
        com.netflix.appinfo.InstanceInfo instanceInfo53 = new com.netflix.appinfo.InstanceInfo(instanceInfo51);
        java.lang.Boolean boolean54 = instanceInfo53.isCoordinatingDiscoveryServer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str55 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo53);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        java.lang.String[] strArray6 = new java.lang.String[] { "/healthcheck", "/Status", "UNKNOWN", "inesserver2.windows.cin.ufpe.br:80", "unknown", "eureka." };
        com.netflix.appinfo.InstanceInfo.Builder builder7 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder7.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder10.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus18 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder14.setStatus(instanceStatus18);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder19.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo24 = builder19.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder25 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo24);
        com.netflix.appinfo.InstanceInfo.Builder builder26 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo24);
        java.lang.String str27 = instanceInfo24.getVIPAddress();
        java.util.Map<java.lang.String, java.lang.String> strMap28 = instanceInfo24.getMetadata();
        java.lang.String str29 = instanceInfo24.getASGName();
        com.netflix.appinfo.InstanceInfo.ActionType actionType30 = instanceInfo24.getActionType();
        com.netflix.appinfo.InstanceInfo.Builder builder31 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str32 = com.netflix.appinfo.InstanceInfo.getZone(strArray6, instanceInfo24);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        java.lang.String[] strArray1 = new java.lang.String[] { "UNKNOWN" };
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager2 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap3 = applicationInfoManager2.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo4 = applicationInfoManager2.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager5 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager5.config = myDataCenterInstanceConfig7;
        applicationInfoManager2.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig7);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap10 = applicationInfoManager2.listeners;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager11 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap12 = applicationInfoManager11.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo13 = applicationInfoManager11.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager14 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig16 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager14.config = myDataCenterInstanceConfig16;
        applicationInfoManager11.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig16);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap19 = applicationInfoManager11.listeners;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager20 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap21 = applicationInfoManager20.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo22 = applicationInfoManager20.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager23 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig25 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager23.config = myDataCenterInstanceConfig25;
        applicationInfoManager20.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig25);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap28 = applicationInfoManager20.listeners;
        applicationInfoManager11.listeners = strMap28;
        applicationInfoManager2.listeners = strMap28;
        com.netflix.appinfo.InstanceInfo instanceInfo31 = applicationInfoManager2.instanceInfo;
        com.netflix.appinfo.LeaseInfo leaseInfo32 = instanceInfo31.getLeaseInfo();
        java.lang.String str33 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo31);
        com.netflix.appinfo.InstanceInfo.Builder builder34 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder34.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder37.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder37.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder43 = builder41.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus45 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder46 = builder41.setStatus(instanceStatus45);
        com.netflix.appinfo.InstanceInfo.Builder builder48 = builder46.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder50 = builder46.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo51 = builder46.getRawInstance();
        java.lang.String str52 = instanceInfo51.getIPAddr();
        com.netflix.appinfo.InstanceInfo instanceInfo53 = new com.netflix.appinfo.InstanceInfo(instanceInfo51);
        com.netflix.appinfo.InstanceInfo.Builder builder54 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo53);
        java.lang.String str55 = instanceInfo53.getAppName();
        java.lang.Long long56 = instanceInfo53.getLastDirtyTimestamp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str57 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo53);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setHomePageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setHomePageUrlForDeser("172.20.26.3");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setHomePageUrl("/", "/Status");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder3 = builder0.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder3.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder3.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder7.setStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo17 = builder12.getRawInstance();
        java.lang.String str18 = instanceInfo17.getIPAddr();
        com.netflix.appinfo.InstanceInfo instanceInfo19 = new com.netflix.appinfo.InstanceInfo(instanceInfo17);
        com.netflix.appinfo.InstanceInfo instanceInfo20 = new com.netflix.appinfo.InstanceInfo(instanceInfo19);
        com.netflix.appinfo.InstanceInfo instanceInfo21 = new com.netflix.appinfo.InstanceInfo(instanceInfo20);
        int int22 = instanceInfo20.getCountryId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        instanceInfo20.setIsCoordinatingDiscoveryServer();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setCountryId((int) (short) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setHomePageUrlForDeser("EUREKA.");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setSecureVIPAddress("na");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder7.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder10.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus18 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder14.setStatus(instanceStatus18);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder19.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo24 = builder19.getRawInstance();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus25 = instanceInfo24.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo instanceInfo26 = new com.netflix.appinfo.InstanceInfo(instanceInfo24);
        java.lang.String str27 = instanceInfo26.getAppGroupName();
        java.lang.String str28 = instanceInfo26.getHomePageUrl();
        com.netflix.appinfo.InstanceInfo.PortType portType29 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        boolean boolean30 = instanceInfo26.isPortEnabled(portType29);
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder2.enablePort(portType29, false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder2.setHealthCheckUrls("/healthcheck", "EUREKA.", "unknown");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        java.lang.String[] strArray3 = new java.lang.String[] { "http://inesserver2.windows.cin.ufpe.br:80/", "/healthcheck", "UNKNOWN" };
        com.netflix.appinfo.InstanceInfo.Builder builder4 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder4.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder7.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus15 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder11.setStatus(instanceStatus15);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder16.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo21 = builder16.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder22 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo21);
        com.netflix.appinfo.InstanceInfo.Builder builder23 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo21);
        com.netflix.appinfo.InstanceInfo.Builder builder24 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo21);
        instanceInfo21.setIsDirty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = com.netflix.appinfo.InstanceInfo.getZone(strArray3, instanceInfo21);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddress("");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig("/Status");
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig9 = new com.netflix.appinfo.MyDataCenterInstanceConfig("", dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig("", dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig11 = new com.netflix.appinfo.MyDataCenterInstanceConfig("unknown", dataCenterInfo8);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder2.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setPort((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder14.setStatusPageUrl("/Status", "");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setCountryId((int) (short) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) '4');
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setAppGroupName("na");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder4.add("/Status", "/");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setSecureVIPAddressDeser("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setIsCoordinatingDiscoveryServer(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder13.setHealthCheckUrls("/", "/healthcheck", "na");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        com.netflix.appinfo.InstanceInfo.Builder builder1 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder1.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus12 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder8.setStatus(instanceStatus12);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder13.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo18 = builder13.getRawInstance();
        java.lang.String str19 = instanceInfo18.getIPAddr();
        com.netflix.appinfo.InstanceInfo instanceInfo20 = new com.netflix.appinfo.InstanceInfo(instanceInfo18);
        com.netflix.appinfo.InstanceInfo instanceInfo21 = new com.netflix.appinfo.InstanceInfo(instanceInfo20);
        com.netflix.appinfo.InstanceInfo.Builder builder22 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo20);
        java.lang.Long long23 = instanceInfo20.getLastDirtyTimestamp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = com.netflix.appinfo.InstanceInfo.getZone(strArray0, instanceInfo20);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder3 = builder0.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder3.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder3.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder7.setStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo17 = builder12.getRawInstance();
        boolean boolean18 = instanceInfo17.isDirty();
        com.netflix.appinfo.InstanceInfo instanceInfo19 = new com.netflix.appinfo.InstanceInfo(instanceInfo17);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager20 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap21 = applicationInfoManager20.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo22 = applicationInfoManager20.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager23 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig25 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager23.config = myDataCenterInstanceConfig25;
        applicationInfoManager20.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig25);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap28 = applicationInfoManager20.listeners;
        com.netflix.appinfo.InstanceInfo.Builder builder29 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder29.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder34 = builder32.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder32.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder38 = builder36.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus40 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder36.setStatus(instanceStatus40);
        com.netflix.appinfo.InstanceInfo.Builder builder43 = builder41.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder45 = builder41.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo46 = builder41.getRawInstance();
        java.lang.String str47 = instanceInfo46.getIPAddr();
        com.netflix.appinfo.InstanceInfo instanceInfo48 = new com.netflix.appinfo.InstanceInfo(instanceInfo46);
        com.netflix.appinfo.InstanceInfo instanceInfo49 = new com.netflix.appinfo.InstanceInfo(instanceInfo48);
        com.netflix.appinfo.InstanceInfo instanceInfo50 = new com.netflix.appinfo.InstanceInfo(instanceInfo49);
        com.netflix.appinfo.InstanceInfo.Builder builder51 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo49);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager52 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.InstanceInfo.Builder builder53 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder56 = builder53.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder58 = builder56.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder60 = builder56.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder62 = builder60.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus64 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder65 = builder60.setStatus(instanceStatus64);
        com.netflix.appinfo.InstanceInfo.Builder builder67 = builder65.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder69 = builder65.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo70 = builder65.getRawInstance();
        applicationInfoManager52.instanceInfo = instanceInfo70;
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus72 = instanceInfo70.getStatus();
        instanceInfo49.setOverriddenStatus(instanceStatus72);
        applicationInfoManager20.setInstanceStatus(instanceStatus72);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus75 = instanceInfo17.setStatus(instanceStatus72);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        instanceInfo17.setIsCoordinatingDiscoveryServer();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "http://inesserver2.windows.cin.ufpe.br:80/", "UNKNOWN", "hi!", "inesserver2.windows.cin.ufpe.br:80", "" };
        com.netflix.appinfo.InstanceInfo.Builder builder7 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder7.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder10.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus18 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder14.setStatus(instanceStatus18);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder19.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo24 = builder19.getRawInstance();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus25 = instanceInfo24.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo instanceInfo26 = new com.netflix.appinfo.InstanceInfo(instanceInfo24);
        java.lang.String str27 = instanceInfo26.getAppGroupName();
        instanceInfo26.setLastDirtyTimestamp((java.lang.Long) 0L);
        java.lang.String str30 = instanceInfo26.getAppName();
        long long31 = instanceInfo26.getLastUpdatedTimestamp();
        instanceInfo26.setLastUpdatedTimestamp();
        long long33 = instanceInfo26.getLastUpdatedTimestamp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str34 = com.netflix.appinfo.InstanceInfo.getZone(strArray6, instanceInfo26);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setCountryId((int) (short) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setHomePageUrlForDeser("EUREKA.");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setSecureVIPAddress("na");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder2.setHomePageUrl("http://inesserver2.windows.cin.ufpe.br:80/", "EUREKA.");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder3 = builder0.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder3.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setIPAddr("eureka.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder9.setHomePageUrl("na", "http://inesserver2.windows.cin.ufpe.br:80/");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        java.lang.String[] strArray1 = new java.lang.String[] { "UNKNOWN" };
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager2 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap3 = applicationInfoManager2.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo4 = applicationInfoManager2.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager5 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager5.config = myDataCenterInstanceConfig7;
        applicationInfoManager2.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig7);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap10 = applicationInfoManager2.listeners;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager11 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap12 = applicationInfoManager11.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo13 = applicationInfoManager11.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager14 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig16 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager14.config = myDataCenterInstanceConfig16;
        applicationInfoManager11.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig16);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap19 = applicationInfoManager11.listeners;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager20 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap21 = applicationInfoManager20.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo22 = applicationInfoManager20.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager23 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig25 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager23.config = myDataCenterInstanceConfig25;
        applicationInfoManager20.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig25);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap28 = applicationInfoManager20.listeners;
        applicationInfoManager11.listeners = strMap28;
        applicationInfoManager2.listeners = strMap28;
        com.netflix.appinfo.InstanceInfo instanceInfo31 = applicationInfoManager2.instanceInfo;
        com.netflix.appinfo.LeaseInfo leaseInfo32 = instanceInfo31.getLeaseInfo();
        java.lang.String str33 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo31);
        com.netflix.appinfo.InstanceInfo.Builder builder34 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder34.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder37.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder37.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder43 = builder41.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus45 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder46 = builder41.setStatus(instanceStatus45);
        com.netflix.appinfo.InstanceInfo.Builder builder48 = builder46.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder50 = builder46.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo51 = builder46.getRawInstance();
        java.lang.String str52 = instanceInfo51.getIPAddr();
        boolean boolean53 = instanceInfo51.isDirty();
        instanceInfo51.setSID("/healthcheck");
        instanceInfo51.unsetIsDirty((long) 10);
        java.lang.Long long58 = instanceInfo51.isDirtyWithTime();
        java.lang.Boolean boolean59 = instanceInfo51.isCoordinatingDiscoveryServer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str60 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo51);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        java.lang.String[] strArray1 = new java.lang.String[] { "UNKNOWN" };
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager2 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap3 = applicationInfoManager2.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo4 = applicationInfoManager2.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager5 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager5.config = myDataCenterInstanceConfig7;
        applicationInfoManager2.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig7);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap10 = applicationInfoManager2.listeners;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager11 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap12 = applicationInfoManager11.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo13 = applicationInfoManager11.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager14 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig16 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager14.config = myDataCenterInstanceConfig16;
        applicationInfoManager11.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig16);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap19 = applicationInfoManager11.listeners;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager20 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap21 = applicationInfoManager20.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo22 = applicationInfoManager20.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager23 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig25 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager23.config = myDataCenterInstanceConfig25;
        applicationInfoManager20.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig25);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap28 = applicationInfoManager20.listeners;
        applicationInfoManager11.listeners = strMap28;
        applicationInfoManager2.listeners = strMap28;
        com.netflix.appinfo.InstanceInfo instanceInfo31 = applicationInfoManager2.instanceInfo;
        com.netflix.appinfo.LeaseInfo leaseInfo32 = instanceInfo31.getLeaseInfo();
        java.lang.String str33 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo31);
        com.netflix.appinfo.InstanceInfo.Builder builder34 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder34.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder37.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder37.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder43 = builder41.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus45 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder46 = builder41.setStatus(instanceStatus45);
        com.netflix.appinfo.InstanceInfo.Builder builder48 = builder46.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder50 = builder46.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo51 = builder46.getRawInstance();
        java.lang.String str52 = instanceInfo51.getIPAddr();
        com.netflix.appinfo.InstanceInfo instanceInfo53 = new com.netflix.appinfo.InstanceInfo(instanceInfo51);
        com.netflix.appinfo.InstanceInfo instanceInfo54 = new com.netflix.appinfo.InstanceInfo(instanceInfo53);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus55 = instanceInfo54.getStatus();
        com.netflix.appinfo.InstanceInfo instanceInfo56 = new com.netflix.appinfo.InstanceInfo(instanceInfo54);
        java.lang.String str57 = instanceInfo54.getAppGroupName();
        com.netflix.appinfo.InstanceInfo instanceInfo58 = new com.netflix.appinfo.InstanceInfo(instanceInfo54);
        java.lang.String str59 = instanceInfo58.getStatusPageUrl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str60 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo58);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddress("");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig("/Status");
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig9 = new com.netflix.appinfo.MyDataCenterInstanceConfig("", dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig("", dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig11 = new com.netflix.appinfo.MyDataCenterInstanceConfig("unknown", dataCenterInfo8);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder2.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setPort((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder12.setStatusPageUrl("eureka.", "http://inesserver2.windows.cin.ufpe.br:80/");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        java.lang.String[] strArray1 = new java.lang.String[] { "UNKNOWN" };
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager2 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap3 = applicationInfoManager2.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo4 = applicationInfoManager2.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager5 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager5.config = myDataCenterInstanceConfig7;
        applicationInfoManager2.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig7);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap10 = applicationInfoManager2.listeners;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager11 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap12 = applicationInfoManager11.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo13 = applicationInfoManager11.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager14 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig16 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager14.config = myDataCenterInstanceConfig16;
        applicationInfoManager11.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig16);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap19 = applicationInfoManager11.listeners;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager20 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap21 = applicationInfoManager20.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo22 = applicationInfoManager20.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager23 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig25 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager23.config = myDataCenterInstanceConfig25;
        applicationInfoManager20.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig25);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap28 = applicationInfoManager20.listeners;
        applicationInfoManager11.listeners = strMap28;
        applicationInfoManager2.listeners = strMap28;
        com.netflix.appinfo.InstanceInfo instanceInfo31 = applicationInfoManager2.instanceInfo;
        com.netflix.appinfo.LeaseInfo leaseInfo32 = instanceInfo31.getLeaseInfo();
        java.lang.String str33 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo31);
        com.netflix.appinfo.InstanceInfo.Builder builder34 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder34.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder37.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder37.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder43 = builder41.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus45 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder46 = builder41.setStatus(instanceStatus45);
        com.netflix.appinfo.InstanceInfo.Builder builder48 = builder46.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder50 = builder46.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo51 = builder46.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder52 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo51);
        com.netflix.appinfo.InstanceInfo.Builder builder53 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo51);
        java.lang.String str54 = instanceInfo51.getVIPAddress();
        com.netflix.appinfo.InstanceInfo instanceInfo55 = new com.netflix.appinfo.InstanceInfo(instanceInfo51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str56 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo51);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setCountryId((int) (short) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) '4');
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder4.add("/", "eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder4.add("", "/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setSecurePort(7001);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setHostName("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder15.setStatusPageUrl("", "");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder18.setHomePageUrl("na", "unknown");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus23 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder18.setOverriddenStatus(instanceStatus23);
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder10.setOverriddenStatus(instanceStatus23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder25.setHomePageUrl("172.20.26.3", "eureka.");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        java.lang.String[] strArray1 = new java.lang.String[] { "UNKNOWN" };
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager2 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap3 = applicationInfoManager2.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo4 = applicationInfoManager2.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager5 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager5.config = myDataCenterInstanceConfig7;
        applicationInfoManager2.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig7);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap10 = applicationInfoManager2.listeners;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager11 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap12 = applicationInfoManager11.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo13 = applicationInfoManager11.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager14 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig16 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager14.config = myDataCenterInstanceConfig16;
        applicationInfoManager11.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig16);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap19 = applicationInfoManager11.listeners;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager20 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap21 = applicationInfoManager20.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo22 = applicationInfoManager20.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager23 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig25 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager23.config = myDataCenterInstanceConfig25;
        applicationInfoManager20.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig25);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap28 = applicationInfoManager20.listeners;
        applicationInfoManager11.listeners = strMap28;
        applicationInfoManager2.listeners = strMap28;
        com.netflix.appinfo.InstanceInfo instanceInfo31 = applicationInfoManager2.instanceInfo;
        com.netflix.appinfo.LeaseInfo leaseInfo32 = instanceInfo31.getLeaseInfo();
        java.lang.String str33 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo31);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager34 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap35 = applicationInfoManager34.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo36 = applicationInfoManager34.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager37 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig39 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager37.config = myDataCenterInstanceConfig39;
        applicationInfoManager34.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig39);
        java.lang.String str42 = myDataCenterInstanceConfig39.getNamespace();
        com.netflix.appinfo.InstanceInfo.Builder builder43 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder46 = builder43.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder48 = builder46.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder50 = builder46.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder52 = builder50.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus54 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder55 = builder50.setStatus(instanceStatus54);
        com.netflix.appinfo.InstanceInfo.Builder builder57 = builder55.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder59 = builder55.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo60 = builder55.getRawInstance();
        java.lang.String str61 = instanceInfo60.getIPAddr();
        com.netflix.appinfo.InstanceInfo instanceInfo62 = new com.netflix.appinfo.InstanceInfo(instanceInfo60);
        instanceInfo62.setSID("/healthcheck");
        com.netflix.appinfo.InstanceInfo instanceInfo65 = new com.netflix.appinfo.InstanceInfo(instanceInfo62);
        java.lang.Long long66 = instanceInfo62.getLastDirtyTimestamp();
        java.util.Map<java.lang.String, java.lang.String> strMap67 = instanceInfo62.getMetadata();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager68 = new com.netflix.appinfo.ApplicationInfoManager((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig39, instanceInfo62);
        com.netflix.appinfo.InstanceInfo.Builder builder69 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo62);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str70 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo62);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        com.netflix.appinfo.InstanceInfo.Builder builder1 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder1.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus12 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder8.setStatus(instanceStatus12);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder13.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo18 = builder13.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder19 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo18);
        com.netflix.appinfo.InstanceInfo instanceInfo20 = builder19.getRawInstance();
        java.lang.String str21 = instanceInfo20.getId();
        java.lang.String str22 = instanceInfo20.getHostName();
        instanceInfo20.setIsDirty(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = com.netflix.appinfo.InstanceInfo.getZone(strArray0, instanceInfo20);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setHomePageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder5.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus16 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder12.setStatus(instanceStatus16);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder17.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo22 = builder17.getRawInstance();
        boolean boolean23 = instanceInfo22.isDirty();
        boolean boolean24 = instanceInfo22.isDirty();
        instanceInfo22.setIsDirty(false);
        java.util.Map<java.lang.String, java.lang.String> strMap27 = instanceInfo22.getMetadata();
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder0.setMetadata(strMap27);
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder0.setHomePageUrlForDeser("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder33 = builder0.setHomePageUrl("UNKNOWN", "UNKNOWN");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.InstanceInfo.Builder builder1 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder1.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus12 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder8.setStatus(instanceStatus12);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder13.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo18 = builder13.getRawInstance();
        applicationInfoManager0.instanceInfo = instanceInfo18;
        com.netflix.appinfo.ApplicationInfoManager.instance = applicationInfoManager0;
        com.netflix.appinfo.InstanceInfo.Builder builder21 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder21.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder24.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder24.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder28.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus32 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder33 = builder28.setStatus(instanceStatus32);
        com.netflix.appinfo.InstanceInfo.Builder builder35 = builder33.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder33.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo38 = builder33.getRawInstance();
        java.lang.String str39 = instanceInfo38.getIPAddr();
        int int40 = instanceInfo38.getSecurePort();
        java.lang.String str41 = instanceInfo38.getSID();
        com.netflix.appinfo.InstanceInfo.Builder builder42 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo38);
        com.netflix.appinfo.InstanceInfo.Builder builder43 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder46 = builder43.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder48 = builder46.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder50 = builder46.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder52 = builder50.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus54 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder55 = builder50.setStatus(instanceStatus54);
        com.netflix.appinfo.InstanceInfo.Builder builder57 = builder55.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder59 = builder55.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo60 = builder55.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder61 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo60);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus62 = instanceInfo60.getOverriddenStatus();
        instanceInfo60.setIsDirty();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus64 = com.netflix.appinfo.InstanceInfo.InstanceStatus.STARTING;
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus65 = instanceInfo60.setStatus(instanceStatus64);
        instanceInfo38.setOverriddenStatus(instanceStatus64);
        applicationInfoManager0.setInstanceStatus(instanceStatus64);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.refreshDataCenterInfoIfRequired();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        java.lang.String[] strArray4 = new java.lang.String[] { "/healthcheck", "172.20.26.3", "inesserver2.windows.cin.ufpe.br", "" };
        com.netflix.appinfo.InstanceInfo.Builder builder5 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder5.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus16 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder12.setStatus(instanceStatus16);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder17.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo22 = builder17.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder23 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo22);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus24 = instanceInfo22.getOverriddenStatus();
        java.lang.String str25 = instanceInfo22.getASGName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = com.netflix.appinfo.InstanceInfo.getZone(strArray4, instanceInfo22);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        java.lang.String[] strArray1 = new java.lang.String[] { "UNKNOWN" };
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager2 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap3 = applicationInfoManager2.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo4 = applicationInfoManager2.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager5 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager5.config = myDataCenterInstanceConfig7;
        applicationInfoManager2.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig7);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap10 = applicationInfoManager2.listeners;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager11 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap12 = applicationInfoManager11.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo13 = applicationInfoManager11.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager14 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig16 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager14.config = myDataCenterInstanceConfig16;
        applicationInfoManager11.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig16);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap19 = applicationInfoManager11.listeners;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager20 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap21 = applicationInfoManager20.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo22 = applicationInfoManager20.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager23 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig25 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager23.config = myDataCenterInstanceConfig25;
        applicationInfoManager20.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig25);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap28 = applicationInfoManager20.listeners;
        applicationInfoManager11.listeners = strMap28;
        applicationInfoManager2.listeners = strMap28;
        com.netflix.appinfo.InstanceInfo instanceInfo31 = applicationInfoManager2.instanceInfo;
        com.netflix.appinfo.LeaseInfo leaseInfo32 = instanceInfo31.getLeaseInfo();
        java.lang.String str33 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo31);
        com.netflix.appinfo.InstanceInfo.Builder builder34 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder34.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder37.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder37.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder43 = builder41.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus45 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder46 = builder41.setStatus(instanceStatus45);
        com.netflix.appinfo.InstanceInfo.Builder builder48 = builder46.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder50 = builder46.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo51 = builder46.getRawInstance();
        java.lang.String str52 = instanceInfo51.getIPAddr();
        com.netflix.appinfo.InstanceInfo instanceInfo53 = new com.netflix.appinfo.InstanceInfo(instanceInfo51);
        com.netflix.appinfo.InstanceInfo instanceInfo54 = new com.netflix.appinfo.InstanceInfo(instanceInfo53);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus55 = instanceInfo54.getStatus();
        com.netflix.appinfo.InstanceInfo instanceInfo56 = new com.netflix.appinfo.InstanceInfo(instanceInfo54);
        java.lang.String str57 = instanceInfo54.getAppGroupName();
        int int58 = instanceInfo54.getSecurePort();
        instanceInfo54.setIsDirty(true);
        java.lang.String str61 = instanceInfo54.getStatusPageUrl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str62 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo54);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecurePort(7001);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setASGName("EUREKA.");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setNamespace("UNKNOWN");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setSecureVIPAddressDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setSID("inesserver2.windows.cin.ufpe.br:80");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder8.setHealthCheckUrls("na", "UNKNOWN", "eureka.");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap1 = applicationInfoManager0.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo2 = applicationInfoManager0.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager.instance = applicationInfoManager0;
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig4 = applicationInfoManager0.config;
        com.netflix.appinfo.InstanceInfo instanceInfo5 = applicationInfoManager0.getInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.refreshDataCenterInfoIfRequired();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder3 = builder0.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.setHomePageUrlForDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.setPort((int) (short) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setCountryId(7002);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder7.setStatusPageUrlForDeser("eureka.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder11.setHealthCheckUrls("hi!", "inesserver2.windows.cin.ufpe.br:80", "na");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setCountryId((int) (short) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) '4');
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setAppGroupName("na");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder4.add("/Status", "/");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setSecureVIPAddressDeser("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setIPAddr("/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder13.setHomePageUrl("", "/");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap1 = applicationInfoManager0.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo2 = applicationInfoManager0.instanceInfo;
        com.netflix.appinfo.InstanceInfo instanceInfo3 = applicationInfoManager0.getInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.refreshDataCenterInfoIfRequired();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setCountryId((int) (short) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) '4');
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setAppGroupName("na");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setAppGroupName("/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder6.setHomePageUrl("hi!", "172.20.26.3");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "unknown", "hi!" };
        com.netflix.appinfo.InstanceInfo.Builder builder4 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder4.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder7.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus15 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder11.setStatus(instanceStatus15);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder16.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo21 = builder16.getRawInstance();
        java.lang.String str22 = instanceInfo21.getIPAddr();
        com.netflix.appinfo.InstanceInfo instanceInfo23 = new com.netflix.appinfo.InstanceInfo(instanceInfo21);
        com.netflix.appinfo.InstanceInfo instanceInfo24 = new com.netflix.appinfo.InstanceInfo(instanceInfo23);
        boolean boolean25 = instanceInfo23.isDirty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = com.netflix.appinfo.InstanceInfo.getZone(strArray3, instanceInfo23);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder3 = builder0.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.setHomePageUrlForDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.setPort((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder0.setStatusPageUrl("inesserver2.windows.cin.ufpe.br:80", "http://inesserver2.windows.cin.ufpe.br:80/");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder3 = builder0.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder3.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder3.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder7.setStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo17 = builder12.getRawInstance();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus18 = instanceInfo17.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo instanceInfo19 = new com.netflix.appinfo.InstanceInfo(instanceInfo17);
        instanceInfo17.setIsDirty();
        com.netflix.appinfo.InstanceInfo.Builder builder21 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo17);
        java.lang.String str22 = instanceInfo17.getSID();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        instanceInfo17.setIsCoordinatingDiscoveryServer();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setCountryId((int) (short) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) '4');
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setVIPAddress("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setSecurePort(0);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setIPAddr("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setStatusPageUrlForDeser("na");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder12.setHomePageUrl("hi!", "/");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        java.lang.String[] strArray1 = new java.lang.String[] { "UNKNOWN" };
        com.netflix.appinfo.InstanceInfo.Builder builder2 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder2.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder5.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus13 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder9.setStatus(instanceStatus13);
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder14.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo19 = builder14.getRawInstance();
        java.lang.String str20 = instanceInfo19.getIPAddr();
        com.netflix.appinfo.InstanceInfo instanceInfo21 = new com.netflix.appinfo.InstanceInfo(instanceInfo19);
        com.netflix.appinfo.InstanceInfo instanceInfo22 = new com.netflix.appinfo.InstanceInfo(instanceInfo21);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus23 = instanceInfo21.getStatus();
        com.netflix.appinfo.InstanceInfo instanceInfo24 = new com.netflix.appinfo.InstanceInfo(instanceInfo21);
        java.lang.String str25 = instanceInfo21.getHomePageUrl();
        com.netflix.appinfo.InstanceInfo.Builder builder26 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo21);
        boolean boolean27 = instanceInfo21.isDirty();
        instanceInfo21.setIsDirty(false);
        instanceInfo21.setLastUpdatedTimestamp();
        java.util.Map<java.lang.String, java.lang.String> strMap31 = instanceInfo21.getMetadata();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str32 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo21);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecurePort(7001);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSecureVIPAddress("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setAppGroupName("172.20.26.3");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setHealthCheckUrls("inesserver2.windows.cin.ufpe.br", "UNKNOWN", "UNKNOWN");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        java.lang.String[] strArray3 = new java.lang.String[] { "EUREKA.", "na", "http://inesserver2.windows.cin.ufpe.br:80/" };
        com.netflix.appinfo.InstanceInfo.Builder builder4 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder4.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder7.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus15 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder11.setStatus(instanceStatus15);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder16.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo21 = builder16.getRawInstance();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus22 = instanceInfo21.getOverriddenStatus();
        java.lang.String str23 = instanceInfo21.getSID();
        java.lang.String str24 = instanceInfo21.getSID();
        com.netflix.appinfo.InstanceInfo instanceInfo25 = new com.netflix.appinfo.InstanceInfo(instanceInfo21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = com.netflix.appinfo.InstanceInfo.getZone(strArray3, instanceInfo25);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        java.lang.String[] strArray3 = new java.lang.String[] { "/healthcheck", "UNKNOWN", "hi!" };
        com.netflix.appinfo.InstanceInfo.Builder builder4 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder4.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder7.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus15 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder11.setStatus(instanceStatus15);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder16.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo21 = builder16.getRawInstance();
        java.lang.String str22 = instanceInfo21.getIPAddr();
        com.netflix.appinfo.InstanceInfo instanceInfo23 = new com.netflix.appinfo.InstanceInfo(instanceInfo21);
        com.netflix.appinfo.InstanceInfo instanceInfo24 = new com.netflix.appinfo.InstanceInfo(instanceInfo23);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus25 = instanceInfo24.getStatus();
        com.netflix.appinfo.InstanceInfo instanceInfo26 = new com.netflix.appinfo.InstanceInfo(instanceInfo24);
        java.lang.String str27 = instanceInfo24.getAppGroupName();
        int int28 = instanceInfo24.getSecurePort();
        java.lang.String str29 = instanceInfo24.getHostName();
        com.netflix.appinfo.InstanceInfo.Builder builder30 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder33 = builder30.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder35 = builder33.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder33.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder37.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.PortType portType40 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder42 = builder37.enablePort(portType40, false);
        boolean boolean43 = instanceInfo24.isPortEnabled(portType40);
        com.netflix.appinfo.InstanceInfo.Builder builder44 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo24);
        com.netflix.appinfo.InstanceInfo instanceInfo45 = new com.netflix.appinfo.InstanceInfo(instanceInfo24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str46 = com.netflix.appinfo.InstanceInfo.getZone(strArray3, instanceInfo45);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap1 = applicationInfoManager0.listeners;
        applicationInfoManager0.unregisterStatusChangeListener("unknown");
        com.netflix.appinfo.ApplicationInfoManager.instance = applicationInfoManager0;
        com.netflix.appinfo.InstanceInfo.Builder builder5 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder5.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus16 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder12.setStatus(instanceStatus16);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder17.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo22 = builder17.getRawInstance();
        boolean boolean23 = instanceInfo22.isDirty();
        boolean boolean24 = instanceInfo22.isDirty();
        com.netflix.appinfo.InstanceInfo.Builder builder25 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo22);
        com.netflix.appinfo.InstanceInfo instanceInfo26 = new com.netflix.appinfo.InstanceInfo(instanceInfo22);
        com.netflix.appinfo.InstanceInfo.Builder builder27 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo22);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager28 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap29 = applicationInfoManager28.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo30 = applicationInfoManager28.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager31 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig33 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager31.config = myDataCenterInstanceConfig33;
        applicationInfoManager28.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig33);
        com.netflix.appinfo.InstanceInfo instanceInfo36 = applicationInfoManager28.instanceInfo;
        applicationInfoManager28.refreshDataCenterInfoIfRequired();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager38 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap39 = applicationInfoManager38.listeners;
        applicationInfoManager28.listeners = strMap39;
        com.netflix.appinfo.InstanceInfo instanceInfo41 = applicationInfoManager28.instanceInfo;
        com.netflix.appinfo.InstanceInfo.Builder builder42 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder45 = builder42.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder47 = builder45.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder49 = builder45.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder51 = builder49.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus53 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder54 = builder49.setStatus(instanceStatus53);
        com.netflix.appinfo.InstanceInfo.Builder builder56 = builder54.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder58 = builder54.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo59 = builder54.getRawInstance();
        java.lang.String str60 = instanceInfo59.getIPAddr();
        com.netflix.appinfo.InstanceInfo.Builder builder61 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo59);
        instanceInfo59.setLastUpdatedTimestamp();
        com.netflix.appinfo.InstanceInfo.Builder builder63 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo59);
        java.lang.String str64 = instanceInfo59.getIPAddr();
        java.lang.String str65 = instanceInfo59.getSecureVipAddress();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus66 = instanceInfo59.getStatus();
        instanceInfo41.setOverriddenStatus(instanceStatus66);
        com.netflix.appinfo.InstanceInfo.Builder builder68 = builder27.setOverriddenStatus(instanceStatus66);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.setInstanceStatus(instanceStatus66);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setCountryId((int) (short) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setHomePageUrlForDeser("EUREKA.");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setSecureVIPAddress("na");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setNamespace("/");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder2.setAppName("/");
        com.netflix.appinfo.InstanceInfo instanceInfo11 = builder10.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder12.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder15.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus23 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder19.setStatus(instanceStatus23);
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder24.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder24.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo29 = builder24.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder30 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo29);
        com.netflix.appinfo.InstanceInfo instanceInfo31 = new com.netflix.appinfo.InstanceInfo(instanceInfo29);
        com.netflix.appinfo.InstanceInfo.Builder builder32 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder34 = builder32.setCountryId((int) (short) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder32.setPort((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder37 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder40 = builder37.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder42 = builder40.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder44 = builder40.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder46 = builder44.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus48 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder49 = builder44.setStatus(instanceStatus48);
        com.netflix.appinfo.InstanceInfo.Builder builder51 = builder49.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder53 = builder49.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo54 = builder49.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder55 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo54);
        com.netflix.appinfo.InstanceInfo instanceInfo56 = builder55.getRawInstance();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus57 = com.netflix.appinfo.InstanceInfo.InstanceStatus.STARTING;
        instanceInfo56.setOverriddenStatus(instanceStatus57);
        com.netflix.appinfo.InstanceInfo.Builder builder59 = builder36.setStatus(instanceStatus57);
        instanceInfo31.setStatusWithoutDirty(instanceStatus57);
        com.netflix.appinfo.InstanceInfo.Builder builder61 = builder10.setOverriddenStatus(instanceStatus57);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder64 = builder10.setHomePageUrl("UNKNOWN", "hi!");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder3 = builder0.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder3.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder3.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder7.setStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo17 = builder12.getRawInstance();
        java.lang.String str18 = instanceInfo17.getIPAddr();
        com.netflix.appinfo.InstanceInfo.Builder builder19 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo17);
        instanceInfo17.setLastUpdatedTimestamp();
        boolean boolean21 = instanceInfo17.isDirty();
        com.netflix.appinfo.InstanceInfo.Builder builder22 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder22.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder25.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder25.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder31 = builder29.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus33 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder34 = builder29.setStatus(instanceStatus33);
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder34.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder38 = builder34.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo39 = builder34.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder40 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo39);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus41 = instanceInfo39.getOverriddenStatus();
        instanceInfo39.setIsDirty();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus43 = com.netflix.appinfo.InstanceInfo.InstanceStatus.STARTING;
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus44 = instanceInfo39.setStatus(instanceStatus43);
        instanceInfo17.setOverriddenStatus(instanceStatus43);
        instanceInfo17.setSID("na");
        com.netflix.appinfo.InstanceInfo instanceInfo48 = new com.netflix.appinfo.InstanceInfo(instanceInfo17);
        boolean boolean49 = instanceInfo17.isDirty();
        java.lang.String str50 = instanceInfo17.getHostName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        instanceInfo17.setIsCoordinatingDiscoveryServer();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecurePort(7001);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setASGName("EUREKA.");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setNamespace("UNKNOWN");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setSecureVIPAddressDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setSID("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder8.setSID("http://inesserver2.windows.cin.ufpe.br:80/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder8.setHealthCheckUrls("UNKNOWN", "http://inesserver2.windows.cin.ufpe.br:80/", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setCountryId((int) (short) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) '4');
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setVIPAddress("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setASGName("/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder2.setHealthCheckUrls("EUREKA.", "unknown", "unknown");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap1 = applicationInfoManager0.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo2 = applicationInfoManager0.instanceInfo;
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus3 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.setInstanceStatus(instanceStatus3);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSecurePort((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setHealthCheckUrls("", "/healthcheck", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSecurePort((int) (byte) -1);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager5 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap6 = applicationInfoManager5.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo7 = applicationInfoManager5.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager.instance = applicationInfoManager5;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig9 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        java.lang.String str10 = myDataCenterInstanceConfig9.getNamespace();
        java.lang.String str11 = myDataCenterInstanceConfig9.getStatusPageUrlPath();
        applicationInfoManager5.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig9);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder13.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder16.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder20.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus24 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder20.setStatus(instanceStatus24);
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder25.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder25.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo30 = builder25.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder31 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo30);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus32 = instanceInfo30.getOverriddenStatus();
        instanceInfo30.setIsDirty();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus34 = com.netflix.appinfo.InstanceInfo.InstanceStatus.STARTING;
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus35 = instanceInfo30.setStatus(instanceStatus34);
        applicationInfoManager5.setInstanceStatus(instanceStatus35);
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder2.setOverriddenStatus(instanceStatus35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder40 = builder2.setHomePageUrl("inesserver2.windows.cin.ufpe.br", "eureka.");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        java.lang.String[] strArray5 = new java.lang.String[] { "na", "http://inesserver2.windows.cin.ufpe.br:80/", "/", "na", "/" };
        com.netflix.appinfo.InstanceInfo.Builder builder6 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus17 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder13.setStatus(instanceStatus17);
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder18.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo23 = builder18.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder24 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo23);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus25 = instanceInfo23.getOverriddenStatus();
        instanceInfo23.setIsDirty();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo27 = instanceInfo23.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.ActionType actionType28 = instanceInfo23.getActionType();
        java.lang.String str29 = instanceInfo23.getStatusPageUrl();
        instanceInfo23.setIsDirty(true);
        java.lang.String str32 = instanceInfo23.getAppGroupName();
        java.lang.String str33 = instanceInfo23.getHostName();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus34 = instanceInfo23.getStatus();
        instanceInfo23.setIsDirty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str36 = com.netflix.appinfo.InstanceInfo.getZone(strArray5, instanceInfo23);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        java.lang.String[] strArray6 = new java.lang.String[] { "eureka.", "http://inesserver2.windows.cin.ufpe.br:80/", "http://inesserver2.windows.cin.ufpe.br:80/", "EUREKA.", "hi!", "unknown" };
        com.netflix.appinfo.InstanceInfo.Builder builder7 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder7.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder10.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus18 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder14.setStatus(instanceStatus18);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder19.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo24 = builder19.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder25 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo24);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus26 = instanceInfo24.getOverriddenStatus();
        instanceInfo24.setIsDirty();
        com.netflix.appinfo.InstanceInfo.ActionType actionType28 = instanceInfo24.getActionType();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus29 = instanceInfo24.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo instanceInfo30 = new com.netflix.appinfo.InstanceInfo(instanceInfo24);
        java.lang.String str31 = instanceInfo24.getVIPAddress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str32 = com.netflix.appinfo.InstanceInfo.getZone(strArray6, instanceInfo24);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setCountryId((int) (short) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) '4');
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setAppGroupName("na");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setAppGroupName("/");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setLastDirtyTimestamp(1636109051804L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder8.setStatusPageUrl("UNKNOWN", "na");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder3 = builder0.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder3.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder3.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder7.setStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo17 = builder12.getRawInstance();
        boolean boolean18 = instanceInfo17.isDirty();
        boolean boolean19 = instanceInfo17.isDirty();
        instanceInfo17.setIsDirty(false);
        com.netflix.appinfo.InstanceInfo instanceInfo22 = new com.netflix.appinfo.InstanceInfo(instanceInfo17);
        com.netflix.appinfo.InstanceInfo.Builder builder23 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo22);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus24 = instanceInfo22.getStatus();
        java.lang.String str25 = instanceInfo22.getVIPAddress();
        com.netflix.appinfo.InstanceInfo.ActionType actionType26 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        instanceInfo22.setActionType(actionType26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        instanceInfo22.setIsCoordinatingDiscoveryServer();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder3 = builder0.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder3.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder3.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder7.setStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo17 = builder12.getRawInstance();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus18 = instanceInfo17.getOverriddenStatus();
        java.lang.String str19 = instanceInfo17.getSID();
        java.lang.String str20 = instanceInfo17.getIPAddr();
        com.netflix.appinfo.InstanceInfo.Builder builder21 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo17);
        com.netflix.appinfo.InstanceInfo.Builder builder22 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo17);
        com.netflix.appinfo.InstanceInfo instanceInfo23 = new com.netflix.appinfo.InstanceInfo(instanceInfo17);
        com.netflix.appinfo.InstanceInfo instanceInfo24 = new com.netflix.appinfo.InstanceInfo(instanceInfo17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        instanceInfo24.setIsCoordinatingDiscoveryServer();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddress("");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig("/Status");
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig9 = new com.netflix.appinfo.MyDataCenterInstanceConfig("", dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig("", dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig11 = new com.netflix.appinfo.MyDataCenterInstanceConfig("unknown", dataCenterInfo8);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder2.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setPort((int) (short) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setSecurePort((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder16.setHomePageUrl("inesserver2.windows.cin.ufpe.br", "172.20.26.3");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap1 = applicationInfoManager0.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo2 = applicationInfoManager0.getInfo();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager3 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap4 = applicationInfoManager3.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo5 = applicationInfoManager3.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager6 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig8 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager6.config = myDataCenterInstanceConfig8;
        applicationInfoManager3.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig8);
        com.netflix.appinfo.InstanceInfo instanceInfo11 = applicationInfoManager3.instanceInfo;
        applicationInfoManager3.refreshDataCenterInfoIfRequired();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager13 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap14 = applicationInfoManager13.listeners;
        applicationInfoManager3.listeners = strMap14;
        applicationInfoManager0.listeners = strMap14;
        com.netflix.appinfo.InstanceInfo instanceInfo17 = applicationInfoManager0.instanceInfo;
        com.netflix.appinfo.InstanceInfo.Builder builder18 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder18.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder21.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder25.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus29 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder25.setStatus(instanceStatus29);
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder30.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder34 = builder30.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo35 = builder30.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder36 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo35);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus37 = instanceInfo35.getOverriddenStatus();
        instanceInfo35.setIsDirty();
        com.netflix.appinfo.InstanceInfo.ActionType actionType39 = instanceInfo35.getActionType();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus40 = instanceInfo35.getOverriddenStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.setInstanceStatus(instanceStatus40);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecurePort(7001);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSecureVIPAddress("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder4.add("/", "/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder7.setHealthCheckUrls("", "inesserver2.windows.cin.ufpe.br:80", "eureka.");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder3 = builder0.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.setHomePageUrlForDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.setPort((int) (short) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setCountryId(7002);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setHealthCheckUrls("/", "", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecurePort(7001);
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.add("eureka.", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.setSecureVIPAddressDeser("unknown");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager11 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap12 = applicationInfoManager11.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo13 = applicationInfoManager11.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager14 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig16 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager14.config = myDataCenterInstanceConfig16;
        applicationInfoManager11.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig16);
        java.lang.String str19 = myDataCenterInstanceConfig16.getStatusPageUrl();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo20 = myDataCenterInstanceConfig16.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig21 = new com.netflix.appinfo.MyDataCenterInstanceConfig("/", dataCenterInfo20);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig22 = new com.netflix.appinfo.MyDataCenterInstanceConfig("inesserver2.windows.cin.ufpe.br:80", dataCenterInfo20);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig23 = new com.netflix.appinfo.MyDataCenterInstanceConfig("eureka.", dataCenterInfo20);
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder0.setDataCenterInfo(dataCenterInfo20);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus25 = com.netflix.appinfo.InstanceInfo.InstanceStatus.STARTING;
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder24.setOverriddenStatus(instanceStatus25);
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder26.setIsCoordinatingDiscoveryServer(false);
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder28.setSID("http://inesserver2.windows.cin.ufpe.br:80/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder33 = builder30.setHomePageUrl("/healthcheck", "/");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        java.lang.String[] strArray1 = new java.lang.String[] { "UNKNOWN" };
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager2 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap3 = applicationInfoManager2.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo4 = applicationInfoManager2.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager5 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager5.config = myDataCenterInstanceConfig7;
        applicationInfoManager2.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig7);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap10 = applicationInfoManager2.listeners;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager11 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap12 = applicationInfoManager11.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo13 = applicationInfoManager11.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager14 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig16 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager14.config = myDataCenterInstanceConfig16;
        applicationInfoManager11.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig16);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap19 = applicationInfoManager11.listeners;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager20 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap21 = applicationInfoManager20.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo22 = applicationInfoManager20.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager23 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig25 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager23.config = myDataCenterInstanceConfig25;
        applicationInfoManager20.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig25);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap28 = applicationInfoManager20.listeners;
        applicationInfoManager11.listeners = strMap28;
        applicationInfoManager2.listeners = strMap28;
        com.netflix.appinfo.InstanceInfo instanceInfo31 = applicationInfoManager2.instanceInfo;
        com.netflix.appinfo.LeaseInfo leaseInfo32 = instanceInfo31.getLeaseInfo();
        java.lang.String str33 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo31);
        com.netflix.appinfo.InstanceInfo.Builder builder34 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder34.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder37.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder37.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder43 = builder41.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus45 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder46 = builder41.setStatus(instanceStatus45);
        com.netflix.appinfo.InstanceInfo.Builder builder48 = builder46.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder50 = builder46.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo51 = builder46.getRawInstance();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus52 = instanceInfo51.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo instanceInfo53 = new com.netflix.appinfo.InstanceInfo(instanceInfo51);
        java.lang.String str54 = instanceInfo53.getAppGroupName();
        instanceInfo53.setLastDirtyTimestamp((java.lang.Long) 0L);
        java.lang.String str57 = instanceInfo53.getAppName();
        long long58 = instanceInfo53.getLastUpdatedTimestamp();
        instanceInfo53.setLastUpdatedTimestamp();
        long long60 = instanceInfo53.getLastUpdatedTimestamp();
        com.netflix.appinfo.InstanceInfo instanceInfo61 = new com.netflix.appinfo.InstanceInfo(instanceInfo53);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str62 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo61);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecurePort(7001);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("172.20.26.3");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder4.setStatusPageUrl("/Status", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        java.lang.String[] strArray1 = new java.lang.String[] { "UNKNOWN" };
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager2 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap3 = applicationInfoManager2.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo4 = applicationInfoManager2.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager5 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager5.config = myDataCenterInstanceConfig7;
        applicationInfoManager2.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig7);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap10 = applicationInfoManager2.listeners;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager11 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap12 = applicationInfoManager11.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo13 = applicationInfoManager11.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager14 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig16 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager14.config = myDataCenterInstanceConfig16;
        applicationInfoManager11.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig16);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap19 = applicationInfoManager11.listeners;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager20 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap21 = applicationInfoManager20.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo22 = applicationInfoManager20.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager23 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig25 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager23.config = myDataCenterInstanceConfig25;
        applicationInfoManager20.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig25);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap28 = applicationInfoManager20.listeners;
        applicationInfoManager11.listeners = strMap28;
        applicationInfoManager2.listeners = strMap28;
        com.netflix.appinfo.InstanceInfo instanceInfo31 = applicationInfoManager2.instanceInfo;
        com.netflix.appinfo.LeaseInfo leaseInfo32 = instanceInfo31.getLeaseInfo();
        java.lang.String str33 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo31);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager34 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap35 = applicationInfoManager34.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo36 = applicationInfoManager34.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager.instance = applicationInfoManager34;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig38 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        java.lang.String str39 = myDataCenterInstanceConfig38.getNamespace();
        java.lang.String str40 = myDataCenterInstanceConfig38.getStatusPageUrlPath();
        applicationInfoManager34.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig38);
        com.netflix.appinfo.InstanceInfo instanceInfo42 = applicationInfoManager34.instanceInfo;
        com.netflix.appinfo.InstanceInfo.Builder builder43 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo42);
        java.util.Map<java.lang.String, java.lang.String> strMap44 = instanceInfo42.getMetadata();
        java.lang.String str45 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo42);
        com.netflix.appinfo.InstanceInfo.Builder builder46 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder49 = builder46.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder51 = builder49.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder53 = builder49.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder55 = builder53.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus57 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder58 = builder53.setStatus(instanceStatus57);
        com.netflix.appinfo.InstanceInfo.Builder builder60 = builder58.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder62 = builder58.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo63 = builder58.getRawInstance();
        boolean boolean64 = instanceInfo63.isDirty();
        boolean boolean65 = instanceInfo63.isDirty();
        instanceInfo63.setIsDirty(false);
        com.netflix.appinfo.InstanceInfo instanceInfo68 = new com.netflix.appinfo.InstanceInfo(instanceInfo63);
        com.netflix.appinfo.InstanceInfo.Builder builder69 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo68);
        java.lang.String str70 = instanceInfo68.getAppName();
        java.lang.String str71 = instanceInfo68.getSecureVipAddress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str72 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo68);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        java.lang.String[] strArray1 = new java.lang.String[] { "UNKNOWN" };
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager2 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap3 = applicationInfoManager2.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo4 = applicationInfoManager2.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager5 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager5.config = myDataCenterInstanceConfig7;
        applicationInfoManager2.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig7);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap10 = applicationInfoManager2.listeners;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager11 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap12 = applicationInfoManager11.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo13 = applicationInfoManager11.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager14 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig16 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager14.config = myDataCenterInstanceConfig16;
        applicationInfoManager11.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig16);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap19 = applicationInfoManager11.listeners;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager20 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap21 = applicationInfoManager20.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo22 = applicationInfoManager20.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager23 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig25 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager23.config = myDataCenterInstanceConfig25;
        applicationInfoManager20.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig25);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap28 = applicationInfoManager20.listeners;
        applicationInfoManager11.listeners = strMap28;
        applicationInfoManager2.listeners = strMap28;
        com.netflix.appinfo.InstanceInfo instanceInfo31 = applicationInfoManager2.instanceInfo;
        com.netflix.appinfo.LeaseInfo leaseInfo32 = instanceInfo31.getLeaseInfo();
        java.lang.String str33 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo31);
        com.netflix.appinfo.InstanceInfo.Builder builder34 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder34.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder37.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder37.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder43 = builder41.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus45 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder46 = builder41.setStatus(instanceStatus45);
        com.netflix.appinfo.InstanceInfo.Builder builder48 = builder46.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder50 = builder46.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo51 = builder46.getRawInstance();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus52 = instanceInfo51.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo instanceInfo53 = new com.netflix.appinfo.InstanceInfo(instanceInfo51);
        instanceInfo53.setIsDirty();
        java.util.Map<java.lang.String, java.lang.String> strMap55 = instanceInfo53.getMetadata();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str56 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo53);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        java.lang.String[] strArray1 = new java.lang.String[] { "UNKNOWN" };
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager2 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap3 = applicationInfoManager2.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo4 = applicationInfoManager2.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager5 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager5.config = myDataCenterInstanceConfig7;
        applicationInfoManager2.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig7);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap10 = applicationInfoManager2.listeners;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager11 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap12 = applicationInfoManager11.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo13 = applicationInfoManager11.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager14 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig16 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager14.config = myDataCenterInstanceConfig16;
        applicationInfoManager11.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig16);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap19 = applicationInfoManager11.listeners;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager20 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap21 = applicationInfoManager20.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo22 = applicationInfoManager20.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager23 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig25 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager23.config = myDataCenterInstanceConfig25;
        applicationInfoManager20.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig25);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap28 = applicationInfoManager20.listeners;
        applicationInfoManager11.listeners = strMap28;
        applicationInfoManager2.listeners = strMap28;
        com.netflix.appinfo.InstanceInfo instanceInfo31 = applicationInfoManager2.instanceInfo;
        com.netflix.appinfo.LeaseInfo leaseInfo32 = instanceInfo31.getLeaseInfo();
        java.lang.String str33 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo31);
        com.netflix.appinfo.InstanceInfo.Builder builder34 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder34.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder37.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder37.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder43 = builder41.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus45 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder46 = builder41.setStatus(instanceStatus45);
        com.netflix.appinfo.InstanceInfo.Builder builder48 = builder46.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder50 = builder46.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo51 = builder46.getRawInstance();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus52 = instanceInfo51.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo instanceInfo53 = new com.netflix.appinfo.InstanceInfo(instanceInfo51);
        java.lang.String str54 = instanceInfo53.getAppGroupName();
        java.lang.String str55 = instanceInfo53.getSecureVipAddress();
        java.lang.String str56 = instanceInfo53.getSecureVipAddress();
        instanceInfo53.setSID("172.20.26.3");
        java.lang.String str59 = instanceInfo53.getAppName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str60 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo53);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        java.lang.String[] strArray2 = new java.lang.String[] { "/", "inesserver2.windows.cin.ufpe.br:80" };
        com.netflix.appinfo.InstanceInfo.Builder builder3 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder3.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus14 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder10.setStatus(instanceStatus14);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder15.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo20 = builder15.getRawInstance();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus21 = instanceInfo20.getOverriddenStatus();
        instanceInfo20.setIsDirty();
        com.netflix.appinfo.InstanceInfo.Builder builder23 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo20);
        instanceInfo20.setIsDirty(false);
        com.netflix.appinfo.InstanceInfo.Builder builder26 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str27 = com.netflix.appinfo.InstanceInfo.getZone(strArray2, instanceInfo20);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        com.netflix.appinfo.InstanceInfo.Builder builder1 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder1.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus12 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder8.setStatus(instanceStatus12);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder13.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo18 = builder13.getRawInstance();
        java.lang.String str19 = instanceInfo18.getIPAddr();
        com.netflix.appinfo.InstanceInfo instanceInfo20 = new com.netflix.appinfo.InstanceInfo(instanceInfo18);
        com.netflix.appinfo.InstanceInfo instanceInfo21 = new com.netflix.appinfo.InstanceInfo(instanceInfo20);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus22 = instanceInfo20.getStatus();
        java.lang.String str23 = instanceInfo20.getASGName();
        instanceInfo20.setIsDirty(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = com.netflix.appinfo.InstanceInfo.getZone(strArray0, instanceInfo20);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setCountryId((int) (short) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setLastUpdatedTimestamp(1636109051265L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setHealthCheckUrls("/Status", "/healthcheck", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setCountryId((int) (short) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) '4');
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setAppGroupName("na");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setAppGroupName("/");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setLastDirtyTimestamp(1636109051804L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder10.setHealthCheckUrls("UNKNOWN", "", "eureka.");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddress("");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig("/Status");
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig9 = new com.netflix.appinfo.MyDataCenterInstanceConfig("", dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig("", dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig11 = new com.netflix.appinfo.MyDataCenterInstanceConfig("unknown", dataCenterInfo8);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder2.setDataCenterInfo(dataCenterInfo8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder2.setHomePageUrl("/Status", "unknown");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap1 = applicationInfoManager0.listeners;
        applicationInfoManager0.unregisterStatusChangeListener("unknown");
        com.netflix.appinfo.ApplicationInfoManager.instance = applicationInfoManager0;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager5 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap6 = applicationInfoManager5.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo7 = applicationInfoManager5.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager8 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager8.config = myDataCenterInstanceConfig10;
        applicationInfoManager5.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig10);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap13 = applicationInfoManager5.listeners;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager14 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap15 = applicationInfoManager14.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo16 = applicationInfoManager14.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager17 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig19 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager17.config = myDataCenterInstanceConfig19;
        applicationInfoManager14.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig19);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap22 = applicationInfoManager14.listeners;
        applicationInfoManager5.listeners = strMap22;
        com.netflix.appinfo.InstanceInfo instanceInfo24 = applicationInfoManager5.getInfo();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager25 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap26 = applicationInfoManager25.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo27 = applicationInfoManager25.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager28 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig30 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager28.config = myDataCenterInstanceConfig30;
        applicationInfoManager25.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig30);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager33 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap34 = applicationInfoManager33.listeners;
        applicationInfoManager25.listeners = strMap34;
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap36 = applicationInfoManager25.listeners;
        applicationInfoManager5.listeners = strMap36;
        applicationInfoManager0.listeners = strMap36;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig40 = new com.netflix.appinfo.MyDataCenterInstanceConfig("/Status");
        java.lang.String str41 = myDataCenterInstanceConfig40.getHealthCheckUrl();
        com.netflix.appinfo.InstanceInfo.Builder builder42 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder45 = builder42.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder47 = builder45.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder49 = builder45.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder51 = builder49.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus53 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder54 = builder49.setStatus(instanceStatus53);
        com.netflix.appinfo.InstanceInfo.Builder builder56 = builder54.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder58 = builder54.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo59 = builder54.getRawInstance();
        java.lang.String str60 = instanceInfo59.getIPAddr();
        com.netflix.appinfo.InstanceInfo instanceInfo61 = new com.netflix.appinfo.InstanceInfo(instanceInfo59);
        com.netflix.appinfo.InstanceInfo instanceInfo62 = new com.netflix.appinfo.InstanceInfo(instanceInfo61);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus63 = instanceInfo61.getStatus();
        com.netflix.appinfo.InstanceInfo instanceInfo64 = new com.netflix.appinfo.InstanceInfo(instanceInfo61);
        java.lang.String str65 = instanceInfo61.getHomePageUrl();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager66 = new com.netflix.appinfo.ApplicationInfoManager((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig40, instanceInfo61);
        int int67 = myDataCenterInstanceConfig40.getLeaseExpirationDurationInSeconds();
        java.lang.String str68 = myDataCenterInstanceConfig40.getHomePageUrlPath();
        java.util.Map<java.lang.String, java.lang.String> strMap69 = myDataCenterInstanceConfig40.getMetadataMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.registerAppMetadata(strMap69);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        java.lang.String[] strArray1 = new java.lang.String[] { "UNKNOWN" };
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager2 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap3 = applicationInfoManager2.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo4 = applicationInfoManager2.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager5 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager5.config = myDataCenterInstanceConfig7;
        applicationInfoManager2.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig7);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap10 = applicationInfoManager2.listeners;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager11 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap12 = applicationInfoManager11.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo13 = applicationInfoManager11.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager14 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig16 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager14.config = myDataCenterInstanceConfig16;
        applicationInfoManager11.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig16);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap19 = applicationInfoManager11.listeners;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager20 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap21 = applicationInfoManager20.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo22 = applicationInfoManager20.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager23 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig25 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager23.config = myDataCenterInstanceConfig25;
        applicationInfoManager20.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig25);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap28 = applicationInfoManager20.listeners;
        applicationInfoManager11.listeners = strMap28;
        applicationInfoManager2.listeners = strMap28;
        com.netflix.appinfo.InstanceInfo instanceInfo31 = applicationInfoManager2.instanceInfo;
        com.netflix.appinfo.LeaseInfo leaseInfo32 = instanceInfo31.getLeaseInfo();
        java.lang.String str33 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo31);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager34 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap35 = applicationInfoManager34.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo36 = applicationInfoManager34.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager.instance = applicationInfoManager34;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig38 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        java.lang.String str39 = myDataCenterInstanceConfig38.getNamespace();
        java.lang.String str40 = myDataCenterInstanceConfig38.getStatusPageUrlPath();
        applicationInfoManager34.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig38);
        com.netflix.appinfo.InstanceInfo instanceInfo42 = applicationInfoManager34.instanceInfo;
        com.netflix.appinfo.InstanceInfo.Builder builder43 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo42);
        java.util.Map<java.lang.String, java.lang.String> strMap44 = instanceInfo42.getMetadata();
        java.lang.String str45 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo42);
        com.netflix.appinfo.InstanceInfo.Builder builder46 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder49 = builder46.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder51 = builder49.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder53 = builder49.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder55 = builder53.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus57 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder58 = builder53.setStatus(instanceStatus57);
        com.netflix.appinfo.InstanceInfo.Builder builder60 = builder58.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder62 = builder58.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo63 = builder58.getRawInstance();
        java.lang.String str64 = instanceInfo63.getIPAddr();
        com.netflix.appinfo.InstanceInfo instanceInfo65 = new com.netflix.appinfo.InstanceInfo(instanceInfo63);
        java.lang.Boolean boolean66 = instanceInfo63.isCoordinatingDiscoveryServer();
        instanceInfo63.setIsDirty();
        java.lang.String str68 = instanceInfo63.getVIPAddress();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager70 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap71 = applicationInfoManager70.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo72 = applicationInfoManager70.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager73 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig75 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager73.config = myDataCenterInstanceConfig75;
        applicationInfoManager70.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig75);
        java.lang.String str78 = myDataCenterInstanceConfig75.getStatusPageUrl();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo79 = myDataCenterInstanceConfig75.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig80 = new com.netflix.appinfo.MyDataCenterInstanceConfig("/", dataCenterInfo79);
        java.lang.String str81 = myDataCenterInstanceConfig80.getSecureHealthCheckUrl();
        java.lang.String str82 = myDataCenterInstanceConfig80.getHealthCheckUrlPath();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo83 = myDataCenterInstanceConfig80.getDataCenterInfo();
        boolean boolean84 = instanceInfo63.equals((java.lang.Object) myDataCenterInstanceConfig80);
        instanceInfo63.setIsDirty(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str87 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo63);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecurePort(7001);
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.add("eureka.", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.ActionType actionType6 = com.netflix.appinfo.InstanceInfo.ActionType.ADDED;
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setActionType(actionType6);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder5.setHealthCheckUrlsForDeser("/", "EUREKA.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder5.setHomePageUrl("UNKNOWN", "eureka.");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig2 = new com.netflix.appinfo.MyDataCenterInstanceConfig("/Status");
        java.lang.String str3 = myDataCenterInstanceConfig2.getAppGroupName();
        java.lang.String str4 = myDataCenterInstanceConfig2.getStatusPageUrl();
        com.netflix.appinfo.InstanceInfo.Builder builder5 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder5.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus16 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder12.setStatus(instanceStatus16);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder17.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo22 = builder17.getRawInstance();
        java.lang.String str23 = instanceInfo22.getIPAddr();
        com.netflix.appinfo.InstanceInfo instanceInfo24 = new com.netflix.appinfo.InstanceInfo(instanceInfo22);
        com.netflix.appinfo.InstanceInfo instanceInfo25 = new com.netflix.appinfo.InstanceInfo(instanceInfo24);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus26 = instanceInfo25.getStatus();
        com.netflix.appinfo.InstanceInfo instanceInfo27 = new com.netflix.appinfo.InstanceInfo(instanceInfo25);
        java.lang.String str28 = instanceInfo25.getId();
        java.lang.String str29 = instanceInfo25.getVersion();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager30 = new com.netflix.appinfo.ApplicationInfoManager((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig2, instanceInfo25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str31 = com.netflix.appinfo.InstanceInfo.getZone(strArray0, instanceInfo25);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        java.lang.String[] strArray1 = new java.lang.String[] { "UNKNOWN" };
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager2 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap3 = applicationInfoManager2.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo4 = applicationInfoManager2.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager5 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager5.config = myDataCenterInstanceConfig7;
        applicationInfoManager2.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig7);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap10 = applicationInfoManager2.listeners;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager11 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap12 = applicationInfoManager11.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo13 = applicationInfoManager11.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager14 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig16 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager14.config = myDataCenterInstanceConfig16;
        applicationInfoManager11.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig16);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap19 = applicationInfoManager11.listeners;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager20 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap21 = applicationInfoManager20.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo22 = applicationInfoManager20.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager23 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig25 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager23.config = myDataCenterInstanceConfig25;
        applicationInfoManager20.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig25);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap28 = applicationInfoManager20.listeners;
        applicationInfoManager11.listeners = strMap28;
        applicationInfoManager2.listeners = strMap28;
        com.netflix.appinfo.InstanceInfo instanceInfo31 = applicationInfoManager2.instanceInfo;
        com.netflix.appinfo.LeaseInfo leaseInfo32 = instanceInfo31.getLeaseInfo();
        java.lang.String str33 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo31);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager34 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap35 = applicationInfoManager34.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo36 = applicationInfoManager34.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager.instance = applicationInfoManager34;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig38 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        java.lang.String str39 = myDataCenterInstanceConfig38.getNamespace();
        java.lang.String str40 = myDataCenterInstanceConfig38.getStatusPageUrlPath();
        applicationInfoManager34.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig38);
        com.netflix.appinfo.InstanceInfo instanceInfo42 = applicationInfoManager34.instanceInfo;
        com.netflix.appinfo.InstanceInfo.Builder builder43 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo42);
        java.util.Map<java.lang.String, java.lang.String> strMap44 = instanceInfo42.getMetadata();
        java.lang.String str45 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo42);
        com.netflix.appinfo.InstanceInfo.Builder builder46 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder49 = builder46.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder51 = builder49.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder53 = builder49.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder55 = builder53.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus57 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder58 = builder53.setStatus(instanceStatus57);
        com.netflix.appinfo.InstanceInfo.Builder builder60 = builder58.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder62 = builder58.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo63 = builder58.getRawInstance();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus64 = instanceInfo63.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo instanceInfo65 = new com.netflix.appinfo.InstanceInfo(instanceInfo63);
        java.lang.String str66 = instanceInfo65.getAppGroupName();
        java.lang.String str67 = instanceInfo65.getSecureVipAddress();
        java.lang.String str68 = instanceInfo65.getSecureVipAddress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str69 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo65);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        java.lang.String[] strArray1 = new java.lang.String[] { "UNKNOWN" };
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager2 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap3 = applicationInfoManager2.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo4 = applicationInfoManager2.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager5 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager5.config = myDataCenterInstanceConfig7;
        applicationInfoManager2.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig7);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap10 = applicationInfoManager2.listeners;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager11 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap12 = applicationInfoManager11.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo13 = applicationInfoManager11.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager14 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig16 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager14.config = myDataCenterInstanceConfig16;
        applicationInfoManager11.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig16);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap19 = applicationInfoManager11.listeners;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager20 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap21 = applicationInfoManager20.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo22 = applicationInfoManager20.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager23 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig25 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager23.config = myDataCenterInstanceConfig25;
        applicationInfoManager20.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig25);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap28 = applicationInfoManager20.listeners;
        applicationInfoManager11.listeners = strMap28;
        applicationInfoManager2.listeners = strMap28;
        com.netflix.appinfo.InstanceInfo instanceInfo31 = applicationInfoManager2.instanceInfo;
        com.netflix.appinfo.LeaseInfo leaseInfo32 = instanceInfo31.getLeaseInfo();
        java.lang.String str33 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo31);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager34 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap35 = applicationInfoManager34.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo36 = applicationInfoManager34.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager.instance = applicationInfoManager34;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig38 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        java.lang.String str39 = myDataCenterInstanceConfig38.getNamespace();
        java.lang.String str40 = myDataCenterInstanceConfig38.getStatusPageUrlPath();
        applicationInfoManager34.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig38);
        com.netflix.appinfo.InstanceInfo instanceInfo42 = applicationInfoManager34.instanceInfo;
        com.netflix.appinfo.InstanceInfo.Builder builder43 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo42);
        java.util.Map<java.lang.String, java.lang.String> strMap44 = instanceInfo42.getMetadata();
        java.lang.String str45 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo42);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager46 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap47 = applicationInfoManager46.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo48 = applicationInfoManager46.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager.instance = applicationInfoManager46;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig50 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        java.lang.String str51 = myDataCenterInstanceConfig50.getNamespace();
        java.lang.String str52 = myDataCenterInstanceConfig50.getStatusPageUrlPath();
        applicationInfoManager46.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig50);
        java.lang.String str54 = myDataCenterInstanceConfig50.getStatusPageUrlPath();
        java.lang.String str55 = myDataCenterInstanceConfig50.getHomePageUrl();
        com.netflix.appinfo.InstanceInfo.Builder builder56 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder59 = builder56.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder61 = builder59.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder63 = builder59.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder65 = builder63.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus67 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder68 = builder63.setStatus(instanceStatus67);
        com.netflix.appinfo.InstanceInfo.Builder builder70 = builder68.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder72 = builder68.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo73 = builder68.getRawInstance();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus74 = instanceInfo73.getOverriddenStatus();
        instanceInfo73.setIsDirty();
        java.lang.String str76 = instanceInfo73.getHomePageUrl();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager77 = new com.netflix.appinfo.ApplicationInfoManager((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig50, instanceInfo73);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig78 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        java.lang.String str79 = myDataCenterInstanceConfig78.getSecureVirtualHostName();
        applicationInfoManager77.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig78);
        com.netflix.appinfo.InstanceInfo.Builder builder81 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder83 = builder81.setSecurePort(7001);
        com.netflix.appinfo.InstanceInfo.Builder builder85 = builder83.setHostName("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder88 = builder85.setStatusPageUrl("", "");
        com.netflix.appinfo.InstanceInfo.Builder builder91 = builder88.setHealthCheckUrlsForDeser("/Status", "EUREKA.");
        com.netflix.appinfo.InstanceInfo instanceInfo92 = builder91.getRawInstance();
        java.lang.Long long93 = instanceInfo92.isDirtyWithTime();
        java.lang.String str94 = instanceInfo92.getVIPAddress();
        applicationInfoManager77.instanceInfo = instanceInfo92;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str96 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo92);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder3 = builder0.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder3.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder3.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder7.setStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo17 = builder12.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder18 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo17);
        com.netflix.appinfo.InstanceInfo instanceInfo19 = new com.netflix.appinfo.InstanceInfo(instanceInfo17);
        java.lang.String str20 = instanceInfo17.getSID();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus21 = instanceInfo17.getStatus();
        java.lang.String str22 = instanceInfo17.getASGName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        instanceInfo17.setIsCoordinatingDiscoveryServer();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        java.lang.String[] strArray1 = new java.lang.String[] { "UNKNOWN" };
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager2 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap3 = applicationInfoManager2.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo4 = applicationInfoManager2.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager5 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager5.config = myDataCenterInstanceConfig7;
        applicationInfoManager2.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig7);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap10 = applicationInfoManager2.listeners;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager11 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap12 = applicationInfoManager11.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo13 = applicationInfoManager11.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager14 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig16 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager14.config = myDataCenterInstanceConfig16;
        applicationInfoManager11.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig16);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap19 = applicationInfoManager11.listeners;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager20 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap21 = applicationInfoManager20.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo22 = applicationInfoManager20.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager23 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig25 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager23.config = myDataCenterInstanceConfig25;
        applicationInfoManager20.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig25);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap28 = applicationInfoManager20.listeners;
        applicationInfoManager11.listeners = strMap28;
        applicationInfoManager2.listeners = strMap28;
        com.netflix.appinfo.InstanceInfo instanceInfo31 = applicationInfoManager2.instanceInfo;
        com.netflix.appinfo.LeaseInfo leaseInfo32 = instanceInfo31.getLeaseInfo();
        java.lang.String str33 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo31);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager34 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap35 = applicationInfoManager34.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo36 = applicationInfoManager34.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager.instance = applicationInfoManager34;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig38 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        java.lang.String str39 = myDataCenterInstanceConfig38.getNamespace();
        java.lang.String str40 = myDataCenterInstanceConfig38.getStatusPageUrlPath();
        applicationInfoManager34.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig38);
        com.netflix.appinfo.InstanceInfo instanceInfo42 = applicationInfoManager34.instanceInfo;
        com.netflix.appinfo.InstanceInfo.Builder builder43 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo42);
        java.util.Map<java.lang.String, java.lang.String> strMap44 = instanceInfo42.getMetadata();
        java.lang.String str45 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo42);
        com.netflix.appinfo.InstanceInfo.Builder builder46 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder49 = builder46.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder51 = builder49.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder53 = builder49.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder55 = builder53.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus57 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder58 = builder53.setStatus(instanceStatus57);
        com.netflix.appinfo.InstanceInfo.Builder builder60 = builder58.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder62 = builder58.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo63 = builder58.getRawInstance();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus64 = instanceInfo63.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo instanceInfo65 = new com.netflix.appinfo.InstanceInfo(instanceInfo63);
        java.lang.String str66 = instanceInfo65.getAppGroupName();
        java.lang.String str67 = instanceInfo65.getSecureVipAddress();
        java.lang.String str68 = instanceInfo65.getSecureVipAddress();
        com.netflix.appinfo.InstanceInfo instanceInfo69 = new com.netflix.appinfo.InstanceInfo(instanceInfo65);
        java.lang.String str70 = instanceInfo65.getHomePageUrl();
        instanceInfo65.unsetIsDirty(1636109037195L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str73 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo65);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setCountryId((int) (short) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setPort((int) (byte) 1);
        boolean boolean5 = builder0.isInitialized();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder0.setHealthCheckUrls("http://inesserver2.windows.cin.ufpe.br:80/", "na", "172.20.26.3");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecurePort(7001);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setCountryId((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder0.setStatusPageUrl("inesserver2.windows.cin.ufpe.br", "/healthcheck");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap1 = applicationInfoManager0.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo2 = applicationInfoManager0.getInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder5 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setSecureVIPAddress("");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig12 = new com.netflix.appinfo.MyDataCenterInstanceConfig("/Status");
        com.netflix.appinfo.DataCenterInfo dataCenterInfo13 = myDataCenterInstanceConfig12.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig14 = new com.netflix.appinfo.MyDataCenterInstanceConfig("", dataCenterInfo13);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig15 = new com.netflix.appinfo.MyDataCenterInstanceConfig("", dataCenterInfo13);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig16 = new com.netflix.appinfo.MyDataCenterInstanceConfig("unknown", dataCenterInfo13);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder7.setDataCenterInfo(dataCenterInfo13);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig18 = new com.netflix.appinfo.MyDataCenterInstanceConfig("172.20.26.3", dataCenterInfo13);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig19 = new com.netflix.appinfo.MyDataCenterInstanceConfig("inesserver2.windows.cin.ufpe.br", dataCenterInfo13);
        applicationInfoManager0.config = myDataCenterInstanceConfig19;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.refreshDataCenterInfoIfRequired();
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.InstanceInfo.Builder builder1 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder1.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus12 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder8.setStatus(instanceStatus12);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder13.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo18 = builder13.getRawInstance();
        applicationInfoManager0.instanceInfo = instanceInfo18;
        com.netflix.appinfo.InstanceInfo.Builder builder20 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder20.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder23.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder23.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder27.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus31 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder27.setStatus(instanceStatus31);
        com.netflix.appinfo.InstanceInfo.Builder builder34 = builder32.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder32.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo37 = builder32.getRawInstance();
        java.lang.String str38 = instanceInfo37.getIPAddr();
        com.netflix.appinfo.InstanceInfo instanceInfo39 = new com.netflix.appinfo.InstanceInfo(instanceInfo37);
        java.lang.Boolean boolean40 = instanceInfo37.isCoordinatingDiscoveryServer();
        instanceInfo37.setIsDirty();
        java.util.Set<java.lang.String> strSet42 = instanceInfo37.getHealthCheckUrls();
        com.netflix.appinfo.InstanceInfo.Builder builder43 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo37);
        com.netflix.appinfo.InstanceInfo.Builder builder45 = builder43.setSID("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder46 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder49 = builder46.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder51 = builder49.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder53 = builder49.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder55 = builder53.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus57 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder58 = builder53.setStatus(instanceStatus57);
        com.netflix.appinfo.InstanceInfo.Builder builder60 = builder58.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder62 = builder58.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo63 = builder58.getRawInstance();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus64 = instanceInfo63.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo instanceInfo65 = new com.netflix.appinfo.InstanceInfo(instanceInfo63);
        java.lang.String str66 = instanceInfo65.getAppGroupName();
        instanceInfo65.setLastDirtyTimestamp((java.lang.Long) 0L);
        com.netflix.appinfo.InstanceInfo.ActionType actionType69 = instanceInfo65.getActionType();
        com.netflix.appinfo.InstanceInfo instanceInfo70 = new com.netflix.appinfo.InstanceInfo(instanceInfo65);
        java.util.Map<java.lang.String, java.lang.String> strMap71 = instanceInfo70.getMetadata();
        com.netflix.appinfo.InstanceInfo.Builder builder72 = builder43.setMetadata(strMap71);
        applicationInfoManager0.registerAppMetadata(strMap71);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.refreshDataCenterInfoIfRequired();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        java.lang.String[] strArray1 = new java.lang.String[] { "UNKNOWN" };
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager2 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap3 = applicationInfoManager2.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo4 = applicationInfoManager2.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager5 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager5.config = myDataCenterInstanceConfig7;
        applicationInfoManager2.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig7);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap10 = applicationInfoManager2.listeners;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager11 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap12 = applicationInfoManager11.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo13 = applicationInfoManager11.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager14 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig16 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager14.config = myDataCenterInstanceConfig16;
        applicationInfoManager11.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig16);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap19 = applicationInfoManager11.listeners;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager20 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap21 = applicationInfoManager20.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo22 = applicationInfoManager20.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager23 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig25 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager23.config = myDataCenterInstanceConfig25;
        applicationInfoManager20.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig25);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap28 = applicationInfoManager20.listeners;
        applicationInfoManager11.listeners = strMap28;
        applicationInfoManager2.listeners = strMap28;
        com.netflix.appinfo.InstanceInfo instanceInfo31 = applicationInfoManager2.instanceInfo;
        com.netflix.appinfo.LeaseInfo leaseInfo32 = instanceInfo31.getLeaseInfo();
        java.lang.String str33 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo31);
        com.netflix.appinfo.InstanceInfo.Builder builder34 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder34.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder37.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder37.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder43 = builder41.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus45 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder46 = builder41.setStatus(instanceStatus45);
        com.netflix.appinfo.InstanceInfo.Builder builder48 = builder46.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder50 = builder46.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo51 = builder46.getRawInstance();
        java.lang.String str52 = instanceInfo51.getIPAddr();
        com.netflix.appinfo.InstanceInfo instanceInfo53 = new com.netflix.appinfo.InstanceInfo(instanceInfo51);
        int int54 = instanceInfo53.getSecurePort();
        java.lang.String str55 = instanceInfo53.getStatusPageUrl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str56 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo53);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setCountryId((int) (short) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) '4');
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setVIPAddress("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setASGName("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setIPAddr("");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setLastDirtyTimestamp(1636109121044L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder12.setStatusPageUrl("default", "hi!");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecurePort(7001);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setASGName("EUREKA.");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setNamespace("UNKNOWN");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setLastUpdatedTimestamp(1636109091204L);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setIsCoordinatingDiscoveryServer(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder12.setHomePageUrl("eureka.", "na");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder3 = builder0.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder3.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder3.setIsCoordinatingDiscoveryServer(true);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setCountryId((int) ' ');
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setStatusPageUrlForDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder11.setHealthCheckUrlsForDeser("172.20.26.3", "na");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder11.setStatusPageUrl("172.20.26.3", "hi!");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder3 = builder0.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder3.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder3.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder7.setStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig18 = new com.netflix.appinfo.MyDataCenterInstanceConfig("/Status");
        java.lang.String str19 = myDataCenterInstanceConfig18.getHealthCheckUrl();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo20 = myDataCenterInstanceConfig18.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder12.setDataCenterInfo(dataCenterInfo20);
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setNamespace("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder23.setHomePageUrlForDeser("EUREKA.");
        com.netflix.appinfo.InstanceInfo instanceInfo26 = builder25.getRawInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo27 = new com.netflix.appinfo.InstanceInfo(instanceInfo26);
        com.netflix.appinfo.InstanceInfo instanceInfo28 = new com.netflix.appinfo.InstanceInfo(instanceInfo27);
        java.lang.String str29 = instanceInfo28.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        instanceInfo28.setIsCoordinatingDiscoveryServer();
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        java.lang.String[] strArray1 = new java.lang.String[] { "eureka." };
        com.netflix.appinfo.InstanceInfo.Builder builder2 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder2.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder5.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus13 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder9.setStatus(instanceStatus13);
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder14.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo19 = builder14.getRawInstance();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus20 = instanceInfo19.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo instanceInfo21 = new com.netflix.appinfo.InstanceInfo(instanceInfo19);
        java.lang.String str22 = instanceInfo21.getAppGroupName();
        java.lang.String str23 = instanceInfo21.getSecureVipAddress();
        java.lang.String str24 = instanceInfo21.getSecureVipAddress();
        com.netflix.appinfo.InstanceInfo.Builder builder25 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo21);
        java.lang.String str26 = instanceInfo21.getHomePageUrl();
        com.netflix.appinfo.InstanceInfo.Builder builder27 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo21);
        java.lang.String str28 = instanceInfo21.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str29 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo21);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder3 = builder0.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder3.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder3.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder7.setStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo17 = builder12.getRawInstance();
        java.lang.String str18 = instanceInfo17.getIPAddr();
        com.netflix.appinfo.InstanceInfo instanceInfo19 = new com.netflix.appinfo.InstanceInfo(instanceInfo17);
        com.netflix.appinfo.InstanceInfo instanceInfo20 = new com.netflix.appinfo.InstanceInfo(instanceInfo19);
        com.netflix.appinfo.InstanceInfo instanceInfo21 = new com.netflix.appinfo.InstanceInfo(instanceInfo20);
        com.netflix.appinfo.InstanceInfo.Builder builder22 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo20);
        instanceInfo20.setLastDirtyTimestamp((java.lang.Long) 1636109014613L);
        java.lang.String str25 = instanceInfo20.getVIPAddress();
        java.lang.String str26 = instanceInfo20.getIPAddr();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        instanceInfo20.setIsCoordinatingDiscoveryServer();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecurePort(7001);
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.add("eureka.", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.ActionType actionType6 = com.netflix.appinfo.InstanceInfo.ActionType.ADDED;
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setActionType(actionType6);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder5.setNamespace("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder5.setCountryId((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder5.setHomePageUrl("na", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setCountryId((int) (short) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) '4');
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setVIPAddress("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setASGName("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setIPAddr("");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setLastDirtyTimestamp(1636109121044L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setHealthCheckUrls("inesserver2.windows.cin.ufpe.br:80", "EUREKA.", "/");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setCountryId((int) (short) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) '4');
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder4.add("/", "eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder4.add("", "/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setSecurePort(7001);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setHostName("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder15.setStatusPageUrl("", "");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder18.setHomePageUrl("na", "unknown");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus23 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder18.setOverriddenStatus(instanceStatus23);
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder10.setOverriddenStatus(instanceStatus23);
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder10.setAppName("http://inesserver2.windows.cin.ufpe.br:80/");
        com.netflix.appinfo.InstanceInfo.Builder builder28 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder31 = builder28.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder33 = builder31.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder35 = builder31.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder35.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus39 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder40 = builder35.setStatus(instanceStatus39);
        com.netflix.appinfo.InstanceInfo.Builder builder42 = builder40.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder44 = builder40.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo45 = builder40.getRawInstance();
        boolean boolean46 = instanceInfo45.isDirty();
        boolean boolean47 = instanceInfo45.isDirty();
        com.netflix.appinfo.InstanceInfo.Builder builder48 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo45);
        com.netflix.appinfo.InstanceInfo instanceInfo49 = new com.netflix.appinfo.InstanceInfo(instanceInfo45);
        java.lang.String str50 = instanceInfo45.getAppGroupName();
        java.lang.String str51 = instanceInfo45.getVIPAddress();
        com.netflix.appinfo.InstanceInfo instanceInfo52 = new com.netflix.appinfo.InstanceInfo(instanceInfo45);
        com.netflix.appinfo.InstanceInfo.Builder builder53 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder56 = builder53.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder58 = builder56.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder60 = builder58.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder62 = builder58.setVIPAddressDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder65 = builder62.add("na", "inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder67 = builder62.setLastDirtyTimestamp((long) (-1));
        com.netflix.appinfo.InstanceInfo.Builder builder69 = builder62.setSID("na");
        com.netflix.appinfo.InstanceInfo.Builder builder70 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder73 = builder70.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder75 = builder73.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder77 = builder73.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder79 = builder77.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus81 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder82 = builder77.setStatus(instanceStatus81);
        com.netflix.appinfo.InstanceInfo.Builder builder84 = builder82.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder86 = builder82.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo87 = builder82.getRawInstance();
        boolean boolean88 = instanceInfo87.isDirty();
        boolean boolean89 = instanceInfo87.isDirty();
        java.lang.String str90 = instanceInfo87.getAppName();
        instanceInfo87.setIsCoordinatingDiscoveryServer();
        com.netflix.appinfo.InstanceInfo.ActionType actionType92 = com.netflix.appinfo.InstanceInfo.ActionType.ADDED;
        instanceInfo87.setActionType(actionType92);
        com.netflix.appinfo.InstanceInfo.Builder builder94 = builder69.setActionType(actionType92);
        instanceInfo45.setActionType(actionType92);
        com.netflix.appinfo.InstanceInfo.Builder builder96 = builder27.setActionType(actionType92);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder99 = builder96.setStatusPageUrl("default", "default");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder3 = builder0.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder3.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder3.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder7.setStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo17 = builder12.getRawInstance();
        boolean boolean18 = instanceInfo17.isDirty();
        boolean boolean19 = instanceInfo17.isDirty();
        instanceInfo17.setIsDirty(false);
        com.netflix.appinfo.InstanceInfo instanceInfo22 = new com.netflix.appinfo.InstanceInfo(instanceInfo17);
        com.netflix.appinfo.InstanceInfo.Builder builder23 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo22);
        instanceInfo22.setLastDirtyTimestamp((java.lang.Long) 1636109022964L);
        instanceInfo22.setLastUpdatedTimestamp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        instanceInfo22.setIsCoordinatingDiscoveryServer();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder3 = builder0.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.setHomePageUrlForDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.setPort((int) (short) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder0.setNamespace("UNKNOWN");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder0.setHomePageUrl("/Status", "UNKNOWN");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap1 = applicationInfoManager0.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo2 = applicationInfoManager0.getInfo();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager3 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap4 = applicationInfoManager3.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo5 = applicationInfoManager3.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager6 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig8 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager6.config = myDataCenterInstanceConfig8;
        applicationInfoManager3.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig8);
        com.netflix.appinfo.InstanceInfo instanceInfo11 = applicationInfoManager3.instanceInfo;
        applicationInfoManager3.refreshDataCenterInfoIfRequired();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager13 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap14 = applicationInfoManager13.listeners;
        applicationInfoManager3.listeners = strMap14;
        applicationInfoManager0.listeners = strMap14;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.refreshDataCenterInfoIfRequired();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap1 = applicationInfoManager0.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo2 = applicationInfoManager0.instanceInfo;
        com.netflix.appinfo.InstanceInfo instanceInfo3 = applicationInfoManager0.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager4 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap5 = applicationInfoManager4.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo6 = applicationInfoManager4.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager7 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig9 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager7.config = myDataCenterInstanceConfig9;
        applicationInfoManager4.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig9);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap12 = applicationInfoManager4.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo13 = applicationInfoManager4.instanceInfo;
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus14 = instanceInfo13.getOverriddenStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.setInstanceStatus(instanceStatus14);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setCountryId((int) (short) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) '4');
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setVIPAddress("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setSecurePort(0);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setIPAddr("inesserver2.windows.cin.ufpe.br:80");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder10.setStatusPageUrl("inesserver2.windows.cin.ufpe.br:80", "hi!");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap1 = applicationInfoManager0.listeners;
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig2 = applicationInfoManager0.config;
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig3 = applicationInfoManager0.config;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig5 = new com.netflix.appinfo.MyDataCenterInstanceConfig("/Status");
        java.lang.String str6 = myDataCenterInstanceConfig5.getAppGroupName();
        java.lang.String str7 = myDataCenterInstanceConfig5.getStatusPageUrl();
        com.netflix.appinfo.InstanceInfo.Builder builder8 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder8.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder11.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus19 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder15.setStatus(instanceStatus19);
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder20.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder20.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo25 = builder20.getRawInstance();
        java.lang.String str26 = instanceInfo25.getIPAddr();
        com.netflix.appinfo.InstanceInfo instanceInfo27 = new com.netflix.appinfo.InstanceInfo(instanceInfo25);
        com.netflix.appinfo.InstanceInfo instanceInfo28 = new com.netflix.appinfo.InstanceInfo(instanceInfo27);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus29 = instanceInfo28.getStatus();
        com.netflix.appinfo.InstanceInfo instanceInfo30 = new com.netflix.appinfo.InstanceInfo(instanceInfo28);
        java.lang.String str31 = instanceInfo28.getId();
        java.lang.String str32 = instanceInfo28.getVersion();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager33 = new com.netflix.appinfo.ApplicationInfoManager((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig5, instanceInfo28);
        com.netflix.appinfo.InstanceInfo.Builder builder34 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder34.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder37.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder37.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder43 = builder41.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus45 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder46 = builder41.setStatus(instanceStatus45);
        com.netflix.appinfo.InstanceInfo.Builder builder48 = builder46.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder50 = builder46.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo51 = builder46.getRawInstance();
        java.lang.String str52 = instanceInfo51.getIPAddr();
        com.netflix.appinfo.InstanceInfo instanceInfo53 = new com.netflix.appinfo.InstanceInfo(instanceInfo51);
        com.netflix.appinfo.InstanceInfo instanceInfo54 = new com.netflix.appinfo.InstanceInfo(instanceInfo53);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus55 = instanceInfo54.getStatus();
        com.netflix.appinfo.InstanceInfo instanceInfo56 = new com.netflix.appinfo.InstanceInfo(instanceInfo54);
        com.netflix.appinfo.InstanceInfo instanceInfo57 = new com.netflix.appinfo.InstanceInfo(instanceInfo56);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus59 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("na");
        instanceInfo56.setStatusWithoutDirty(instanceStatus59);
        applicationInfoManager33.setInstanceStatus(instanceStatus59);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.setInstanceStatus(instanceStatus59);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder3 = builder0.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder3.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder5.setLastDirtyTimestamp(1636109106647L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder9.setHomePageUrl("na", "172.20.26.3");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder3 = builder0.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder3.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder5.setVIPAddressDeser("");
        com.netflix.appinfo.InstanceInfo instanceInfo10 = builder5.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder11 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder11.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder14.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.PortType portType21 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder18.enablePort(portType21, false);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager24 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap25 = applicationInfoManager24.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo26 = applicationInfoManager24.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager27 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig29 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager27.config = myDataCenterInstanceConfig29;
        applicationInfoManager24.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig29);
        java.lang.String str32 = myDataCenterInstanceConfig29.getStatusPageUrl();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo33 = myDataCenterInstanceConfig29.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder34 = builder23.setDataCenterInfo(dataCenterInfo33);
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder23.setStatusPageUrlForDeser("na");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus37 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder38 = builder23.setStatus(instanceStatus37);
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder5.setOverriddenStatus(instanceStatus37);
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder5.setIPAddr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder44 = builder5.setHomePageUrl("inesserver2.windows.cin.ufpe.br", "172.20.26.3");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap1 = applicationInfoManager0.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo2 = applicationInfoManager0.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager.instance = applicationInfoManager0;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder4.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder7.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus15 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder11.setStatus(instanceStatus15);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder16.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo21 = builder16.getRawInstance();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus22 = instanceInfo21.getOverriddenStatus();
        java.lang.String str23 = instanceInfo21.getSID();
        com.netflix.appinfo.InstanceInfo.ActionType actionType24 = instanceInfo21.getActionType();
        com.netflix.appinfo.InstanceInfo instanceInfo25 = new com.netflix.appinfo.InstanceInfo(instanceInfo21);
        com.netflix.appinfo.InstanceInfo instanceInfo26 = new com.netflix.appinfo.InstanceInfo(instanceInfo25);
        com.netflix.appinfo.InstanceInfo instanceInfo27 = new com.netflix.appinfo.InstanceInfo(instanceInfo25);
        java.lang.String str28 = instanceInfo25.getAppName();
        applicationInfoManager0.instanceInfo = instanceInfo25;
        com.netflix.appinfo.InstanceInfo instanceInfo30 = applicationInfoManager0.instanceInfo;
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap31 = applicationInfoManager0.listeners;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.refreshDataCenterInfoIfRequired();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap1 = applicationInfoManager0.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo2 = applicationInfoManager0.instanceInfo;
        applicationInfoManager0.unregisterStatusChangeListener("inesserver2.windows.cin.ufpe.br");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.refreshDataCenterInfoIfRequired();
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap1 = applicationInfoManager0.listeners;
        applicationInfoManager0.unregisterStatusChangeListener("unknown");
        com.netflix.appinfo.ApplicationInfoManager.instance = applicationInfoManager0;
        com.netflix.appinfo.InstanceInfo instanceInfo5 = applicationInfoManager0.instanceInfo;
        com.netflix.appinfo.InstanceInfo.Builder builder6 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus17 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder13.setStatus(instanceStatus17);
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder18.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo23 = builder18.getRawInstance();
        boolean boolean24 = instanceInfo23.isDirty();
        com.netflix.appinfo.InstanceInfo instanceInfo25 = new com.netflix.appinfo.InstanceInfo(instanceInfo23);
        java.lang.String str26 = instanceInfo23.getVersion();
        long long27 = instanceInfo23.getLastUpdatedTimestamp();
        java.lang.Boolean boolean28 = instanceInfo23.isCoordinatingDiscoveryServer();
        com.netflix.appinfo.InstanceInfo.Builder builder29 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder29.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder34 = builder32.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder32.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder38 = builder36.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.PortType portType39 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder36.enablePort(portType39, false);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager42 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap43 = applicationInfoManager42.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo44 = applicationInfoManager42.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager45 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig47 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager45.config = myDataCenterInstanceConfig47;
        applicationInfoManager42.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig47);
        java.lang.String str50 = myDataCenterInstanceConfig47.getStatusPageUrl();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo51 = myDataCenterInstanceConfig47.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder52 = builder41.setDataCenterInfo(dataCenterInfo51);
        com.netflix.appinfo.InstanceInfo.Builder builder54 = builder41.setStatusPageUrlForDeser("na");
        com.netflix.appinfo.InstanceInfo.Builder builder55 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder58 = builder55.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder60 = builder58.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder62 = builder58.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder64 = builder62.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus66 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder67 = builder62.setStatus(instanceStatus66);
        com.netflix.appinfo.InstanceInfo.Builder builder69 = builder67.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder71 = builder67.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo72 = builder67.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder73 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo72);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus74 = instanceInfo72.getOverriddenStatus();
        instanceInfo72.setIsDirty();
        com.netflix.appinfo.InstanceInfo.ActionType actionType76 = instanceInfo72.getActionType();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus77 = instanceInfo72.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder78 = builder41.setStatus(instanceStatus77);
        instanceInfo23.setOverriddenStatus(instanceStatus77);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.setInstanceStatus(instanceStatus77);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder3 = builder0.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder3.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder3.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo instanceInfo10 = builder9.getRawInstance();
        java.lang.String str11 = instanceInfo10.getAppGroupName();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo10);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        instanceInfo10.setIsCoordinatingDiscoveryServer();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder3 = builder0.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder3.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder3.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder7.setStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo17 = builder12.getRawInstance();
        java.lang.String str18 = instanceInfo17.getIPAddr();
        com.netflix.appinfo.InstanceInfo instanceInfo19 = new com.netflix.appinfo.InstanceInfo(instanceInfo17);
        int int20 = instanceInfo19.getSecurePort();
        java.lang.String str21 = instanceInfo19.getStatusPageUrl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        instanceInfo19.setIsCoordinatingDiscoveryServer();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecurePort(7001);
        boolean boolean3 = builder0.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.setLastDirtyTimestamp(1636109115205L);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setCountryId((int) (short) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setPort((int) (byte) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder11.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder14.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus22 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder18.setStatus(instanceStatus22);
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder23.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder23.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo28 = builder23.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder29 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo28);
        com.netflix.appinfo.InstanceInfo instanceInfo30 = builder29.getRawInstance();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus31 = com.netflix.appinfo.InstanceInfo.InstanceStatus.STARTING;
        instanceInfo30.setOverriddenStatus(instanceStatus31);
        com.netflix.appinfo.InstanceInfo.Builder builder33 = builder10.setStatus(instanceStatus31);
        com.netflix.appinfo.InstanceInfo.Builder builder34 = builder0.setStatus(instanceStatus31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder34.setHomePageUrl("EUREKA.", "EUREKA.");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddress("");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setHomePageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setHomePageUrlForDeser("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setHealthCheckUrlsForDeser("inesserver2.windows.cin.ufpe.br", "/healthcheck");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setHomePageUrl("/", "na");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder3 = builder0.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder3.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder6 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus17 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder13.setStatus(instanceStatus17);
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder18.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig24 = new com.netflix.appinfo.MyDataCenterInstanceConfig("/Status");
        java.lang.String str25 = myDataCenterInstanceConfig24.getHealthCheckUrl();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo26 = myDataCenterInstanceConfig24.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder18.setDataCenterInfo(dataCenterInfo26);
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder27.setNamespace("172.20.26.3");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager30 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap31 = applicationInfoManager30.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo32 = applicationInfoManager30.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager33 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig35 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager33.config = myDataCenterInstanceConfig35;
        applicationInfoManager30.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig35);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap38 = applicationInfoManager30.listeners;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager39 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap40 = applicationInfoManager39.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo41 = applicationInfoManager39.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager42 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig44 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager42.config = myDataCenterInstanceConfig44;
        applicationInfoManager39.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig44);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap47 = applicationInfoManager39.listeners;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager48 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap49 = applicationInfoManager48.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo50 = applicationInfoManager48.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager51 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig53 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager51.config = myDataCenterInstanceConfig53;
        applicationInfoManager48.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig53);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap56 = applicationInfoManager48.listeners;
        applicationInfoManager39.listeners = strMap56;
        applicationInfoManager30.listeners = strMap56;
        com.netflix.appinfo.InstanceInfo instanceInfo59 = applicationInfoManager30.instanceInfo;
        com.netflix.appinfo.LeaseInfo leaseInfo60 = instanceInfo59.getLeaseInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder61 = builder29.setLeaseInfo(leaseInfo60);
        com.netflix.appinfo.InstanceInfo.Builder builder62 = builder3.setLeaseInfo(leaseInfo60);
        com.netflix.appinfo.InstanceInfo.Builder builder64 = builder62.setNamespace("na");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder68 = builder64.setHealthCheckUrls("hi!", "default", "na");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecurePort(7001);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setASGName("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder0.setSID("inesserver2.windows.cin.ufpe.br");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder0.setHomePageUrl("inesserver2.windows.cin.ufpe.br:80", "");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setCountryId((int) (short) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setHomePageUrlForDeser("EUREKA.");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setSecureVIPAddress("na");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setNamespace("/");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder2.setAppName("/");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder2.setSecureVIPAddressDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder2.setSecurePort((-1));
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder2.setSecureVIPAddressDeser("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder2.setHomePageUrl("eureka.", "/Status");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setCountryId((int) (short) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) '4');
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setAppGroupName("na");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setAppGroupName("/");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setLastUpdatedTimestamp(1636109031524L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder6.setStatusPageUrl("172.20.26.3", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder3 = builder0.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder3.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder5.setVIPAddressDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder9.add("na", "inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setAppName("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setLastUpdatedTimestamp(1636109037433L);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setSecurePort((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder18.setHomePageUrl("unknown", "hi!");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        java.lang.String[] strArray3 = new java.lang.String[] { "/", "EUREKA.", "/" };
        com.netflix.appinfo.InstanceInfo.Builder builder4 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder4.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder7.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus15 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder11.setStatus(instanceStatus15);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder18.setSecureVIPAddressDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder18.setSID("/Status");
        com.netflix.appinfo.InstanceInfo instanceInfo25 = builder24.getRawInstance();
        java.lang.String str26 = instanceInfo25.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str27 = com.netflix.appinfo.InstanceInfo.getZone(strArray3, instanceInfo25);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecurePort(7001);
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.add("eureka.", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.setSecureVIPAddressDeser("unknown");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager11 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap12 = applicationInfoManager11.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo13 = applicationInfoManager11.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager14 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig16 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager14.config = myDataCenterInstanceConfig16;
        applicationInfoManager11.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig16);
        java.lang.String str19 = myDataCenterInstanceConfig16.getStatusPageUrl();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo20 = myDataCenterInstanceConfig16.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig21 = new com.netflix.appinfo.MyDataCenterInstanceConfig("/", dataCenterInfo20);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig22 = new com.netflix.appinfo.MyDataCenterInstanceConfig("inesserver2.windows.cin.ufpe.br:80", dataCenterInfo20);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig23 = new com.netflix.appinfo.MyDataCenterInstanceConfig("eureka.", dataCenterInfo20);
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder0.setDataCenterInfo(dataCenterInfo20);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus25 = com.netflix.appinfo.InstanceInfo.InstanceStatus.STARTING;
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder24.setOverriddenStatus(instanceStatus25);
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder26.setIsCoordinatingDiscoveryServer(false);
        com.netflix.appinfo.InstanceInfo.Builder builder29 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder29.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder34 = builder32.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder32.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder38 = builder36.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus40 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder36.setStatus(instanceStatus40);
        com.netflix.appinfo.InstanceInfo.Builder builder43 = builder41.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder45 = builder41.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo46 = builder41.getRawInstance();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus47 = instanceInfo46.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo instanceInfo48 = new com.netflix.appinfo.InstanceInfo(instanceInfo46);
        java.lang.String str49 = instanceInfo48.getAppGroupName();
        instanceInfo48.setLastDirtyTimestamp((java.lang.Long) 0L);
        java.lang.String str52 = instanceInfo48.getAppName();
        long long53 = instanceInfo48.getLastUpdatedTimestamp();
        com.netflix.appinfo.InstanceInfo instanceInfo54 = new com.netflix.appinfo.InstanceInfo(instanceInfo48);
        com.netflix.appinfo.InstanceInfo.Builder builder55 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder58 = builder55.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder60 = builder58.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder62 = builder58.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder64 = builder62.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus66 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder67 = builder62.setStatus(instanceStatus66);
        com.netflix.appinfo.InstanceInfo.Builder builder69 = builder67.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder71 = builder67.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo72 = builder67.getRawInstance();
        java.lang.String str73 = instanceInfo72.getIPAddr();
        com.netflix.appinfo.InstanceInfo.Builder builder74 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo72);
        instanceInfo72.setLastUpdatedTimestamp();
        com.netflix.appinfo.InstanceInfo.Builder builder76 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo72);
        com.netflix.appinfo.InstanceInfo.Builder builder78 = builder76.setNamespace("/Status");
        com.netflix.appinfo.InstanceInfo.ActionType actionType79 = com.netflix.appinfo.InstanceInfo.ActionType.ADDED;
        com.netflix.appinfo.InstanceInfo.Builder builder80 = builder78.setActionType(actionType79);
        instanceInfo54.setActionType(actionType79);
        com.netflix.appinfo.InstanceInfo.Builder builder82 = builder28.setActionType(actionType79);
        com.netflix.appinfo.InstanceInfo.Builder builder84 = builder28.setSecureVIPAddressDeser("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder86 = builder28.setVIPAddress("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder89 = builder28.add("na", "default");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder92 = builder89.setStatusPageUrl("inesserver2.windows.cin.ufpe.br:80", "UNKNOWN");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap1 = applicationInfoManager0.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo2 = applicationInfoManager0.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager.instance = applicationInfoManager0;
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig4 = applicationInfoManager0.config;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.refreshDataCenterInfoIfRequired();
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setCountryId((int) (short) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) '4');
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setAppGroupName("na");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder4.add("/Status", "/");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder4.setNamespace("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setStatusPageUrlForDeser("UNKNOWN");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setAppGroupName("http://inesserver2.windows.cin.ufpe.br:80/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder13.setHealthCheckUrls("/", "eureka.", "hi!");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        java.lang.String[] strArray1 = new java.lang.String[] { "UNKNOWN" };
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager2 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap3 = applicationInfoManager2.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo4 = applicationInfoManager2.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager5 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager5.config = myDataCenterInstanceConfig7;
        applicationInfoManager2.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig7);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap10 = applicationInfoManager2.listeners;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager11 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap12 = applicationInfoManager11.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo13 = applicationInfoManager11.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager14 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig16 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager14.config = myDataCenterInstanceConfig16;
        applicationInfoManager11.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig16);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap19 = applicationInfoManager11.listeners;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager20 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap21 = applicationInfoManager20.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo22 = applicationInfoManager20.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager23 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig25 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager23.config = myDataCenterInstanceConfig25;
        applicationInfoManager20.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig25);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap28 = applicationInfoManager20.listeners;
        applicationInfoManager11.listeners = strMap28;
        applicationInfoManager2.listeners = strMap28;
        com.netflix.appinfo.InstanceInfo instanceInfo31 = applicationInfoManager2.instanceInfo;
        com.netflix.appinfo.LeaseInfo leaseInfo32 = instanceInfo31.getLeaseInfo();
        java.lang.String str33 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo31);
        com.netflix.appinfo.InstanceInfo.Builder builder34 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder34.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder37.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder37.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder43 = builder41.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus45 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder46 = builder41.setStatus(instanceStatus45);
        com.netflix.appinfo.InstanceInfo.Builder builder48 = builder46.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder50 = builder46.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo51 = builder46.getRawInstance();
        boolean boolean52 = instanceInfo51.isDirty();
        com.netflix.appinfo.InstanceInfo instanceInfo53 = new com.netflix.appinfo.InstanceInfo(instanceInfo51);
        java.lang.String str54 = instanceInfo53.getStatusPageUrl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str55 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo53);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder3 = builder0.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder3.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder5.setVIPAddressDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder9.add("na", "inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder9.setLastDirtyTimestamp((long) (-1));
        com.netflix.appinfo.InstanceInfo instanceInfo15 = builder9.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder9.setSecurePort(97);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder9.setHomePageUrl("/", "eureka.");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setCountryId((int) (short) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) '4');
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setVIPAddress("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setSecurePort(0);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setIPAddr("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setIPAddr("inesserver2.windows.cin.ufpe.br");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder12.setHomePageUrl("/Status", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecurePort(7001);
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.add("eureka.", "172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.setSecureVIPAddressDeser("unknown");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager11 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap12 = applicationInfoManager11.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo13 = applicationInfoManager11.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager14 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig16 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager14.config = myDataCenterInstanceConfig16;
        applicationInfoManager11.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig16);
        java.lang.String str19 = myDataCenterInstanceConfig16.getStatusPageUrl();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo20 = myDataCenterInstanceConfig16.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig21 = new com.netflix.appinfo.MyDataCenterInstanceConfig("/", dataCenterInfo20);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig22 = new com.netflix.appinfo.MyDataCenterInstanceConfig("inesserver2.windows.cin.ufpe.br:80", dataCenterInfo20);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig23 = new com.netflix.appinfo.MyDataCenterInstanceConfig("eureka.", dataCenterInfo20);
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder0.setDataCenterInfo(dataCenterInfo20);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus25 = com.netflix.appinfo.InstanceInfo.InstanceStatus.STARTING;
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder24.setOverriddenStatus(instanceStatus25);
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder26.setIsCoordinatingDiscoveryServer(false);
        com.netflix.appinfo.InstanceInfo.Builder builder29 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder29.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder34 = builder32.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder32.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder38 = builder36.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus40 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder36.setStatus(instanceStatus40);
        com.netflix.appinfo.InstanceInfo.Builder builder43 = builder41.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder45 = builder41.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo46 = builder41.getRawInstance();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus47 = instanceInfo46.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo instanceInfo48 = new com.netflix.appinfo.InstanceInfo(instanceInfo46);
        java.lang.String str49 = instanceInfo48.getAppGroupName();
        instanceInfo48.setLastDirtyTimestamp((java.lang.Long) 0L);
        java.lang.String str52 = instanceInfo48.getAppName();
        long long53 = instanceInfo48.getLastUpdatedTimestamp();
        com.netflix.appinfo.InstanceInfo instanceInfo54 = new com.netflix.appinfo.InstanceInfo(instanceInfo48);
        com.netflix.appinfo.InstanceInfo.Builder builder55 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder58 = builder55.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder60 = builder58.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder62 = builder58.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder64 = builder62.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus66 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder67 = builder62.setStatus(instanceStatus66);
        com.netflix.appinfo.InstanceInfo.Builder builder69 = builder67.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder71 = builder67.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo72 = builder67.getRawInstance();
        java.lang.String str73 = instanceInfo72.getIPAddr();
        com.netflix.appinfo.InstanceInfo.Builder builder74 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo72);
        instanceInfo72.setLastUpdatedTimestamp();
        com.netflix.appinfo.InstanceInfo.Builder builder76 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo72);
        com.netflix.appinfo.InstanceInfo.Builder builder78 = builder76.setNamespace("/Status");
        com.netflix.appinfo.InstanceInfo.ActionType actionType79 = com.netflix.appinfo.InstanceInfo.ActionType.ADDED;
        com.netflix.appinfo.InstanceInfo.Builder builder80 = builder78.setActionType(actionType79);
        instanceInfo54.setActionType(actionType79);
        com.netflix.appinfo.InstanceInfo.Builder builder82 = builder28.setActionType(actionType79);
        com.netflix.appinfo.InstanceInfo.Builder builder84 = builder28.setSecureVIPAddressDeser("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder86 = builder28.setVIPAddress("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder88 = builder86.setLastDirtyTimestamp(1636109080721L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder92 = builder88.setHealthCheckUrls("inesserver2.windows.cin.ufpe.br", "unknown", "eureka.");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder3 = builder0.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder3.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder3.setIsCoordinatingDiscoveryServer(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder3.setHealthCheckUrls("EUREKA.", "/", "/");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        java.lang.String[] strArray1 = new java.lang.String[] { "UNKNOWN" };
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager2 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap3 = applicationInfoManager2.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo4 = applicationInfoManager2.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager5 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager5.config = myDataCenterInstanceConfig7;
        applicationInfoManager2.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig7);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap10 = applicationInfoManager2.listeners;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager11 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap12 = applicationInfoManager11.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo13 = applicationInfoManager11.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager14 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig16 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager14.config = myDataCenterInstanceConfig16;
        applicationInfoManager11.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig16);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap19 = applicationInfoManager11.listeners;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager20 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap21 = applicationInfoManager20.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo22 = applicationInfoManager20.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager23 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig25 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager23.config = myDataCenterInstanceConfig25;
        applicationInfoManager20.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig25);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap28 = applicationInfoManager20.listeners;
        applicationInfoManager11.listeners = strMap28;
        applicationInfoManager2.listeners = strMap28;
        com.netflix.appinfo.InstanceInfo instanceInfo31 = applicationInfoManager2.instanceInfo;
        com.netflix.appinfo.LeaseInfo leaseInfo32 = instanceInfo31.getLeaseInfo();
        java.lang.String str33 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo31);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager34 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap35 = applicationInfoManager34.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo36 = applicationInfoManager34.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager.instance = applicationInfoManager34;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig38 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        java.lang.String str39 = myDataCenterInstanceConfig38.getNamespace();
        java.lang.String str40 = myDataCenterInstanceConfig38.getStatusPageUrlPath();
        applicationInfoManager34.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig38);
        com.netflix.appinfo.InstanceInfo instanceInfo42 = applicationInfoManager34.instanceInfo;
        com.netflix.appinfo.InstanceInfo.Builder builder43 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo42);
        java.util.Map<java.lang.String, java.lang.String> strMap44 = instanceInfo42.getMetadata();
        java.lang.String str45 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo42);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig47 = new com.netflix.appinfo.MyDataCenterInstanceConfig("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder48 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder51 = builder48.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder53 = builder51.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder55 = builder51.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder57 = builder55.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus59 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder60 = builder55.setStatus(instanceStatus59);
        com.netflix.appinfo.InstanceInfo.Builder builder62 = builder60.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder64 = builder60.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo65 = builder60.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder66 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo65);
        com.netflix.appinfo.InstanceInfo.Builder builder67 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo65);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager68 = new com.netflix.appinfo.ApplicationInfoManager((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig47, instanceInfo65);
        java.lang.String str69 = instanceInfo65.getASGName();
        java.lang.String str70 = instanceInfo65.getVIPAddress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str71 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo65);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecurePort(7001);
        boolean boolean3 = builder0.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.setLastDirtyTimestamp(1636109115205L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder0.setHealthCheckUrls("", "", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        java.lang.String[] strArray1 = new java.lang.String[] { "unknown" };
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig3 = new com.netflix.appinfo.MyDataCenterInstanceConfig("eureka.");
        java.lang.String str4 = myDataCenterInstanceConfig3.getHealthCheckUrl();
        java.lang.String str5 = myDataCenterInstanceConfig3.getIpAddress();
        java.lang.String str6 = myDataCenterInstanceConfig3.getSecureVirtualHostName();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = myDataCenterInstanceConfig3.getMetadataMap();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig3.getDataCenterInfo();
        int int9 = myDataCenterInstanceConfig3.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder10.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder13.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus21 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder17.setStatus(instanceStatus21);
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder22.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder22.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo27 = builder22.getRawInstance();
        java.lang.String str28 = instanceInfo27.getIPAddr();
        com.netflix.appinfo.InstanceInfo instanceInfo29 = new com.netflix.appinfo.InstanceInfo(instanceInfo27);
        com.netflix.appinfo.InstanceInfo instanceInfo30 = new com.netflix.appinfo.InstanceInfo(instanceInfo29);
        com.netflix.appinfo.InstanceInfo instanceInfo31 = new com.netflix.appinfo.InstanceInfo(instanceInfo30);
        com.netflix.appinfo.InstanceInfo.Builder builder32 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo30);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager33 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.InstanceInfo.Builder builder34 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder34.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder37.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder37.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder43 = builder41.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus45 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder46 = builder41.setStatus(instanceStatus45);
        com.netflix.appinfo.InstanceInfo.Builder builder48 = builder46.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder50 = builder46.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo51 = builder46.getRawInstance();
        applicationInfoManager33.instanceInfo = instanceInfo51;
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus53 = instanceInfo51.getStatus();
        instanceInfo30.setOverriddenStatus(instanceStatus53);
        java.lang.String str55 = instanceInfo30.getSID();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager56 = new com.netflix.appinfo.ApplicationInfoManager((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig3, instanceInfo30);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap57 = applicationInfoManager56.listeners;
        com.netflix.appinfo.InstanceInfo.Builder builder58 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder61 = builder58.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder63 = builder61.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder65 = builder61.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder67 = builder65.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus69 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder70 = builder65.setStatus(instanceStatus69);
        com.netflix.appinfo.InstanceInfo.Builder builder72 = builder70.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder74 = builder70.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo75 = builder70.getRawInstance();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus76 = instanceInfo75.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo instanceInfo77 = new com.netflix.appinfo.InstanceInfo(instanceInfo75);
        java.lang.String str78 = instanceInfo77.getAppGroupName();
        java.lang.String str79 = instanceInfo77.getHomePageUrl();
        instanceInfo77.setLastDirtyTimestamp((java.lang.Long) 1636109029377L);
        applicationInfoManager56.instanceInfo = instanceInfo77;
        com.netflix.appinfo.InstanceInfo instanceInfo83 = new com.netflix.appinfo.InstanceInfo(instanceInfo77);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str84 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo77);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setCountryId((int) (short) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) '4');
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setLastUpdatedTimestamp((long) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setNamespace("inesserver2.windows.cin.ufpe.br:80");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder8.setStatusPageUrl("unknown", "");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        java.lang.String[] strArray3 = new java.lang.String[] { "/", "inesserver2.windows.cin.ufpe.br", "" };
        com.netflix.appinfo.InstanceInfo.Builder builder4 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder4.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder7.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus15 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder11.setStatus(instanceStatus15);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder16.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo21 = builder16.getRawInstance();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus22 = instanceInfo21.getOverriddenStatus();
        java.lang.String str23 = instanceInfo21.getHomePageUrl();
        java.lang.String str24 = instanceInfo21.getId();
        java.lang.String str25 = instanceInfo21.getVersion();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = com.netflix.appinfo.InstanceInfo.getZone(strArray3, instanceInfo21);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        java.lang.String[] strArray1 = new java.lang.String[] { "UNKNOWN" };
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager2 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap3 = applicationInfoManager2.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo4 = applicationInfoManager2.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager5 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager5.config = myDataCenterInstanceConfig7;
        applicationInfoManager2.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig7);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap10 = applicationInfoManager2.listeners;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager11 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap12 = applicationInfoManager11.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo13 = applicationInfoManager11.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager14 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig16 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager14.config = myDataCenterInstanceConfig16;
        applicationInfoManager11.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig16);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap19 = applicationInfoManager11.listeners;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager20 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap21 = applicationInfoManager20.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo22 = applicationInfoManager20.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager23 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig25 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager23.config = myDataCenterInstanceConfig25;
        applicationInfoManager20.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig25);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap28 = applicationInfoManager20.listeners;
        applicationInfoManager11.listeners = strMap28;
        applicationInfoManager2.listeners = strMap28;
        com.netflix.appinfo.InstanceInfo instanceInfo31 = applicationInfoManager2.instanceInfo;
        com.netflix.appinfo.LeaseInfo leaseInfo32 = instanceInfo31.getLeaseInfo();
        java.lang.String str33 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo31);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager34 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap35 = applicationInfoManager34.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo36 = applicationInfoManager34.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager.instance = applicationInfoManager34;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig38 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        java.lang.String str39 = myDataCenterInstanceConfig38.getNamespace();
        java.lang.String str40 = myDataCenterInstanceConfig38.getStatusPageUrlPath();
        applicationInfoManager34.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig38);
        com.netflix.appinfo.InstanceInfo instanceInfo42 = applicationInfoManager34.instanceInfo;
        com.netflix.appinfo.InstanceInfo.Builder builder43 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo42);
        java.util.Map<java.lang.String, java.lang.String> strMap44 = instanceInfo42.getMetadata();
        java.lang.String str45 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo42);
        com.netflix.appinfo.InstanceInfo.Builder builder46 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder48 = builder46.setSecurePort(7001);
        com.netflix.appinfo.InstanceInfo.Builder builder50 = builder48.setHostName("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder53 = builder50.setStatusPageUrl("", "");
        com.netflix.appinfo.InstanceInfo.Builder builder56 = builder53.setHealthCheckUrlsForDeser("/Status", "EUREKA.");
        com.netflix.appinfo.InstanceInfo instanceInfo57 = builder56.getRawInstance();
        java.lang.Long long58 = instanceInfo57.isDirtyWithTime();
        instanceInfo57.unsetIsDirty(1636109022509L);
        java.util.Set<java.lang.String> strSet61 = instanceInfo57.getHealthCheckUrls();
        java.lang.String str62 = instanceInfo57.getHomePageUrl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str63 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo57);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap1 = applicationInfoManager0.listeners;
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig2 = applicationInfoManager0.config;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager3 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap4 = applicationInfoManager3.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo5 = applicationInfoManager3.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager6 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig8 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager6.config = myDataCenterInstanceConfig8;
        applicationInfoManager3.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig8);
        java.lang.String str11 = myDataCenterInstanceConfig8.getStatusPageUrl();
        java.lang.String str12 = myDataCenterInstanceConfig8.getHealthCheckUrlPath();
        java.lang.String str13 = myDataCenterInstanceConfig8.getIpAddress();
        com.netflix.appinfo.InstanceInfo.Builder builder14 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder14.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder17.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus25 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder21.setStatus(instanceStatus25);
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder26.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder26.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo31 = builder26.getRawInstance();
        java.lang.String str32 = instanceInfo31.getIPAddr();
        com.netflix.appinfo.InstanceInfo instanceInfo33 = new com.netflix.appinfo.InstanceInfo(instanceInfo31);
        instanceInfo33.setSID("/healthcheck");
        com.netflix.appinfo.InstanceInfo instanceInfo36 = new com.netflix.appinfo.InstanceInfo(instanceInfo33);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus38 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus39 = instanceInfo36.setStatus(instanceStatus38);
        java.util.Set<java.lang.String> strSet40 = instanceInfo36.getHealthCheckUrls();
        com.netflix.appinfo.InstanceInfo instanceInfo41 = new com.netflix.appinfo.InstanceInfo(instanceInfo36);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager42 = new com.netflix.appinfo.ApplicationInfoManager((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig8, instanceInfo36);
        com.netflix.appinfo.InstanceInfo instanceInfo43 = applicationInfoManager42.instanceInfo;
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus44 = instanceInfo43.getStatus();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus45 = instanceInfo43.getStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.setInstanceStatus(instanceStatus45);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        java.lang.String[] strArray1 = new java.lang.String[] { "UNKNOWN" };
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager2 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap3 = applicationInfoManager2.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo4 = applicationInfoManager2.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager5 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager5.config = myDataCenterInstanceConfig7;
        applicationInfoManager2.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig7);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap10 = applicationInfoManager2.listeners;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager11 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap12 = applicationInfoManager11.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo13 = applicationInfoManager11.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager14 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig16 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager14.config = myDataCenterInstanceConfig16;
        applicationInfoManager11.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig16);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap19 = applicationInfoManager11.listeners;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager20 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap21 = applicationInfoManager20.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo22 = applicationInfoManager20.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager23 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig25 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager23.config = myDataCenterInstanceConfig25;
        applicationInfoManager20.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig25);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap28 = applicationInfoManager20.listeners;
        applicationInfoManager11.listeners = strMap28;
        applicationInfoManager2.listeners = strMap28;
        com.netflix.appinfo.InstanceInfo instanceInfo31 = applicationInfoManager2.instanceInfo;
        com.netflix.appinfo.LeaseInfo leaseInfo32 = instanceInfo31.getLeaseInfo();
        java.lang.String str33 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo31);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager34 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap35 = applicationInfoManager34.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo36 = applicationInfoManager34.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager.instance = applicationInfoManager34;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig38 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        java.lang.String str39 = myDataCenterInstanceConfig38.getNamespace();
        java.lang.String str40 = myDataCenterInstanceConfig38.getStatusPageUrlPath();
        applicationInfoManager34.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig38);
        com.netflix.appinfo.InstanceInfo instanceInfo42 = applicationInfoManager34.instanceInfo;
        com.netflix.appinfo.InstanceInfo.Builder builder43 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo42);
        java.util.Map<java.lang.String, java.lang.String> strMap44 = instanceInfo42.getMetadata();
        java.lang.String str45 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo42);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager46 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig48 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager46.config = myDataCenterInstanceConfig48;
        java.lang.String str50 = myDataCenterInstanceConfig48.getAppname();
        java.lang.String str51 = myDataCenterInstanceConfig48.getHealthCheckUrlPath();
        int int52 = myDataCenterInstanceConfig48.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo53 = myDataCenterInstanceConfig48.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder54 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder57 = builder54.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder59 = builder57.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder61 = builder57.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder63 = builder61.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus65 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder66 = builder61.setStatus(instanceStatus65);
        com.netflix.appinfo.InstanceInfo.Builder builder68 = builder66.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder70 = builder66.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo71 = builder66.getRawInstance();
        java.lang.String str72 = instanceInfo71.getIPAddr();
        com.netflix.appinfo.InstanceInfo.Builder builder73 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo71);
        instanceInfo71.setLastUpdatedTimestamp();
        boolean boolean75 = instanceInfo71.isDirty();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager76 = new com.netflix.appinfo.ApplicationInfoManager((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig48, instanceInfo71);
        java.lang.String str77 = instanceInfo71.getSID();
        com.netflix.appinfo.InstanceInfo instanceInfo78 = new com.netflix.appinfo.InstanceInfo(instanceInfo71);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str79 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo71);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        java.lang.String[] strArray4 = new java.lang.String[] { "inesserver2.windows.cin.ufpe.br", "inesserver2.windows.cin.ufpe.br", "unknown", "inesserver2.windows.cin.ufpe.br" };
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig5 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        java.lang.String str6 = myDataCenterInstanceConfig5.getAppname();
        boolean boolean7 = myDataCenterInstanceConfig5.isNonSecurePortEnabled();
        int int8 = myDataCenterInstanceConfig5.getSecurePort();
        int int9 = myDataCenterInstanceConfig5.getSecurePort();
        java.lang.String str10 = myDataCenterInstanceConfig5.getHomePageUrl();
        java.lang.String str11 = myDataCenterInstanceConfig5.getHomePageUrl();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder12.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder15.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus23 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder19.setStatus(instanceStatus23);
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder24.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder24.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo29 = builder24.getRawInstance();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus30 = instanceInfo29.getOverriddenStatus();
        java.lang.String str31 = instanceInfo29.getSID();
        java.lang.String str32 = instanceInfo29.getIPAddr();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager33 = new com.netflix.appinfo.ApplicationInfoManager((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig5, instanceInfo29);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig34 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        java.lang.String str35 = myDataCenterInstanceConfig34.getAppname();
        boolean boolean36 = myDataCenterInstanceConfig34.isNonSecurePortEnabled();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo37 = myDataCenterInstanceConfig34.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder38 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder38.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder43 = builder41.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder45 = builder41.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder47 = builder45.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus49 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder50 = builder45.setStatus(instanceStatus49);
        com.netflix.appinfo.InstanceInfo.Builder builder52 = builder50.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder54 = builder50.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo55 = builder50.getRawInstance();
        java.lang.String str56 = instanceInfo55.getIPAddr();
        int int57 = instanceInfo55.getSecurePort();
        java.lang.String str58 = instanceInfo55.getSID();
        com.netflix.appinfo.InstanceInfo instanceInfo59 = new com.netflix.appinfo.InstanceInfo(instanceInfo55);
        com.netflix.appinfo.InstanceInfo.Builder builder60 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo55);
        java.lang.String str61 = instanceInfo55.getStatusPageUrl();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager62 = new com.netflix.appinfo.ApplicationInfoManager((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig34, instanceInfo55);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager63 = new com.netflix.appinfo.ApplicationInfoManager((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig5, instanceInfo55);
        com.netflix.appinfo.InstanceInfo.Builder builder64 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo55);
        com.netflix.appinfo.InstanceInfo.Builder builder65 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo55);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str66 = com.netflix.appinfo.InstanceInfo.getZone(strArray4, instanceInfo55);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        java.lang.String[] strArray1 = new java.lang.String[] { "UNKNOWN" };
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager2 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap3 = applicationInfoManager2.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo4 = applicationInfoManager2.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager5 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager5.config = myDataCenterInstanceConfig7;
        applicationInfoManager2.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig7);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap10 = applicationInfoManager2.listeners;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager11 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap12 = applicationInfoManager11.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo13 = applicationInfoManager11.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager14 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig16 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager14.config = myDataCenterInstanceConfig16;
        applicationInfoManager11.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig16);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap19 = applicationInfoManager11.listeners;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager20 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap21 = applicationInfoManager20.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo22 = applicationInfoManager20.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager23 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig25 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager23.config = myDataCenterInstanceConfig25;
        applicationInfoManager20.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig25);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap28 = applicationInfoManager20.listeners;
        applicationInfoManager11.listeners = strMap28;
        applicationInfoManager2.listeners = strMap28;
        com.netflix.appinfo.InstanceInfo instanceInfo31 = applicationInfoManager2.instanceInfo;
        com.netflix.appinfo.LeaseInfo leaseInfo32 = instanceInfo31.getLeaseInfo();
        java.lang.String str33 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo31);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager34 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap35 = applicationInfoManager34.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo36 = applicationInfoManager34.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager.instance = applicationInfoManager34;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig38 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        java.lang.String str39 = myDataCenterInstanceConfig38.getNamespace();
        java.lang.String str40 = myDataCenterInstanceConfig38.getStatusPageUrlPath();
        applicationInfoManager34.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig38);
        com.netflix.appinfo.InstanceInfo instanceInfo42 = applicationInfoManager34.instanceInfo;
        com.netflix.appinfo.InstanceInfo.Builder builder43 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo42);
        java.util.Map<java.lang.String, java.lang.String> strMap44 = instanceInfo42.getMetadata();
        java.lang.String str45 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo42);
        com.netflix.appinfo.InstanceInfo.Builder builder46 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder49 = builder46.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder51 = builder49.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder53 = builder49.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder55 = builder53.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus57 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder58 = builder53.setStatus(instanceStatus57);
        com.netflix.appinfo.InstanceInfo.Builder builder60 = builder58.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder62 = builder58.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo63 = builder58.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder64 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo63);
        com.netflix.appinfo.InstanceInfo.Builder builder65 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo63);
        java.lang.String str66 = instanceInfo63.getVIPAddress();
        com.netflix.appinfo.InstanceInfo.Builder builder67 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder70 = builder67.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder72 = builder70.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder74 = builder70.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder76 = builder74.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus78 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder79 = builder74.setStatus(instanceStatus78);
        com.netflix.appinfo.InstanceInfo.Builder builder81 = builder79.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder83 = builder79.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus85 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder86 = builder83.setOverriddenStatus(instanceStatus85);
        instanceInfo63.setOverriddenStatus(instanceStatus85);
        com.netflix.appinfo.InstanceInfo instanceInfo88 = new com.netflix.appinfo.InstanceInfo(instanceInfo63);
        java.lang.String str89 = instanceInfo88.getSID();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str90 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo88);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        java.lang.String[] strArray5 = new java.lang.String[] { "EUREKA.", "/healthcheck", "inesserver2.windows.cin.ufpe.br:80", "na", "unknown" };
        com.netflix.appinfo.InstanceInfo.Builder builder6 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus17 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder13.setStatus(instanceStatus17);
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder18.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo23 = builder18.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder24 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo23);
        com.netflix.appinfo.InstanceInfo instanceInfo25 = new com.netflix.appinfo.InstanceInfo(instanceInfo23);
        com.netflix.appinfo.InstanceInfo.Builder builder26 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo25);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig28 = new com.netflix.appinfo.MyDataCenterInstanceConfig("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder29 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder29.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder34 = builder32.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder32.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder38 = builder36.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus40 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder36.setStatus(instanceStatus40);
        com.netflix.appinfo.InstanceInfo.Builder builder43 = builder41.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder45 = builder41.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo46 = builder41.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder47 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo46);
        com.netflix.appinfo.InstanceInfo.Builder builder48 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo46);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager49 = new com.netflix.appinfo.ApplicationInfoManager((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig28, instanceInfo46);
        com.netflix.appinfo.InstanceInfo instanceInfo50 = new com.netflix.appinfo.InstanceInfo(instanceInfo46);
        java.lang.String str51 = instanceInfo46.getASGName();
        com.netflix.appinfo.InstanceInfo.Builder builder52 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder55 = builder52.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder57 = builder55.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder59 = builder55.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder61 = builder59.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus63 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder64 = builder59.setStatus(instanceStatus63);
        com.netflix.appinfo.InstanceInfo.Builder builder66 = builder64.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder68 = builder64.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo69 = builder64.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder70 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo69);
        com.netflix.appinfo.InstanceInfo instanceInfo71 = builder70.getRawInstance();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus72 = com.netflix.appinfo.InstanceInfo.InstanceStatus.STARTING;
        instanceInfo71.setOverriddenStatus(instanceStatus72);
        instanceInfo46.setStatusWithoutDirty(instanceStatus72);
        instanceInfo25.setStatusWithoutDirty(instanceStatus72);
        java.lang.String str76 = instanceInfo25.getSID();
        com.netflix.appinfo.InstanceInfo.Builder builder77 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo25);
        com.netflix.appinfo.InstanceInfo instanceInfo78 = new com.netflix.appinfo.InstanceInfo(instanceInfo25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str79 = com.netflix.appinfo.InstanceInfo.getZone(strArray5, instanceInfo25);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        java.lang.String[] strArray1 = new java.lang.String[] { "UNKNOWN" };
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager2 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap3 = applicationInfoManager2.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo4 = applicationInfoManager2.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager5 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager5.config = myDataCenterInstanceConfig7;
        applicationInfoManager2.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig7);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap10 = applicationInfoManager2.listeners;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager11 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap12 = applicationInfoManager11.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo13 = applicationInfoManager11.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager14 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig16 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager14.config = myDataCenterInstanceConfig16;
        applicationInfoManager11.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig16);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap19 = applicationInfoManager11.listeners;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager20 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap21 = applicationInfoManager20.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo22 = applicationInfoManager20.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager23 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig25 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager23.config = myDataCenterInstanceConfig25;
        applicationInfoManager20.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig25);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap28 = applicationInfoManager20.listeners;
        applicationInfoManager11.listeners = strMap28;
        applicationInfoManager2.listeners = strMap28;
        com.netflix.appinfo.InstanceInfo instanceInfo31 = applicationInfoManager2.instanceInfo;
        com.netflix.appinfo.LeaseInfo leaseInfo32 = instanceInfo31.getLeaseInfo();
        java.lang.String str33 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo31);
        com.netflix.appinfo.InstanceInfo.Builder builder34 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder34.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder37.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder37.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder43 = builder41.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo instanceInfo44 = builder43.getRawInstance();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus45 = instanceInfo44.getStatus();
        java.lang.String str46 = instanceInfo44.getHomePageUrl();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus48 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus49 = instanceInfo44.setStatus(instanceStatus48);
        instanceInfo44.setIsCoordinatingDiscoveryServer();
        java.lang.String str51 = instanceInfo44.getAppName();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo52 = instanceInfo44.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder53 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder56 = builder53.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder58 = builder56.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder60 = builder56.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder62 = builder60.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus64 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder65 = builder60.setStatus(instanceStatus64);
        com.netflix.appinfo.InstanceInfo.Builder builder67 = builder65.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder69 = builder65.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo70 = builder65.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder71 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo70);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus72 = instanceInfo70.getOverriddenStatus();
        instanceInfo70.setIsDirty();
        com.netflix.appinfo.InstanceInfo.ActionType actionType74 = instanceInfo70.getActionType();
        instanceInfo70.setLastUpdatedTimestamp();
        java.util.Set<java.lang.String> strSet76 = instanceInfo70.getHealthCheckUrls();
        com.netflix.appinfo.InstanceInfo.Builder builder77 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo70);
        com.netflix.appinfo.InstanceInfo.Builder builder78 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo70);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus79 = instanceInfo70.getOverriddenStatus();
        instanceInfo44.setStatusWithoutDirty(instanceStatus79);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str81 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo44);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        java.lang.String[] strArray1 = new java.lang.String[] { "EUREKA." };
        com.netflix.appinfo.InstanceInfo.Builder builder2 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder2.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder5.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus13 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder9.setStatus(instanceStatus13);
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder14.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo19 = builder14.getRawInstance();
        java.lang.String str20 = instanceInfo19.getIPAddr();
        int int21 = instanceInfo19.getSecurePort();
        java.lang.String str22 = instanceInfo19.getSID();
        com.netflix.appinfo.InstanceInfo.Builder builder23 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo19);
        java.lang.String str24 = instanceInfo19.getASGName();
        com.netflix.appinfo.InstanceInfo instanceInfo25 = new com.netflix.appinfo.InstanceInfo(instanceInfo19);
        boolean boolean26 = instanceInfo25.isDirty();
        java.lang.Long long27 = instanceInfo25.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.Builder builder28 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo25);
        java.lang.String str29 = instanceInfo25.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str30 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo25);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        java.lang.String[] strArray6 = new java.lang.String[] { "na", "inesserver2.windows.cin.ufpe.br", "na", "/", "172.20.26.3", "na" };
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager7 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig9 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager7.config = myDataCenterInstanceConfig9;
        java.lang.String str11 = myDataCenterInstanceConfig9.getAppname();
        java.lang.String str12 = myDataCenterInstanceConfig9.getHealthCheckUrlPath();
        int int13 = myDataCenterInstanceConfig9.getLeaseRenewalIntervalInSeconds();
        int int14 = myDataCenterInstanceConfig9.getSecurePort();
        com.netflix.appinfo.InstanceInfo.Builder builder15 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder15.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder18.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder22.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo instanceInfo25 = builder24.getRawInstance();
        java.lang.String str26 = instanceInfo25.getAppGroupName();
        com.netflix.appinfo.InstanceInfo.Builder builder27 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo25);
        java.lang.Long long28 = instanceInfo25.isDirtyWithTime();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager29 = new com.netflix.appinfo.ApplicationInfoManager((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig9, instanceInfo25);
        java.lang.String str30 = instanceInfo25.getIPAddr();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str31 = com.netflix.appinfo.InstanceInfo.getZone(strArray6, instanceInfo25);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        java.lang.String[] strArray5 = new java.lang.String[] { "EUREKA.", "", "UNKNOWN", "inesserver2.windows.cin.ufpe.br", "eureka." };
        com.netflix.appinfo.InstanceInfo.Builder builder6 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder9.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus17 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder13.setStatus(instanceStatus17);
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder18.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo23 = builder18.getRawInstance();
        java.lang.String str24 = instanceInfo23.getIPAddr();
        com.netflix.appinfo.InstanceInfo.Builder builder25 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo23);
        instanceInfo23.setLastUpdatedTimestamp();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo27 = instanceInfo23.getDataCenterInfo();
        java.lang.String str28 = instanceInfo23.getAppGroupName();
        com.netflix.appinfo.InstanceInfo.Builder builder29 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str30 = com.netflix.appinfo.InstanceInfo.getZone(strArray5, instanceInfo23);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setCountryId((int) (short) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) '4');
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setVIPAddress("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setASGName("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setIPAddr("");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setLastDirtyTimestamp(1636109121044L);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder13.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder16.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder20.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus24 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder20.setStatus(instanceStatus24);
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder25.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder25.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo30 = builder25.getRawInstance();
        java.lang.String str31 = instanceInfo30.getIPAddr();
        com.netflix.appinfo.InstanceInfo.Builder builder32 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo30);
        instanceInfo30.setLastUpdatedTimestamp();
        com.netflix.appinfo.InstanceInfo.Builder builder34 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo30);
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder34.setAppGroupName("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder37 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder40 = builder37.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder42 = builder40.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder44 = builder40.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder46 = builder44.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus48 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder49 = builder44.setStatus(instanceStatus48);
        com.netflix.appinfo.InstanceInfo.Builder builder51 = builder49.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder53 = builder49.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo54 = builder49.getRawInstance();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus55 = instanceInfo54.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo instanceInfo56 = new com.netflix.appinfo.InstanceInfo(instanceInfo54);
        java.lang.String str57 = instanceInfo56.getAppGroupName();
        java.lang.String str58 = instanceInfo56.getHomePageUrl();
        com.netflix.appinfo.InstanceInfo.PortType portType59 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        boolean boolean60 = instanceInfo56.isPortEnabled(portType59);
        com.netflix.appinfo.InstanceInfo.Builder builder62 = builder36.enablePort(portType59, true);
        com.netflix.appinfo.InstanceInfo.Builder builder64 = builder12.enablePort(portType59, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder67 = builder64.setHomePageUrl("default", "EUREKA.");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder3 = builder0.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder3.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder3.setHomePageUrlForDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder3.setStatusPageUrlForDeser("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder3.setSecureVIPAddressDeser("172.20.26.3");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder11.setHomePageUrl("hi!", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setCountryId((int) (short) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setLastUpdatedTimestamp(1636109051265L);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setAppGroupName("/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setStatusPageUrl("/", "UNKNOWN");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setCountryId((int) (short) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setHomePageUrlForDeser("EUREKA.");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setSecureVIPAddress("na");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setIPAddr("/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder2.setHealthCheckUrls("inesserver2.windows.cin.ufpe.br", "eureka.", "http://inesserver2.windows.cin.ufpe.br:80/");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder3 = builder0.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder3.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder3.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder7.setStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo17 = builder12.getRawInstance();
        java.lang.String str18 = instanceInfo17.getIPAddr();
        com.netflix.appinfo.InstanceInfo instanceInfo19 = new com.netflix.appinfo.InstanceInfo(instanceInfo17);
        instanceInfo19.setSID("/healthcheck");
        com.netflix.appinfo.InstanceInfo instanceInfo22 = new com.netflix.appinfo.InstanceInfo(instanceInfo19);
        java.lang.Long long23 = instanceInfo19.getLastDirtyTimestamp();
        java.util.Map<java.lang.String, java.lang.String> strMap24 = instanceInfo19.getMetadata();
        java.lang.Long long25 = instanceInfo19.isDirtyWithTime();
        java.lang.String str26 = instanceInfo19.getSecureVipAddress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        instanceInfo19.setIsCoordinatingDiscoveryServer();
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        java.lang.String[] strArray1 = new java.lang.String[] { "UNKNOWN" };
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager2 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap3 = applicationInfoManager2.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo4 = applicationInfoManager2.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager5 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager5.config = myDataCenterInstanceConfig7;
        applicationInfoManager2.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig7);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap10 = applicationInfoManager2.listeners;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager11 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap12 = applicationInfoManager11.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo13 = applicationInfoManager11.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager14 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig16 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager14.config = myDataCenterInstanceConfig16;
        applicationInfoManager11.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig16);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap19 = applicationInfoManager11.listeners;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager20 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap21 = applicationInfoManager20.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo22 = applicationInfoManager20.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager23 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig25 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager23.config = myDataCenterInstanceConfig25;
        applicationInfoManager20.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig25);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap28 = applicationInfoManager20.listeners;
        applicationInfoManager11.listeners = strMap28;
        applicationInfoManager2.listeners = strMap28;
        com.netflix.appinfo.InstanceInfo instanceInfo31 = applicationInfoManager2.instanceInfo;
        com.netflix.appinfo.LeaseInfo leaseInfo32 = instanceInfo31.getLeaseInfo();
        java.lang.String str33 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo31);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager34 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap35 = applicationInfoManager34.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo36 = applicationInfoManager34.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager.instance = applicationInfoManager34;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig38 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        java.lang.String str39 = myDataCenterInstanceConfig38.getNamespace();
        java.lang.String str40 = myDataCenterInstanceConfig38.getStatusPageUrlPath();
        applicationInfoManager34.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig38);
        com.netflix.appinfo.InstanceInfo instanceInfo42 = applicationInfoManager34.instanceInfo;
        com.netflix.appinfo.InstanceInfo.Builder builder43 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo42);
        java.util.Map<java.lang.String, java.lang.String> strMap44 = instanceInfo42.getMetadata();
        java.lang.String str45 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo42);
        com.netflix.appinfo.InstanceInfo.Builder builder46 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder49 = builder46.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder51 = builder49.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder53 = builder49.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder55 = builder53.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus57 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder58 = builder53.setStatus(instanceStatus57);
        com.netflix.appinfo.InstanceInfo.Builder builder60 = builder58.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder62 = builder58.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo63 = builder58.getRawInstance();
        java.lang.String str64 = instanceInfo63.getIPAddr();
        com.netflix.appinfo.InstanceInfo instanceInfo65 = new com.netflix.appinfo.InstanceInfo(instanceInfo63);
        java.lang.Boolean boolean66 = instanceInfo63.isCoordinatingDiscoveryServer();
        long long67 = instanceInfo63.getLastUpdatedTimestamp();
        com.netflix.appinfo.InstanceInfo instanceInfo68 = new com.netflix.appinfo.InstanceInfo(instanceInfo63);
        com.netflix.appinfo.InstanceInfo instanceInfo69 = new com.netflix.appinfo.InstanceInfo(instanceInfo63);
        int int70 = instanceInfo63.getPort();
        instanceInfo63.setIsDirty(false);
        java.lang.String str73 = instanceInfo63.getId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str74 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo63);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder3 = builder0.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder3.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder3.setHomePageUrlForDeser("/Status");
        com.netflix.appinfo.InstanceInfo instanceInfo8 = builder3.getRawInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder3.setHealthCheckUrls("EUREKA.", "http://inesserver2.windows.cin.ufpe.br:80/Status", "eureka.");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap1 = applicationInfoManager0.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo2 = applicationInfoManager0.getInfo();
        com.netflix.appinfo.ApplicationInfoManager.instance = applicationInfoManager0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.refreshDataCenterInfoIfRequired();
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        com.netflix.appinfo.InstanceInfo.Builder builder1 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder1.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus12 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder8.setStatus(instanceStatus12);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder13.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo18 = builder13.getRawInstance();
        java.lang.String str19 = instanceInfo18.getIPAddr();
        com.netflix.appinfo.InstanceInfo.Builder builder20 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo18);
        instanceInfo18.setLastUpdatedTimestamp();
        boolean boolean22 = instanceInfo18.isDirty();
        com.netflix.appinfo.InstanceInfo.Builder builder23 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder23.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder26.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder26.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder30.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus34 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder35 = builder30.setStatus(instanceStatus34);
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder35.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder35.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo40 = builder35.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder41 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo40);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus42 = instanceInfo40.getOverriddenStatus();
        instanceInfo40.setIsDirty();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus44 = com.netflix.appinfo.InstanceInfo.InstanceStatus.STARTING;
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus45 = instanceInfo40.setStatus(instanceStatus44);
        instanceInfo18.setOverriddenStatus(instanceStatus44);
        instanceInfo18.setSID("na");
        java.lang.Boolean boolean49 = instanceInfo18.isCoordinatingDiscoveryServer();
        com.netflix.appinfo.InstanceInfo.Builder builder50 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str51 = com.netflix.appinfo.InstanceInfo.getZone(strArray0, instanceInfo18);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        java.lang.String[] strArray1 = new java.lang.String[] { "UNKNOWN" };
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager2 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap3 = applicationInfoManager2.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo4 = applicationInfoManager2.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager5 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager5.config = myDataCenterInstanceConfig7;
        applicationInfoManager2.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig7);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap10 = applicationInfoManager2.listeners;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager11 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap12 = applicationInfoManager11.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo13 = applicationInfoManager11.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager14 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig16 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager14.config = myDataCenterInstanceConfig16;
        applicationInfoManager11.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig16);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap19 = applicationInfoManager11.listeners;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager20 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap21 = applicationInfoManager20.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo22 = applicationInfoManager20.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager23 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig25 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager23.config = myDataCenterInstanceConfig25;
        applicationInfoManager20.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig25);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap28 = applicationInfoManager20.listeners;
        applicationInfoManager11.listeners = strMap28;
        applicationInfoManager2.listeners = strMap28;
        com.netflix.appinfo.InstanceInfo instanceInfo31 = applicationInfoManager2.instanceInfo;
        com.netflix.appinfo.LeaseInfo leaseInfo32 = instanceInfo31.getLeaseInfo();
        java.lang.String str33 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo31);
        com.netflix.appinfo.InstanceInfo.Builder builder34 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder34.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder37.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder37.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder43 = builder41.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus45 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder46 = builder41.setStatus(instanceStatus45);
        com.netflix.appinfo.InstanceInfo.Builder builder48 = builder46.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder50 = builder46.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo51 = builder46.getRawInstance();
        java.lang.String str52 = instanceInfo51.getIPAddr();
        int int53 = instanceInfo51.getSecurePort();
        java.lang.String str54 = instanceInfo51.getSID();
        com.netflix.appinfo.InstanceInfo instanceInfo55 = new com.netflix.appinfo.InstanceInfo(instanceInfo51);
        com.netflix.appinfo.InstanceInfo instanceInfo56 = new com.netflix.appinfo.InstanceInfo(instanceInfo51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str57 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo56);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap1 = applicationInfoManager0.listeners;
        applicationInfoManager0.unregisterStatusChangeListener("unknown");
        com.netflix.appinfo.ApplicationInfoManager.instance = applicationInfoManager0;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager5 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap6 = applicationInfoManager5.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo7 = applicationInfoManager5.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager8 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager8.config = myDataCenterInstanceConfig10;
        applicationInfoManager5.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig10);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap13 = applicationInfoManager5.listeners;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager14 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap15 = applicationInfoManager14.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo16 = applicationInfoManager14.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager17 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig19 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager17.config = myDataCenterInstanceConfig19;
        applicationInfoManager14.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig19);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap22 = applicationInfoManager14.listeners;
        applicationInfoManager5.listeners = strMap22;
        com.netflix.appinfo.InstanceInfo instanceInfo24 = applicationInfoManager5.getInfo();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager25 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap26 = applicationInfoManager25.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo27 = applicationInfoManager25.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager28 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig30 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager28.config = myDataCenterInstanceConfig30;
        applicationInfoManager25.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig30);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager33 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap34 = applicationInfoManager33.listeners;
        applicationInfoManager25.listeners = strMap34;
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap36 = applicationInfoManager25.listeners;
        applicationInfoManager5.listeners = strMap36;
        applicationInfoManager0.listeners = strMap36;
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap39 = applicationInfoManager0.listeners;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.refreshDataCenterInfoIfRequired();
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setCountryId((int) (short) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setPort((int) (byte) 1);
        boolean boolean5 = builder0.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.setSecureVIPAddress("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder7.setStatusPageUrl("inesserver2.windows.cin.ufpe.br:80", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder3 = builder0.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder3.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder5.setVIPAddressDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder9.add("na", "inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setNamespace("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setLastDirtyTimestamp(1636109067998L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder16.setHomePageUrl("hi!", "UNKNOWN");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        java.lang.String[] strArray3 = new java.lang.String[] { "UNKNOWN", "http://inesserver2.windows.cin.ufpe.br:80/Status", "/Status" };
        com.netflix.appinfo.InstanceInfo.Builder builder4 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder4.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder7.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus15 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder11.setStatus(instanceStatus15);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder16.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo21 = builder16.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder22 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo21);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus23 = instanceInfo21.getOverriddenStatus();
        instanceInfo21.setIsDirty();
        com.netflix.appinfo.InstanceInfo.ActionType actionType25 = instanceInfo21.getActionType();
        instanceInfo21.setLastUpdatedTimestamp();
        instanceInfo21.setIsCoordinatingDiscoveryServer();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig29 = new com.netflix.appinfo.MyDataCenterInstanceConfig("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder30 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder33 = builder30.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder35 = builder33.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder33.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder37.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus41 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder42 = builder37.setStatus(instanceStatus41);
        com.netflix.appinfo.InstanceInfo.Builder builder44 = builder42.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder46 = builder42.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo47 = builder42.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder48 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo47);
        com.netflix.appinfo.InstanceInfo.Builder builder49 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo47);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager50 = new com.netflix.appinfo.ApplicationInfoManager((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig29, instanceInfo47);
        com.netflix.appinfo.InstanceInfo instanceInfo51 = applicationInfoManager50.instanceInfo;
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus52 = instanceInfo51.getStatus();
        instanceInfo21.setStatusWithoutDirty(instanceStatus52);
        com.netflix.appinfo.InstanceInfo instanceInfo54 = new com.netflix.appinfo.InstanceInfo(instanceInfo21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str55 = com.netflix.appinfo.InstanceInfo.getZone(strArray3, instanceInfo21);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setCountryId((int) (short) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setLastUpdatedTimestamp((long) '4');
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder4.add("/", "eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setLastUpdatedTimestamp(1636109042207L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder9.setHomePageUrl("", "UNKNOWN");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder3 = builder0.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder3.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder3.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus11 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder7.setStatus(instanceStatus11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo17 = builder12.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder18 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo17);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo17);
        java.lang.String str20 = instanceInfo17.getVIPAddress();
        com.netflix.appinfo.InstanceInfo instanceInfo21 = new com.netflix.appinfo.InstanceInfo(instanceInfo17);
        java.util.Map<java.lang.String, java.lang.String> strMap22 = instanceInfo21.getMetadata();
        com.netflix.appinfo.InstanceInfo.ActionType actionType23 = instanceInfo21.getActionType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        instanceInfo21.setIsCoordinatingDiscoveryServer();
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        java.lang.String[] strArray1 = new java.lang.String[] { "UNKNOWN" };
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager2 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap3 = applicationInfoManager2.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo4 = applicationInfoManager2.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager5 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager5.config = myDataCenterInstanceConfig7;
        applicationInfoManager2.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig7);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap10 = applicationInfoManager2.listeners;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager11 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap12 = applicationInfoManager11.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo13 = applicationInfoManager11.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager14 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig16 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager14.config = myDataCenterInstanceConfig16;
        applicationInfoManager11.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig16);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap19 = applicationInfoManager11.listeners;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager20 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap21 = applicationInfoManager20.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo22 = applicationInfoManager20.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager23 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig25 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager23.config = myDataCenterInstanceConfig25;
        applicationInfoManager20.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig25);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap28 = applicationInfoManager20.listeners;
        applicationInfoManager11.listeners = strMap28;
        applicationInfoManager2.listeners = strMap28;
        com.netflix.appinfo.InstanceInfo instanceInfo31 = applicationInfoManager2.instanceInfo;
        com.netflix.appinfo.LeaseInfo leaseInfo32 = instanceInfo31.getLeaseInfo();
        java.lang.String str33 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo31);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager34 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap35 = applicationInfoManager34.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo36 = applicationInfoManager34.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager.instance = applicationInfoManager34;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig38 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        java.lang.String str39 = myDataCenterInstanceConfig38.getNamespace();
        java.lang.String str40 = myDataCenterInstanceConfig38.getStatusPageUrlPath();
        applicationInfoManager34.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig38);
        com.netflix.appinfo.InstanceInfo instanceInfo42 = applicationInfoManager34.instanceInfo;
        com.netflix.appinfo.InstanceInfo.Builder builder43 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo42);
        java.util.Map<java.lang.String, java.lang.String> strMap44 = instanceInfo42.getMetadata();
        java.lang.String str45 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo42);
        com.netflix.appinfo.InstanceInfo.Builder builder46 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder49 = builder46.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder51 = builder49.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder53 = builder49.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder55 = builder53.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus57 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder58 = builder53.setStatus(instanceStatus57);
        com.netflix.appinfo.InstanceInfo.Builder builder60 = builder58.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder62 = builder58.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo63 = builder58.getRawInstance();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus64 = instanceInfo63.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo instanceInfo65 = new com.netflix.appinfo.InstanceInfo(instanceInfo63);
        java.lang.String str66 = instanceInfo65.getAppGroupName();
        java.lang.String str67 = instanceInfo65.getSecureVipAddress();
        java.lang.String str68 = instanceInfo65.getSecureVipAddress();
        com.netflix.appinfo.InstanceInfo.Builder builder69 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo65);
        java.lang.String str70 = instanceInfo65.getHomePageUrl();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus71 = instanceInfo65.getStatus();
        java.lang.Boolean boolean72 = instanceInfo65.isCoordinatingDiscoveryServer();
        java.lang.String str73 = instanceInfo65.getHostName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str74 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo65);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder3 = builder0.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder3.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder3.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo instanceInfo10 = builder9.getRawInstance();
        instanceInfo10.setLastDirtyTimestamp((java.lang.Long) 1636109022438L);
        java.lang.String str13 = instanceInfo10.getSecureVipAddress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        instanceInfo10.setIsCoordinatingDiscoveryServer();
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        java.lang.String[] strArray1 = new java.lang.String[] { "UNKNOWN" };
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager2 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap3 = applicationInfoManager2.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo4 = applicationInfoManager2.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager5 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager5.config = myDataCenterInstanceConfig7;
        applicationInfoManager2.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig7);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap10 = applicationInfoManager2.listeners;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager11 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap12 = applicationInfoManager11.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo13 = applicationInfoManager11.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager14 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig16 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager14.config = myDataCenterInstanceConfig16;
        applicationInfoManager11.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig16);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap19 = applicationInfoManager11.listeners;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager20 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap21 = applicationInfoManager20.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo22 = applicationInfoManager20.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager23 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig25 = new com.netflix.appinfo.MyDataCenterInstanceConfig("hi!");
        applicationInfoManager23.config = myDataCenterInstanceConfig25;
        applicationInfoManager20.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig25);
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap28 = applicationInfoManager20.listeners;
        applicationInfoManager11.listeners = strMap28;
        applicationInfoManager2.listeners = strMap28;
        com.netflix.appinfo.InstanceInfo instanceInfo31 = applicationInfoManager2.instanceInfo;
        com.netflix.appinfo.LeaseInfo leaseInfo32 = instanceInfo31.getLeaseInfo();
        java.lang.String str33 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo31);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager34 = new com.netflix.appinfo.ApplicationInfoManager();
        java.util.Map<java.lang.String, com.netflix.appinfo.ApplicationInfoManager.StatusChangeListener> strMap35 = applicationInfoManager34.listeners;
        com.netflix.appinfo.InstanceInfo instanceInfo36 = applicationInfoManager34.instanceInfo;
        com.netflix.appinfo.ApplicationInfoManager.instance = applicationInfoManager34;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig38 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        java.lang.String str39 = myDataCenterInstanceConfig38.getNamespace();
        java.lang.String str40 = myDataCenterInstanceConfig38.getStatusPageUrlPath();
        applicationInfoManager34.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig38);
        com.netflix.appinfo.InstanceInfo instanceInfo42 = applicationInfoManager34.instanceInfo;
        com.netflix.appinfo.InstanceInfo.Builder builder43 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo42);
        java.util.Map<java.lang.String, java.lang.String> strMap44 = instanceInfo42.getMetadata();
        java.lang.String str45 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo42);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig47 = new com.netflix.appinfo.MyDataCenterInstanceConfig("/Status");
        java.lang.String str48 = myDataCenterInstanceConfig47.getHealthCheckUrl();
        com.netflix.appinfo.InstanceInfo.Builder builder49 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder52 = builder49.setHealthCheckUrlsForDeser("/Status", "");
        com.netflix.appinfo.InstanceInfo.Builder builder54 = builder52.setCountryId((int) 'a');
        com.netflix.appinfo.InstanceInfo.Builder builder56 = builder52.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder58 = builder56.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus60 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder61 = builder56.setStatus(instanceStatus60);
        com.netflix.appinfo.InstanceInfo.Builder builder63 = builder61.setAppGroupName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder65 = builder61.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo66 = builder61.getRawInstance();
        java.lang.String str67 = instanceInfo66.getIPAddr();
        com.netflix.appinfo.InstanceInfo instanceInfo68 = new com.netflix.appinfo.InstanceInfo(instanceInfo66);
        com.netflix.appinfo.InstanceInfo instanceInfo69 = new com.netflix.appinfo.InstanceInfo(instanceInfo68);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus70 = instanceInfo68.getStatus();
        com.netflix.appinfo.InstanceInfo instanceInfo71 = new com.netflix.appinfo.InstanceInfo(instanceInfo68);
        java.lang.String str72 = instanceInfo68.getHomePageUrl();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager73 = new com.netflix.appinfo.ApplicationInfoManager((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig47, instanceInfo68);
        com.netflix.appinfo.InstanceInfo instanceInfo74 = applicationInfoManager73.getInfo();
        com.netflix.appinfo.InstanceInfo instanceInfo75 = applicationInfoManager73.instanceInfo;
        java.lang.String str76 = instanceInfo75.getASGName();
        com.netflix.appinfo.InstanceInfo instanceInfo77 = new com.netflix.appinfo.InstanceInfo(instanceInfo75);
        com.netflix.appinfo.InstanceInfo.Builder builder78 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo77);
        java.lang.String str79 = instanceInfo77.getStatusPageUrl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str80 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo77);
    }
}

