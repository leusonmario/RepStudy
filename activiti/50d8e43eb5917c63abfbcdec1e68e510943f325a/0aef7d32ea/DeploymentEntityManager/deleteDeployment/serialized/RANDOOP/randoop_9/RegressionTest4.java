import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager335();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean263();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager624();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager995();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString566();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean252();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean455();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString223();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager452();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean378();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "584" + "'", str6, "584");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1279" + "'", str8, "1279");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2638" + "'", str10, "2638");
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager934();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean933();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean413();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager65();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5200" + "'", str3, "5200");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString279();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager318();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString675();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager923();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager350();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString869();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean335();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4286" + "'", str3, "4286");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5190" + "'", str5, "5190");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10812" + "'", str8, "10812");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean1048();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean59();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager484();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager165();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean446();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean653();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager742();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString747();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString950();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean917();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "7478" + "'", str9, "7478");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "12012" + "'", str10, "12012");
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager934();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean933();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager542();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean726();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager807();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString732();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString544();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager403();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager439();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "6483" + "'", str5, "6483");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "167" + "'", str6, "167");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString871();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager160();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager284();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager435();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10847" + "'", str6, "10847");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager335();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager902();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean857();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager821();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager276();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString576();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean268();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString589();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "791" + "'", str10, "791");
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1078" + "'", str12, "1078");
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager995();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager333();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString52();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager697();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "634" + "'", str7, "634");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager335();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString987();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean916();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean327();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean12();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString706();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "15313" + "'", str6, "15313");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + false + "'", boolean7, false);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "5851" + "'", str10, "5851");
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean664();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean531();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager483();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString74();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager653();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString598();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "871" + "'", str5, "871");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1352" + "'", str7, "1352");
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager657();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager457();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString961();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager552();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "12143" + "'", str4, "12143");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString147();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager596();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager446();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager36();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean978();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean98();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2226" + "'", str3, "2226");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString473();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager507();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager102();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString879();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString159();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10628" + "'", str2, "10628");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10932" + "'", str5, "10932");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2262" + "'", str6, "2262");
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString384();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "6688" + "'", str5, "6688");
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString569();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean552();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean310();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "649" + "'", str4, "649");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString963();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString160();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager938();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString688();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString853();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "12162" + "'", str2, "12162");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2265" + "'", str3, "2265");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5462" + "'", str5, "5462");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10670" + "'", str6, "10670");
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager335();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean157();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager574();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager375();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean634();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString346();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString857();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5990" + "'", str7, "5990");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10688" + "'", str8, "10688");
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager533();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean126();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean943();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString663();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean105();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager529();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "5005" + "'", str9, "5005");
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager136();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean621();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString308();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5119" + "'", str7, "5119");
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean577();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString429();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString683();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString955();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString285();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager52();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9076" + "'", str3, "9076");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5369" + "'", str4, "5369");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "12071" + "'", str5, "12071");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4514" + "'", str6, "4514");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean577();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString429();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString683();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString253();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString466();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager419();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean104();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager837();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9076" + "'", str3, "9076");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5369" + "'", str4, "5369");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3328" + "'", str5, "3328");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10559" + "'", str6, "10559");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1045();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager376();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean172();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager683();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString745();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean330();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean311();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10001" + "'", str5, "10001");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "7366" + "'", str9, "7366");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1648" + "'", str10, "1648");
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString473();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager507();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString375();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean581();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString116();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString438();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean425();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean180();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager324();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10628" + "'", str2, "10628");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "6596" + "'", str4, "6596");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1924" + "'", str6, "1924");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "9901" + "'", str7, "9901");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager136();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1032();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean204();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager444();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean624();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString885();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean441();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "11002" + "'", str10, "11002");
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString861();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager638();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean437();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString874();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10711" + "'", str3, "10711");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10879" + "'", str6, "10879");
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean1048();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean59();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager530();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean432();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString77();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "984" + "'", str6, "984");
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean577();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString429();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString683();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString955();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean116();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean899();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager791();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9076" + "'", str3, "9076");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5369" + "'", str4, "5369");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "12071" + "'", str5, "12071");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString473();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString382();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager714();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager730();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean486();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean108();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean42();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10628" + "'", str2, "10628");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6661" + "'", str3, "6661");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean115();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager262();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString336();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString514();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean307();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5756" + "'", str6, "5756");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "11551" + "'", str7, "11551");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager136();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1032();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean204();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean559();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1053();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean433();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager662();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager995();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString566();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean252();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString89();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean557();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean296();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString54();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "584" + "'", str6, "584");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2916" + "'", str8, "2916");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1232" + "'", str9, "1232");
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "655" + "'", str12, "655");
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString699();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager209();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean323();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager662();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager688();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5724" + "'", str2, "5724");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1045();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager376();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager589();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString350();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString45();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager114();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean741();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10001" + "'", str5, "10001");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "6086" + "'", str8, "6086");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "522" + "'", str9, "522");
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager995();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString566();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager99();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString66();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager949();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "584" + "'", str6, "584");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "789" + "'", str8, "789");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString861();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean1060();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager965();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager659();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager257();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean46();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString34();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10711" + "'", str3, "10711");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "397" + "'", str9, "397");
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean458();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean604();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager201();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager427();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean396();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString571();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager518();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager763();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "676" + "'", str8, "676");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString37();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager571();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager822();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "420" + "'", str1, "420");
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString37();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager808();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager178();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString790();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager45();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager352();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean919();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "420" + "'", str1, "420");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "80" + "'", str2, "80");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "9385" + "'", str5, "9385");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager125();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString581();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager279();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString644();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean677();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager811();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager660();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean92();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager13 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager192();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "878" + "'", str6, "878");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2322" + "'", str8, "2322");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager13);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager533();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean862();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString252();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean958();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "3263" + "'", str8, "3263");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager995();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager333();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString488();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean462();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1041();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean299();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean555();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString10();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager13 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager992();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString899();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10899" + "'", str7, "10899");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "128" + "'", str12, "128");
        org.junit.Assert.assertNotNull(deploymentEntityManager13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "11200" + "'", str14, "11200");
    }
}

