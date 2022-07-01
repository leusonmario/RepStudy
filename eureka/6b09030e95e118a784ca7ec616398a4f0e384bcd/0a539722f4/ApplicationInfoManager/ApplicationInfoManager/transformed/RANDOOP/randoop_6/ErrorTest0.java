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
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = com.netflix.appinfo.ApplicationInfoManager.instance;
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig1 = applicationInfoManager0.config;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig3 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int4 = myDataCenterInstanceConfig3.getLeaseRenewalIntervalInSeconds();
        int int5 = myDataCenterInstanceConfig3.getLeaseRenewalIntervalInSeconds();
        java.lang.String str6 = myDataCenterInstanceConfig3.getStatusPageUrlPath();
        boolean boolean7 = myDataCenterInstanceConfig3.getSecurePortEnabled();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = myDataCenterInstanceConfig3.getMetadataMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.registerAppMetadata(strMap8);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = com.netflix.appinfo.ApplicationInfoManager.instance;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig2 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int3 = myDataCenterInstanceConfig2.getLeaseRenewalIntervalInSeconds();
        int int4 = myDataCenterInstanceConfig2.getLeaseRenewalIntervalInSeconds();
        applicationInfoManager0.config = myDataCenterInstanceConfig2;
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig6 = applicationInfoManager0.config;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.refreshDataCenterInfoIfRequired();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = com.netflix.appinfo.ApplicationInfoManager.instance;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig2 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int3 = myDataCenterInstanceConfig2.getLeaseRenewalIntervalInSeconds();
        int int4 = myDataCenterInstanceConfig2.getLeaseRenewalIntervalInSeconds();
        applicationInfoManager0.config = myDataCenterInstanceConfig2;
        com.netflix.appinfo.InstanceInfo instanceInfo6 = applicationInfoManager0.instanceInfo;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.refreshDataCenterInfoIfRequired();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo1 = applicationInfoManager0.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig3 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int4 = myDataCenterInstanceConfig3.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo5 = myDataCenterInstanceConfig3.getDataCenterInfo();
        java.lang.String str6 = myDataCenterInstanceConfig3.getNamespace();
        boolean boolean7 = myDataCenterInstanceConfig3.isNonSecurePortEnabled();
        applicationInfoManager0.config = myDataCenterInstanceConfig3;
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus9 = com.netflix.appinfo.InstanceInfo.InstanceStatus.UNKNOWN;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.setInstanceStatus(instanceStatus9);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo1 = applicationInfoManager0.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig3 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int4 = myDataCenterInstanceConfig3.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo5 = myDataCenterInstanceConfig3.getDataCenterInfo();
        java.lang.String str6 = myDataCenterInstanceConfig3.getNamespace();
        boolean boolean7 = myDataCenterInstanceConfig3.isNonSecurePortEnabled();
        applicationInfoManager0.config = myDataCenterInstanceConfig3;
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus9 = com.netflix.appinfo.InstanceInfo.InstanceStatus.STARTING;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.setInstanceStatus(instanceStatus9);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo1 = applicationInfoManager0.instanceInfo;
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus3 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.setInstanceStatus(instanceStatus3);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = com.netflix.appinfo.ApplicationInfoManager.instance;
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig1 = applicationInfoManager0.config;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig3 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = myDataCenterInstanceConfig3.getMetadataMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.registerAppMetadata(strMap4);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = new com.netflix.appinfo.ApplicationInfoManager();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.refreshDataCenterInfoIfRequired();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder3 = builder0.setHealthCheckUrlsForDeser("/healthcheck", "inesserver2.windows.cin.ufpe.br");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder3.setHomePageUrl("http://inesserver2.windows.cin.ufpe.br:80/", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setHealthCheckUrls("inesserver2.windows.cin.ufpe.br", "", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.setStatusPageUrl("unknown", "hi!");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setDataCenterInfo(dataCenterInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder6.setSecureVIPAddressDeser("http://inesserver2.windows.cin.ufpe.br:80/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder6.setHealthCheckUrls("/", "/healthcheck", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setIPAddr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder6.setHomePageUrl("", "na");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("unknown");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setHealthCheckUrls("UNKNOWN", "/Status", "/Status");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setDataCenterInfo(dataCenterInfo11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder12.setHomePageUrl("unknown", "unknown");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo1 = applicationInfoManager0.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig3 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int4 = myDataCenterInstanceConfig3.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo5 = myDataCenterInstanceConfig3.getDataCenterInfo();
        int int6 = myDataCenterInstanceConfig3.getLeaseExpirationDurationInSeconds();
        java.lang.String str7 = myDataCenterInstanceConfig3.getHomePageUrlPath();
        applicationInfoManager0.config = myDataCenterInstanceConfig3;
        com.netflix.appinfo.ApplicationInfoManager.instance = applicationInfoManager0;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager10 = com.netflix.appinfo.ApplicationInfoManager.instance;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig12 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int13 = myDataCenterInstanceConfig12.getLeaseRenewalIntervalInSeconds();
        int int14 = myDataCenterInstanceConfig12.getLeaseRenewalIntervalInSeconds();
        applicationInfoManager10.config = myDataCenterInstanceConfig12;
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig16 = applicationInfoManager10.config;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig18 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        java.util.Map<java.lang.String, java.lang.String> strMap19 = myDataCenterInstanceConfig18.getMetadataMap();
        applicationInfoManager10.config = myDataCenterInstanceConfig18;
        java.lang.String str21 = myDataCenterInstanceConfig18.getAppGroupName();
        java.util.Map<java.lang.String, java.lang.String> strMap22 = myDataCenterInstanceConfig18.getMetadataMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.registerAppMetadata(strMap22);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo1 = applicationInfoManager0.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig3 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int4 = myDataCenterInstanceConfig3.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo5 = myDataCenterInstanceConfig3.getDataCenterInfo();
        java.lang.String str6 = myDataCenterInstanceConfig3.getNamespace();
        boolean boolean7 = myDataCenterInstanceConfig3.isNonSecurePortEnabled();
        applicationInfoManager0.config = myDataCenterInstanceConfig3;
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig9 = applicationInfoManager0.config;
        com.netflix.appinfo.InstanceInfo instanceInfo10 = applicationInfoManager0.getInfo();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus12 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("UNKNOWN");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.setInstanceStatus(instanceStatus12);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setHealthCheckUrls("http://inesserver2.windows.cin.ufpe.br:80/", "na", "http://hi!:80/Status");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setHomePageUrl("inesserver2.windows.cin.ufpe.br:80", "/");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setHealthCheckUrls("UNKNOWN", "inesserver2.windows.cin.ufpe.br", "hi!");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo1 = applicationInfoManager0.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig4 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int5 = myDataCenterInstanceConfig4.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo6 = myDataCenterInstanceConfig4.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig("/Status", dataCenterInfo6);
        java.lang.String str8 = myDataCenterInstanceConfig7.getAppname();
        java.lang.String str9 = myDataCenterInstanceConfig7.getNamespace();
        applicationInfoManager0.config = myDataCenterInstanceConfig7;
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus12 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.setInstanceStatus(instanceStatus12);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setDataCenterInfo(dataCenterInfo11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder6.setHomePageUrl("http://hi!:80/Status", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder3 = builder0.setHealthCheckUrlsForDeser("/healthcheck", "inesserver2.windows.cin.ufpe.br");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder3.setHealthCheckUrls("http://hi!:80/Status", "/", "/Status");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo1 = applicationInfoManager0.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig3 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int4 = myDataCenterInstanceConfig3.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo5 = myDataCenterInstanceConfig3.getDataCenterInfo();
        java.lang.String str6 = myDataCenterInstanceConfig3.getNamespace();
        boolean boolean7 = myDataCenterInstanceConfig3.isNonSecurePortEnabled();
        applicationInfoManager0.config = myDataCenterInstanceConfig3;
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig9 = applicationInfoManager0.config;
        com.netflix.appinfo.InstanceInfo instanceInfo10 = applicationInfoManager0.getInfo();
        com.netflix.appinfo.InstanceInfo instanceInfo11 = applicationInfoManager0.instanceInfo;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.refreshDataCenterInfoIfRequired();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setDataCenterInfo(dataCenterInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setVIPAddressDeser("/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder12.setHomePageUrl("http://hi!:80/Status", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder9.setHealthCheckUrlsForDeser("hi!", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder9.setHealthCheckUrls("inesserver2.windows.cin.ufpe.br", "UNKNOWN", "/");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setDataCenterInfo(dataCenterInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setVIPAddressDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder16.add("na", "/healthcheck");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder16.setHomePageUrl("", "http://hi!:80/Status");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setSecurePort((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setHealthCheckUrls("", "inesserver2.windows.cin.ufpe.br:80", "http://inesserver2.windows.cin.ufpe.br:80/");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = com.netflix.appinfo.ApplicationInfoManager.instance;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig2 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int3 = myDataCenterInstanceConfig2.getLeaseRenewalIntervalInSeconds();
        int int4 = myDataCenterInstanceConfig2.getLeaseRenewalIntervalInSeconds();
        applicationInfoManager0.config = myDataCenterInstanceConfig2;
        com.netflix.appinfo.ApplicationInfoManager.instance = applicationInfoManager0;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig8 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int9 = myDataCenterInstanceConfig8.getLeaseRenewalIntervalInSeconds();
        int int10 = myDataCenterInstanceConfig8.getLeaseRenewalIntervalInSeconds();
        java.lang.String str11 = myDataCenterInstanceConfig8.getStatusPageUrlPath();
        boolean boolean12 = myDataCenterInstanceConfig8.getSecurePortEnabled();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = myDataCenterInstanceConfig8.getMetadataMap();
        applicationInfoManager0.config = myDataCenterInstanceConfig8;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.refreshDataCenterInfoIfRequired();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo instanceInfo5 = builder0.build();
        boolean boolean6 = builder0.isInitialized();
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder0.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder0.setSID("/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder0.setHomePageUrl("na", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setIPAddr("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setAppName("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setLastDirtyTimestamp((long) 7001);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setHealthCheckUrls("http://inesserver2.windows.cin.ufpe.br:80/Status", "unknown", "");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = com.netflix.appinfo.ApplicationInfoManager.instance;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig2 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int3 = myDataCenterInstanceConfig2.getLeaseRenewalIntervalInSeconds();
        int int4 = myDataCenterInstanceConfig2.getLeaseRenewalIntervalInSeconds();
        applicationInfoManager0.config = myDataCenterInstanceConfig2;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.refreshDataCenterInfoIfRequired();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setHomePageUrlForDeser("unknown");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setHealthCheckUrls("na", "http://inesserver2.windows.cin.ufpe.br:80/", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setIPAddr("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setIPAddr("na");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder8.setStatusPageUrl("inesserver2.windows.cin.ufpe.br:80", "/healthcheck");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = new com.netflix.appinfo.ApplicationInfoManager();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager1 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo2 = applicationInfoManager1.instanceInfo;
        com.netflix.appinfo.InstanceInfo instanceInfo3 = applicationInfoManager1.getInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig5 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        java.lang.String str6 = myDataCenterInstanceConfig5.getIpAddress();
        java.lang.String str7 = myDataCenterInstanceConfig5.getASGName();
        boolean boolean8 = myDataCenterInstanceConfig5.getSecurePortEnabled();
        java.lang.String str9 = myDataCenterInstanceConfig5.getStatusPageUrl();
        applicationInfoManager1.config = myDataCenterInstanceConfig5;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig12 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int13 = myDataCenterInstanceConfig12.getLeaseRenewalIntervalInSeconds();
        java.lang.String str14 = myDataCenterInstanceConfig12.getNamespace();
        java.lang.String str15 = myDataCenterInstanceConfig12.getNamespace();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo16 = myDataCenterInstanceConfig12.getDataCenterInfo();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = myDataCenterInstanceConfig12.getMetadataMap();
        applicationInfoManager1.registerAppMetadata(strMap17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.registerAppMetadata(strMap17);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppName("http://inesserver2.windows.cin.ufpe.br:80/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.setHealthCheckUrlsForDeser("inesserver2.windows.cin.ufpe.br", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder0.setHealthCheckUrls("hi!", "", "http://inesserver2.windows.cin.ufpe.br:80/");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setDataCenterInfo(dataCenterInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder6.setNamespace("na");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder6.add("unknown", "UNKNOWN");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder6.setSecureVIPAddressDeser("default");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setVIPAddress("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder19.setASGName("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder19.setHealthCheckUrls("/Status", "inesserver2.windows.cin.ufpe.br", "UNKNOWN");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setDataCenterInfo(dataCenterInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setVIPAddressDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setAppGroupName("DEFAULT");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder14.setHomePageUrl("/", "172.20.26.3");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setDataCenterInfo(dataCenterInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setVIPAddressDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setSecureVIPAddressDeser("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder16.setHomePageUrl("unknown", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setIPAddr("http://inesserver2.windows.cin.ufpe.br:80/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder0.setSecureVIPAddressDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setHomePageUrlForDeser("/healthcheck");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder10.setHomePageUrl("http://hi!:80/Status", "http://default:80/Status");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setIPAddr("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setStatusPageUrlForDeser("default");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setHomePageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder8.setCountryId((-1));
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder8.setCountryId((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder16.setHomePageUrl("UNKNOWN", "default");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setIPAddr("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setStatusPageUrlForDeser("default");
        boolean boolean11 = builder8.isInitialized();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder8.setStatusPageUrl("inesserver2.windows.cin.ufpe.br", "DEFAULT");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setDataCenterInfo(dataCenterInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setVIPAddressDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder16.add("na", "/healthcheck");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder16.setStatusPageUrl("/healthcheck", "");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo instanceInfo5 = builder0.build();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder0.setStatusPageUrl("", "DEFAULT");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppName("http://inesserver2.windows.cin.ufpe.br:80/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSID("inesserver2.windows.cin.ufpe.br:80");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setHealthCheckUrls("inesserver2.windows.cin.ufpe.br:80", "DEFAULT", "DEFAULT");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setDataCenterInfo(dataCenterInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setVIPAddressDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder16.add("na", "/healthcheck");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder19.setHomePageUrl("UNKNOWN", "hi!");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setIPAddr("http://inesserver2.windows.cin.ufpe.br:80/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder0.setSecureVIPAddressDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setSecureVIPAddressDeser("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo11 = builder10.getRawInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder10.setHomePageUrl("/Status", "http://inesserver2.windows.cin.ufpe.br:80/");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo1 = applicationInfoManager0.instanceInfo;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.refreshDataCenterInfoIfRequired();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setIPAddr("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setStatusPageUrlForDeser("default");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setSecurePort((int) '4');
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setSecurePort((int) ' ');
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder14.add("/", "unknown");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder14.setHealthCheckUrls("", "http://default:80/Status", "");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setIPAddr("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setStatusPageUrlForDeser("default");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder10.setStatusPageUrl("hi!", "172.20.26.3");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder9.setHealthCheckUrlsForDeser("hi!", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setHealthCheckUrls("UNKNOWN", "/Status", "na");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setDataCenterInfo(dataCenterInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setVIPAddressDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder12.add("", "inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setIPAddr("unknown");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder19.setHomePageUrl("inesserver2.windows.cin.ufpe.br", "DEFAULT");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setDataCenterInfo(dataCenterInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder6.setNamespace("na");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setVIPAddress("/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder14.setStatusPageUrl("hi!", "default");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setCountryId(7002);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.setHealthCheckUrlsForDeser("UNKNOWN", "UNKNOWN");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setStatusPageUrlForDeser("http://hi!:80/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder7.setStatusPageUrl("/Status", "http://hi!:80/Status");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setIPAddr("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setStatusPageUrlForDeser("default");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setHomePageUrlForDeser("");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager13 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo14 = applicationInfoManager13.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig16 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int17 = myDataCenterInstanceConfig16.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo18 = myDataCenterInstanceConfig16.getDataCenterInfo();
        java.lang.String str19 = myDataCenterInstanceConfig16.getNamespace();
        boolean boolean20 = myDataCenterInstanceConfig16.isNonSecurePortEnabled();
        applicationInfoManager13.config = myDataCenterInstanceConfig16;
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig22 = applicationInfoManager13.config;
        com.netflix.appinfo.InstanceInfo instanceInfo23 = applicationInfoManager13.getInfo();
        com.netflix.appinfo.InstanceInfo instanceInfo24 = applicationInfoManager13.instanceInfo;
        int int25 = instanceInfo24.getSecurePort();
        boolean boolean26 = instanceInfo24.isDirty();
        com.netflix.appinfo.InstanceInfo instanceInfo27 = new com.netflix.appinfo.InstanceInfo(instanceInfo24);
        com.netflix.appinfo.InstanceInfo instanceInfo28 = new com.netflix.appinfo.InstanceInfo(instanceInfo24);
        java.lang.String str29 = instanceInfo24.getAppGroupName();
        int int30 = instanceInfo24.getCountryId();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus31 = instanceInfo24.getStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder12.setStatus(instanceStatus31);
        com.netflix.appinfo.InstanceInfo.Builder builder34 = builder32.setSID("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder32.setASGName("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder36.setStatusPageUrl("default", "172.20.26.3");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setCountryId(7002);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setSecurePort((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.PortType portType7 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder4.enablePort(portType7, false);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setHomePageUrlForDeser("");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager12 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo13 = applicationInfoManager12.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig15 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int16 = myDataCenterInstanceConfig15.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo17 = myDataCenterInstanceConfig15.getDataCenterInfo();
        java.lang.String str18 = myDataCenterInstanceConfig15.getNamespace();
        boolean boolean19 = myDataCenterInstanceConfig15.isNonSecurePortEnabled();
        applicationInfoManager12.config = myDataCenterInstanceConfig15;
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig21 = applicationInfoManager12.config;
        com.netflix.appinfo.InstanceInfo instanceInfo22 = applicationInfoManager12.getInfo();
        com.netflix.appinfo.InstanceInfo instanceInfo23 = applicationInfoManager12.instanceInfo;
        int int24 = instanceInfo23.getSecurePort();
        boolean boolean25 = instanceInfo23.isDirty();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus26 = instanceInfo23.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder9.setOverriddenStatus(instanceStatus26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder31 = builder27.setHealthCheckUrls("inesserver2.windows.cin.ufpe.br:80", "unknown", "hi!");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo1 = applicationInfoManager0.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig3 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int4 = myDataCenterInstanceConfig3.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo5 = myDataCenterInstanceConfig3.getDataCenterInfo();
        java.lang.String str6 = myDataCenterInstanceConfig3.getNamespace();
        boolean boolean7 = myDataCenterInstanceConfig3.isNonSecurePortEnabled();
        applicationInfoManager0.config = myDataCenterInstanceConfig3;
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig9 = applicationInfoManager0.config;
        com.netflix.appinfo.InstanceInfo instanceInfo10 = applicationInfoManager0.getInfo();
        com.netflix.appinfo.InstanceInfo instanceInfo11 = applicationInfoManager0.instanceInfo;
        java.lang.Boolean boolean12 = instanceInfo11.isCoordinatingDiscoveryServer();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus13 = com.netflix.appinfo.InstanceInfo.InstanceStatus.OUT_OF_SERVICE;
        instanceInfo11.setOverriddenStatus(instanceStatus13);
        int int15 = instanceInfo11.getSecurePort();
        java.lang.String str16 = instanceInfo11.getHostName();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = instanceInfo11.getMetadata();
        com.netflix.appinfo.InstanceInfo.Builder builder18 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setSecureVIPAddressDeser("");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig22 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int23 = myDataCenterInstanceConfig22.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo24 = myDataCenterInstanceConfig22.getDataCenterInfo();
        java.lang.String str26 = myDataCenterInstanceConfig22.getHostName(true);
        com.netflix.appinfo.DataCenterInfo dataCenterInfo27 = myDataCenterInstanceConfig22.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder18.setDataCenterInfo(dataCenterInfo27);
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder18.setVIPAddressDeser("DEFAULT");
        com.netflix.appinfo.InstanceInfo instanceInfo31 = builder30.getRawInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder34 = builder30.setHomePageUrl("default", "default");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager3 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo4 = applicationInfoManager3.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig6 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int7 = myDataCenterInstanceConfig6.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig6.getDataCenterInfo();
        java.lang.String str9 = myDataCenterInstanceConfig6.getNamespace();
        boolean boolean10 = myDataCenterInstanceConfig6.isNonSecurePortEnabled();
        applicationInfoManager3.config = myDataCenterInstanceConfig6;
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig12 = applicationInfoManager3.config;
        com.netflix.appinfo.InstanceInfo instanceInfo13 = applicationInfoManager3.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig16 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int17 = myDataCenterInstanceConfig16.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo18 = myDataCenterInstanceConfig16.getDataCenterInfo();
        java.lang.String str20 = myDataCenterInstanceConfig16.getHostName(true);
        com.netflix.appinfo.DataCenterInfo dataCenterInfo21 = myDataCenterInstanceConfig16.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig22 = new com.netflix.appinfo.MyDataCenterInstanceConfig("inesserver2.windows.cin.ufpe.br:80", dataCenterInfo21);
        java.lang.String str23 = myDataCenterInstanceConfig22.getSecureHealthCheckUrl();
        java.util.Map<java.lang.String, java.lang.String> strMap24 = myDataCenterInstanceConfig22.getMetadataMap();
        applicationInfoManager3.registerAppMetadata(strMap24);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager26 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo27 = applicationInfoManager26.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig29 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int30 = myDataCenterInstanceConfig29.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo31 = myDataCenterInstanceConfig29.getDataCenterInfo();
        java.lang.String str32 = myDataCenterInstanceConfig29.getNamespace();
        boolean boolean33 = myDataCenterInstanceConfig29.isNonSecurePortEnabled();
        applicationInfoManager26.config = myDataCenterInstanceConfig29;
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig35 = applicationInfoManager26.config;
        com.netflix.appinfo.InstanceInfo instanceInfo36 = applicationInfoManager26.getInfo();
        com.netflix.appinfo.InstanceInfo instanceInfo37 = applicationInfoManager26.instanceInfo;
        java.lang.Boolean boolean38 = instanceInfo37.isCoordinatingDiscoveryServer();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus39 = com.netflix.appinfo.InstanceInfo.InstanceStatus.OUT_OF_SERVICE;
        instanceInfo37.setOverriddenStatus(instanceStatus39);
        applicationInfoManager3.setInstanceStatus(instanceStatus39);
        com.netflix.appinfo.InstanceInfo.Builder builder42 = builder0.setOverriddenStatus(instanceStatus39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder46 = builder42.setHealthCheckUrls("na", "/", "http://default:80/Status");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setDataCenterInfo(dataCenterInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder6.setNamespace("na");
        com.netflix.appinfo.InstanceInfo instanceInfo15 = builder6.build();
        boolean boolean16 = builder6.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder6.setASGName("inesserver2.windows.cin.ufpe.br:80");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder18.setHomePageUrl("http://inesserver2.windows.cin.ufpe.br:80/Status", "http://hi!:80/Status");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo1 = applicationInfoManager0.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig3 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int4 = myDataCenterInstanceConfig3.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo5 = myDataCenterInstanceConfig3.getDataCenterInfo();
        int int6 = myDataCenterInstanceConfig3.getLeaseExpirationDurationInSeconds();
        java.lang.String str7 = myDataCenterInstanceConfig3.getHomePageUrlPath();
        applicationInfoManager0.config = myDataCenterInstanceConfig3;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig11 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int12 = myDataCenterInstanceConfig11.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo13 = myDataCenterInstanceConfig11.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig14 = new com.netflix.appinfo.MyDataCenterInstanceConfig("/Status", dataCenterInfo13);
        java.lang.String str15 = myDataCenterInstanceConfig14.getSecureVirtualHostName();
        java.lang.String str16 = myDataCenterInstanceConfig14.getSecureVirtualHostName();
        java.lang.String str17 = myDataCenterInstanceConfig14.getNamespace();
        applicationInfoManager0.config = myDataCenterInstanceConfig14;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.refreshDataCenterInfoIfRequired();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setCountryId(7002);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder4.setHealthCheckUrlsForDeser("hi!", "http://inesserver2.windows.cin.ufpe.br:80/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setStatusPageUrlForDeser("http://hi!:80/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder7.setStatusPageUrl("/healthcheck", "hi!");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setCountryId(7002);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder4.setHealthCheckUrlsForDeser("http://hi!:80/Status", "inesserver2.windows.cin.ufpe.br:80");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder4.setHealthCheckUrls("UNKNOWN", "inesserver2.windows.cin.ufpe.br:80", "http://hi!:80/Status");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setDataCenterInfo(dataCenterInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setVIPAddressDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setStatusPageUrlForDeser("na");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder14.setAppGroupName("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager19 = com.netflix.appinfo.ApplicationInfoManager.instance;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig21 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int22 = myDataCenterInstanceConfig21.getLeaseRenewalIntervalInSeconds();
        int int23 = myDataCenterInstanceConfig21.getLeaseRenewalIntervalInSeconds();
        applicationInfoManager19.config = myDataCenterInstanceConfig21;
        java.lang.String str25 = myDataCenterInstanceConfig21.getIpAddress();
        java.lang.String str26 = myDataCenterInstanceConfig21.getHealthCheckUrlPath();
        java.lang.String str27 = myDataCenterInstanceConfig21.getHealthCheckUrl();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo28 = myDataCenterInstanceConfig21.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder18.setDataCenterInfo(dataCenterInfo28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder18.setHomePageUrl("eureka.", "");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppName("http://inesserver2.windows.cin.ufpe.br:80/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSID("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder2.setHealthCheckUrlsForDeser("http://inesserver2.windows.cin.ufpe.br:80/Status", "/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder7.setStatusPageUrl("", "");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo1 = applicationInfoManager0.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig3 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int4 = myDataCenterInstanceConfig3.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo5 = myDataCenterInstanceConfig3.getDataCenterInfo();
        java.lang.String str6 = myDataCenterInstanceConfig3.getNamespace();
        boolean boolean7 = myDataCenterInstanceConfig3.isNonSecurePortEnabled();
        applicationInfoManager0.config = myDataCenterInstanceConfig3;
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig9 = applicationInfoManager0.config;
        com.netflix.appinfo.InstanceInfo instanceInfo10 = applicationInfoManager0.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig13 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int14 = myDataCenterInstanceConfig13.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo15 = myDataCenterInstanceConfig13.getDataCenterInfo();
        java.lang.String str17 = myDataCenterInstanceConfig13.getHostName(true);
        com.netflix.appinfo.DataCenterInfo dataCenterInfo18 = myDataCenterInstanceConfig13.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig19 = new com.netflix.appinfo.MyDataCenterInstanceConfig("inesserver2.windows.cin.ufpe.br:80", dataCenterInfo18);
        java.lang.String str20 = myDataCenterInstanceConfig19.getSecureHealthCheckUrl();
        java.util.Map<java.lang.String, java.lang.String> strMap21 = myDataCenterInstanceConfig19.getMetadataMap();
        applicationInfoManager0.registerAppMetadata(strMap21);
        com.netflix.appinfo.InstanceInfo instanceInfo23 = applicationInfoManager0.instanceInfo;
        com.netflix.appinfo.InstanceInfo.Builder builder24 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo23);
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder24.setNamespace("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder24.setNamespace("HTTP://INESSERVER2.WINDOWS.CIN.UFPE.BR:80/STATUS");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder24.setHealthCheckUrls("", "", "hi!");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.ApplicationInfoManager.instance = applicationInfoManager0;
        com.netflix.appinfo.InstanceInfo instanceInfo2 = applicationInfoManager0.instanceInfo;
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus4 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("172.20.26.3");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.setInstanceStatus(instanceStatus4);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder0.setHealthCheckUrls("inesserver2.windows.cin.ufpe.br", "http://inesserver2.windows.cin.ufpe.br:80/Status", "DEFAULT");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setStatusPageUrl("unknown", "172.20.26.3");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setIPAddr("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setStatusPageUrlForDeser("default");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setHomePageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder8.setCountryId((-1));
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder8.setAppName("na");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder8.setVIPAddressDeser("http://hi!:80/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder8.setHomePageUrl("na", "hi!");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo instanceInfo5 = builder0.build();
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.setASGName("HTTP://INESSERVER2.WINDOWS.CIN.UFPE.BR:80/STATUS");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder0.setStatusPageUrl("unknown", "http://inesserver2.windows.cin.ufpe.br:10/Status");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setSecurePort((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setHealthCheckUrls("172.20.26.3", "INESSERVER2.WINDOWS.CIN.UFPE.BR", "http://inesserver2.windows.cin.ufpe.br:10/Status");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("unknown");
        boolean boolean3 = builder0.isInitialized();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setHomePageUrl("http://hi!:80/Status", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder3 = builder0.setHealthCheckUrlsForDeser("/healthcheck", "inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder3.setStatusPageUrlForDeser("http://inesserver2.windows.cin.ufpe.br:80/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setCountryId((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder7.setHomePageUrl("DEFAULT", "HTTP://HI!:80/STATUS");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setCountryId(7002);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.setHealthCheckUrlsForDeser("UNKNOWN", "UNKNOWN");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setAppGroupName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setVIPAddressDeser("DEFAULT");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setAppName("inesserver2.windows.cin.ufpe.br");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder13.setHomePageUrl("http://default:80/Status", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setSID("http://inesserver2.windows.cin.ufpe.br:80/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder0.setIPAddr("http://hi!:80/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder8.setHomePageUrl("", "HI!");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setIPAddr("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setStatusPageUrlForDeser("default");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setHomePageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder8.setCountryId((-1));
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder8.setCountryId((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder16.setStatusPageUrl("INESSERVER2.WINDOWS.CIN.UFPE.BR", "hi!");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setDataCenterInfo(dataCenterInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setVIPAddressDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder12.add("", "inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder12.setHomePageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setAppName("/healthcheck");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder21.setHomePageUrl("DEFAULT", "HTTP://HI!:80/STATUS");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setDataCenterInfo(dataCenterInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder6.setNamespace("na");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder6.add("unknown", "UNKNOWN");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder6.setSecureVIPAddressDeser("default");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setVIPAddress("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder19.setASGName("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder19.setHealthCheckUrls("/HEALTHCHECK", "", "/HEALTHCHECK");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setDataCenterInfo(dataCenterInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder6.setNamespace("na");
        com.netflix.appinfo.InstanceInfo instanceInfo15 = builder6.build();
        boolean boolean16 = builder6.isInitialized();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager17 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo18 = applicationInfoManager17.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig20 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int21 = myDataCenterInstanceConfig20.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo22 = myDataCenterInstanceConfig20.getDataCenterInfo();
        java.lang.String str23 = myDataCenterInstanceConfig20.getNamespace();
        boolean boolean24 = myDataCenterInstanceConfig20.isNonSecurePortEnabled();
        applicationInfoManager17.config = myDataCenterInstanceConfig20;
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig26 = applicationInfoManager17.config;
        com.netflix.appinfo.InstanceInfo instanceInfo27 = applicationInfoManager17.getInfo();
        com.netflix.appinfo.InstanceInfo instanceInfo28 = applicationInfoManager17.instanceInfo;
        java.lang.Boolean boolean29 = instanceInfo28.isCoordinatingDiscoveryServer();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus30 = com.netflix.appinfo.InstanceInfo.InstanceStatus.OUT_OF_SERVICE;
        instanceInfo28.setOverriddenStatus(instanceStatus30);
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder6.setStatus(instanceStatus30);
        com.netflix.appinfo.InstanceInfo.Builder builder34 = builder6.setIPAddr("UNKNOWN");
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder6.setHomePageUrlForDeser("http://hi!:80/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder38 = builder6.setStatusPageUrlForDeser("http://inesserver2.windows.cin.ufpe.br:80/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder6.setHomePageUrl("http://default:80/Status", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager7 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo8 = applicationInfoManager7.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int11 = myDataCenterInstanceConfig10.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo12 = myDataCenterInstanceConfig10.getDataCenterInfo();
        java.lang.String str13 = myDataCenterInstanceConfig10.getNamespace();
        boolean boolean14 = myDataCenterInstanceConfig10.isNonSecurePortEnabled();
        applicationInfoManager7.config = myDataCenterInstanceConfig10;
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig16 = applicationInfoManager7.config;
        com.netflix.appinfo.InstanceInfo instanceInfo17 = applicationInfoManager7.getInfo();
        com.netflix.appinfo.InstanceInfo instanceInfo18 = applicationInfoManager7.instanceInfo;
        int int19 = instanceInfo18.getSecurePort();
        boolean boolean20 = instanceInfo18.isDirty();
        java.lang.String str21 = instanceInfo18.getHostName();
        com.netflix.appinfo.InstanceInfo.ActionType actionType22 = instanceInfo18.getActionType();
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder0.setActionType(actionType22);
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder0.setAppGroupName("http://inesserver2.windows.cin.ufpe.br:80/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder0.setSecureVIPAddressDeser("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder31 = builder0.setHealthCheckUrls("UNKNOWN", "/HEALTHCHECK", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder3 = builder0.setHealthCheckUrlsForDeser("/healthcheck", "inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder3.setStatusPageUrlForDeser("http://inesserver2.windows.cin.ufpe.br:80/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setCountryId((int) (short) 0);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder5.setSecureVIPAddress("http://inesserver2.windows.cin.ufpe.br:80/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder9.setHomePageUrl("eureka.", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setDataCenterInfo(dataCenterInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder6.setNamespace("na");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder6.setLastDirtyTimestamp(1636105969900L);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setSecureVIPAddress("http://inesserver2.windows.cin.ufpe.br:80/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder16.setSecureVIPAddressDeser("na");
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder16.setPort((int) '#');
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder16.setCountryId(80);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder16.setHealthCheckUrls("http://hi!:80/Status", "/healthcheck", "default");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder0.add("http://inesserver2.windows.cin.ufpe.br:80/Status", "");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager10 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo11 = applicationInfoManager10.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig13 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int14 = myDataCenterInstanceConfig13.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo15 = myDataCenterInstanceConfig13.getDataCenterInfo();
        java.lang.String str16 = myDataCenterInstanceConfig13.getNamespace();
        boolean boolean17 = myDataCenterInstanceConfig13.isNonSecurePortEnabled();
        applicationInfoManager10.config = myDataCenterInstanceConfig13;
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig19 = applicationInfoManager10.config;
        com.netflix.appinfo.InstanceInfo instanceInfo20 = applicationInfoManager10.getInfo();
        com.netflix.appinfo.InstanceInfo instanceInfo21 = applicationInfoManager10.instanceInfo;
        int int22 = instanceInfo21.getSecurePort();
        boolean boolean23 = instanceInfo21.isDirty();
        com.netflix.appinfo.InstanceInfo instanceInfo24 = new com.netflix.appinfo.InstanceInfo(instanceInfo21);
        java.lang.String str25 = instanceInfo24.getHostName();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus26 = instanceInfo24.getStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder0.setStatus(instanceStatus26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder31 = builder27.setHealthCheckUrls("172.20.26.3", "inesserver2.windows.cin.ufpe.br:80", "na");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setDataCenterInfo(dataCenterInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setVIPAddressDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder12.setAppName("default");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder18.setStatusPageUrl("HTTP://HI!:80/STATUS", "");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setDataCenterInfo(dataCenterInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder6.setNamespace("na");
        com.netflix.appinfo.InstanceInfo instanceInfo15 = builder6.build();
        boolean boolean16 = builder6.isInitialized();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager17 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo18 = applicationInfoManager17.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig20 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int21 = myDataCenterInstanceConfig20.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo22 = myDataCenterInstanceConfig20.getDataCenterInfo();
        java.lang.String str23 = myDataCenterInstanceConfig20.getNamespace();
        boolean boolean24 = myDataCenterInstanceConfig20.isNonSecurePortEnabled();
        applicationInfoManager17.config = myDataCenterInstanceConfig20;
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig26 = applicationInfoManager17.config;
        com.netflix.appinfo.InstanceInfo instanceInfo27 = applicationInfoManager17.getInfo();
        com.netflix.appinfo.InstanceInfo instanceInfo28 = applicationInfoManager17.instanceInfo;
        java.lang.Boolean boolean29 = instanceInfo28.isCoordinatingDiscoveryServer();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus30 = com.netflix.appinfo.InstanceInfo.InstanceStatus.OUT_OF_SERVICE;
        instanceInfo28.setOverriddenStatus(instanceStatus30);
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder6.setStatus(instanceStatus30);
        com.netflix.appinfo.InstanceInfo.Builder builder34 = builder6.setSecureVIPAddressDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder6.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder38 = builder36.setCountryId(100);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager39 = com.netflix.appinfo.ApplicationInfoManager.instance;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig41 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int42 = myDataCenterInstanceConfig41.getLeaseRenewalIntervalInSeconds();
        int int43 = myDataCenterInstanceConfig41.getLeaseRenewalIntervalInSeconds();
        applicationInfoManager39.config = myDataCenterInstanceConfig41;
        java.lang.String str45 = myDataCenterInstanceConfig41.getIpAddress();
        java.lang.String str46 = myDataCenterInstanceConfig41.getVirtualHostName();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo47 = myDataCenterInstanceConfig41.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder48 = builder38.setDataCenterInfo(dataCenterInfo47);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder51 = builder48.setHomePageUrl("http:///:80/Status", "/HEALTHCHECK");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setCountryId(7002);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setSecurePort((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.PortType portType7 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder4.enablePort(portType7, false);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setHomePageUrlForDeser("");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager12 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo13 = applicationInfoManager12.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig15 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int16 = myDataCenterInstanceConfig15.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo17 = myDataCenterInstanceConfig15.getDataCenterInfo();
        java.lang.String str18 = myDataCenterInstanceConfig15.getNamespace();
        boolean boolean19 = myDataCenterInstanceConfig15.isNonSecurePortEnabled();
        applicationInfoManager12.config = myDataCenterInstanceConfig15;
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig21 = applicationInfoManager12.config;
        com.netflix.appinfo.InstanceInfo instanceInfo22 = applicationInfoManager12.getInfo();
        com.netflix.appinfo.InstanceInfo instanceInfo23 = applicationInfoManager12.instanceInfo;
        int int24 = instanceInfo23.getSecurePort();
        boolean boolean25 = instanceInfo23.isDirty();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus26 = instanceInfo23.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder9.setOverriddenStatus(instanceStatus26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder9.setStatusPageUrl("eureka.", "hi!");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setIPAddr("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setVIPAddress("");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setHomePageUrlForDeser("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setSecureVIPAddress("inesserver2.windows.cin.ufpe.br:80");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder14.setHealthCheckUrls("HI!", "", "http://default:80/Status");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setDataCenterInfo(dataCenterInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder6.setNamespace("na");
        com.netflix.appinfo.InstanceInfo instanceInfo15 = builder6.build();
        boolean boolean16 = builder6.isInitialized();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager17 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo18 = applicationInfoManager17.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig20 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int21 = myDataCenterInstanceConfig20.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo22 = myDataCenterInstanceConfig20.getDataCenterInfo();
        java.lang.String str23 = myDataCenterInstanceConfig20.getNamespace();
        boolean boolean24 = myDataCenterInstanceConfig20.isNonSecurePortEnabled();
        applicationInfoManager17.config = myDataCenterInstanceConfig20;
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig26 = applicationInfoManager17.config;
        com.netflix.appinfo.InstanceInfo instanceInfo27 = applicationInfoManager17.getInfo();
        com.netflix.appinfo.InstanceInfo instanceInfo28 = applicationInfoManager17.instanceInfo;
        java.lang.Boolean boolean29 = instanceInfo28.isCoordinatingDiscoveryServer();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus30 = com.netflix.appinfo.InstanceInfo.InstanceStatus.OUT_OF_SERVICE;
        instanceInfo28.setOverriddenStatus(instanceStatus30);
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder6.setStatus(instanceStatus30);
        com.netflix.appinfo.InstanceInfo.Builder builder34 = builder6.setIPAddr("UNKNOWN");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder6.setHomePageUrl("HTTP://INESSERVER2.WINDOWS.CIN.UFPE.BR:80/STATUS", "http://hi!:80/Status");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setDataCenterInfo(dataCenterInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setVIPAddressDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder16.add("na", "/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder16.setCountryId((int) (short) -1);
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder16.setHealthCheckUrlsForDeser("172.20.26.3", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder24.setHealthCheckUrls("/healthcheck", "inesserver2.windows.cin.ufpe.br:80", "http://inesserver2.windows.cin.ufpe.br:10/Status");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = com.netflix.appinfo.ApplicationInfoManager.instance;
        com.netflix.appinfo.InstanceInfo instanceInfo1 = applicationInfoManager0.instanceInfo;
        com.netflix.appinfo.InstanceInfo instanceInfo2 = applicationInfoManager0.instanceInfo;
        com.netflix.appinfo.InstanceInfo instanceInfo3 = applicationInfoManager0.getInfo();
        com.netflix.appinfo.InstanceInfo instanceInfo4 = applicationInfoManager0.getInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder5 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo4);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setCountryId(80);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder5.setStatusPageUrl("inesserver2.windows.cin.ufpe.br", "http:///:80/Status");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppName("http://inesserver2.windows.cin.ufpe.br:80/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setIPAddr("default");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder4.setHomePageUrl("unknown", "unknown");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setDataCenterInfo(dataCenterInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder6.setNamespace("na");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder6.setLastDirtyTimestamp(1636105969900L);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setSecureVIPAddress("http://inesserver2.windows.cin.ufpe.br:80/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder16.setSecureVIPAddressDeser("na");
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder16.setPort((int) '#');
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder16.setCountryId(80);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder24.setHealthCheckUrls("HTTP://INESSERVER2.WINDOWS.CIN.UFPE.BR:80/STATUS", "HI!", "HTTP://INESSERVER2.WINDOWS.CIN.UFPE.BR:80/STATUS");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setIPAddr("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setStatusPageUrlForDeser("default");
        com.netflix.appinfo.InstanceInfo instanceInfo11 = builder10.build();
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder10.setVIPAddressDeser("http://inesserver2.windows.cin.ufpe.br:80/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder10.setASGName("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder10.setHomePageUrl("UNKNOWN", "http://hi!:35/Status");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setDataCenterInfo(dataCenterInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder6.setSecureVIPAddressDeser("http://inesserver2.windows.cin.ufpe.br:80/Status");
        com.netflix.appinfo.InstanceInfo instanceInfo15 = builder6.build();
        boolean boolean16 = builder6.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder6.setHomePageUrlForDeser("DEFAULT");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder6.setHealthCheckUrls("HTTP://INESSERVER2.WINDOWS.CIN.UFPE.BR:10/STATUS", "/", "http://inesserver2.windows.cin.ufpe.br:80/");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo1 = applicationInfoManager0.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig3 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int4 = myDataCenterInstanceConfig3.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo5 = myDataCenterInstanceConfig3.getDataCenterInfo();
        java.lang.String str6 = myDataCenterInstanceConfig3.getNamespace();
        boolean boolean7 = myDataCenterInstanceConfig3.isNonSecurePortEnabled();
        applicationInfoManager0.config = myDataCenterInstanceConfig3;
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig9 = applicationInfoManager0.config;
        com.netflix.appinfo.InstanceInfo instanceInfo10 = applicationInfoManager0.instanceInfo;
        com.netflix.appinfo.InstanceInfo instanceInfo11 = applicationInfoManager0.getInfo();
        com.netflix.appinfo.ApplicationInfoManager.instance = applicationInfoManager0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.refreshDataCenterInfoIfRequired();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder3 = builder0.setHealthCheckUrlsForDeser("/healthcheck", "inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder3.setStatusPageUrlForDeser("http://inesserver2.windows.cin.ufpe.br:80/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setCountryId((int) (short) 0);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder5.setSecureVIPAddress("http://inesserver2.windows.cin.ufpe.br:80/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder5.setHomePageUrl("172.20.26.3", "/");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = com.netflix.appinfo.ApplicationInfoManager.instance;
        com.netflix.appinfo.InstanceInfo instanceInfo1 = applicationInfoManager0.instanceInfo;
        com.netflix.appinfo.InstanceInfo instanceInfo2 = applicationInfoManager0.instanceInfo;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.refreshDataCenterInfoIfRequired();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setCountryId(7002);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.setHealthCheckUrlsForDeser("UNKNOWN", "UNKNOWN");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setAppGroupName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setAppGroupName("");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setHomePageUrlForDeser("http://default:80/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setAppName("/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder15.setStatusPageUrl("/healthcheck", "http://hi!:80/Status");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo instanceInfo5 = builder0.build();
        boolean boolean6 = builder0.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder0.setAppGroupName("inesserver2.windows.cin.ufpe.br:80");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder8.setStatusPageUrl("na", "eureka.");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setCountryId(7002);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setSecurePort((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setIPAddr("/");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setPort(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder10.setStatusPageUrl("http://inesserver2.windows.cin.ufpe.br:80/", "/healthcheck");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setIPAddr("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setStatusPageUrlForDeser("default");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setHomePageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder8.setCountryId((-1));
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder8.setAppName("na");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder8.setVIPAddressDeser("http://hi!:80/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setCountryId(0);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager21 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo22 = applicationInfoManager21.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig24 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int25 = myDataCenterInstanceConfig24.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo26 = myDataCenterInstanceConfig24.getDataCenterInfo();
        java.lang.String str27 = myDataCenterInstanceConfig24.getNamespace();
        boolean boolean28 = myDataCenterInstanceConfig24.isNonSecurePortEnabled();
        applicationInfoManager21.config = myDataCenterInstanceConfig24;
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig30 = applicationInfoManager21.config;
        com.netflix.appinfo.InstanceInfo instanceInfo31 = applicationInfoManager21.getInfo();
        com.netflix.appinfo.InstanceInfo instanceInfo32 = applicationInfoManager21.instanceInfo;
        java.lang.Boolean boolean33 = instanceInfo32.isCoordinatingDiscoveryServer();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus34 = com.netflix.appinfo.InstanceInfo.InstanceStatus.OUT_OF_SERVICE;
        instanceInfo32.setOverriddenStatus(instanceStatus34);
        int int36 = instanceInfo32.getSecurePort();
        java.lang.String str37 = instanceInfo32.getHostName();
        java.util.Map<java.lang.String, java.lang.String> strMap38 = instanceInfo32.getMetadata();
        instanceInfo32.setIsDirty(false);
        com.netflix.appinfo.LeaseInfo leaseInfo41 = instanceInfo32.getLeaseInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder42 = builder18.setLeaseInfo(leaseInfo41);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder46 = builder42.setHealthCheckUrls("DEFAULT", "DEFAULT", "HTTP://INESSERVER2.WINDOWS.CIN.UFPE.BR:80/STATUS");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setIPAddr("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setIPAddr("na");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder10.setHealthCheckUrls("HTTP://HI!:80/STATUS", "http://inesserver2.windows.cin.ufpe.br:80/", "http:///:80/Status");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder9.setHealthCheckUrlsForDeser("hi!", "");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setASGName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setVIPAddress("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder12.setHomePageUrl("http://hi!:80/Status", "UNKNOWN");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setIPAddr("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setStatusPageUrlForDeser("default");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setHomePageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder8.setCountryId((-1));
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder8.setAppName("na");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder8.setIPAddr("default");
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder8.setSID("eureka.");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder8.setHomePageUrl("/HEALTHCHECK", "/Status");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setDataCenterInfo(dataCenterInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder6.setSecureVIPAddressDeser("http://inesserver2.windows.cin.ufpe.br:80/Status");
        com.netflix.appinfo.InstanceInfo instanceInfo15 = builder6.build();
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder6.setCountryId(1);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig19 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        java.lang.String str20 = myDataCenterInstanceConfig19.getIpAddress();
        java.lang.String str21 = myDataCenterInstanceConfig19.getASGName();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo22 = myDataCenterInstanceConfig19.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder6.setDataCenterInfo(dataCenterInfo22);
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder23.setHomePageUrlForDeser("HTTP://INESSERVER2.WINDOWS.CIN.UFPE.BR:80/STATUS");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder25.setHomePageUrl("default", "eureka.");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setCountryId(7002);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder4.setHealthCheckUrlsForDeser("hi!", "http://inesserver2.windows.cin.ufpe.br:80/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setStatusPageUrlForDeser("http://hi!:80/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder9.setHomePageUrl("eureka.", "HTTP://HI!:80/STATUS");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder3 = builder0.setHealthCheckUrlsForDeser("/healthcheck", "inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.setNamespace("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.setVIPAddressDeser("172.20.26.3");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder7.setHealthCheckUrls("172.20.26.3", "http://inesserver2.windows.cin.ufpe.br:80/", "hi!");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setIPAddr("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setStatusPageUrlForDeser("default");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setHomePageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder8.setCountryId((-1));
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder8.setCountryId((-1));
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setHomePageUrlForDeser("default");
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setVIPAddressDeser("http://inesserver2.windows.cin.ufpe.br:10/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder18.setHomePageUrl("/HEALTHCHECK", "/");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setIPAddr("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setStatusPageUrlForDeser("default");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setHomePageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder8.setSecureVIPAddress("na");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder8.setStatusPageUrl("/HEALTHCHECK", "http://hi!:35/Status");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder3 = builder0.setHealthCheckUrlsForDeser("/healthcheck", "inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.setNamespace("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setVIPAddressDeser("inesserver2.windows.cin.ufpe.br");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder7.setHomePageUrl("http:///:80/Status", "http://inesserver2.windows.cin.ufpe.br:80/");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setIPAddr("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setVIPAddress("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder6.setStatusPageUrl("/healthcheck", "http://hi!:35/Status");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setDataCenterInfo(dataCenterInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder6.setSecureVIPAddressDeser("http://inesserver2.windows.cin.ufpe.br:80/Status");
        com.netflix.appinfo.InstanceInfo instanceInfo15 = builder6.build();
        boolean boolean16 = builder6.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder6.setHomePageUrlForDeser("DEFAULT");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder18.setHealthCheckUrls("http://inesserver2.windows.cin.ufpe.br:10/Status", "/healthcheck", "na");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppName("http://inesserver2.windows.cin.ufpe.br:80/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setVIPAddress("/");
        boolean boolean5 = builder2.isInitialized();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder2.setHealthCheckUrls("", "http:///:80/Status", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setDataCenterInfo(dataCenterInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setVIPAddressDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder12.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder18.setHealthCheckUrlsForDeser("http://hi!:80/Status", "http://inesserver2.windows.cin.ufpe.br:80/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder18.setStatusPageUrl("http://default:80/Status", "/");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder6.setHostName("172.20.26.3");
        com.netflix.appinfo.InstanceInfo instanceInfo12 = builder11.getRawInstance();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = instanceInfo12.getMetadata();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        instanceInfo12.setIsCoordinatingDiscoveryServer();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppName("http://inesserver2.windows.cin.ufpe.br:80/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSecureVIPAddressDeser("http://inesserver2.windows.cin.ufpe.br:80/");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setSID("HI!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setHomePageUrl("/healthcheck", "eureka.");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setIPAddr("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setIPAddr("na");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setNamespace("http://inesserver2.windows.cin.ufpe.br:80/");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder8.setLastDirtyTimestamp(1636105999761L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder14.setStatusPageUrl("http://hi!:80/Status", "DEFAULT");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setStatusPageUrlForDeser("/healthcheck");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setHealthCheckUrls("INESSERVER2.WINDOWS.CIN.UFPE.BR", "DEFAULT", "");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder3 = builder0.setHealthCheckUrlsForDeser("/healthcheck", "inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.setNamespace("/Status");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int8 = myDataCenterInstanceConfig7.getLeaseRenewalIntervalInSeconds();
        boolean boolean9 = myDataCenterInstanceConfig7.isInstanceEnabledOnit();
        java.lang.String str10 = myDataCenterInstanceConfig7.getStatusPageUrlPath();
        java.lang.String str11 = myDataCenterInstanceConfig7.getAppGroupName();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo12 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder5.setDataCenterInfo(dataCenterInfo12);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder14.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder14.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig21 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo22 = myDataCenterInstanceConfig21.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder20.setDataCenterInfo(dataCenterInfo22);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig24 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo25 = myDataCenterInstanceConfig24.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder20.setDataCenterInfo(dataCenterInfo25);
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder20.setNamespace("na");
        com.netflix.appinfo.InstanceInfo instanceInfo29 = builder20.build();
        int int30 = instanceInfo29.getSecurePort();
        boolean boolean31 = instanceInfo29.isDirty();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus32 = instanceInfo29.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder33 = builder13.setOverriddenStatus(instanceStatus32);
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder13.setHealthCheckUrlsForDeser("http://inesserver2.windows.cin.ufpe.br:80/Status", "/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder38 = builder36.setVIPAddress("unknown");
        com.netflix.appinfo.InstanceInfo instanceInfo39 = builder38.getRawInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder43 = builder38.setHealthCheckUrls("/Status", "/", "INESSERVER2.WINDOWS.CIN.UFPE.BR");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder9.setHealthCheckUrlsForDeser("hi!", "");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setNamespace("");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder12.setSecureVIPAddress("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder18.setHealthCheckUrls("INESSERVER2.WINDOWS.CIN.UFPE.BR", "http:///:80/Status", "unknown");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder9.setHealthCheckUrlsForDeser("hi!", "");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setNamespace("");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder12.setSecureVIPAddress("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder12.setStatusPageUrl("HTTP://HI!:80/STATUS", "hi!");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setDataCenterInfo(dataCenterInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder6.setNamespace("na");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder6.setLastDirtyTimestamp(1636105969900L);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setSecureVIPAddress("http://inesserver2.windows.cin.ufpe.br:80/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder16.setSecureVIPAddressDeser("na");
        com.netflix.appinfo.InstanceInfo instanceInfo21 = builder16.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder16.setASGName("/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder23.setStatusPageUrl("http://inesserver2.windows.cin.ufpe.br:10/Status", "http://hi!:35/Status");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setCountryId(7002);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder4.setHealthCheckUrlsForDeser("hi!", "http://inesserver2.windows.cin.ufpe.br:80/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder4.setHomePageUrl("http://default:80/Status", "http://hi!:35/Status");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo1 = applicationInfoManager0.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig3 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int4 = myDataCenterInstanceConfig3.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo5 = myDataCenterInstanceConfig3.getDataCenterInfo();
        java.lang.String str6 = myDataCenterInstanceConfig3.getNamespace();
        boolean boolean7 = myDataCenterInstanceConfig3.isNonSecurePortEnabled();
        applicationInfoManager0.config = myDataCenterInstanceConfig3;
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig9 = applicationInfoManager0.config;
        com.netflix.appinfo.InstanceInfo instanceInfo10 = applicationInfoManager0.getInfo();
        com.netflix.appinfo.InstanceInfo instanceInfo11 = applicationInfoManager0.getInfo();
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig12 = applicationInfoManager0.config;
        com.netflix.appinfo.ApplicationInfoManager.instance = applicationInfoManager0;
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager14 = com.netflix.appinfo.ApplicationInfoManager.instance;
        com.netflix.appinfo.InstanceInfo instanceInfo15 = applicationInfoManager14.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig17 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int18 = myDataCenterInstanceConfig17.getLeaseRenewalIntervalInSeconds();
        java.lang.String str19 = myDataCenterInstanceConfig17.getVirtualHostName();
        java.lang.String str20 = myDataCenterInstanceConfig17.getASGName();
        boolean boolean21 = myDataCenterInstanceConfig17.isNonSecurePortEnabled();
        applicationInfoManager14.config = myDataCenterInstanceConfig17;
        java.lang.String str23 = myDataCenterInstanceConfig17.getAppname();
        java.lang.String str24 = myDataCenterInstanceConfig17.getNamespace();
        applicationInfoManager0.config = myDataCenterInstanceConfig17;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.refreshDataCenterInfoIfRequired();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setIPAddr("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setStatusPageUrlForDeser("default");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setSecurePort((int) '4');
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setSecurePort((int) ' ');
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setStatusPageUrlForDeser("inesserver2.windows.cin.ufpe.br:80");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder16.setHomePageUrl("/Status", "http://hi!:80/Status");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setDataCenterInfo(dataCenterInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder6.setNamespace("na");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder14.setHealthCheckUrls("HTTP://INESSERVER2.WINDOWS.CIN.UFPE.BR:10/STATUS", "UNKNOWN", "/HEALTHCHECK");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder2.setHealthCheckUrlsForDeser("", "na");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder5.setStatusPageUrl("172.20.26.3", "http://inesserver2.windows.cin.ufpe.br:80/");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = com.netflix.appinfo.ApplicationInfoManager.instance;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig2 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int3 = myDataCenterInstanceConfig2.getLeaseRenewalIntervalInSeconds();
        int int4 = myDataCenterInstanceConfig2.getLeaseRenewalIntervalInSeconds();
        applicationInfoManager0.config = myDataCenterInstanceConfig2;
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig6 = applicationInfoManager0.config;
        com.netflix.appinfo.ApplicationInfoManager.instance = applicationInfoManager0;
        com.netflix.appinfo.InstanceInfo instanceInfo8 = applicationInfoManager0.instanceInfo;
        com.netflix.appinfo.InstanceInfo instanceInfo9 = applicationInfoManager0.getInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig11 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int12 = myDataCenterInstanceConfig11.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo13 = myDataCenterInstanceConfig11.getDataCenterInfo();
        int int14 = myDataCenterInstanceConfig11.getSecurePort();
        java.lang.String str16 = myDataCenterInstanceConfig11.getHostName(true);
        boolean boolean17 = myDataCenterInstanceConfig11.getSecurePortEnabled();
        int int18 = myDataCenterInstanceConfig11.getLeaseRenewalIntervalInSeconds();
        boolean boolean19 = myDataCenterInstanceConfig11.isInstanceEnabledOnit();
        java.util.Map<java.lang.String, java.lang.String> strMap20 = myDataCenterInstanceConfig11.getMetadataMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.registerAppMetadata(strMap20);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setDataCenterInfo(dataCenterInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder6.setNamespace("na");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder6.add("unknown", "UNKNOWN");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig20 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int21 = myDataCenterInstanceConfig20.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo22 = myDataCenterInstanceConfig20.getDataCenterInfo();
        java.lang.String str24 = myDataCenterInstanceConfig20.getHostName(true);
        com.netflix.appinfo.DataCenterInfo dataCenterInfo25 = myDataCenterInstanceConfig20.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig26 = new com.netflix.appinfo.MyDataCenterInstanceConfig("inesserver2.windows.cin.ufpe.br:80", dataCenterInfo25);
        boolean boolean27 = myDataCenterInstanceConfig26.isInstanceEnabledOnit();
        java.lang.String str28 = myDataCenterInstanceConfig26.getHealthCheckUrlPath();
        java.lang.String str29 = myDataCenterInstanceConfig26.getAppname();
        java.util.Map<java.lang.String, java.lang.String> strMap30 = myDataCenterInstanceConfig26.getMetadataMap();
        com.netflix.appinfo.InstanceInfo.Builder builder31 = builder6.setMetadata(strMap30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder34 = builder6.setHomePageUrl("inesserver2.windows.cin.ufpe.br", "default");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setDataCenterInfo(dataCenterInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder6.setNamespace("na");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder6.setLastDirtyTimestamp(1636105969900L);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setSecureVIPAddress("http://inesserver2.windows.cin.ufpe.br:80/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder16.setSecureVIPAddressDeser("na");
        com.netflix.appinfo.InstanceInfo instanceInfo21 = builder16.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder16.setASGName("/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder16.setStatusPageUrl("HTTP://INESSERVER2.WINDOWS.CIN.UFPE.BR:80/", "http://inesserver2.windows.cin.ufpe.br:10/Status");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setIPAddr("");
        boolean boolean9 = builder6.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder6.setVIPAddress("na");
        com.netflix.appinfo.InstanceInfo instanceInfo12 = builder6.build();
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder6.setAppGroupName("http://hi!:80/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder6.setIPAddr("INESSERVER2.WINDOWS.CIN.UFPE.BR");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder6.setStatusPageUrl("/healthcheck", "/healthcheck");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setIPAddr("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setStatusPageUrlForDeser("default");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setSecurePort((int) '4');
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setSecurePort((int) ' ');
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder14.add("/", "unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setStatusPageUrlForDeser("HTTP://HI!:80/STATUS");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder17.setAppName("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder21.add("default", "HTTP://HI!:80/STATUS");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder21.setStatusPageUrl("http:///:80/Status", "hi!");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo instanceInfo5 = builder0.build();
        boolean boolean6 = builder0.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder0.setNamespace("http://inesserver2.windows.cin.ufpe.br:80/");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder8.add("hi!", "hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder11.setHealthCheckUrlsForDeser("inesserver2.windows.cin.ufpe.br:80", "inesserver2.windows.cin.ufpe.br");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder11.setHomePageUrl("hi!", "/healthcheck");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setDataCenterInfo(dataCenterInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder6.setSecureVIPAddressDeser("http://inesserver2.windows.cin.ufpe.br:80/Status");
        com.netflix.appinfo.InstanceInfo instanceInfo15 = builder6.build();
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder6.setCountryId(1);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig19 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        java.lang.String str20 = myDataCenterInstanceConfig19.getIpAddress();
        java.lang.String str21 = myDataCenterInstanceConfig19.getASGName();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo22 = myDataCenterInstanceConfig19.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder6.setDataCenterInfo(dataCenterInfo22);
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder23.setVIPAddress("/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder23.setHomePageUrl("INESSERVER2.WINDOWS.CIN.UFPE.BR", "/HEALTHCHECK");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppName("http://inesserver2.windows.cin.ufpe.br:80/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setVIPAddress("/");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager5 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo6 = applicationInfoManager5.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig8 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int9 = myDataCenterInstanceConfig8.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo10 = myDataCenterInstanceConfig8.getDataCenterInfo();
        java.lang.String str11 = myDataCenterInstanceConfig8.getNamespace();
        boolean boolean12 = myDataCenterInstanceConfig8.isNonSecurePortEnabled();
        applicationInfoManager5.config = myDataCenterInstanceConfig8;
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig14 = applicationInfoManager5.config;
        com.netflix.appinfo.InstanceInfo instanceInfo15 = applicationInfoManager5.getInfo();
        com.netflix.appinfo.InstanceInfo instanceInfo16 = applicationInfoManager5.instanceInfo;
        int int17 = instanceInfo16.getSecurePort();
        boolean boolean18 = instanceInfo16.isDirty();
        com.netflix.appinfo.InstanceInfo instanceInfo19 = new com.netflix.appinfo.InstanceInfo(instanceInfo16);
        java.lang.String str20 = instanceInfo19.getVersion();
        instanceInfo19.setLastUpdatedTimestamp();
        java.lang.String str22 = instanceInfo19.getAppName();
        java.lang.String str23 = instanceInfo19.getSID();
        java.lang.String str24 = instanceInfo19.getASGName();
        java.lang.Long long25 = instanceInfo19.getLastDirtyTimestamp();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo26 = instanceInfo19.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder4.setDataCenterInfo(dataCenterInfo26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder31 = builder4.setHealthCheckUrls("HI!", "http://default:80/Status", "HI!");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setIPAddr("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setAppName("172.20.26.3");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder10.setHomePageUrl("", "");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setDataCenterInfo(dataCenterInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder6.setSecureVIPAddressDeser("http://inesserver2.windows.cin.ufpe.br:80/Status");
        com.netflix.appinfo.InstanceInfo instanceInfo15 = builder6.build();
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder6.setIPAddr("");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig19 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int20 = myDataCenterInstanceConfig19.getLeaseRenewalIntervalInSeconds();
        int int21 = myDataCenterInstanceConfig19.getLeaseRenewalIntervalInSeconds();
        java.lang.String str22 = myDataCenterInstanceConfig19.getStatusPageUrlPath();
        boolean boolean23 = myDataCenterInstanceConfig19.getSecurePortEnabled();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo24 = myDataCenterInstanceConfig19.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder17.setDataCenterInfo(dataCenterInfo24);
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder25.setVIPAddress("http://default:80/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder27.setStatusPageUrl("/", "");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setCountryId(7002);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.setHealthCheckUrlsForDeser("UNKNOWN", "UNKNOWN");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setStatusPageUrlForDeser("http://hi!:80/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder7.setHealthCheckUrlsForDeser("na", "");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder7.setAppName("/healthcheck");
        com.netflix.appinfo.InstanceInfo instanceInfo15 = builder7.build();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder7.setHomePageUrl("http://inesserver2.windows.cin.ufpe.br:80/Status", "http://inesserver2.windows.cin.ufpe.br:80/");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setDataCenterInfo(dataCenterInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setVIPAddressDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder12.add("", "inesserver2.windows.cin.ufpe.br");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder17.setHomePageUrl("http://inesserver2.windows.cin.ufpe.br:10/Status", "");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setSID("http://inesserver2.windows.cin.ufpe.br:80/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setHealthCheckUrlsForDeser("/", "default");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setStatusPageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setASGName("http://hi!:80/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setVIPAddressDeser("HI!");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder13.setIPAddr("INESSERVER2.WINDOWS.CIN.UFPE.BR");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder13.setHomePageUrl("http://hi!:80/Status", "");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo instanceInfo5 = builder0.build();
        boolean boolean6 = builder0.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder0.setNamespace("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setASGName("inesserver2.windows.cin.ufpe.br");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder10.setStatusPageUrl("HTTP://HI!:80/STATUS", "/HEALTHCHECK");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setSecurePort((-1));
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setCountryId((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setHealthCheckUrls("http://inesserver2.windows.cin.ufpe.br:10/Status", "http://inesserver2.windows.cin.ufpe.br:80/", "DEFAULT");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setCountryId(7002);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager5 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo6 = applicationInfoManager5.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig8 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int9 = myDataCenterInstanceConfig8.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo10 = myDataCenterInstanceConfig8.getDataCenterInfo();
        java.lang.String str11 = myDataCenterInstanceConfig8.getNamespace();
        boolean boolean12 = myDataCenterInstanceConfig8.isNonSecurePortEnabled();
        applicationInfoManager5.config = myDataCenterInstanceConfig8;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig15 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int16 = myDataCenterInstanceConfig15.getLeaseRenewalIntervalInSeconds();
        int int17 = myDataCenterInstanceConfig15.getLeaseRenewalIntervalInSeconds();
        java.lang.String str18 = myDataCenterInstanceConfig15.getStatusPageUrlPath();
        applicationInfoManager5.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig15);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig21 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int22 = myDataCenterInstanceConfig21.getLeaseRenewalIntervalInSeconds();
        int int23 = myDataCenterInstanceConfig21.getLeaseRenewalIntervalInSeconds();
        java.lang.String str24 = myDataCenterInstanceConfig21.getStatusPageUrlPath();
        boolean boolean25 = myDataCenterInstanceConfig21.getSecurePortEnabled();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager26 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo27 = applicationInfoManager26.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig29 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int30 = myDataCenterInstanceConfig29.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo31 = myDataCenterInstanceConfig29.getDataCenterInfo();
        java.lang.String str32 = myDataCenterInstanceConfig29.getNamespace();
        boolean boolean33 = myDataCenterInstanceConfig29.isNonSecurePortEnabled();
        applicationInfoManager26.config = myDataCenterInstanceConfig29;
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig35 = applicationInfoManager26.config;
        com.netflix.appinfo.InstanceInfo instanceInfo36 = applicationInfoManager26.getInfo();
        com.netflix.appinfo.InstanceInfo instanceInfo37 = applicationInfoManager26.instanceInfo;
        com.netflix.appinfo.InstanceInfo.ActionType actionType38 = com.netflix.appinfo.InstanceInfo.ActionType.ADDED;
        instanceInfo37.setActionType(actionType38);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager40 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo41 = applicationInfoManager40.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig43 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int44 = myDataCenterInstanceConfig43.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo45 = myDataCenterInstanceConfig43.getDataCenterInfo();
        java.lang.String str46 = myDataCenterInstanceConfig43.getNamespace();
        boolean boolean47 = myDataCenterInstanceConfig43.isNonSecurePortEnabled();
        applicationInfoManager40.config = myDataCenterInstanceConfig43;
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig49 = applicationInfoManager40.config;
        com.netflix.appinfo.InstanceInfo instanceInfo50 = applicationInfoManager40.getInfo();
        com.netflix.appinfo.InstanceInfo instanceInfo51 = applicationInfoManager40.instanceInfo;
        com.netflix.appinfo.InstanceInfo.ActionType actionType52 = com.netflix.appinfo.InstanceInfo.ActionType.ADDED;
        instanceInfo51.setActionType(actionType52);
        instanceInfo37.setActionType(actionType52);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager55 = new com.netflix.appinfo.ApplicationInfoManager((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig21, instanceInfo37);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus57 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("inesserver2.windows.cin.ufpe.br:80");
        instanceInfo37.setOverriddenStatus(instanceStatus57);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus60 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("/Status");
        instanceInfo37.setOverriddenStatus(instanceStatus60);
        applicationInfoManager5.setInstanceStatus(instanceStatus60);
        com.netflix.appinfo.InstanceInfo.Builder builder63 = builder0.setStatus(instanceStatus60);
        com.netflix.appinfo.InstanceInfo.Builder builder65 = builder63.setPort(30);
        com.netflix.appinfo.InstanceInfo.Builder builder67 = builder65.setCountryId((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder70 = builder67.setStatusPageUrl("/HEALTHCHECK", "HI!");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setAppName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setNamespace("");
        com.netflix.appinfo.InstanceInfo instanceInfo11 = builder8.build();
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder8.setVIPAddress("HTTP://HI!:80/STATUS");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder8.setHealthCheckUrls("172.20.26.3", "172.20.26.3", "/Status");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setCountryId(7002);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager5 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo6 = applicationInfoManager5.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig8 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int9 = myDataCenterInstanceConfig8.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo10 = myDataCenterInstanceConfig8.getDataCenterInfo();
        java.lang.String str11 = myDataCenterInstanceConfig8.getNamespace();
        boolean boolean12 = myDataCenterInstanceConfig8.isNonSecurePortEnabled();
        applicationInfoManager5.config = myDataCenterInstanceConfig8;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig15 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int16 = myDataCenterInstanceConfig15.getLeaseRenewalIntervalInSeconds();
        int int17 = myDataCenterInstanceConfig15.getLeaseRenewalIntervalInSeconds();
        java.lang.String str18 = myDataCenterInstanceConfig15.getStatusPageUrlPath();
        applicationInfoManager5.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig15);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig21 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int22 = myDataCenterInstanceConfig21.getLeaseRenewalIntervalInSeconds();
        int int23 = myDataCenterInstanceConfig21.getLeaseRenewalIntervalInSeconds();
        java.lang.String str24 = myDataCenterInstanceConfig21.getStatusPageUrlPath();
        boolean boolean25 = myDataCenterInstanceConfig21.getSecurePortEnabled();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager26 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo27 = applicationInfoManager26.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig29 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int30 = myDataCenterInstanceConfig29.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo31 = myDataCenterInstanceConfig29.getDataCenterInfo();
        java.lang.String str32 = myDataCenterInstanceConfig29.getNamespace();
        boolean boolean33 = myDataCenterInstanceConfig29.isNonSecurePortEnabled();
        applicationInfoManager26.config = myDataCenterInstanceConfig29;
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig35 = applicationInfoManager26.config;
        com.netflix.appinfo.InstanceInfo instanceInfo36 = applicationInfoManager26.getInfo();
        com.netflix.appinfo.InstanceInfo instanceInfo37 = applicationInfoManager26.instanceInfo;
        com.netflix.appinfo.InstanceInfo.ActionType actionType38 = com.netflix.appinfo.InstanceInfo.ActionType.ADDED;
        instanceInfo37.setActionType(actionType38);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager40 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo41 = applicationInfoManager40.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig43 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int44 = myDataCenterInstanceConfig43.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo45 = myDataCenterInstanceConfig43.getDataCenterInfo();
        java.lang.String str46 = myDataCenterInstanceConfig43.getNamespace();
        boolean boolean47 = myDataCenterInstanceConfig43.isNonSecurePortEnabled();
        applicationInfoManager40.config = myDataCenterInstanceConfig43;
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig49 = applicationInfoManager40.config;
        com.netflix.appinfo.InstanceInfo instanceInfo50 = applicationInfoManager40.getInfo();
        com.netflix.appinfo.InstanceInfo instanceInfo51 = applicationInfoManager40.instanceInfo;
        com.netflix.appinfo.InstanceInfo.ActionType actionType52 = com.netflix.appinfo.InstanceInfo.ActionType.ADDED;
        instanceInfo51.setActionType(actionType52);
        instanceInfo37.setActionType(actionType52);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager55 = new com.netflix.appinfo.ApplicationInfoManager((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig21, instanceInfo37);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus57 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("inesserver2.windows.cin.ufpe.br:80");
        instanceInfo37.setOverriddenStatus(instanceStatus57);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus60 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("/Status");
        instanceInfo37.setOverriddenStatus(instanceStatus60);
        applicationInfoManager5.setInstanceStatus(instanceStatus60);
        com.netflix.appinfo.InstanceInfo.Builder builder63 = builder0.setStatus(instanceStatus60);
        com.netflix.appinfo.InstanceInfo.Builder builder65 = builder63.setPort(30);
        com.netflix.appinfo.InstanceInfo.Builder builder67 = builder65.setCountryId((int) (byte) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder70 = builder65.add("", "HTTP://INESSERVER2.WINDOWS.CIN.UFPE.BR:10/STATUS");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus72 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("http://hi!:80/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder73 = builder65.setOverriddenStatus(instanceStatus72);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder76 = builder65.setStatusPageUrl("", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setIPAddr("");
        boolean boolean9 = builder6.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder6.setVIPAddress("na");
        com.netflix.appinfo.InstanceInfo instanceInfo12 = builder6.build();
        com.netflix.appinfo.InstanceInfo instanceInfo13 = builder6.build();
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder6.setVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder17.setHealthCheckUrlsForDeser("/healthcheck", "inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder17.setNamespace("/Status");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig24 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int25 = myDataCenterInstanceConfig24.getLeaseRenewalIntervalInSeconds();
        boolean boolean26 = myDataCenterInstanceConfig24.isInstanceEnabledOnit();
        java.lang.String str27 = myDataCenterInstanceConfig24.getStatusPageUrlPath();
        java.lang.String str28 = myDataCenterInstanceConfig24.getAppGroupName();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo29 = myDataCenterInstanceConfig24.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder22.setDataCenterInfo(dataCenterInfo29);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig31 = new com.netflix.appinfo.MyDataCenterInstanceConfig("DEFAULT", dataCenterInfo29);
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder15.setDataCenterInfo(dataCenterInfo29);
        com.netflix.appinfo.InstanceInfo.Builder builder34 = builder15.setSecureVIPAddressDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder15.setStatusPageUrlForDeser("HTTP://HI!:80/STATUS");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder40 = builder15.setHealthCheckUrls("", "http://default:80/Status", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setDataCenterInfo(dataCenterInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setVIPAddressDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder12.add("", "inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder12.setHomePageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder12.setAppName("http://inesserver2.windows.cin.ufpe.br:80/Status");
        com.netflix.appinfo.InstanceInfo instanceInfo22 = builder21.build();
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder21.setSecurePort((int) '4');
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder21.setVIPAddress("DEFAULT");
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder21.setHomePageUrlForDeser("http://hi!:80/Status");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager29 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo30 = applicationInfoManager29.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig32 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int33 = myDataCenterInstanceConfig32.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo34 = myDataCenterInstanceConfig32.getDataCenterInfo();
        java.lang.String str35 = myDataCenterInstanceConfig32.getNamespace();
        boolean boolean36 = myDataCenterInstanceConfig32.isNonSecurePortEnabled();
        applicationInfoManager29.config = myDataCenterInstanceConfig32;
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig38 = applicationInfoManager29.config;
        com.netflix.appinfo.InstanceInfo instanceInfo39 = applicationInfoManager29.getInfo();
        com.netflix.appinfo.InstanceInfo instanceInfo40 = applicationInfoManager29.instanceInfo;
        int int41 = instanceInfo40.getSecurePort();
        java.lang.String str42 = instanceInfo40.getSID();
        java.util.Set<java.lang.String> strSet43 = instanceInfo40.getHealthCheckUrls();
        java.util.Set<java.lang.String> strSet44 = instanceInfo40.getHealthCheckUrls();
        java.lang.String str45 = instanceInfo40.getASGName();
        java.util.Map<java.lang.String, java.lang.String> strMap46 = instanceInfo40.getMetadata();
        com.netflix.appinfo.InstanceInfo.Builder builder47 = builder21.setMetadata(strMap46);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder51 = builder47.setHealthCheckUrls("na", "/", "");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo instanceInfo5 = builder0.build();
        boolean boolean6 = builder0.isInitialized();
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder0.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder0.setSID("/");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setCountryId(7002);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setHomePageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder11.setPort((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder15.setStatusPageUrl("http://inesserver2.windows.cin.ufpe.br:80/", "/Status");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo instanceInfo5 = builder0.build();
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.setIPAddr("http://hi!:80/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder7.setHomePageUrl("http://inesserver2.windows.cin.ufpe.br:80/", "INESSERVER2.WINDOWS.CIN.UFPE.BR");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder2.setHealthCheckUrlsForDeser("http://inesserver2.windows.cin.ufpe.br:80/", "default");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setSID("http://inesserver2.windows.cin.ufpe.br:80/");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder5.setHealthCheckUrlsForDeser("http://hi!:80/Status", "unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setSecurePort((int) (byte) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder10.setHealthCheckUrlsForDeser("172.20.26.3", "HTTP://HI!:80/STATUS");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder10.setHealthCheckUrls("unknown", "unknown", "hi!");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder2.setHealthCheckUrlsForDeser("", "na");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.add("UNKNOWN", "UNKNOWN");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder8.setHomePageUrl("na", "INESSERVER2.WINDOWS.CIN.UFPE.BR");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setDataCenterInfo(dataCenterInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setVIPAddressDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setStatusPageUrlForDeser("na");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder14.setAppGroupName("inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager19 = com.netflix.appinfo.ApplicationInfoManager.instance;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig21 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int22 = myDataCenterInstanceConfig21.getLeaseRenewalIntervalInSeconds();
        int int23 = myDataCenterInstanceConfig21.getLeaseRenewalIntervalInSeconds();
        applicationInfoManager19.config = myDataCenterInstanceConfig21;
        java.lang.String str25 = myDataCenterInstanceConfig21.getIpAddress();
        java.lang.String str26 = myDataCenterInstanceConfig21.getHealthCheckUrlPath();
        java.lang.String str27 = myDataCenterInstanceConfig21.getHealthCheckUrl();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo28 = myDataCenterInstanceConfig21.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder18.setDataCenterInfo(dataCenterInfo28);
        com.netflix.appinfo.InstanceInfo.Builder builder31 = builder29.setLastDirtyTimestamp(1636105979211L);
        com.netflix.appinfo.InstanceInfo.Builder builder33 = builder31.setStatusPageUrlForDeser("inesserver2.windows.cin.ufpe.br:80");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder31.setStatusPageUrl("http://inesserver2.windows.cin.ufpe.br:80/", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder2.setHealthCheckUrlsForDeser("", "na");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.add("UNKNOWN", "UNKNOWN");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setHealthCheckUrls("default", "http://inesserver2.windows.cin.ufpe.br:10/Status", "unknown");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setDataCenterInfo(dataCenterInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setVIPAddressDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder12.add("", "inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setIPAddr("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setAppName("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setAppName("http://inesserver2.windows.cin.ufpe.br:10/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder23.setStatusPageUrl("", "hi!");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setIPAddr("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setStatusPageUrlForDeser("default");
        com.netflix.appinfo.InstanceInfo instanceInfo11 = builder10.build();
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder10.setVIPAddressDeser("http://inesserver2.windows.cin.ufpe.br:80/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder10.setASGName("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder10.setHealthCheckUrls("DEFAULT", "http://inesserver2.windows.cin.ufpe.br:80:80/Status", "");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setDataCenterInfo(dataCenterInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder6.setNamespace("na");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder6.add("unknown", "UNKNOWN");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setSecureVIPAddress("eureka.");
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder17.setHealthCheckUrlsForDeser("/", "HTTP://HI!:80/STATUS");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder17.setHealthCheckUrls("/healthcheck", "inesserver2.windows.cin.ufpe.br:80", "unknown");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setSecurePort((-1));
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder0.setSecurePort((int) (byte) 0);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder0.setHomePageUrlForDeser("default");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setVIPAddressDeser("na");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder10.setHomePageUrl("/HEALTHCHECK", "HTTP://INESSERVER2.WINDOWS.CIN.UFPE.BR:80/");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setCountryId(7002);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.setHealthCheckUrlsForDeser("UNKNOWN", "UNKNOWN");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setStatusPageUrlForDeser("http://hi!:80/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder7.setVIPAddressDeser("DEFAULT");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder7.setASGName("http:///:80/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder13.setStatusPageUrl("inesserver2.windows.cin.ufpe.br", "172.20.26.3");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setIPAddr("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setCountryId((int) (short) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setHomePageUrlForDeser("na");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder10.setStatusPageUrl("default", "HI!");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setIPAddr("");
        boolean boolean9 = builder6.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder6.setVIPAddress("na");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder6.setStatusPageUrl("HTTP://HI!:80/STATUS", "unknown");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setIPAddr("http://inesserver2.windows.cin.ufpe.br:80/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder0.setSecureVIPAddressDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setHomePageUrlForDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setVIPAddress("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder10.setSecurePort(35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder14.setStatusPageUrl("http:///:80/Status", "HTTP://INESSERVER2.WINDOWS.CIN.UFPE.BR:80/");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setDataCenterInfo(dataCenterInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder6.setNamespace("na");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder6.add("unknown", "UNKNOWN");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig20 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int21 = myDataCenterInstanceConfig20.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo22 = myDataCenterInstanceConfig20.getDataCenterInfo();
        java.lang.String str24 = myDataCenterInstanceConfig20.getHostName(true);
        com.netflix.appinfo.DataCenterInfo dataCenterInfo25 = myDataCenterInstanceConfig20.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig26 = new com.netflix.appinfo.MyDataCenterInstanceConfig("inesserver2.windows.cin.ufpe.br:80", dataCenterInfo25);
        boolean boolean27 = myDataCenterInstanceConfig26.isInstanceEnabledOnit();
        java.lang.String str28 = myDataCenterInstanceConfig26.getHealthCheckUrlPath();
        java.lang.String str29 = myDataCenterInstanceConfig26.getAppname();
        java.util.Map<java.lang.String, java.lang.String> strMap30 = myDataCenterInstanceConfig26.getMetadataMap();
        com.netflix.appinfo.InstanceInfo.Builder builder31 = builder6.setMetadata(strMap30);
        com.netflix.appinfo.InstanceInfo.Builder builder32 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder34 = builder32.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder32.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder38 = builder32.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig39 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo40 = myDataCenterInstanceConfig39.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder38.setDataCenterInfo(dataCenterInfo40);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig42 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo43 = myDataCenterInstanceConfig42.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder44 = builder38.setDataCenterInfo(dataCenterInfo43);
        com.netflix.appinfo.InstanceInfo.Builder builder46 = builder38.setNamespace("na");
        com.netflix.appinfo.InstanceInfo instanceInfo47 = builder38.build();
        int int48 = instanceInfo47.getSecurePort();
        java.util.Set<java.lang.String> strSet49 = instanceInfo47.getHealthCheckUrls();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus50 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        instanceInfo47.setStatusWithoutDirty(instanceStatus50);
        java.lang.String str52 = instanceInfo47.getHomePageUrl();
        int int53 = instanceInfo47.getCountryId();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager54 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo55 = applicationInfoManager54.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig57 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int58 = myDataCenterInstanceConfig57.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo59 = myDataCenterInstanceConfig57.getDataCenterInfo();
        java.lang.String str60 = myDataCenterInstanceConfig57.getNamespace();
        boolean boolean61 = myDataCenterInstanceConfig57.isNonSecurePortEnabled();
        applicationInfoManager54.config = myDataCenterInstanceConfig57;
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig63 = applicationInfoManager54.config;
        com.netflix.appinfo.InstanceInfo instanceInfo64 = applicationInfoManager54.getInfo();
        com.netflix.appinfo.InstanceInfo instanceInfo65 = applicationInfoManager54.instanceInfo;
        int int66 = instanceInfo65.getSecurePort();
        boolean boolean67 = instanceInfo65.isDirty();
        com.netflix.appinfo.InstanceInfo instanceInfo68 = new com.netflix.appinfo.InstanceInfo(instanceInfo65);
        java.lang.String str69 = instanceInfo68.getVersion();
        instanceInfo68.setLastUpdatedTimestamp();
        java.lang.String str71 = instanceInfo68.getAppName();
        java.lang.String str72 = instanceInfo68.getSID();
        java.lang.String str73 = instanceInfo68.getASGName();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager74 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo75 = applicationInfoManager74.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig77 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int78 = myDataCenterInstanceConfig77.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo79 = myDataCenterInstanceConfig77.getDataCenterInfo();
        java.lang.String str80 = myDataCenterInstanceConfig77.getNamespace();
        boolean boolean81 = myDataCenterInstanceConfig77.isNonSecurePortEnabled();
        applicationInfoManager74.config = myDataCenterInstanceConfig77;
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig83 = applicationInfoManager74.config;
        com.netflix.appinfo.InstanceInfo instanceInfo84 = applicationInfoManager74.getInfo();
        com.netflix.appinfo.InstanceInfo instanceInfo85 = applicationInfoManager74.instanceInfo;
        com.netflix.appinfo.InstanceInfo.ActionType actionType86 = com.netflix.appinfo.InstanceInfo.ActionType.ADDED;
        instanceInfo85.setActionType(actionType86);
        java.lang.String str88 = instanceInfo85.getAppGroupName();
        com.netflix.appinfo.InstanceInfo.ActionType actionType89 = com.netflix.appinfo.InstanceInfo.ActionType.ADDED;
        instanceInfo85.setActionType(actionType89);
        instanceInfo68.setActionType(actionType89);
        instanceInfo47.setActionType(actionType89);
        java.lang.String str93 = instanceInfo47.getHostName();
        com.netflix.appinfo.InstanceInfo.Builder builder94 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo47);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus95 = instanceInfo47.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder96 = builder31.setOverriddenStatus(instanceStatus95);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder99 = builder96.setHomePageUrl("HI!", "HI!");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setIPAddr("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setStatusPageUrlForDeser("default");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setHomePageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder8.setCountryId((-1));
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder8.setCountryId((-1));
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setHomePageUrlForDeser("default");
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setVIPAddressDeser("http://inesserver2.windows.cin.ufpe.br:10/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder20.setStatusPageUrl("HTTP://INESSERVER2.WINDOWS.CIN.UFPE.BR:10/STATUS", "INESSERVER2.WINDOWS.CIN.UFPE.BR");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder3 = builder0.setHealthCheckUrlsForDeser("/healthcheck", "inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.setNamespace("/Status");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int8 = myDataCenterInstanceConfig7.getLeaseRenewalIntervalInSeconds();
        boolean boolean9 = myDataCenterInstanceConfig7.isInstanceEnabledOnit();
        java.lang.String str10 = myDataCenterInstanceConfig7.getStatusPageUrlPath();
        java.lang.String str11 = myDataCenterInstanceConfig7.getAppGroupName();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo12 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder5.setDataCenterInfo(dataCenterInfo12);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder14.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder14.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig21 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo22 = myDataCenterInstanceConfig21.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder20.setDataCenterInfo(dataCenterInfo22);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig24 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo25 = myDataCenterInstanceConfig24.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder20.setDataCenterInfo(dataCenterInfo25);
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder20.setNamespace("na");
        com.netflix.appinfo.InstanceInfo instanceInfo29 = builder20.build();
        int int30 = instanceInfo29.getSecurePort();
        boolean boolean31 = instanceInfo29.isDirty();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus32 = instanceInfo29.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder33 = builder13.setOverriddenStatus(instanceStatus32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder33.setStatusPageUrl("http://hi!:35/Status", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo instanceInfo5 = builder0.build();
        boolean boolean6 = builder0.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder0.setNamespace("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setASGName("inesserver2.windows.cin.ufpe.br");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder10.setHomePageUrl("http://inesserver2.windows.cin.ufpe.br:10/Status", "http://inesserver2.windows.cin.ufpe.br:80/");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo instanceInfo5 = builder0.build();
        boolean boolean6 = builder0.isInitialized();
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder0.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder0.setSID("/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder9.setHomePageUrl("INESSERVER2.WINDOWS.CIN.UFPE.BR:80", "HI!");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder3 = builder0.setHealthCheckUrlsForDeser("/healthcheck", "inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.setNamespace("/Status");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int8 = myDataCenterInstanceConfig7.getLeaseRenewalIntervalInSeconds();
        boolean boolean9 = myDataCenterInstanceConfig7.isInstanceEnabledOnit();
        java.lang.String str10 = myDataCenterInstanceConfig7.getStatusPageUrlPath();
        java.lang.String str11 = myDataCenterInstanceConfig7.getAppGroupName();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo12 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder5.setDataCenterInfo(dataCenterInfo12);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder14.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder14.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig21 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo22 = myDataCenterInstanceConfig21.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder20.setDataCenterInfo(dataCenterInfo22);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig24 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo25 = myDataCenterInstanceConfig24.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder20.setDataCenterInfo(dataCenterInfo25);
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder20.setNamespace("na");
        com.netflix.appinfo.InstanceInfo instanceInfo29 = builder20.build();
        int int30 = instanceInfo29.getSecurePort();
        boolean boolean31 = instanceInfo29.isDirty();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus32 = instanceInfo29.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder33 = builder13.setOverriddenStatus(instanceStatus32);
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder13.setHealthCheckUrlsForDeser("http://inesserver2.windows.cin.ufpe.br:80/Status", "/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder13.setStatusPageUrl("HTTP://INESSERVER2.WINDOWS.CIN.UFPE.BR:80/STATUS", "hi!");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setDataCenterInfo(dataCenterInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder6.setSecureVIPAddressDeser("http://inesserver2.windows.cin.ufpe.br:80/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder6.setHealthCheckUrls("", "inesserver2.windows.cin.ufpe.br:80", "/HEALTHCHECK");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setDataCenterInfo(dataCenterInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder6.setSecureVIPAddressDeser("http://inesserver2.windows.cin.ufpe.br:80/Status");
        com.netflix.appinfo.InstanceInfo instanceInfo15 = builder6.build();
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder6.setCountryId(1);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig19 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        java.lang.String str20 = myDataCenterInstanceConfig19.getIpAddress();
        java.lang.String str21 = myDataCenterInstanceConfig19.getASGName();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo22 = myDataCenterInstanceConfig19.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder6.setDataCenterInfo(dataCenterInfo22);
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder23.setVIPAddress("/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder23.setStatusPageUrl("INESSERVER2.WINDOWS.CIN.UFPE.BR", "hi!");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setDataCenterInfo(dataCenterInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder6.setSecureVIPAddressDeser("http://inesserver2.windows.cin.ufpe.br:80/Status");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager15 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo16 = applicationInfoManager15.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig18 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int19 = myDataCenterInstanceConfig18.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo20 = myDataCenterInstanceConfig18.getDataCenterInfo();
        java.lang.String str21 = myDataCenterInstanceConfig18.getNamespace();
        boolean boolean22 = myDataCenterInstanceConfig18.isNonSecurePortEnabled();
        applicationInfoManager15.config = myDataCenterInstanceConfig18;
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig24 = applicationInfoManager15.config;
        com.netflix.appinfo.InstanceInfo instanceInfo25 = applicationInfoManager15.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig28 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int29 = myDataCenterInstanceConfig28.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo30 = myDataCenterInstanceConfig28.getDataCenterInfo();
        java.lang.String str32 = myDataCenterInstanceConfig28.getHostName(true);
        com.netflix.appinfo.DataCenterInfo dataCenterInfo33 = myDataCenterInstanceConfig28.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig34 = new com.netflix.appinfo.MyDataCenterInstanceConfig("inesserver2.windows.cin.ufpe.br:80", dataCenterInfo33);
        java.lang.String str35 = myDataCenterInstanceConfig34.getSecureHealthCheckUrl();
        java.util.Map<java.lang.String, java.lang.String> strMap36 = myDataCenterInstanceConfig34.getMetadataMap();
        applicationInfoManager15.registerAppMetadata(strMap36);
        com.netflix.appinfo.InstanceInfo.Builder builder38 = builder6.setMetadata(strMap36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder6.setHomePageUrl("http://hi!:97/Status", "/Status");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo instanceInfo5 = builder0.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder0.add("http://inesserver2.windows.cin.ufpe.br:10/Status", "inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager9 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo10 = applicationInfoManager9.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig12 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int13 = myDataCenterInstanceConfig12.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo14 = myDataCenterInstanceConfig12.getDataCenterInfo();
        java.lang.String str15 = myDataCenterInstanceConfig12.getNamespace();
        boolean boolean16 = myDataCenterInstanceConfig12.isNonSecurePortEnabled();
        applicationInfoManager9.config = myDataCenterInstanceConfig12;
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig18 = applicationInfoManager9.config;
        com.netflix.appinfo.InstanceInfo instanceInfo19 = applicationInfoManager9.getInfo();
        com.netflix.appinfo.InstanceInfo instanceInfo20 = applicationInfoManager9.instanceInfo;
        java.lang.Boolean boolean21 = instanceInfo20.isCoordinatingDiscoveryServer();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus22 = com.netflix.appinfo.InstanceInfo.InstanceStatus.OUT_OF_SERVICE;
        instanceInfo20.setOverriddenStatus(instanceStatus22);
        int int24 = instanceInfo20.getSecurePort();
        java.lang.String str25 = instanceInfo20.getHostName();
        java.util.Map<java.lang.String, java.lang.String> strMap26 = instanceInfo20.getMetadata();
        com.netflix.appinfo.InstanceInfo.Builder builder27 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo20);
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder27.setSecureVIPAddressDeser("");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig31 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int32 = myDataCenterInstanceConfig31.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo33 = myDataCenterInstanceConfig31.getDataCenterInfo();
        java.lang.String str35 = myDataCenterInstanceConfig31.getHostName(true);
        com.netflix.appinfo.DataCenterInfo dataCenterInfo36 = myDataCenterInstanceConfig31.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder27.setDataCenterInfo(dataCenterInfo36);
        com.netflix.appinfo.InstanceInfo.Builder builder38 = builder8.setDataCenterInfo(dataCenterInfo36);
        com.netflix.appinfo.InstanceInfo.Builder builder40 = builder38.setAppGroupName("hi!");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager41 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo42 = applicationInfoManager41.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig44 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int45 = myDataCenterInstanceConfig44.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo46 = myDataCenterInstanceConfig44.getDataCenterInfo();
        java.lang.String str47 = myDataCenterInstanceConfig44.getNamespace();
        boolean boolean48 = myDataCenterInstanceConfig44.isNonSecurePortEnabled();
        applicationInfoManager41.config = myDataCenterInstanceConfig44;
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig50 = applicationInfoManager41.config;
        com.netflix.appinfo.InstanceInfo instanceInfo51 = applicationInfoManager41.getInfo();
        com.netflix.appinfo.InstanceInfo instanceInfo52 = applicationInfoManager41.instanceInfo;
        com.netflix.appinfo.InstanceInfo.ActionType actionType53 = com.netflix.appinfo.InstanceInfo.ActionType.ADDED;
        instanceInfo52.setActionType(actionType53);
        java.lang.String str55 = instanceInfo52.getVersion();
        java.lang.String str56 = instanceInfo52.getIPAddr();
        instanceInfo52.setLastUpdatedTimestamp();
        instanceInfo52.setSID("http://hi!:80/Status");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus60 = instanceInfo52.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder61 = builder40.setStatus(instanceStatus60);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder64 = builder40.setStatusPageUrl("/", "http://inesserver2.windows.cin.ufpe.br:80:80/Status");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setIPAddr("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setStatusPageUrlForDeser("default");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setSecurePort((int) '4');
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setSecurePort((int) ' ');
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setAppName("");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder14.setVIPAddress("http://inesserver2.windows.cin.ufpe.br:10/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder18.setHealthCheckUrls("HTTP://HI!:80/STATUS", "http://inesserver2.windows.cin.ufpe.br:80:80/Status", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder9.setHealthCheckUrlsForDeser("hi!", "");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setASGName("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder14.setHomePageUrl("http://default:80/Status", "http://hi!:80/Status");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setCountryId(7002);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager5 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo6 = applicationInfoManager5.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig8 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int9 = myDataCenterInstanceConfig8.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo10 = myDataCenterInstanceConfig8.getDataCenterInfo();
        java.lang.String str11 = myDataCenterInstanceConfig8.getNamespace();
        boolean boolean12 = myDataCenterInstanceConfig8.isNonSecurePortEnabled();
        applicationInfoManager5.config = myDataCenterInstanceConfig8;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig15 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int16 = myDataCenterInstanceConfig15.getLeaseRenewalIntervalInSeconds();
        int int17 = myDataCenterInstanceConfig15.getLeaseRenewalIntervalInSeconds();
        java.lang.String str18 = myDataCenterInstanceConfig15.getStatusPageUrlPath();
        applicationInfoManager5.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig15);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig21 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int22 = myDataCenterInstanceConfig21.getLeaseRenewalIntervalInSeconds();
        int int23 = myDataCenterInstanceConfig21.getLeaseRenewalIntervalInSeconds();
        java.lang.String str24 = myDataCenterInstanceConfig21.getStatusPageUrlPath();
        boolean boolean25 = myDataCenterInstanceConfig21.getSecurePortEnabled();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager26 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo27 = applicationInfoManager26.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig29 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int30 = myDataCenterInstanceConfig29.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo31 = myDataCenterInstanceConfig29.getDataCenterInfo();
        java.lang.String str32 = myDataCenterInstanceConfig29.getNamespace();
        boolean boolean33 = myDataCenterInstanceConfig29.isNonSecurePortEnabled();
        applicationInfoManager26.config = myDataCenterInstanceConfig29;
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig35 = applicationInfoManager26.config;
        com.netflix.appinfo.InstanceInfo instanceInfo36 = applicationInfoManager26.getInfo();
        com.netflix.appinfo.InstanceInfo instanceInfo37 = applicationInfoManager26.instanceInfo;
        com.netflix.appinfo.InstanceInfo.ActionType actionType38 = com.netflix.appinfo.InstanceInfo.ActionType.ADDED;
        instanceInfo37.setActionType(actionType38);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager40 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo41 = applicationInfoManager40.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig43 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int44 = myDataCenterInstanceConfig43.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo45 = myDataCenterInstanceConfig43.getDataCenterInfo();
        java.lang.String str46 = myDataCenterInstanceConfig43.getNamespace();
        boolean boolean47 = myDataCenterInstanceConfig43.isNonSecurePortEnabled();
        applicationInfoManager40.config = myDataCenterInstanceConfig43;
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig49 = applicationInfoManager40.config;
        com.netflix.appinfo.InstanceInfo instanceInfo50 = applicationInfoManager40.getInfo();
        com.netflix.appinfo.InstanceInfo instanceInfo51 = applicationInfoManager40.instanceInfo;
        com.netflix.appinfo.InstanceInfo.ActionType actionType52 = com.netflix.appinfo.InstanceInfo.ActionType.ADDED;
        instanceInfo51.setActionType(actionType52);
        instanceInfo37.setActionType(actionType52);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager55 = new com.netflix.appinfo.ApplicationInfoManager((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig21, instanceInfo37);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus57 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("inesserver2.windows.cin.ufpe.br:80");
        instanceInfo37.setOverriddenStatus(instanceStatus57);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus60 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("/Status");
        instanceInfo37.setOverriddenStatus(instanceStatus60);
        applicationInfoManager5.setInstanceStatus(instanceStatus60);
        com.netflix.appinfo.InstanceInfo.Builder builder63 = builder0.setStatus(instanceStatus60);
        com.netflix.appinfo.InstanceInfo.Builder builder65 = builder63.setPort(30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder69 = builder65.setHealthCheckUrls("default", "172.20.26.3", "/healthcheck");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo instanceInfo5 = builder0.build();
        boolean boolean6 = builder0.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder0.setNamespace("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setCountryId((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder10.setHealthCheckUrls("http://inesserver2.windows.cin.ufpe.br:10/Status", "http://inesserver2.windows.cin.ufpe.br:10/Status", "");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setIPAddr("http://inesserver2.windows.cin.ufpe.br:80/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder0.setSecureVIPAddressDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setAppName("na");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder10.add("unknown", "/");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder13.add("http:///:80/Status", "DEFAULT");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setAppGroupName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder16.setASGName("/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder16.setHealthCheckUrls("", "", "default");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setCountryId(7002);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.setHealthCheckUrlsForDeser("UNKNOWN", "UNKNOWN");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setStatusPageUrlForDeser("http://hi!:80/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder7.setPort((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder11.setHomePageUrl("inesserver2.windows.cin.ufpe.br:80", "");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.add("inesserver2.windows.cin.ufpe.br:80", "/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder6.setLastDirtyTimestamp(1636105974704L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder14.setHomePageUrl("http:///HEALTHCHECK:80/Status", "INESSERVER2.WINDOWS.CIN.UFPE.BR:80");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = com.netflix.appinfo.ApplicationInfoManager.instance;
        com.netflix.appinfo.InstanceInfo instanceInfo1 = applicationInfoManager0.instanceInfo;
        com.netflix.appinfo.InstanceInfo instanceInfo2 = applicationInfoManager0.instanceInfo;
        com.netflix.appinfo.InstanceInfo instanceInfo3 = applicationInfoManager0.getInfo();
        com.netflix.appinfo.InstanceInfo instanceInfo4 = applicationInfoManager0.getInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder5 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo4);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setCountryId(80);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder5.setCountryId(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder5.setStatusPageUrl("", "HTTP://HI!:80/STATUS");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setIPAddr("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setAppName("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setLastDirtyTimestamp((long) 7001);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setASGName("HTTP://HI!:80/STATUS");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setLastDirtyTimestamp(1636105997514L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder12.setHealthCheckUrls("http://hi!:35/Status", "http://hi!:97/Status", "HTTP://HI!:80/STATUS");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setDataCenterInfo(dataCenterInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder6.setNamespace("na");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder6.setLastDirtyTimestamp(1636105969900L);
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setSecureVIPAddress("http://inesserver2.windows.cin.ufpe.br:80/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder16.setSecureVIPAddressDeser("na");
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder16.setPort((int) '#');
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder16.setPort(7001);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder16.setHomePageUrl("HTTP://INESSERVER2.WINDOWS.CIN.UFPE.BR:80/", "DEFAULT");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setDataCenterInfo(dataCenterInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder6.setNamespace("na");
        com.netflix.appinfo.InstanceInfo instanceInfo15 = builder6.build();
        boolean boolean16 = builder6.isInitialized();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager17 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo18 = applicationInfoManager17.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig20 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int21 = myDataCenterInstanceConfig20.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo22 = myDataCenterInstanceConfig20.getDataCenterInfo();
        java.lang.String str23 = myDataCenterInstanceConfig20.getNamespace();
        boolean boolean24 = myDataCenterInstanceConfig20.isNonSecurePortEnabled();
        applicationInfoManager17.config = myDataCenterInstanceConfig20;
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig26 = applicationInfoManager17.config;
        com.netflix.appinfo.InstanceInfo instanceInfo27 = applicationInfoManager17.getInfo();
        com.netflix.appinfo.InstanceInfo instanceInfo28 = applicationInfoManager17.instanceInfo;
        java.lang.Boolean boolean29 = instanceInfo28.isCoordinatingDiscoveryServer();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus30 = com.netflix.appinfo.InstanceInfo.InstanceStatus.OUT_OF_SERVICE;
        instanceInfo28.setOverriddenStatus(instanceStatus30);
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder6.setStatus(instanceStatus30);
        com.netflix.appinfo.InstanceInfo.Builder builder34 = builder6.setSecureVIPAddressDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder6.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder38 = builder36.setCountryId(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder38.setHomePageUrl("HTTP://HI!:35/STATUS", "/healthcheck");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setIPAddr("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setAppName("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setLastDirtyTimestamp((long) 7001);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder6.add("", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder6.setStatusPageUrl("inesserver2.windows.cin.ufpe.br", "http:///HEALTHCHECK:80/Status");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setDataCenterInfo(dataCenterInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setVIPAddressDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder12.add("", "inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder12.setHomePageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder12.setAppName("http://inesserver2.windows.cin.ufpe.br:80/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder21.setStatusPageUrl("", "http:///:80/Status");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setIPAddr("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setVIPAddress("");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setHomePageUrlForDeser("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setSecureVIPAddress("inesserver2.windows.cin.ufpe.br:80");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder14.setHomePageUrl("/", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setDataCenterInfo(dataCenterInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder6.setNamespace("na");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder6.add("unknown", "UNKNOWN");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder6.setSecureVIPAddressDeser("default");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setVIPAddress("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder19.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder23.setSID("DEFAULT");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder25.setStatusPageUrl("", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setDataCenterInfo(dataCenterInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder6.setNamespace("na");
        com.netflix.appinfo.InstanceInfo instanceInfo15 = builder6.build();
        boolean boolean16 = builder6.isInitialized();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager17 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo18 = applicationInfoManager17.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig20 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int21 = myDataCenterInstanceConfig20.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo22 = myDataCenterInstanceConfig20.getDataCenterInfo();
        java.lang.String str23 = myDataCenterInstanceConfig20.getNamespace();
        boolean boolean24 = myDataCenterInstanceConfig20.isNonSecurePortEnabled();
        applicationInfoManager17.config = myDataCenterInstanceConfig20;
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig26 = applicationInfoManager17.config;
        com.netflix.appinfo.InstanceInfo instanceInfo27 = applicationInfoManager17.getInfo();
        com.netflix.appinfo.InstanceInfo instanceInfo28 = applicationInfoManager17.instanceInfo;
        java.lang.Boolean boolean29 = instanceInfo28.isCoordinatingDiscoveryServer();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus30 = com.netflix.appinfo.InstanceInfo.InstanceStatus.OUT_OF_SERVICE;
        instanceInfo28.setOverriddenStatus(instanceStatus30);
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder6.setStatus(instanceStatus30);
        com.netflix.appinfo.InstanceInfo.Builder builder34 = builder6.setSecureVIPAddressDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder6.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder38 = builder6.setStatusPageUrlForDeser("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder6.setHomePageUrl("na", "HTTP://INESSERVER2.WINDOWS.CIN.UFPE.BR:80/");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setIPAddr("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setStatusPageUrlForDeser("default");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setHomePageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder8.setCountryId((-1));
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder8.setAppName("na");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder8.setIPAddr("default");
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder8.setVIPAddressDeser("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder8.setHomePageUrl("/", "HTTP://INESSERVER2.WINDOWS.CIN.UFPE.BR:10/STATUS");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setIPAddr("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setStatusPageUrlForDeser("default");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setHomePageUrlForDeser("");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager13 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo14 = applicationInfoManager13.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig16 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int17 = myDataCenterInstanceConfig16.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo18 = myDataCenterInstanceConfig16.getDataCenterInfo();
        java.lang.String str19 = myDataCenterInstanceConfig16.getNamespace();
        boolean boolean20 = myDataCenterInstanceConfig16.isNonSecurePortEnabled();
        applicationInfoManager13.config = myDataCenterInstanceConfig16;
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig22 = applicationInfoManager13.config;
        com.netflix.appinfo.InstanceInfo instanceInfo23 = applicationInfoManager13.getInfo();
        com.netflix.appinfo.InstanceInfo instanceInfo24 = applicationInfoManager13.instanceInfo;
        int int25 = instanceInfo24.getSecurePort();
        boolean boolean26 = instanceInfo24.isDirty();
        com.netflix.appinfo.InstanceInfo instanceInfo27 = new com.netflix.appinfo.InstanceInfo(instanceInfo24);
        com.netflix.appinfo.InstanceInfo instanceInfo28 = new com.netflix.appinfo.InstanceInfo(instanceInfo24);
        java.lang.String str29 = instanceInfo24.getAppGroupName();
        int int30 = instanceInfo24.getCountryId();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus31 = instanceInfo24.getStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder12.setStatus(instanceStatus31);
        com.netflix.appinfo.InstanceInfo.Builder builder34 = builder12.setIPAddr("na");
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder12.add("/HEALTHCHECK", "HTTP://INESSERVER2.WINDOWS.CIN.UFPE.BR:80/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder40 = builder12.setStatusPageUrl("/healthcheck", "");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setDataCenterInfo(dataCenterInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setVIPAddressDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder16.add("na", "/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder16.setCountryId((int) (short) -1);
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder16.setSecurePort((int) (short) 0);
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder16.setVIPAddress("172.20.26.3");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager26 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo27 = applicationInfoManager26.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig29 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int30 = myDataCenterInstanceConfig29.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo31 = myDataCenterInstanceConfig29.getDataCenterInfo();
        java.lang.String str32 = myDataCenterInstanceConfig29.getNamespace();
        boolean boolean33 = myDataCenterInstanceConfig29.isNonSecurePortEnabled();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo34 = myDataCenterInstanceConfig29.getDataCenterInfo();
        applicationInfoManager26.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig29);
        boolean boolean36 = myDataCenterInstanceConfig29.getSecurePortEnabled();
        java.lang.String str37 = myDataCenterInstanceConfig29.getSecureHealthCheckUrl();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo38 = myDataCenterInstanceConfig29.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder25.setDataCenterInfo(dataCenterInfo38);
        boolean boolean40 = builder39.isInitialized();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder44 = builder39.setHealthCheckUrls("default", "172.20.26.3", "HTTP://HI!:35/STATUS");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setDataCenterInfo(dataCenterInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder6.setNamespace("na");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder6.add("unknown", "UNKNOWN");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder6.setSecureVIPAddressDeser("default");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setVIPAddress("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder19.setASGName("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder23.setStatusPageUrl("http://default:80/Status", "");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder2.setHealthCheckUrlsForDeser("", "na");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.add("UNKNOWN", "UNKNOWN");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder2.setAppName("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder2.setLastDirtyTimestamp(1636106112356L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder12.setHomePageUrl("http://inesserver2.windows.cin.ufpe.br:80/", "");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo1 = applicationInfoManager0.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig3 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int4 = myDataCenterInstanceConfig3.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo5 = myDataCenterInstanceConfig3.getDataCenterInfo();
        int int6 = myDataCenterInstanceConfig3.getLeaseExpirationDurationInSeconds();
        java.lang.String str7 = myDataCenterInstanceConfig3.getHomePageUrlPath();
        applicationInfoManager0.config = myDataCenterInstanceConfig3;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig11 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int12 = myDataCenterInstanceConfig11.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo13 = myDataCenterInstanceConfig11.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig14 = new com.netflix.appinfo.MyDataCenterInstanceConfig("/Status", dataCenterInfo13);
        java.lang.String str15 = myDataCenterInstanceConfig14.getSecureVirtualHostName();
        java.lang.String str16 = myDataCenterInstanceConfig14.getSecureVirtualHostName();
        java.lang.String str17 = myDataCenterInstanceConfig14.getNamespace();
        applicationInfoManager0.config = myDataCenterInstanceConfig14;
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig19 = applicationInfoManager0.config;
        com.netflix.appinfo.InstanceInfo instanceInfo20 = applicationInfoManager0.instanceInfo;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.refreshDataCenterInfoIfRequired();
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setDataCenterInfo(dataCenterInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder6.setNamespace("na");
        com.netflix.appinfo.InstanceInfo instanceInfo15 = builder6.build();
        int int16 = instanceInfo15.getSecurePort();
        instanceInfo15.setSID("http://inesserver2.windows.cin.ufpe.br:80/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo15);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setStatusPageUrlForDeser("http://default:80/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder19.setStatusPageUrl("", "");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setIPAddr("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setStatusPageUrlForDeser("default");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setHomePageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder8.setCountryId((-1));
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder8.setCountryId((-1));
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setHomePageUrlForDeser("default");
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder18.setSecureVIPAddress("http://inesserver2.windows.cin.ufpe.br:80/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder20.setStatusPageUrl("http://inesserver2.windows.cin.ufpe.br:80:80/Status", "unknown");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setDataCenterInfo(dataCenterInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder6.setNamespace("na");
        com.netflix.appinfo.InstanceInfo instanceInfo15 = builder6.build();
        boolean boolean16 = builder6.isInitialized();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager17 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo18 = applicationInfoManager17.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig20 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int21 = myDataCenterInstanceConfig20.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo22 = myDataCenterInstanceConfig20.getDataCenterInfo();
        java.lang.String str23 = myDataCenterInstanceConfig20.getNamespace();
        boolean boolean24 = myDataCenterInstanceConfig20.isNonSecurePortEnabled();
        applicationInfoManager17.config = myDataCenterInstanceConfig20;
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig26 = applicationInfoManager17.config;
        com.netflix.appinfo.InstanceInfo instanceInfo27 = applicationInfoManager17.getInfo();
        com.netflix.appinfo.InstanceInfo instanceInfo28 = applicationInfoManager17.instanceInfo;
        java.lang.Boolean boolean29 = instanceInfo28.isCoordinatingDiscoveryServer();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus30 = com.netflix.appinfo.InstanceInfo.InstanceStatus.OUT_OF_SERVICE;
        instanceInfo28.setOverriddenStatus(instanceStatus30);
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder6.setStatus(instanceStatus30);
        com.netflix.appinfo.InstanceInfo.Builder builder34 = builder6.setSecureVIPAddressDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder6.setIPAddr("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder38 = builder36.setCountryId(100);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager39 = com.netflix.appinfo.ApplicationInfoManager.instance;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig41 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int42 = myDataCenterInstanceConfig41.getLeaseRenewalIntervalInSeconds();
        int int43 = myDataCenterInstanceConfig41.getLeaseRenewalIntervalInSeconds();
        applicationInfoManager39.config = myDataCenterInstanceConfig41;
        java.lang.String str45 = myDataCenterInstanceConfig41.getIpAddress();
        java.lang.String str46 = myDataCenterInstanceConfig41.getVirtualHostName();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo47 = myDataCenterInstanceConfig41.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder48 = builder38.setDataCenterInfo(dataCenterInfo47);
        com.netflix.appinfo.InstanceInfo.Builder builder50 = builder48.setVIPAddressDeser("eureka.");
        com.netflix.appinfo.InstanceInfo instanceInfo51 = builder48.build();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager52 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo53 = applicationInfoManager52.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig55 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int56 = myDataCenterInstanceConfig55.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo57 = myDataCenterInstanceConfig55.getDataCenterInfo();
        java.lang.String str58 = myDataCenterInstanceConfig55.getNamespace();
        boolean boolean59 = myDataCenterInstanceConfig55.isNonSecurePortEnabled();
        applicationInfoManager52.config = myDataCenterInstanceConfig55;
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig61 = applicationInfoManager52.config;
        com.netflix.appinfo.InstanceInfo instanceInfo62 = applicationInfoManager52.getInfo();
        com.netflix.appinfo.InstanceInfo instanceInfo63 = applicationInfoManager52.instanceInfo;
        int int64 = instanceInfo63.getSecurePort();
        boolean boolean65 = instanceInfo63.isDirty();
        boolean boolean66 = instanceInfo63.isDirty();
        java.lang.String str67 = instanceInfo63.getVersion();
        long long68 = instanceInfo63.getLastUpdatedTimestamp();
        com.netflix.appinfo.InstanceInfo.ActionType actionType69 = instanceInfo63.getActionType();
        com.netflix.appinfo.InstanceInfo.Builder builder70 = builder48.setActionType(actionType69);
        com.netflix.appinfo.InstanceInfo.Builder builder72 = builder48.setIPAddr("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder74 = builder72.setSecurePort(97);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder77 = builder72.setStatusPageUrl("DEFAULT", "");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setDataCenterInfo(dataCenterInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setVIPAddressDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder16.add("na", "/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder16.setCountryId((int) (short) -1);
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setAppGroupName("http://inesserver2.windows.cin.ufpe.br:80/");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus24 = com.netflix.appinfo.InstanceInfo.InstanceStatus.DOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder23.setOverriddenStatus(instanceStatus24);
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder23.setAppName("INESSERVER2.WINDOWS.CIN.UFPE.BR");
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder27.setHealthCheckUrlsForDeser("http:///:80/Status", "HTTP://INESSERVER2.WINDOWS.CIN.UFPE.BR:10/STATUS");
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder30.setIPAddr("http://inesserver2.windows.cin.ufpe.br:80:80/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder30.setHealthCheckUrls("HTTP:///:80/STATUS", "http:///HEALTHCHECK:80/Status", "hi!");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setDataCenterInfo(dataCenterInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder6.setNamespace("na");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder6.setHealthCheckUrlsForDeser("http://inesserver2.windows.cin.ufpe.br:80/", "/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder6.setHealthCheckUrls("default", "HTTP:///HEALTHCHECK:80/STATUS", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setCountryId(7002);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager5 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo6 = applicationInfoManager5.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig8 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int9 = myDataCenterInstanceConfig8.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo10 = myDataCenterInstanceConfig8.getDataCenterInfo();
        java.lang.String str11 = myDataCenterInstanceConfig8.getNamespace();
        boolean boolean12 = myDataCenterInstanceConfig8.isNonSecurePortEnabled();
        applicationInfoManager5.config = myDataCenterInstanceConfig8;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig15 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int16 = myDataCenterInstanceConfig15.getLeaseRenewalIntervalInSeconds();
        int int17 = myDataCenterInstanceConfig15.getLeaseRenewalIntervalInSeconds();
        java.lang.String str18 = myDataCenterInstanceConfig15.getStatusPageUrlPath();
        applicationInfoManager5.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig15);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig21 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int22 = myDataCenterInstanceConfig21.getLeaseRenewalIntervalInSeconds();
        int int23 = myDataCenterInstanceConfig21.getLeaseRenewalIntervalInSeconds();
        java.lang.String str24 = myDataCenterInstanceConfig21.getStatusPageUrlPath();
        boolean boolean25 = myDataCenterInstanceConfig21.getSecurePortEnabled();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager26 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo27 = applicationInfoManager26.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig29 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int30 = myDataCenterInstanceConfig29.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo31 = myDataCenterInstanceConfig29.getDataCenterInfo();
        java.lang.String str32 = myDataCenterInstanceConfig29.getNamespace();
        boolean boolean33 = myDataCenterInstanceConfig29.isNonSecurePortEnabled();
        applicationInfoManager26.config = myDataCenterInstanceConfig29;
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig35 = applicationInfoManager26.config;
        com.netflix.appinfo.InstanceInfo instanceInfo36 = applicationInfoManager26.getInfo();
        com.netflix.appinfo.InstanceInfo instanceInfo37 = applicationInfoManager26.instanceInfo;
        com.netflix.appinfo.InstanceInfo.ActionType actionType38 = com.netflix.appinfo.InstanceInfo.ActionType.ADDED;
        instanceInfo37.setActionType(actionType38);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager40 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo41 = applicationInfoManager40.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig43 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int44 = myDataCenterInstanceConfig43.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo45 = myDataCenterInstanceConfig43.getDataCenterInfo();
        java.lang.String str46 = myDataCenterInstanceConfig43.getNamespace();
        boolean boolean47 = myDataCenterInstanceConfig43.isNonSecurePortEnabled();
        applicationInfoManager40.config = myDataCenterInstanceConfig43;
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig49 = applicationInfoManager40.config;
        com.netflix.appinfo.InstanceInfo instanceInfo50 = applicationInfoManager40.getInfo();
        com.netflix.appinfo.InstanceInfo instanceInfo51 = applicationInfoManager40.instanceInfo;
        com.netflix.appinfo.InstanceInfo.ActionType actionType52 = com.netflix.appinfo.InstanceInfo.ActionType.ADDED;
        instanceInfo51.setActionType(actionType52);
        instanceInfo37.setActionType(actionType52);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager55 = new com.netflix.appinfo.ApplicationInfoManager((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig21, instanceInfo37);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus57 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("inesserver2.windows.cin.ufpe.br:80");
        instanceInfo37.setOverriddenStatus(instanceStatus57);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus60 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("/Status");
        instanceInfo37.setOverriddenStatus(instanceStatus60);
        applicationInfoManager5.setInstanceStatus(instanceStatus60);
        com.netflix.appinfo.InstanceInfo.Builder builder63 = builder0.setStatus(instanceStatus60);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder67 = builder0.setHealthCheckUrls("inesserver2.windows.cin.ufpe.br", "eureka.", "HTTP://HI!:35/STATUS");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder9.setHealthCheckUrlsForDeser("hi!", "");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setSecureVIPAddressDeser("default");
        com.netflix.appinfo.InstanceInfo instanceInfo17 = builder14.build();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder14.setHomePageUrl("http://inesserver2.windows.cin.ufpe.br:80/Status", "HTTP://INESSERVER2.WINDOWS.CIN.UFPE.BR:80/STATUS");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setIPAddr("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setStatusPageUrlForDeser("default");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setHomePageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder8.setCountryId((-1));
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder8.setAppName("na");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder8.setIPAddr("default");
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder8.setVIPAddressDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder20.setSecurePort(97);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder20.setHealthCheckUrls("http://inesserver2.windows.cin.ufpe.br:80:80/Status", "/", "HTTP://INESSERVER2.WINDOWS.CIN.UFPE.BR:80/STATUS");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setDataCenterInfo(dataCenterInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder6.setSecureVIPAddressDeser("http://inesserver2.windows.cin.ufpe.br:80/Status");
        com.netflix.appinfo.InstanceInfo instanceInfo15 = builder6.build();
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder6.setCountryId(1);
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setVIPAddressDeser("");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig21 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int22 = myDataCenterInstanceConfig21.getLeaseRenewalIntervalInSeconds();
        int int23 = myDataCenterInstanceConfig21.getLeaseRenewalIntervalInSeconds();
        java.lang.String str24 = myDataCenterInstanceConfig21.getStatusPageUrlPath();
        boolean boolean25 = myDataCenterInstanceConfig21.getSecurePortEnabled();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager26 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo27 = applicationInfoManager26.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig29 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int30 = myDataCenterInstanceConfig29.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo31 = myDataCenterInstanceConfig29.getDataCenterInfo();
        java.lang.String str32 = myDataCenterInstanceConfig29.getNamespace();
        boolean boolean33 = myDataCenterInstanceConfig29.isNonSecurePortEnabled();
        applicationInfoManager26.config = myDataCenterInstanceConfig29;
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig35 = applicationInfoManager26.config;
        com.netflix.appinfo.InstanceInfo instanceInfo36 = applicationInfoManager26.getInfo();
        com.netflix.appinfo.InstanceInfo instanceInfo37 = applicationInfoManager26.instanceInfo;
        com.netflix.appinfo.InstanceInfo.ActionType actionType38 = com.netflix.appinfo.InstanceInfo.ActionType.ADDED;
        instanceInfo37.setActionType(actionType38);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager40 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo41 = applicationInfoManager40.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig43 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int44 = myDataCenterInstanceConfig43.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo45 = myDataCenterInstanceConfig43.getDataCenterInfo();
        java.lang.String str46 = myDataCenterInstanceConfig43.getNamespace();
        boolean boolean47 = myDataCenterInstanceConfig43.isNonSecurePortEnabled();
        applicationInfoManager40.config = myDataCenterInstanceConfig43;
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig49 = applicationInfoManager40.config;
        com.netflix.appinfo.InstanceInfo instanceInfo50 = applicationInfoManager40.getInfo();
        com.netflix.appinfo.InstanceInfo instanceInfo51 = applicationInfoManager40.instanceInfo;
        com.netflix.appinfo.InstanceInfo.ActionType actionType52 = com.netflix.appinfo.InstanceInfo.ActionType.ADDED;
        instanceInfo51.setActionType(actionType52);
        instanceInfo37.setActionType(actionType52);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager55 = new com.netflix.appinfo.ApplicationInfoManager((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig21, instanceInfo37);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus57 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("inesserver2.windows.cin.ufpe.br:80");
        instanceInfo37.setOverriddenStatus(instanceStatus57);
        com.netflix.appinfo.InstanceInfo instanceInfo59 = new com.netflix.appinfo.InstanceInfo(instanceInfo37);
        instanceInfo59.setLastUpdatedTimestamp();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager61 = com.netflix.appinfo.ApplicationInfoManager.instance;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig63 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int64 = myDataCenterInstanceConfig63.getLeaseRenewalIntervalInSeconds();
        int int65 = myDataCenterInstanceConfig63.getLeaseRenewalIntervalInSeconds();
        applicationInfoManager61.config = myDataCenterInstanceConfig63;
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig67 = applicationInfoManager61.config;
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig68 = applicationInfoManager61.config;
        applicationInfoManager61.refreshDataCenterInfoIfRequired();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager70 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo71 = applicationInfoManager70.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig73 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int74 = myDataCenterInstanceConfig73.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo75 = myDataCenterInstanceConfig73.getDataCenterInfo();
        java.lang.String str76 = myDataCenterInstanceConfig73.getNamespace();
        boolean boolean77 = myDataCenterInstanceConfig73.isNonSecurePortEnabled();
        applicationInfoManager70.config = myDataCenterInstanceConfig73;
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig79 = applicationInfoManager70.config;
        com.netflix.appinfo.InstanceInfo instanceInfo80 = applicationInfoManager70.getInfo();
        com.netflix.appinfo.InstanceInfo instanceInfo81 = applicationInfoManager70.instanceInfo;
        int int82 = instanceInfo81.getSecurePort();
        boolean boolean83 = instanceInfo81.isDirty();
        com.netflix.appinfo.InstanceInfo instanceInfo84 = new com.netflix.appinfo.InstanceInfo(instanceInfo81);
        com.netflix.appinfo.InstanceInfo instanceInfo85 = new com.netflix.appinfo.InstanceInfo(instanceInfo81);
        java.lang.String str86 = instanceInfo81.getAppGroupName();
        int int87 = instanceInfo81.getCountryId();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus88 = instanceInfo81.getStatus();
        applicationInfoManager61.setInstanceStatus(instanceStatus88);
        instanceInfo59.setOverriddenStatus(instanceStatus88);
        com.netflix.appinfo.InstanceInfo.Builder builder91 = builder19.setStatus(instanceStatus88);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder95 = builder19.setHealthCheckUrls("HTTP://INESSERVER2.WINDOWS.CIN.UFPE.BR:80/STATUS", "inesserver2.windows.cin.ufpe.br:80", "HTTP://INESSERVER2.WINDOWS.CIN.UFPE.BR:80/");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setDataCenterInfo(dataCenterInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setVIPAddressDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder12.add("", "inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder12.setHomePageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder12.setAppName("http://inesserver2.windows.cin.ufpe.br:80/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder21.add("HTTP://INESSERVER2.WINDOWS.CIN.UFPE.BR:80/STATUS", "http://default:80/Status");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager25 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.ApplicationInfoManager.instance = applicationInfoManager25;
        applicationInfoManager25.refreshDataCenterInfoIfRequired();
        com.netflix.appinfo.InstanceInfo instanceInfo28 = applicationInfoManager25.getInfo();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager29 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo30 = applicationInfoManager29.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig32 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int33 = myDataCenterInstanceConfig32.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo34 = myDataCenterInstanceConfig32.getDataCenterInfo();
        java.lang.String str35 = myDataCenterInstanceConfig32.getNamespace();
        boolean boolean36 = myDataCenterInstanceConfig32.isNonSecurePortEnabled();
        applicationInfoManager29.config = myDataCenterInstanceConfig32;
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig38 = applicationInfoManager29.config;
        com.netflix.appinfo.InstanceInfo instanceInfo39 = applicationInfoManager29.getInfo();
        com.netflix.appinfo.InstanceInfo instanceInfo40 = applicationInfoManager29.instanceInfo;
        int int41 = instanceInfo40.getSecurePort();
        instanceInfo40.setIsCoordinatingDiscoveryServer();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus43 = com.netflix.appinfo.InstanceInfo.InstanceStatus.UNKNOWN;
        instanceInfo40.setOverriddenStatus(instanceStatus43);
        instanceInfo28.setStatusWithoutDirty(instanceStatus43);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus46 = instanceInfo28.getStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder47 = builder21.setStatus(instanceStatus46);
        com.netflix.appinfo.InstanceInfo.Builder builder49 = builder47.setVIPAddressDeser("inesserver2.windows.cin.ufpe.br");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder53 = builder49.setHealthCheckUrls("HTTP://INESSERVER2.WINDOWS.CIN.UFPE.BR:10/STATUS", "/Status", "na");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setIPAddr("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setStatusPageUrlForDeser("default");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setHomePageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder8.setCountryId((-1));
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setSID("UNKNOWN");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager17 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo18 = applicationInfoManager17.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig20 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int21 = myDataCenterInstanceConfig20.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo22 = myDataCenterInstanceConfig20.getDataCenterInfo();
        java.lang.String str23 = myDataCenterInstanceConfig20.getNamespace();
        boolean boolean24 = myDataCenterInstanceConfig20.isNonSecurePortEnabled();
        applicationInfoManager17.config = myDataCenterInstanceConfig20;
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig26 = applicationInfoManager17.config;
        com.netflix.appinfo.InstanceInfo instanceInfo27 = applicationInfoManager17.getInfo();
        com.netflix.appinfo.InstanceInfo instanceInfo28 = applicationInfoManager17.instanceInfo;
        int int29 = instanceInfo28.getSecurePort();
        boolean boolean30 = instanceInfo28.isDirty();
        com.netflix.appinfo.InstanceInfo instanceInfo31 = new com.netflix.appinfo.InstanceInfo(instanceInfo28);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus32 = com.netflix.appinfo.InstanceInfo.InstanceStatus.UP;
        instanceInfo28.setStatus(instanceStatus32);
        com.netflix.appinfo.InstanceInfo.Builder builder34 = builder16.setOverriddenStatus(instanceStatus32);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig38 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int39 = myDataCenterInstanceConfig38.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo40 = myDataCenterInstanceConfig38.getDataCenterInfo();
        java.lang.String str42 = myDataCenterInstanceConfig38.getHostName(true);
        com.netflix.appinfo.DataCenterInfo dataCenterInfo43 = myDataCenterInstanceConfig38.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig44 = new com.netflix.appinfo.MyDataCenterInstanceConfig("UNKNOWN", dataCenterInfo43);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig45 = new com.netflix.appinfo.MyDataCenterInstanceConfig("/Status", dataCenterInfo43);
        com.netflix.appinfo.InstanceInfo.Builder builder46 = builder16.setDataCenterInfo(dataCenterInfo43);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder49 = builder46.setStatusPageUrl("UNKNOWN", "UNKNOWN");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setIPAddr("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setStatusPageUrlForDeser("default");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setSecurePort((int) '4');
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder8.setAppName("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setSecureVIPAddress("http://hi!:35/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder16.setStatusPageUrl("172.20.26.3", "INESSERVER2.WINDOWS.CIN.UFPE.BR:80");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder3 = builder0.setHealthCheckUrlsForDeser("/healthcheck", "inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.setNamespace("/Status");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int8 = myDataCenterInstanceConfig7.getLeaseRenewalIntervalInSeconds();
        boolean boolean9 = myDataCenterInstanceConfig7.isInstanceEnabledOnit();
        java.lang.String str10 = myDataCenterInstanceConfig7.getStatusPageUrlPath();
        java.lang.String str11 = myDataCenterInstanceConfig7.getAppGroupName();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo12 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder5.setDataCenterInfo(dataCenterInfo12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder5.setHealthCheckUrls("/Status", "/", "172.20.26.3");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setDataCenterInfo(dataCenterInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setVIPAddressDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder12.setAppName("default");
        com.netflix.appinfo.InstanceInfo instanceInfo19 = builder12.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder12.setPort((int) (short) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder12.setLastDirtyTimestamp(1636105986720L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder12.setStatusPageUrl("hi!", "eureka.");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder9.setHomePageUrl("unknown", "http://inesserver2.windows.cin.ufpe.br:80:80/Status");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setIPAddr("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setStatusPageUrlForDeser("default");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setSecurePort((int) '4');
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setSecurePort((int) ' ');
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder14.add("/", "unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setStatusPageUrlForDeser("HTTP://HI!:80/STATUS");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setAppName("INESSERVER2.WINDOWS.CIN.UFPE.BR");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder19.setHomePageUrl("hi!", "INESSERVER2.WINDOWS.CIN.UFPE.BR");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setAppGroupName("http://inesserver2.windows.cin.ufpe.br:80/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder4.setStatusPageUrl("http:///:80/Status", "UNKNOWN");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setIPAddr("http://inesserver2.windows.cin.ufpe.br:80/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder0.setSecureVIPAddressDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setAppName("http://hi!:35/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder8.setHealthCheckUrls("HTTP:///:80/STATUS", "eureka.", "172.20.26.3");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = com.netflix.appinfo.ApplicationInfoManager.instance;
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig1 = applicationInfoManager0.config;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.refreshDataCenterInfoIfRequired();
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder2.setHealthCheckUrlsForDeser("http://inesserver2.windows.cin.ufpe.br:80/", "default");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder5.setSID("http://inesserver2.windows.cin.ufpe.br:80/");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder5.setHealthCheckUrlsForDeser("http://hi!:80/Status", "unknown");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder10.setHomePageUrl("UNKNOWN", "INESSERVER2.WINDOWS.CIN.UFPE.BR:80");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setHomePageUrlForDeser("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setCountryId(52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder8.setStatusPageUrl("", "HI!");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setCountryId(7002);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager5 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo6 = applicationInfoManager5.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig8 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int9 = myDataCenterInstanceConfig8.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo10 = myDataCenterInstanceConfig8.getDataCenterInfo();
        java.lang.String str11 = myDataCenterInstanceConfig8.getNamespace();
        boolean boolean12 = myDataCenterInstanceConfig8.isNonSecurePortEnabled();
        applicationInfoManager5.config = myDataCenterInstanceConfig8;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig15 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int16 = myDataCenterInstanceConfig15.getLeaseRenewalIntervalInSeconds();
        int int17 = myDataCenterInstanceConfig15.getLeaseRenewalIntervalInSeconds();
        java.lang.String str18 = myDataCenterInstanceConfig15.getStatusPageUrlPath();
        applicationInfoManager5.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig15);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig21 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int22 = myDataCenterInstanceConfig21.getLeaseRenewalIntervalInSeconds();
        int int23 = myDataCenterInstanceConfig21.getLeaseRenewalIntervalInSeconds();
        java.lang.String str24 = myDataCenterInstanceConfig21.getStatusPageUrlPath();
        boolean boolean25 = myDataCenterInstanceConfig21.getSecurePortEnabled();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager26 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo27 = applicationInfoManager26.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig29 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int30 = myDataCenterInstanceConfig29.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo31 = myDataCenterInstanceConfig29.getDataCenterInfo();
        java.lang.String str32 = myDataCenterInstanceConfig29.getNamespace();
        boolean boolean33 = myDataCenterInstanceConfig29.isNonSecurePortEnabled();
        applicationInfoManager26.config = myDataCenterInstanceConfig29;
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig35 = applicationInfoManager26.config;
        com.netflix.appinfo.InstanceInfo instanceInfo36 = applicationInfoManager26.getInfo();
        com.netflix.appinfo.InstanceInfo instanceInfo37 = applicationInfoManager26.instanceInfo;
        com.netflix.appinfo.InstanceInfo.ActionType actionType38 = com.netflix.appinfo.InstanceInfo.ActionType.ADDED;
        instanceInfo37.setActionType(actionType38);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager40 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo41 = applicationInfoManager40.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig43 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int44 = myDataCenterInstanceConfig43.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo45 = myDataCenterInstanceConfig43.getDataCenterInfo();
        java.lang.String str46 = myDataCenterInstanceConfig43.getNamespace();
        boolean boolean47 = myDataCenterInstanceConfig43.isNonSecurePortEnabled();
        applicationInfoManager40.config = myDataCenterInstanceConfig43;
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig49 = applicationInfoManager40.config;
        com.netflix.appinfo.InstanceInfo instanceInfo50 = applicationInfoManager40.getInfo();
        com.netflix.appinfo.InstanceInfo instanceInfo51 = applicationInfoManager40.instanceInfo;
        com.netflix.appinfo.InstanceInfo.ActionType actionType52 = com.netflix.appinfo.InstanceInfo.ActionType.ADDED;
        instanceInfo51.setActionType(actionType52);
        instanceInfo37.setActionType(actionType52);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager55 = new com.netflix.appinfo.ApplicationInfoManager((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig21, instanceInfo37);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus57 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("inesserver2.windows.cin.ufpe.br:80");
        instanceInfo37.setOverriddenStatus(instanceStatus57);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus60 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("/Status");
        instanceInfo37.setOverriddenStatus(instanceStatus60);
        applicationInfoManager5.setInstanceStatus(instanceStatus60);
        com.netflix.appinfo.InstanceInfo.Builder builder63 = builder0.setStatus(instanceStatus60);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder66 = builder63.setHomePageUrl("/", "172.20.26.3");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setIPAddr("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setAppName("172.20.26.3");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setStatusPageUrlForDeser("http://hi!:97/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder12.setStatusPageUrl("http://inesserver2.windows.cin.ufpe.br:80/", "/STATUS");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setDataCenterInfo(dataCenterInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setVIPAddressDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder12.add("", "inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder12.setHomePageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder12.setAppName("http://inesserver2.windows.cin.ufpe.br:80/Status");
        com.netflix.appinfo.InstanceInfo instanceInfo22 = builder21.build();
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder21.setSecurePort((int) '4');
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder21.setVIPAddress("DEFAULT");
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder21.setHomePageUrlForDeser("http://hi!:80/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder31 = builder21.setStatusPageUrl("http://inesserver2.windows.cin.ufpe.br:80/", "http://inesserver2.windows.cin.ufpe.br:80/Status");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppName("http://inesserver2.windows.cin.ufpe.br:80/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSecureVIPAddressDeser("http://inesserver2.windows.cin.ufpe.br:80/");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setSID("HI!");
        boolean boolean7 = builder4.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder4.setHealthCheckUrlsForDeser("unknown", "http://inesserver2.windows.cin.ufpe.br:80/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder4.setHealthCheckUrls("INESSERVER2.WINDOWS.CIN.UFPE.BR:80", "DEFAULT", "HTTP://INESSERVER2.WINDOWS.CIN.UFPE.BR:80:80/STATUS");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder9.setHealthCheckUrlsForDeser("hi!", "");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setASGName("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder12.setHomePageUrl("HTTP://INESSERVER2.WINDOWS.CIN.UFPE.BR:80/", "http://inesserver2.windows.cin.ufpe.br:10/Status");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setIPAddr("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setVIPAddress("");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setHomePageUrlForDeser("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setSecureVIPAddress("inesserver2.windows.cin.ufpe.br:80");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder12.setHealthCheckUrls("eureka.", "HTTP://HI!:80/STATUS", "http:///HEALTHCHECK:80/Status");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setIPAddr("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setStatusPageUrlForDeser("default");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setHomePageUrlForDeser("");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager13 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo14 = applicationInfoManager13.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig16 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int17 = myDataCenterInstanceConfig16.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo18 = myDataCenterInstanceConfig16.getDataCenterInfo();
        java.lang.String str19 = myDataCenterInstanceConfig16.getNamespace();
        boolean boolean20 = myDataCenterInstanceConfig16.isNonSecurePortEnabled();
        applicationInfoManager13.config = myDataCenterInstanceConfig16;
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig22 = applicationInfoManager13.config;
        com.netflix.appinfo.InstanceInfo instanceInfo23 = applicationInfoManager13.getInfo();
        com.netflix.appinfo.InstanceInfo instanceInfo24 = applicationInfoManager13.instanceInfo;
        int int25 = instanceInfo24.getSecurePort();
        boolean boolean26 = instanceInfo24.isDirty();
        com.netflix.appinfo.InstanceInfo instanceInfo27 = new com.netflix.appinfo.InstanceInfo(instanceInfo24);
        com.netflix.appinfo.InstanceInfo instanceInfo28 = new com.netflix.appinfo.InstanceInfo(instanceInfo24);
        java.lang.String str29 = instanceInfo24.getAppGroupName();
        int int30 = instanceInfo24.getCountryId();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus31 = instanceInfo24.getStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder32 = builder12.setStatus(instanceStatus31);
        com.netflix.appinfo.InstanceInfo.Builder builder34 = builder12.setIPAddr("na");
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder12.add("/HEALTHCHECK", "HTTP://INESSERVER2.WINDOWS.CIN.UFPE.BR:80/");
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder37.setPort(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder42 = builder37.setStatusPageUrl("HTTP://HI!:35/STATUS", "inesserver2.windows.cin.ufpe.br:80");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setIPAddr("http://inesserver2.windows.cin.ufpe.br:80/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder0.setSecureVIPAddressDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setHomePageUrlForDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setVIPAddress("/healthcheck");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder12.setHomePageUrl("172.20.26.3", "HI!");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setSID("http://inesserver2.windows.cin.ufpe.br:80/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setHealthCheckUrlsForDeser("/", "default");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setStatusPageUrlForDeser("/");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setASGName("http://hi!:80/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setVIPAddressDeser("HI!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder15.setStatusPageUrl("INESSERVER2.WINDOWS.CIN.UFPE.BR", "HTTP://INESSERVER2.WINDOWS.CIN.UFPE.BR:80/STATUS");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setCountryId(7002);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder4.setHealthCheckUrlsForDeser("http://hi!:80/Status", "inesserver2.windows.cin.ufpe.br:80");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager8 = com.netflix.appinfo.ApplicationInfoManager.instance;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int11 = myDataCenterInstanceConfig10.getLeaseRenewalIntervalInSeconds();
        int int12 = myDataCenterInstanceConfig10.getLeaseRenewalIntervalInSeconds();
        applicationInfoManager8.config = myDataCenterInstanceConfig10;
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig14 = applicationInfoManager8.config;
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig15 = applicationInfoManager8.config;
        applicationInfoManager8.refreshDataCenterInfoIfRequired();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager17 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo18 = applicationInfoManager17.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig20 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int21 = myDataCenterInstanceConfig20.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo22 = myDataCenterInstanceConfig20.getDataCenterInfo();
        java.lang.String str23 = myDataCenterInstanceConfig20.getNamespace();
        boolean boolean24 = myDataCenterInstanceConfig20.isNonSecurePortEnabled();
        applicationInfoManager17.config = myDataCenterInstanceConfig20;
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig26 = applicationInfoManager17.config;
        com.netflix.appinfo.InstanceInfo instanceInfo27 = applicationInfoManager17.getInfo();
        com.netflix.appinfo.InstanceInfo instanceInfo28 = applicationInfoManager17.instanceInfo;
        int int29 = instanceInfo28.getSecurePort();
        boolean boolean30 = instanceInfo28.isDirty();
        com.netflix.appinfo.InstanceInfo instanceInfo31 = new com.netflix.appinfo.InstanceInfo(instanceInfo28);
        com.netflix.appinfo.InstanceInfo instanceInfo32 = new com.netflix.appinfo.InstanceInfo(instanceInfo28);
        java.lang.String str33 = instanceInfo28.getAppGroupName();
        int int34 = instanceInfo28.getCountryId();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus35 = instanceInfo28.getStatus();
        applicationInfoManager8.setInstanceStatus(instanceStatus35);
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder7.setOverriddenStatus(instanceStatus35);
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder37.setSecureVIPAddress("http:///:80/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder43 = builder39.setHealthCheckUrls("/STATUS", "http://inesserver2.windows.cin.ufpe.br:80:80/Status", "http://hi!:35/Status");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder3 = builder0.setHealthCheckUrlsForDeser("/healthcheck", "inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.setNamespace("/Status");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int8 = myDataCenterInstanceConfig7.getLeaseRenewalIntervalInSeconds();
        boolean boolean9 = myDataCenterInstanceConfig7.isInstanceEnabledOnit();
        java.lang.String str10 = myDataCenterInstanceConfig7.getStatusPageUrlPath();
        java.lang.String str11 = myDataCenterInstanceConfig7.getAppGroupName();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo12 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder5.setDataCenterInfo(dataCenterInfo12);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder14.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder14.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig21 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo22 = myDataCenterInstanceConfig21.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder20.setDataCenterInfo(dataCenterInfo22);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig24 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo25 = myDataCenterInstanceConfig24.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder20.setDataCenterInfo(dataCenterInfo25);
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder20.setNamespace("na");
        com.netflix.appinfo.InstanceInfo instanceInfo29 = builder20.build();
        int int30 = instanceInfo29.getSecurePort();
        boolean boolean31 = instanceInfo29.isDirty();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus32 = instanceInfo29.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder33 = builder13.setOverriddenStatus(instanceStatus32);
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder13.setHealthCheckUrlsForDeser("http://inesserver2.windows.cin.ufpe.br:80/Status", "/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder38 = builder13.setIPAddr("http://inesserver2.windows.cin.ufpe.br:80/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder42 = builder13.setHealthCheckUrls("http://http://inesserver2.windows.cin.ufpe.br:10/Status:80/Status", "default", "http:///:80/Status");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setIPAddr("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setStatusPageUrlForDeser("default");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setSecurePort((int) '4');
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setSecureVIPAddress("/HEALTHCHECK");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setVIPAddress("/HEALTHCHECK");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setStatusPageUrlForDeser("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder18.setStatusPageUrl("/healthcheck", "INESSERVER2.WINDOWS.CIN.UFPE.BR");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setIPAddr("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setStatusPageUrlForDeser("default");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setSecurePort((int) '4');
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setSecurePort((int) ' ');
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder14.add("/", "unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setStatusPageUrlForDeser("HTTP://HI!:80/STATUS");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setAppName("INESSERVER2.WINDOWS.CIN.UFPE.BR");
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setStatusPageUrlForDeser("INESSERVER2.WINDOWS.CIN.UFPE.BR");
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder21.setSecureVIPAddress("na");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder21.setHomePageUrl("", "");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setIPAddr("http://inesserver2.windows.cin.ufpe.br:80/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder0.setSecureVIPAddressDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setAppName("na");
        com.netflix.appinfo.InstanceInfo instanceInfo11 = builder8.build();
        com.netflix.appinfo.InstanceInfo instanceInfo12 = builder8.build();
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder8.setPort((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder14.setStatusPageUrl("INESSERVER2.WINDOWS.CIN.UFPE.BR:80", "http:///:80/Status");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo1 = applicationInfoManager0.instanceInfo;
        com.netflix.appinfo.InstanceInfo instanceInfo2 = applicationInfoManager0.getInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig4 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int5 = myDataCenterInstanceConfig4.getLeaseRenewalIntervalInSeconds();
        boolean boolean6 = myDataCenterInstanceConfig4.isInstanceEnabledOnit();
        java.lang.String str7 = myDataCenterInstanceConfig4.getStatusPageUrlPath();
        java.lang.String str8 = myDataCenterInstanceConfig4.getStatusPageUrl();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo9 = myDataCenterInstanceConfig4.getDataCenterInfo();
        int int10 = myDataCenterInstanceConfig4.getLeaseExpirationDurationInSeconds();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = myDataCenterInstanceConfig4.getMetadataMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.registerAppMetadata(strMap11);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setIPAddr("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setVIPAddress("");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setHomePageUrlForDeser("inesserver2.windows.cin.ufpe.br");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder10.setHomePageUrl("HTTP://HI!:35/STATUS", "");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setIPAddr("");
        boolean boolean9 = builder6.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder6.setVIPAddress("na");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setAppGroupName("unknown");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder13.setHealthCheckUrls("", "NA", "HI!");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setDataCenterInfo(dataCenterInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder6.setNamespace("na");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder6.add("unknown", "UNKNOWN");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager18 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo19 = applicationInfoManager18.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig21 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int22 = myDataCenterInstanceConfig21.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo23 = myDataCenterInstanceConfig21.getDataCenterInfo();
        java.lang.String str24 = myDataCenterInstanceConfig21.getNamespace();
        boolean boolean25 = myDataCenterInstanceConfig21.isNonSecurePortEnabled();
        applicationInfoManager18.config = myDataCenterInstanceConfig21;
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig27 = applicationInfoManager18.config;
        com.netflix.appinfo.InstanceInfo instanceInfo28 = applicationInfoManager18.getInfo();
        com.netflix.appinfo.InstanceInfo instanceInfo29 = applicationInfoManager18.instanceInfo;
        int int30 = instanceInfo29.getSecurePort();
        int int31 = instanceInfo29.getPort();
        int int32 = instanceInfo29.getCountryId();
        boolean boolean33 = instanceInfo29.isDirty();
        int int34 = instanceInfo29.getPort();
        java.lang.String str35 = instanceInfo29.getStatusPageUrl();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager36 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo37 = applicationInfoManager36.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig39 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int40 = myDataCenterInstanceConfig39.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo41 = myDataCenterInstanceConfig39.getDataCenterInfo();
        java.lang.String str42 = myDataCenterInstanceConfig39.getNamespace();
        boolean boolean43 = myDataCenterInstanceConfig39.isNonSecurePortEnabled();
        applicationInfoManager36.config = myDataCenterInstanceConfig39;
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig45 = applicationInfoManager36.config;
        com.netflix.appinfo.InstanceInfo instanceInfo46 = applicationInfoManager36.getInfo();
        com.netflix.appinfo.InstanceInfo instanceInfo47 = applicationInfoManager36.instanceInfo;
        int int48 = instanceInfo47.getSecurePort();
        com.netflix.appinfo.InstanceInfo.PortType portType49 = com.netflix.appinfo.InstanceInfo.PortType.SECURE;
        boolean boolean50 = instanceInfo47.isPortEnabled(portType49);
        boolean boolean51 = instanceInfo29.isPortEnabled(portType49);
        com.netflix.appinfo.InstanceInfo.Builder builder53 = builder6.enablePort(portType49, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder56 = builder53.setStatusPageUrl("http://hi!:80/Status", "http://hi!:80/Status");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setCountryId(7002);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder0.setHealthCheckUrlsForDeser("UNKNOWN", "UNKNOWN");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setStatusPageUrlForDeser("http://hi!:80/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder7.setPort((int) (byte) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setIPAddr("HTTP://INESSERVER2.WINDOWS.CIN.UFPE.BR:80/STATUS");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setLastDirtyTimestamp(1636106082701L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder13.setStatusPageUrl("http://inesserver2.windows.cin.ufpe.br:80/", "");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setDataCenterInfo(dataCenterInfo11);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus14 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("na");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder6.setStatus(instanceStatus14);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder6.setVIPAddress("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder6.setHomePageUrl("/", "UNKNOWN");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setDataCenterInfo(dataCenterInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder6.setSecureVIPAddressDeser("http://inesserver2.windows.cin.ufpe.br:80/Status");
        com.netflix.appinfo.InstanceInfo instanceInfo15 = builder6.build();
        instanceInfo15.setSID("na");
        long long18 = instanceInfo15.getLastUpdatedTimestamp();
        com.netflix.appinfo.InstanceInfo instanceInfo19 = new com.netflix.appinfo.InstanceInfo(instanceInfo15);
        com.netflix.appinfo.InstanceInfo.Builder builder20 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder20.setHomePageUrl("http://hi!:97/Status", "default");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setAppName("http://inesserver2.windows.cin.ufpe.br:80/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setSecureVIPAddressDeser("http://inesserver2.windows.cin.ufpe.br:80/");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setAppGroupName("na");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setVIPAddressDeser("default");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder8.setStatusPageUrl("http://inesserver2.windows.cin.ufpe.br:80/Status", "default");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setDataCenterInfo(dataCenterInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder6.setNamespace("na");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder6.add("unknown", "UNKNOWN");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder6.setSecureVIPAddressDeser("default");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setVIPAddress("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder19.setASGName("");
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder23.setSID("DEFAULT");
        com.netflix.appinfo.InstanceInfo instanceInfo26 = builder25.getRawInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder25.setStatusPageUrl("inesserver2.windows.cin.ufpe.br:80", "HI!");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setDataCenterInfo(dataCenterInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setVIPAddressDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setAppGroupName("DEFAULT");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder16.setStatusPageUrl("NA", "/healthcheck");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setIPAddr("");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setStatusPageUrlForDeser("default");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setHomePageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder8.setCountryId((-1));
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder8.setAppName("na");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder16.setHealthCheckUrls("HTTP://INESSERVER2.WINDOWS.CIN.UFPE.BR:10/STATUS", "DEFAULT", "UNKNOWN");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo instanceInfo5 = builder0.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder0.add("http://inesserver2.windows.cin.ufpe.br:10/Status", "inesserver2.windows.cin.ufpe.br");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder0.setHomePageUrl("UNKNOWN", "http://http://inesserver2.windows.cin.ufpe.br:80/Status:80/Status");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setIPAddr("");
        boolean boolean9 = builder6.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder6.setVIPAddress("na");
        com.netflix.appinfo.InstanceInfo instanceInfo12 = builder6.build();
        com.netflix.appinfo.InstanceInfo instanceInfo13 = builder6.build();
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder6.setVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager16 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo17 = applicationInfoManager16.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig19 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int20 = myDataCenterInstanceConfig19.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo21 = myDataCenterInstanceConfig19.getDataCenterInfo();
        java.lang.String str22 = myDataCenterInstanceConfig19.getNamespace();
        boolean boolean23 = myDataCenterInstanceConfig19.isNonSecurePortEnabled();
        applicationInfoManager16.config = myDataCenterInstanceConfig19;
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig25 = applicationInfoManager16.config;
        com.netflix.appinfo.InstanceInfo instanceInfo26 = applicationInfoManager16.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig29 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int30 = myDataCenterInstanceConfig29.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo31 = myDataCenterInstanceConfig29.getDataCenterInfo();
        java.lang.String str33 = myDataCenterInstanceConfig29.getHostName(true);
        com.netflix.appinfo.DataCenterInfo dataCenterInfo34 = myDataCenterInstanceConfig29.getDataCenterInfo();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig35 = new com.netflix.appinfo.MyDataCenterInstanceConfig("inesserver2.windows.cin.ufpe.br:80", dataCenterInfo34);
        java.lang.String str36 = myDataCenterInstanceConfig35.getSecureHealthCheckUrl();
        java.util.Map<java.lang.String, java.lang.String> strMap37 = myDataCenterInstanceConfig35.getMetadataMap();
        applicationInfoManager16.registerAppMetadata(strMap37);
        com.netflix.appinfo.InstanceInfo instanceInfo39 = applicationInfoManager16.instanceInfo;
        java.lang.String str40 = instanceInfo39.getStatusPageUrl();
        instanceInfo39.setSID("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager43 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo44 = applicationInfoManager43.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig46 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int47 = myDataCenterInstanceConfig46.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo48 = myDataCenterInstanceConfig46.getDataCenterInfo();
        java.lang.String str49 = myDataCenterInstanceConfig46.getNamespace();
        boolean boolean50 = myDataCenterInstanceConfig46.isNonSecurePortEnabled();
        applicationInfoManager43.config = myDataCenterInstanceConfig46;
        com.netflix.appinfo.EurekaInstanceConfig eurekaInstanceConfig52 = applicationInfoManager43.config;
        com.netflix.appinfo.InstanceInfo instanceInfo53 = applicationInfoManager43.getInfo();
        com.netflix.appinfo.InstanceInfo instanceInfo54 = applicationInfoManager43.instanceInfo;
        com.netflix.appinfo.InstanceInfo.ActionType actionType55 = com.netflix.appinfo.InstanceInfo.ActionType.ADDED;
        instanceInfo54.setActionType(actionType55);
        java.lang.String str57 = instanceInfo54.getVersion();
        java.lang.String str58 = instanceInfo54.getIPAddr();
        instanceInfo54.setLastUpdatedTimestamp();
        instanceInfo54.setSID("http://hi!:80/Status");
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus62 = instanceInfo54.getOverriddenStatus();
        instanceInfo39.setStatusWithoutDirty(instanceStatus62);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus64 = instanceInfo39.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder65 = builder6.setStatus(instanceStatus64);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder69 = builder65.setHealthCheckUrls("", "http://http://inesserver2.windows.cin.ufpe.br:10/Status:80/Status", "http://inesserver2.windows.cin.ufpe.br:80/");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo instanceInfo5 = builder0.build();
        boolean boolean6 = builder0.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder0.setNamespace("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setASGName("inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo instanceInfo11 = builder8.getRawInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder8.setHomePageUrl("eureka.", "hi!");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setCountryId(7002);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setSecurePort((int) (byte) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setIPAddr("/");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setASGName("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder8.setHealthCheckUrls("UNKNOWN", "http://http://inesserver2.windows.cin.ufpe.br:10/Status:80/Status", "INESSERVER2.WINDOWS.CIN.UFPE.BR");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder6.setHostName("172.20.26.3");
        com.netflix.appinfo.InstanceInfo instanceInfo12 = builder11.getRawInstance();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = instanceInfo12.getMetadata();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo14 = instanceInfo12.getDataCenterInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        instanceInfo12.setIsCoordinatingDiscoveryServer();
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setDataCenterInfo(dataCenterInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setVIPAddressDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder16.add("na", "/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder16.setCountryId((int) (short) -1);
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder16.setHealthCheckUrlsForDeser("172.20.26.3", "");
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder24.setNamespace("HTTP://INESSERVER2.WINDOWS.CIN.UFPE.BR:80/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder29 = builder24.setHomePageUrl("inesserver2.windows.cin.ufpe.br", "http:///HEALTHCHECK:80/Status");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setDataCenterInfo(dataCenterInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setVIPAddressDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setSecureVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder16.add("na", "/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder16.setCountryId((int) (short) -1);
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder16.setSecurePort((int) (short) 0);
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder16.setVIPAddress("172.20.26.3");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager26 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo27 = applicationInfoManager26.instanceInfo;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig29 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int30 = myDataCenterInstanceConfig29.getLeaseRenewalIntervalInSeconds();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo31 = myDataCenterInstanceConfig29.getDataCenterInfo();
        java.lang.String str32 = myDataCenterInstanceConfig29.getNamespace();
        boolean boolean33 = myDataCenterInstanceConfig29.isNonSecurePortEnabled();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo34 = myDataCenterInstanceConfig29.getDataCenterInfo();
        applicationInfoManager26.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig29);
        boolean boolean36 = myDataCenterInstanceConfig29.getSecurePortEnabled();
        java.lang.String str37 = myDataCenterInstanceConfig29.getSecureHealthCheckUrl();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo38 = myDataCenterInstanceConfig29.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder25.setDataCenterInfo(dataCenterInfo38);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder42 = builder25.setHomePageUrl("", "INESSERVER2.WINDOWS.CIN.UFPE.BR");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setDataCenterInfo(dataCenterInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setVIPAddressDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder12.add("", "inesserver2.windows.cin.ufpe.br");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder12.setHomePageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder12.setAppName("http://inesserver2.windows.cin.ufpe.br:80/Status");
        com.netflix.appinfo.InstanceInfo instanceInfo22 = builder21.build();
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder21.setSecurePort((int) '4');
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder24.setAppName("http:///:80/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder24.setSecureVIPAddressDeser("http://hi!:35/Status");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager29 = com.netflix.appinfo.ApplicationInfoManager.instance;
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig31 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        int int32 = myDataCenterInstanceConfig31.getLeaseRenewalIntervalInSeconds();
        int int33 = myDataCenterInstanceConfig31.getLeaseRenewalIntervalInSeconds();
        applicationInfoManager29.config = myDataCenterInstanceConfig31;
        java.lang.String str35 = myDataCenterInstanceConfig31.getIpAddress();
        java.lang.String str36 = myDataCenterInstanceConfig31.getHealthCheckUrl();
        java.lang.String str37 = myDataCenterInstanceConfig31.getStatusPageUrl();
        java.lang.String str38 = myDataCenterInstanceConfig31.getIpAddress();
        int int39 = myDataCenterInstanceConfig31.getSecurePort();
        java.lang.String str40 = myDataCenterInstanceConfig31.getSecureHealthCheckUrl();
        java.util.Map<java.lang.String, java.lang.String> strMap41 = myDataCenterInstanceConfig31.getMetadataMap();
        com.netflix.appinfo.InstanceInfo.Builder builder42 = builder28.setMetadata(strMap41);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder45 = builder42.setStatusPageUrl("http:///:80/Status", "na");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setNamespace("unknown");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder2.setHomePageUrl("na", "unknown");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setAppGroupName("/");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig7 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo8 = myDataCenterInstanceConfig7.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder6.setDataCenterInfo(dataCenterInfo8);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig10 = new com.netflix.appinfo.MyDataCenterInstanceConfig();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo11 = myDataCenterInstanceConfig10.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder6.setDataCenterInfo(dataCenterInfo11);
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setVIPAddressDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder14.setAppGroupName("");
        boolean boolean17 = builder14.isInitialized();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder14.setHealthCheckUrls("HTTP://INESSERVER2.WINDOWS.CIN.UFPE.BR:80/STATUS", "UNKNOWN", "http://inesserver2.windows.cin.ufpe.br:10/Status");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setSecureVIPAddressDeser("/healthcheck");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppName("default");
        com.netflix.appinfo.InstanceInfo instanceInfo5 = builder0.build();
        boolean boolean6 = builder0.isInitialized();
        com.netflix.appinfo.InstanceInfo instanceInfo7 = builder0.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder0.setSID("/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder0.setHealthCheckUrls("http:///HEALTHCHECK:80/Status", "default", "/healthcheck");
    }
}

