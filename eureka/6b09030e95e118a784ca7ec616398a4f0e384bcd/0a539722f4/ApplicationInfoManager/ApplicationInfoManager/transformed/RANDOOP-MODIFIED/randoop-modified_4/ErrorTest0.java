import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = new com.netflix.appinfo.ApplicationInfoManager();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.refreshDataCenterInfoIfRequired();
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = com.netflix.appinfo.ApplicationInfoManager.instance;
        com.netflix.appinfo.InstanceInfo instanceInfo1 = applicationInfoManager0.instanceInfo;
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus3 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("inesserver2.windows.cin.ufpe.br");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        applicationInfoManager0.setInstanceStatus(instanceStatus3);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setVIPAddress("na");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder5 = builder0.setHomePageUrl("/", "na");
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = com.netflix.appinfo.ApplicationInfoManager.instance;
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus2 = com.netflix.appinfo.InstanceInfo.InstanceStatus.toEnum("172.20.26.3");
        applicationInfoManager0.setInstanceStatus(instanceStatus2);
        com.netflix.appinfo.InstanceInfo instanceInfo4 = applicationInfoManager0.instanceInfo;
        com.netflix.appinfo.LeaseInfo leaseInfo5 = instanceInfo4.getLeaseInfo();
        com.netflix.appinfo.InstanceInfo instanceInfo6 = new com.netflix.appinfo.InstanceInfo(instanceInfo4);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo4);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder7.add("unknown", "na");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder10.setStatusPageUrl("inesserver2.windows.cin.ufpe.br", "/");
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = com.netflix.appinfo.ApplicationInfoManager.instance;
        com.netflix.appinfo.InstanceInfo instanceInfo1 = applicationInfoManager0.instanceInfo;
        int int2 = instanceInfo1.getPort();
        com.netflix.appinfo.InstanceInfo instanceInfo3 = new com.netflix.appinfo.InstanceInfo(instanceInfo1);
        com.netflix.appinfo.InstanceInfo instanceInfo4 = new com.netflix.appinfo.InstanceInfo(instanceInfo1);
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = instanceInfo4.getActionType();
        com.netflix.appinfo.InstanceInfo instanceInfo6 = new com.netflix.appinfo.InstanceInfo(instanceInfo4);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo4);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setHealthCheckUrls("/Status", "http://inesserver2.windows.cin.ufpe.br:80/Status", "hi!");
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        java.lang.String[] strArray5 = new java.lang.String[] { "na", "eureka.", "inesserver2.windows.cin.ufpe.br:80", "/Status", "http://inesserver2.windows.cin.ufpe.br:80/" };
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager6 = com.netflix.appinfo.ApplicationInfoManager.instance;
        com.netflix.appinfo.InstanceInfo instanceInfo7 = applicationInfoManager6.getInfo();
        java.lang.String str8 = instanceInfo7.getIPAddr();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus9 = instanceInfo7.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo instanceInfo10 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        com.netflix.appinfo.InstanceInfo instanceInfo11 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        java.util.Map<java.lang.String, java.lang.String> strMap12 = instanceInfo7.getMetadata();
        int int13 = instanceInfo7.getCountryId();
        com.netflix.appinfo.InstanceInfo instanceInfo14 = new com.netflix.appinfo.InstanceInfo(instanceInfo7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = com.netflix.appinfo.InstanceInfo.getZone(strArray5, instanceInfo14);
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test7");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = com.netflix.appinfo.ApplicationInfoManager.instance;
        com.netflix.appinfo.InstanceInfo instanceInfo1 = applicationInfoManager0.instanceInfo;
        int int2 = instanceInfo1.getPort();
        com.netflix.appinfo.InstanceInfo instanceInfo3 = new com.netflix.appinfo.InstanceInfo(instanceInfo1);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder7 = builder4.setHomePageUrl("unknown", "http://inesserver2.windows.cin.ufpe.br:80/");
    }

    @Test
    public void test8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test8");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager0 = com.netflix.appinfo.ApplicationInfoManager.instance;
        com.netflix.appinfo.InstanceInfo instanceInfo1 = applicationInfoManager0.getInfo();
        java.lang.String str2 = instanceInfo1.getIPAddr();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus3 = instanceInfo1.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo instanceInfo4 = new com.netflix.appinfo.InstanceInfo(instanceInfo1);
        com.netflix.appinfo.InstanceInfo instanceInfo5 = new com.netflix.appinfo.InstanceInfo(instanceInfo1);
        java.lang.String str6 = instanceInfo1.getASGName();
        com.netflix.appinfo.InstanceInfo.Builder builder7 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo1);
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setIPAddr("unknown");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder7.setHomePageUrl("/", "default");
    }
}

