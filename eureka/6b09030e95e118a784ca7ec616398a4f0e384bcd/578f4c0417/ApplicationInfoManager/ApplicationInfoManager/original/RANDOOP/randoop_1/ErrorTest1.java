import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test501");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus1 = com.netflix.appinfo.InstanceInfo.InstanceStatus.UNKNOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setOverriddenStatus(instanceStatus1);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setVIPAddressDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder2.setStatusPageUrlForDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder9 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo instanceInfo12 = builder9.getRawInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo13 = new com.netflix.appinfo.InstanceInfo(instanceInfo12);
        java.lang.String str14 = instanceInfo12.getIPAddr();
        java.util.Set<java.lang.String> strSet15 = instanceInfo12.getHealthCheckUrls();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = instanceInfo12.getMetadata();
        java.lang.Long long17 = instanceInfo12.isDirtyWithTime();
        java.lang.Long long18 = instanceInfo12.isDirtyWithTime();
        instanceInfo12.setIsDirty();
        com.netflix.appinfo.InstanceInfo.Builder builder20 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder20.setVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder20.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder25 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus26 = com.netflix.appinfo.InstanceInfo.InstanceStatus.UNKNOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder25.setOverriddenStatus(instanceStatus26);
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder24.setStatus(instanceStatus26);
        instanceInfo12.setOverriddenStatus(instanceStatus26);
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder2.setOverriddenStatus(instanceStatus26);
        com.netflix.appinfo.InstanceInfo.Builder builder33 = builder2.add("inesserver2.windows.cin.ufpe.br:80", "na");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder33.setHomePageUrl("UNKNOWN", "/Status");
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus1 = com.netflix.appinfo.InstanceInfo.InstanceStatus.UNKNOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setOverriddenStatus(instanceStatus1);
        com.netflix.appinfo.InstanceInfo.ActionType actionType3 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setActionType(actionType3);
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setVIPAddressDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder7 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder7.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setSecurePort(100);
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder11.setSecurePort((int) (short) 0);
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder15.setAppGroupName("");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig19 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean20 = myDataCenterInstanceConfig19.getSecurePortEnabled();
        boolean boolean21 = myDataCenterInstanceConfig19.isNonSecurePortEnabled();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo22 = myDataCenterInstanceConfig19.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder15.setDataCenterInfo(dataCenterInfo22);
        com.netflix.appinfo.InstanceInfo.Builder builder24 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder26 = builder24.setVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo instanceInfo27 = builder24.getRawInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo28 = new com.netflix.appinfo.InstanceInfo(instanceInfo27);
        com.netflix.appinfo.LeaseInfo leaseInfo29 = instanceInfo27.getLeaseInfo();
        com.netflix.appinfo.InstanceInfo.ActionType actionType30 = instanceInfo27.getActionType();
        java.util.Map<java.lang.String, java.lang.String> strMap31 = instanceInfo27.getMetadata();
        com.netflix.appinfo.InstanceInfo.Builder builder32 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder34 = builder32.setVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder32.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder38 = builder36.setSecurePort(100);
        com.netflix.appinfo.InstanceInfo.Builder builder40 = builder38.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder41 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder43 = builder41.setVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo instanceInfo44 = builder41.getRawInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo45 = new com.netflix.appinfo.InstanceInfo(instanceInfo44);
        com.netflix.appinfo.LeaseInfo leaseInfo46 = instanceInfo44.getLeaseInfo();
        com.netflix.appinfo.InstanceInfo.ActionType actionType47 = instanceInfo44.getActionType();
        java.lang.String str48 = instanceInfo44.getVIPAddress();
        java.lang.Long long49 = instanceInfo44.isDirtyWithTime();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager50 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo51 = applicationInfoManager50.getInfo();
        java.lang.String str52 = instanceInfo51.getSecureVipAddress();
        com.netflix.appinfo.InstanceInfo.ActionType actionType53 = instanceInfo51.getActionType();
        instanceInfo51.setLastUpdatedTimestamp();
        com.netflix.appinfo.LeaseInfo leaseInfo55 = instanceInfo51.getLeaseInfo();
        instanceInfo44.setLeaseInfo(leaseInfo55);
        com.netflix.appinfo.InstanceInfo.Builder builder57 = builder38.setLeaseInfo(leaseInfo55);
        instanceInfo27.setLeaseInfo(leaseInfo55);
        com.netflix.appinfo.InstanceInfo.Builder builder59 = builder23.setLeaseInfo(leaseInfo55);
        com.netflix.appinfo.InstanceInfo.Builder builder60 = builder0.setLeaseInfo(leaseInfo55);
        com.netflix.appinfo.InstanceInfo.Builder builder62 = builder60.setIsCoordinatingDiscoveryServer(false);
        com.netflix.appinfo.InstanceInfo.Builder builder64 = builder60.setIPAddr("/");
        com.netflix.appinfo.InstanceInfo.Builder builder66 = builder60.setIsCoordinatingDiscoveryServer(true);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager67 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        applicationInfoManager67.refreshDataCenterInfoIfRequired();
        com.netflix.appinfo.InstanceInfo.Builder builder69 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder71 = builder69.setVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo instanceInfo72 = builder69.getRawInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo73 = new com.netflix.appinfo.InstanceInfo(instanceInfo72);
        java.lang.String str74 = instanceInfo72.getIPAddr();
        java.util.Set<java.lang.String> strSet75 = instanceInfo72.getHealthCheckUrls();
        java.util.Map<java.lang.String, java.lang.String> strMap76 = instanceInfo72.getMetadata();
        applicationInfoManager67.registerAppMetadata(strMap76);
        com.netflix.appinfo.InstanceInfo instanceInfo78 = applicationInfoManager67.getInfo();
        instanceInfo78.setSID("/Status");
        java.lang.Long long81 = instanceInfo78.getLastDirtyTimestamp();
        java.lang.String str82 = instanceInfo78.getHostName();
        java.lang.String str83 = instanceInfo78.getSID();
        com.netflix.appinfo.LeaseInfo leaseInfo84 = instanceInfo78.getLeaseInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder85 = builder66.setLeaseInfo(leaseInfo84);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder89 = builder85.setHealthCheckUrls("", "", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder0.setIsCoordinatingDiscoveryServer(false);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setSecurePort((int) ' ');
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setLastUpdatedTimestamp(0L);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setAppGroupName("http://inesserver2.windows.cin.ufpe.br:80/Status");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder12.setHealthCheckUrls("http://inesserver2.windows.cin.ufpe.br:80/Status", "/Status", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager2 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo3 = applicationInfoManager2.getInfo();
        java.lang.String str4 = instanceInfo3.getSecureVipAddress();
        com.netflix.appinfo.InstanceInfo.ActionType actionType5 = instanceInfo3.getActionType();
        instanceInfo3.setLastUpdatedTimestamp();
        com.netflix.appinfo.LeaseInfo leaseInfo7 = instanceInfo3.getLeaseInfo();
        com.netflix.appinfo.LeaseInfo leaseInfo8 = instanceInfo3.getLeaseInfo();
        java.util.Set<java.lang.String> strSet9 = instanceInfo3.getHealthCheckUrls();
        java.lang.String str10 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo3);
        com.netflix.appinfo.InstanceInfo.Builder builder11 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo instanceInfo14 = builder11.getRawInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo15 = new com.netflix.appinfo.InstanceInfo(instanceInfo14);
        com.netflix.appinfo.LeaseInfo leaseInfo16 = instanceInfo14.getLeaseInfo();
        com.netflix.appinfo.InstanceInfo.ActionType actionType17 = instanceInfo14.getActionType();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = instanceInfo14.getMetadata();
        com.netflix.appinfo.InstanceInfo.Builder builder19 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder19.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder23.setSecurePort(100);
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder25.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder28 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder28.setVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo instanceInfo31 = builder28.getRawInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo32 = new com.netflix.appinfo.InstanceInfo(instanceInfo31);
        com.netflix.appinfo.LeaseInfo leaseInfo33 = instanceInfo31.getLeaseInfo();
        com.netflix.appinfo.InstanceInfo.ActionType actionType34 = instanceInfo31.getActionType();
        java.lang.String str35 = instanceInfo31.getVIPAddress();
        java.lang.Long long36 = instanceInfo31.isDirtyWithTime();
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager37 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo38 = applicationInfoManager37.getInfo();
        java.lang.String str39 = instanceInfo38.getSecureVipAddress();
        com.netflix.appinfo.InstanceInfo.ActionType actionType40 = instanceInfo38.getActionType();
        instanceInfo38.setLastUpdatedTimestamp();
        com.netflix.appinfo.LeaseInfo leaseInfo42 = instanceInfo38.getLeaseInfo();
        instanceInfo31.setLeaseInfo(leaseInfo42);
        com.netflix.appinfo.InstanceInfo.Builder builder44 = builder25.setLeaseInfo(leaseInfo42);
        instanceInfo14.setLeaseInfo(leaseInfo42);
        com.netflix.appinfo.InstanceInfo.Builder builder46 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus47 = com.netflix.appinfo.InstanceInfo.InstanceStatus.UNKNOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder48 = builder46.setOverriddenStatus(instanceStatus47);
        com.netflix.appinfo.InstanceInfo.Builder builder50 = builder48.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder52 = builder48.setVIPAddressDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder54 = builder52.setNamespace("hi!");
        com.netflix.appinfo.InstanceInfo.ActionType actionType55 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder56 = builder54.setActionType(actionType55);
        instanceInfo14.setActionType(actionType55);
        instanceInfo14.setIsCoordinatingDiscoveryServer();
        int int59 = instanceInfo14.getSecurePort();
        java.lang.Long long60 = instanceInfo14.isDirtyWithTime();
        instanceInfo14.setIsDirty();
        com.netflix.appinfo.InstanceInfo.Builder builder62 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder64 = builder62.setVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder66 = builder62.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder68 = builder66.setSecurePort(100);
        com.netflix.appinfo.InstanceInfo.Builder builder70 = builder66.setSecurePort((int) (short) 0);
        com.netflix.appinfo.InstanceInfo.Builder builder72 = builder70.setAppGroupName("");
        com.netflix.appinfo.InstanceInfo.Builder builder73 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder75 = builder73.setVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder77 = builder73.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder79 = builder77.setSecurePort(100);
        com.netflix.appinfo.InstanceInfo.Builder builder81 = builder77.setSecurePort((int) (short) 0);
        com.netflix.appinfo.InstanceInfo.PortType portType82 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        com.netflix.appinfo.InstanceInfo.Builder builder84 = builder81.enablePort(portType82, false);
        com.netflix.appinfo.InstanceInfo.Builder builder86 = builder70.enablePort(portType82, true);
        com.netflix.appinfo.InstanceInfo.Builder builder88 = builder70.setNamespace("/Status");
        com.netflix.appinfo.InstanceInfo instanceInfo89 = builder70.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder91 = builder70.setPort(90);
        com.netflix.appinfo.InstanceInfo.Builder builder93 = builder91.setAppName("default");
        boolean boolean94 = instanceInfo14.equals((java.lang.Object) builder91);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str95 = com.netflix.appinfo.InstanceInfo.getZone(strArray1, instanceInfo14);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo instanceInfo3 = builder0.getRawInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo4 = new com.netflix.appinfo.InstanceInfo(instanceInfo3);
        com.netflix.appinfo.LeaseInfo leaseInfo5 = instanceInfo3.getLeaseInfo();
        com.netflix.appinfo.InstanceInfo.ActionType actionType6 = instanceInfo3.getActionType();
        java.lang.String str7 = instanceInfo3.getVIPAddress();
        java.lang.String str8 = instanceInfo3.getSecureVipAddress();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus10 = com.netflix.appinfo.InstanceInfo.InstanceStatus.UNKNOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder9.setOverriddenStatus(instanceStatus10);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder11.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder11.setVIPAddressDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder16.setVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo instanceInfo19 = builder16.getRawInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo20 = new com.netflix.appinfo.InstanceInfo(instanceInfo19);
        java.lang.String str21 = instanceInfo19.getIPAddr();
        java.util.Set<java.lang.String> strSet22 = instanceInfo19.getHealthCheckUrls();
        instanceInfo19.setSID("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder25 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder27 = builder25.setVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo instanceInfo28 = builder25.getRawInstance();
        java.lang.String str29 = instanceInfo28.getIPAddr();
        int int30 = instanceInfo28.getCountryId();
        com.netflix.appinfo.InstanceInfo instanceInfo31 = new com.netflix.appinfo.InstanceInfo(instanceInfo28);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager32 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo33 = applicationInfoManager32.getInfo();
        java.lang.String str34 = instanceInfo33.getSecureVipAddress();
        com.netflix.appinfo.InstanceInfo.ActionType actionType35 = instanceInfo33.getActionType();
        instanceInfo33.setLastUpdatedTimestamp();
        com.netflix.appinfo.LeaseInfo leaseInfo37 = instanceInfo33.getLeaseInfo();
        instanceInfo28.setLeaseInfo(leaseInfo37);
        instanceInfo19.setLeaseInfo(leaseInfo37);
        com.netflix.appinfo.InstanceInfo.Builder builder40 = builder15.setLeaseInfo(leaseInfo37);
        boolean boolean41 = instanceInfo3.equals((java.lang.Object) builder15);
        com.netflix.appinfo.InstanceInfo.Builder builder43 = builder15.setASGName("UNKNOWN");
        com.netflix.appinfo.InstanceInfo.Builder builder46 = builder15.add("", "/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder48 = builder46.setHomePageUrlForDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder50 = builder46.setAppName("na");
        com.netflix.appinfo.InstanceInfo.Builder builder52 = builder46.setIsCoordinatingDiscoveryServer(true);
        com.netflix.appinfo.InstanceInfo.Builder builder53 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder55 = builder53.setVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo instanceInfo56 = builder53.getRawInstance();
        java.lang.String str57 = instanceInfo56.getAppName();
        com.netflix.appinfo.InstanceInfo instanceInfo58 = new com.netflix.appinfo.InstanceInfo(instanceInfo56);
        instanceInfo58.setIsCoordinatingDiscoveryServer();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus60 = instanceInfo58.getOverriddenStatus();
        com.netflix.appinfo.InstanceInfo.Builder builder61 = builder52.setStatus(instanceStatus60);
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus62 = com.netflix.appinfo.InstanceInfo.InstanceStatus.UNKNOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder63 = builder52.setOverriddenStatus(instanceStatus62);
        com.netflix.appinfo.InstanceInfo.Builder builder65 = builder52.setCountryId(7001);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder68 = builder52.setHomePageUrl("http://inesserver2.windows.cin.ufpe.br:80/Status", "inesserver2.windows.cin.ufpe.br");
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus1 = com.netflix.appinfo.InstanceInfo.InstanceStatus.UNKNOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setOverriddenStatus(instanceStatus1);
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder2.setStatusPageUrlForDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder2.setVIPAddressDeser("");
        boolean boolean7 = builder2.isInitialized();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder2.setNamespace("");
        com.netflix.appinfo.InstanceInfo.Builder builder11 = builder2.setAppGroupName("/");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder14 = builder12.setVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo instanceInfo15 = builder12.getRawInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo16 = new com.netflix.appinfo.InstanceInfo(instanceInfo15);
        java.lang.String str17 = instanceInfo15.getIPAddr();
        java.util.Set<java.lang.String> strSet18 = instanceInfo15.getHealthCheckUrls();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = instanceInfo15.getMetadata();
        com.netflix.appinfo.InstanceInfo.Builder builder20 = builder2.setMetadata(strMap19);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo instanceInfo24 = builder21.getRawInstance();
        java.lang.String str25 = instanceInfo24.getAppName();
        com.netflix.appinfo.InstanceInfo instanceInfo26 = new com.netflix.appinfo.InstanceInfo(instanceInfo24);
        java.lang.String str27 = instanceInfo24.getHostName();
        java.lang.Long long28 = instanceInfo24.getLastDirtyTimestamp();
        instanceInfo24.unsetIsDirty((long) 100);
        com.netflix.appinfo.InstanceInfo.Builder builder31 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus32 = com.netflix.appinfo.InstanceInfo.InstanceStatus.UNKNOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder33 = builder31.setOverriddenStatus(instanceStatus32);
        com.netflix.appinfo.InstanceInfo.ActionType actionType34 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder35 = builder31.setActionType(actionType34);
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder31.setVIPAddressDeser("");
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder37.setAppName("http://inesserver2.windows.cin.ufpe.br:80/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder40 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder42 = builder40.setVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder44 = builder40.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder46 = builder44.setSecurePort(100);
        com.netflix.appinfo.InstanceInfo.Builder builder48 = builder44.setHostName("");
        com.netflix.appinfo.InstanceInfo.Builder builder50 = builder48.setSecurePort((int) '4');
        com.netflix.appinfo.InstanceInfo.Builder builder52 = builder50.setASGName("unknown");
        com.netflix.appinfo.InstanceInfo.Builder builder53 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus54 = com.netflix.appinfo.InstanceInfo.InstanceStatus.UNKNOWN;
        com.netflix.appinfo.InstanceInfo.Builder builder55 = builder53.setOverriddenStatus(instanceStatus54);
        com.netflix.appinfo.InstanceInfo.ActionType actionType56 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder57 = builder53.setActionType(actionType56);
        com.netflix.appinfo.InstanceInfo.Builder builder58 = builder52.setActionType(actionType56);
        com.netflix.appinfo.InstanceInfo.Builder builder59 = builder37.setActionType(actionType56);
        instanceInfo24.setActionType(actionType56);
        com.netflix.appinfo.InstanceInfo.Builder builder61 = builder2.setActionType(actionType56);
        com.netflix.appinfo.InstanceInfo.Builder builder63 = builder61.setNamespace("http://inesserver2.windows.cin.ufpe.br:80/");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder67 = builder61.setHealthCheckUrls("unknown", "/Status", "/healthcheck");
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setSecurePort(100);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setSecurePort((int) (short) 0);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setAppGroupName("");
        com.netflix.appinfo.InstanceInfo.Builder builder13 = builder8.setHealthCheckUrlsForDeser("/healthcheck", "");
        com.netflix.appinfo.InstanceInfo.Builder builder16 = builder13.add("/", "hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder18 = builder13.setVIPAddressDeser("/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder19.setVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo instanceInfo22 = builder19.getRawInstance();
        java.lang.String str23 = instanceInfo22.getIPAddr();
        int int24 = instanceInfo22.getCountryId();
        com.netflix.appinfo.InstanceInfo instanceInfo25 = new com.netflix.appinfo.InstanceInfo(instanceInfo22);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager26 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo27 = applicationInfoManager26.getInfo();
        java.lang.String str28 = instanceInfo27.getSecureVipAddress();
        com.netflix.appinfo.InstanceInfo.ActionType actionType29 = instanceInfo27.getActionType();
        instanceInfo27.setLastUpdatedTimestamp();
        com.netflix.appinfo.LeaseInfo leaseInfo31 = instanceInfo27.getLeaseInfo();
        instanceInfo22.setLeaseInfo(leaseInfo31);
        com.netflix.appinfo.InstanceInfo.Builder builder33 = builder13.setLeaseInfo(leaseInfo31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder36 = builder33.setStatusPageUrl("HI!", "172.20.26.3");
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo instanceInfo3 = builder0.getRawInstance();
        java.lang.String str4 = instanceInfo3.getAppName();
        java.lang.String str5 = instanceInfo3.getSID();
        com.netflix.appinfo.InstanceInfo.Builder builder6 = new com.netflix.appinfo.InstanceInfo.Builder(instanceInfo3);
        com.netflix.appinfo.InstanceInfo.Builder builder7 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder9 = builder7.setVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo instanceInfo10 = builder7.getRawInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo11 = new com.netflix.appinfo.InstanceInfo(instanceInfo10);
        java.lang.String str12 = instanceInfo10.getIPAddr();
        java.util.Set<java.lang.String> strSet13 = instanceInfo10.getHealthCheckUrls();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = instanceInfo10.getMetadata();
        java.lang.Long long15 = instanceInfo10.isDirtyWithTime();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus16 = instanceInfo10.getStatus();
        java.lang.Long long17 = instanceInfo10.getLastDirtyTimestamp();
        com.netflix.appinfo.InstanceInfo.InstanceStatus instanceStatus18 = com.netflix.appinfo.InstanceInfo.InstanceStatus.UNKNOWN;
        instanceInfo10.setOverriddenStatus(instanceStatus18);
        com.netflix.appinfo.InstanceInfo.Builder builder20 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder22 = builder20.setVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo instanceInfo23 = builder20.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder20.setLastUpdatedTimestamp((long) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder20.setHealthCheckUrlsForDeser("/healthcheck", "/healthcheck");
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig30 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        boolean boolean31 = myDataCenterInstanceConfig30.getSecurePortEnabled();
        java.lang.String str32 = myDataCenterInstanceConfig30.getSecureVirtualHostName();
        boolean boolean33 = myDataCenterInstanceConfig30.getSecurePortEnabled();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo34 = myDataCenterInstanceConfig30.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder35 = builder20.setDataCenterInfo(dataCenterInfo34);
        com.netflix.appinfo.InstanceInfo.Builder builder38 = builder35.setHealthCheckUrlsForDeser("172.20.26.3", "/Status");
        com.netflix.appinfo.InstanceInfo.Builder builder39 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder41 = builder39.setVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo instanceInfo42 = builder39.getRawInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo43 = new com.netflix.appinfo.InstanceInfo(instanceInfo42);
        com.netflix.appinfo.InstanceInfo.PortType portType44 = com.netflix.appinfo.InstanceInfo.PortType.UNSECURE;
        boolean boolean45 = instanceInfo42.isPortEnabled(portType44);
        com.netflix.appinfo.InstanceInfo.Builder builder47 = builder35.enablePort(portType44, false);
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager48 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.InstanceInfo instanceInfo49 = applicationInfoManager48.getInfo();
        java.lang.String str50 = instanceInfo49.getSecureVipAddress();
        com.netflix.appinfo.InstanceInfo.ActionType actionType51 = instanceInfo49.getActionType();
        instanceInfo49.setLastUpdatedTimestamp();
        com.netflix.appinfo.LeaseInfo leaseInfo53 = instanceInfo49.getLeaseInfo();
        com.netflix.appinfo.LeaseInfo leaseInfo54 = instanceInfo49.getLeaseInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder55 = builder35.setLeaseInfo(leaseInfo54);
        com.netflix.appinfo.InstanceInfo instanceInfo56 = builder35.getRawInstance();
        com.netflix.appinfo.InstanceInfo.Builder builder57 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder59 = builder57.setVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder61 = builder57.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder63 = builder57.setIsCoordinatingDiscoveryServer(false);
        com.netflix.appinfo.InstanceInfo.Builder builder65 = builder63.setSecurePort((int) ' ');
        com.netflix.appinfo.InstanceInfo.ActionType actionType66 = com.netflix.appinfo.InstanceInfo.ActionType.DELETED;
        com.netflix.appinfo.InstanceInfo.Builder builder67 = builder65.setActionType(actionType66);
        com.netflix.appinfo.InstanceInfo.Builder builder68 = builder35.setActionType(actionType66);
        instanceInfo10.setActionType(actionType66);
        com.netflix.appinfo.InstanceInfo.Builder builder70 = builder6.setActionType(actionType66);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder73 = builder70.setHomePageUrl("hi!", "HI!");
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setSecurePort(100);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder4.setSecurePort((int) (short) 0);
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder8.setAppGroupName("");
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder8.setLastUpdatedTimestamp((long) (short) 1);
        com.netflix.appinfo.InstanceInfo.Builder builder13 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder15 = builder13.setVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder17 = builder13.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder19 = builder17.setSecurePort(100);
        com.netflix.appinfo.InstanceInfo.Builder builder21 = builder17.setSecurePort((int) (short) 0);
        com.netflix.appinfo.InstanceInfo.Builder builder23 = builder21.setAppGroupName("");
        com.netflix.appinfo.InstanceInfo.Builder builder25 = builder21.setLastUpdatedTimestamp((long) (short) 1);
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig27 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        java.lang.String str28 = myDataCenterInstanceConfig27.getStatusPageUrl();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo29 = myDataCenterInstanceConfig27.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder30 = builder21.setDataCenterInfo(dataCenterInfo29);
        com.netflix.appinfo.InstanceInfo.Builder builder31 = builder12.setDataCenterInfo(dataCenterInfo29);
        com.netflix.appinfo.InstanceInfo.Builder builder33 = builder31.setCountryId((int) (short) 10);
        com.netflix.appinfo.InstanceInfo.Builder builder35 = builder31.setSID("");
        com.netflix.appinfo.InstanceInfo.Builder builder37 = builder31.setLastDirtyTimestamp(1636096877754L);
        com.netflix.appinfo.InstanceInfo.Builder builder39 = builder37.setCountryId(7002);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder42 = builder37.setHomePageUrl("eureka.", "http://inesserver2.windows.cin.ufpe.br:80/");
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
        com.netflix.appinfo.InstanceInfo.Builder builder0 = com.netflix.appinfo.InstanceInfo.Builder.newBuilder();
        com.netflix.appinfo.InstanceInfo.Builder builder2 = builder0.setVIPAddressDeser("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder4 = builder0.setAppGroupName("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder6 = builder4.setSecurePort(100);
        com.netflix.appinfo.InstanceInfo.Builder builder8 = builder6.setSID("hi!");
        com.netflix.appinfo.InstanceInfo.Builder builder10 = builder6.setSecurePort(1);
        com.netflix.appinfo.InstanceInfo.Builder builder12 = builder10.setIPAddr("/healthcheck");
        com.netflix.appinfo.ApplicationInfoManager applicationInfoManager13 = com.netflix.appinfo.ApplicationInfoManager.getInstance();
        com.netflix.appinfo.MyDataCenterInstanceConfig myDataCenterInstanceConfig15 = new com.netflix.appinfo.MyDataCenterInstanceConfig("");
        java.lang.String str16 = myDataCenterInstanceConfig15.getStatusPageUrl();
        java.lang.String str17 = myDataCenterInstanceConfig15.getStatusPageUrlPath();
        applicationInfoManager13.initComponent((com.netflix.appinfo.EurekaInstanceConfig) myDataCenterInstanceConfig15);
        java.lang.String str19 = myDataCenterInstanceConfig15.getIpAddress();
        java.lang.String str20 = myDataCenterInstanceConfig15.getASGName();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo21 = myDataCenterInstanceConfig15.getDataCenterInfo();
        java.lang.String str22 = myDataCenterInstanceConfig15.getSecureVirtualHostName();
        com.netflix.appinfo.DataCenterInfo dataCenterInfo23 = myDataCenterInstanceConfig15.getDataCenterInfo();
        com.netflix.appinfo.InstanceInfo.Builder builder24 = builder12.setDataCenterInfo(dataCenterInfo23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.netflix.appinfo.InstanceInfo.Builder builder28 = builder24.setHealthCheckUrls("", "na", "eureka.");
    }
}

