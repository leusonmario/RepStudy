import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean539();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString395();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean467();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6905" + "'", str2, "6905");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean577();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString429();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString683();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1044();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager807();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean847();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString909();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9076" + "'", str3, "9076");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5369" + "'", str4, "5369");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "11397" + "'", str8, "11397");
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager995();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString566();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean252();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager269();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString853();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "584" + "'", str6, "584");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10670" + "'", str9, "10670");
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1045();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager376();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager973();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager759();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10001" + "'", str5, "10001");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean1048();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean59();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager484();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager165();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean446();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString651();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2389" + "'", str7, "2389");
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString147();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager596();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean974();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString278();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2226" + "'", str3, "2226");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4241" + "'", str6, "4241");
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString279();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean298();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString781();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4286" + "'", str3, "4286");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "9319" + "'", str5, "9319");
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager934();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean933();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean618();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean651();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean301();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString87();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1177" + "'", str6, "1177");
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager335();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString987();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean601();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager911();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean366();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "15313" + "'", str6, "15313");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + false + "'", boolean7, false);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean398();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString866();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10747" + "'", str4, "10747");
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager645();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean198();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean337();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1052();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString832();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager585();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10512" + "'", str6, "10512");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1045();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager376();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager973();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean222();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean443();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10001" + "'", str5, "10001");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString800();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean554();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean204();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager497();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString924();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager81();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString255();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager967();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "9562" + "'", str2, "9562");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "11592" + "'", str6, "11592");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "3418" + "'", str8, "3418");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString728();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString231();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager853();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean498();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString281();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager712();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6195" + "'", str3, "6195");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2809" + "'", str4, "2809");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4376" + "'", str7, "4376");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean445();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean869();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean263();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager392();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString978();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean378();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "12388" + "'", str4, "12388");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString861();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean1060();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager965();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager659();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean809();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean194();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager226();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean393();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10711" + "'", str3, "10711");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString37();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager571();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager802();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager955();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean831();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1055();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "420" + "'", str1, "420");
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "57" + "'", str6, "57");
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager995();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString566();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean252();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString843();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean483();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString636();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager649();
        java.lang.Boolean boolean13 = serializedObjectSupporter0.deserializeObjectBoolean601();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "584" + "'", str6, "584");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1279" + "'", str8, "1279");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10591" + "'", str9, "10591");
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2094" + "'", str11, "2094");
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + false + "'", boolean13, false);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager533();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean126();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager311();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager698();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager415();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean493();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager550();
        java.lang.Boolean boolean13 = serializedObjectSupporter0.deserializeObjectBoolean636();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString523();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + true + "'", boolean13, true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "11606" + "'", str14, "11606");
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString279();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean298();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean946();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean460();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString987();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString517();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4286" + "'", str3, "4286");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "15313" + "'", str7, "15313");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "11578" + "'", str8, "11578");
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString473();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager507();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString375();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager430();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager200();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString831();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager707();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager708();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10628" + "'", str2, "10628");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "6596" + "'", str4, "6596");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10499" + "'", str7, "10499");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString728();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString231();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager853();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean104();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean20();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6195" + "'", str3, "6195");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2809" + "'", str4, "2809");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean115();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager262();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString336();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager359();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean893();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5756" + "'", str6, "5756");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString569();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean199();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean414();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager74();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "649" + "'", str4, "649");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean1048();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString431();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean208();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager872();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager669();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9440" + "'", str3, "9440");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager335();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString513();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString391();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean936();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "11513" + "'", str6, "11513");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "6843" + "'", str7, "6843");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString569();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager877();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager207();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean369();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "649" + "'", str4, "649");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean726();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager807();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager471();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString409();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString938();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean1009();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager188();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "7386" + "'", str6, "7386");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "11868" + "'", str7, "11868");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString666();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString904();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString466();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5066" + "'", str3, "5066");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11303" + "'", str4, "11303");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10559" + "'", str5, "10559");
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString279();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean298();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString241();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager181();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean710();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString939();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4286" + "'", str3, "4286");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2871" + "'", str5, "2871");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "11887" + "'", str8, "11887");
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean1048();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString431();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean208();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean9();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9440" + "'", str3, "9440");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean726();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString468();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean123();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString439();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager177();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager38();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10587" + "'", str4, "10587");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "9918" + "'", str7, "9918");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1045();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString609();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean413();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean596();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString488();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager833();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString741();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10001" + "'", str5, "10001");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1470" + "'", str6, "1470");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10899" + "'", str9, "10899");
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "7053" + "'", str11, "7053");
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager335();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString987();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString249();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "15313" + "'", str6, "15313");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3192" + "'", str7, "3192");
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString473();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString515();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean800();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean297();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10628" + "'", str2, "10628");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11572" + "'", str3, "11572");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager645();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString418();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1044();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean697();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString402();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "7644" + "'", str3, "7644");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "7027" + "'", str6, "7027");
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager335();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString987();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager931();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager748();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1017();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString746();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "15313" + "'", str6, "15313");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "7430" + "'", str10, "7430");
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString569();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager877();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1002();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager390();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString922();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "649" + "'", str4, "649");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "25304" + "'", str6, "25304");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "11555" + "'", str8, "11555");
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager995();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString566();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean252();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean1059();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager868();
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity11 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager10.insertDeployment(deploymentEntity11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "584" + "'", str6, "584");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1279" + "'", str8, "1279");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager585();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager239();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString963();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString301();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString403();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean469();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString574();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean706();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "12162" + "'", str2, "12162");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4958" + "'", str3, "4958");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7042" + "'", str4, "7042");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "735" + "'", str6, "735");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString369();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1051();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString724();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager957();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "6498" + "'", str5, "6498");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5996" + "'", str7, "5996");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean726();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager807();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager471();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager728();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean695();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString102();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean646();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1553" + "'", str9, "1553");
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean664();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString437();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean242();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString482();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager297();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean765();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString636();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean794();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString193();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean885();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9890" + "'", str3, "9890");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10789" + "'", str5, "10789");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2094" + "'", str8, "2094");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2456" + "'", str10, "2456");
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString871();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager201();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager733();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean569();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean428();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager443();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager382();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString776();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10847" + "'", str6, "10847");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "9025" + "'", str13, "9025");
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean726();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager807();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager471();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager728();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean695();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString102();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString155();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1553" + "'", str9, "1553");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2250" + "'", str10, "2250");
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean1048();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean59();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager484();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager165();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean594();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean502();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString569();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager188();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean692();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString582();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "649" + "'", str4, "649");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "889" + "'", str7, "889");
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString473();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString515();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean800();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager524();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean946();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10628" + "'", str2, "10628");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11572" + "'", str3, "11572");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString666();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1055();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager895();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString211();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString801();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5066" + "'", str3, "5066");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "57" + "'", str4, "57");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2526" + "'", str6, "2526");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "9572" + "'", str7, "9572");
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString728();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString231();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean182();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean395();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager726();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager640();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6195" + "'", str3, "6195");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2809" + "'", str4, "2809");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean263();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean838();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean1027();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager14();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString728();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString231();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager853();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean200();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean122();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean80();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean429();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean423();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6195" + "'", str3, "6195");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2809" + "'", str4, "2809");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString473();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager507();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager102();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager833();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager925();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager181();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean98();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString417();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10628" + "'", str2, "10628");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "7595" + "'", str9, "7595");
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString871();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager201();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager733();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1054();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString519();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10847" + "'", str6, "10847");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "11584" + "'", str10, "11584");
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean920();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager631();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString728();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean252();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "6195" + "'", str8, "6195");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean315();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean964();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean1000();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean288();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager463();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString128();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager571();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2138" + "'", str3, "2138");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString569();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean199();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean105();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean71();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager869();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "649" + "'", str4, "649");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager463();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString128();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean871();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1002();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager350();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean251();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager799();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2138" + "'", str3, "2138");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "25304" + "'", str5, "25304");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString304();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean103();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5018" + "'", str4, "5018");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager533();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString94();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1040();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString108();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1292" + "'", str7, "1292");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "53" + "'", str8, "53");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1758" + "'", str9, "1758");
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager995();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString566();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean252();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString242();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager248();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager143();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "584" + "'", str6, "584");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2916" + "'", str8, "2916");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString599();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager504();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean569();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean1025();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString767();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager960();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1366" + "'", str6, "1366");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "8629" + "'", str10, "8629");
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString37();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager808();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager178();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager62();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean1051();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString67();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "420" + "'", str1, "420");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "80" + "'", str2, "80");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "800" + "'", str7, "800");
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean577();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString429();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString683();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString253();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString671();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9076" + "'", str3, "9076");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5369" + "'", str4, "5369");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3328" + "'", str5, "3328");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5132" + "'", str6, "5132");
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager533();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean862();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean646();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean745();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager156();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString901();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "11249" + "'", str11, "11249");
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString861();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean1060();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager247();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1056();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString768();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean694();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10711" + "'", str3, "10711");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "68" + "'", str6, "68");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "8668" + "'", str7, "8668");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString169();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString14();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString257();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean365();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString966();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2360" + "'", str2, "2360");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "172" + "'", str3, "172");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "3508" + "'", str4, "3508");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "12216" + "'", str6, "12216");
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString569();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager382();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1034();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString695();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean20();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "649" + "'", str4, "649");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5645" + "'", str7, "5645");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager299();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1004();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "25310" + "'", str7, "25310");
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean726();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString468();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean123();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString439();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager177();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager409();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean624();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10587" + "'", str4, "10587");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "9918" + "'", str7, "9918");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString369();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager845();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString50();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "6498" + "'", str5, "6498");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "613" + "'", str7, "613");
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString369();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager979();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "6498" + "'", str5, "6498");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString473();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString979();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean416();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString948();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString458();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager379();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10628" + "'", str2, "10628");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "12407" + "'", str3, "12407");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "11988" + "'", str5, "11988");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10229" + "'", str6, "10229");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString800();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean701();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString381();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean898();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1019();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "9562" + "'", str2, "9562");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "6654" + "'", str4, "6654");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean263();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager392();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean255();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString348();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean266();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "6036" + "'", str5, "6036");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean726();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString468();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean416();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10587" + "'", str4, "10587");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString871();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager201();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager733();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean569();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean428();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager443();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager315();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString130();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString641();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10847" + "'", str6, "10847");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2175" + "'", str13, "2175");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2242" + "'", str14, "2242");
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString861();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean1060();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager247();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean31();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager746();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean498();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10711" + "'", str3, "10711");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString861();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager638();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean830();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1060();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean342();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString532();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10711" + "'", str3, "10711");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "101" + "'", str6, "101");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "12175" + "'", str8, "12175");
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager125();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString581();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager279();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString644();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean116();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean843();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString900();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "878" + "'", str6, "878");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2322" + "'", str8, "2322");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "11233" + "'", str11, "11233");
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString448();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString362();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString319();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10118" + "'", str5, "10118");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "6363" + "'", str6, "6363");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5371" + "'", str7, "5371");
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager995();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager333();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean276();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean835();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean932();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager462();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean695();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString728();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString231();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager853();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean200();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager35();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6195" + "'", str3, "6195");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2809" + "'", str4, "2809");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString569();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager877();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager207();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString17();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString89();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager928();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean896();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean333();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString374();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "649" + "'", str4, "649");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "221" + "'", str7, "221");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1232" + "'", str8, "1232");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "6589" + "'", str12, "6589");
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString473();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString382();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager714();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager730();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean486();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean108();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager488();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10628" + "'", str2, "10628");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6661" + "'", str3, "6661");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString963();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString312();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString824();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager15();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "12162" + "'", str2, "12162");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5204" + "'", str3, "5204");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10423" + "'", str4, "10423");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString369();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1051();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString60();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean453();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "6498" + "'", str5, "6498");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "726" + "'", str7, "726");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager335();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean263();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean770();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager134();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5346" + "'", str7, "5346");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString871();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager201();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager733();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean569();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean244();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean710();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString580();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString402();
        java.lang.Boolean boolean14 = serializedObjectSupporter0.deserializeObjectBoolean25();
        java.lang.String str15 = serializedObjectSupporter0.deserializeObjectString820();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10847" + "'", str6, "10847");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "870" + "'", str12, "870");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "7027" + "'", str13, "7027");
        org.junit.Assert.assertEquals("'" + boolean14 + "' != '" + true + "'", boolean14, true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10368" + "'", str15, "10368");
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString666();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager260();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager185();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString379();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean194();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean554();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5066" + "'", str3, "5066");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "6638" + "'", str6, "6638");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager533();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString94();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1040();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager562();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1292" + "'", str7, "1292");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "53" + "'", str8, "53");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString699();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1026();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager749();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean598();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean299();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5724" + "'", str2, "5724");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager335();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean263();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean1030();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager984();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString37();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager867();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager225();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString88();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "420" + "'", str1, "420");
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1203" + "'", str4, "1203");
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString106();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean872();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean591();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1714" + "'", str4, "1714");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager335();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean157();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager43();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean441();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean804();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString435();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "9865" + "'", str10, "9865");
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean726();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString468();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean123();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString439();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager177();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager409();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean624();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString918();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10587" + "'", str4, "10587");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "9918" + "'", str7, "9918");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "11504" + "'", str11, "11504");
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager335();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean157();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager923();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1007();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean795();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean920();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString654();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean759();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean74();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2410" + "'", str7, "2410");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean664();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString437();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean242();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString482();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString489();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean454();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9890" + "'", str3, "9890");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10789" + "'", str5, "10789");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10984" + "'", str6, "10984");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager995();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString566();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean252();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString843();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean483();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString636();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean930();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "584" + "'", str6, "584");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1279" + "'", str8, "1279");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10591" + "'", str9, "10591");
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2094" + "'", str11, "2094");
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager335();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean263();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean1030();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString686();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean130();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "5425" + "'", str8, "5425");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean664();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString437();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean242();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString482();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager297();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean765();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean966();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9890" + "'", str3, "9890");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10789" + "'", str5, "10789");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString448();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString849();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean524();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean728();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString976();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10118" + "'", str5, "10118");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10628" + "'", str6, "10628");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "12360" + "'", str9, "12360");
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1045();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager376();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString924();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager815();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString169();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean675();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager907();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10001" + "'", str5, "10001");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "11592" + "'", str7, "11592");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2360" + "'", str9, "2360");
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString963();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean633();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString235();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString495();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean145();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "12162" + "'", str2, "12162");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2851" + "'", str4, "2851");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "11124" + "'", str5, "11124");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString800();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean701();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString196();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean1052();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString488();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean644();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager415();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "9562" + "'", str2, "9562");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2469" + "'", str4, "2469");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10899" + "'", str6, "10899");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager125();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString581();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager279();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString813();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean413();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean199();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "878" + "'", str6, "878");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "9919" + "'", str8, "9919");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString473();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString382();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager714();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager730();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager670();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString843();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10628" + "'", str2, "10628");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6661" + "'", str3, "6661");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10591" + "'", str7, "10591");
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager995();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString566();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean252();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean976();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString71();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "584" + "'", str6, "584");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "853" + "'", str9, "853");
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager533();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager454();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean943();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean113();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString861();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean1060();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager965();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager659();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean809();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean568();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString633();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10711" + "'", str3, "10711");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2041" + "'", str9, "2041");
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString37();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager571();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager802();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString422();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString46();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager417();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "420" + "'", str1, "420");
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7938" + "'", str4, "7938");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "544" + "'", str5, "544");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager533();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean862();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString252();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean459();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager957();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager778();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean101();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "3263" + "'", str8, "3263");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager463();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1014();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString374();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean858();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "6589" + "'", str4, "6589");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager995();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager333();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean276();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean835();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean259();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager306();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString764();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString123();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "8439" + "'", str5, "8439");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2061" + "'", str6, "2061");
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString728();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString231();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager853();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString490();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6195" + "'", str3, "6195");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2809" + "'", str4, "2809");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "11023" + "'", str6, "11023");
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean115();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager262();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString336();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager65();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString158();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5756" + "'", str6, "5756");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2259" + "'", str8, "2259");
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1045();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString609();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean413();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString317();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager734();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10001" + "'", str5, "10001");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1470" + "'", str6, "1470");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "5301" + "'", str8, "5301");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString861();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean1060();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager258();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString957();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10711" + "'", str3, "10711");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "12097" + "'", str6, "12097");
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager136();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1032();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean204();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean750();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString247();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString905();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3132" + "'", str9, "3132");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "11318" + "'", str10, "11318");
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString861();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString464();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString778();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10711" + "'", str3, "10711");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10490" + "'", str4, "10490");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "9101" + "'", str5, "9101");
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean1048();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString431();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean114();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean707();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9440" + "'", str3, "9440");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1045();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString609();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean413();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString317();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean454();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10001" + "'", str5, "10001");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1470" + "'", str6, "1470");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "5301" + "'", str8, "5301");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager995();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString566();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager198();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean625();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "584" + "'", str6, "584");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1045();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager376();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager973();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean222();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager513();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString149();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean653();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager598();
        java.lang.Boolean boolean13 = serializedObjectSupporter0.deserializeObjectBoolean237();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10001" + "'", str5, "10001");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2232" + "'", str10, "2232");
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + true + "'", boolean13, true);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString861();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean1060();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager965();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager659();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean809();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean194();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean198();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager357();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager255();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10711" + "'", str3, "10711");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString37();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager867();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean408();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString525();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "420" + "'", str1, "420");
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11613" + "'", str4, "11613");
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString666();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1055();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1037();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean503();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5066" + "'", str3, "5066");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "57" + "'", str4, "57");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager645();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean198();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean337();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1052();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager921();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean928();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean1048();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString771();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8784" + "'", str3, "8784");
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager335();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString987();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString894();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager410();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager62();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean570();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString289();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "15313" + "'", str6, "15313");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "11101" + "'", str7, "11101");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4642" + "'", str11, "4642");
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager335();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString513();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString391();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1003();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean908();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager244();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "11513" + "'", str6, "11513");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "6843" + "'", str7, "6843");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString279();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager318();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString675();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager362();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean638();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4286" + "'", str3, "4286");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5190" + "'", str5, "5190");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString871();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString66();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean447();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean235();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean825();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10847" + "'", str6, "10847");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "789" + "'", str7, "789");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean664();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString437();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean242();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString482();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager297();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean765();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString158();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString960();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean302();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9890" + "'", str3, "9890");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10789" + "'", str5, "10789");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2259" + "'", str8, "2259");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "12131" + "'", str9, "12131");
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString569();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean199();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean414();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager866();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "649" + "'", str4, "649");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString674();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager788();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString693();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString37();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean76();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5173" + "'", str4, "5173");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5580" + "'", str6, "5580");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "420" + "'", str7, "420");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString861();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean1060();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager965();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager659();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean809();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean568();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean423();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString204();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10711" + "'", str3, "10711");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2501" + "'", str10, "2501");
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager995();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString566();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager666();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean379();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "584" + "'", str6, "584");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString569();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString518();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean901();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "649" + "'", str4, "649");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "11581" + "'", str5, "11581");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString728();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString270();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean134();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString804();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6195" + "'", str3, "6195");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "3907" + "'", str4, "3907");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + false + "'", boolean5, false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9633" + "'", str6, "9633");
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean1048();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean59();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager484();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager165();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean594();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager554();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString462();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10396" + "'", str8, "10396");
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1045();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager376();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager973();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean222();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager513();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString645();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10001" + "'", str5, "10001");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2332" + "'", str10, "2332");
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1045();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager376();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager973();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean222();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager513();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString149();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean653();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean788();
        java.lang.Boolean boolean13 = serializedObjectSupporter0.deserializeObjectBoolean592();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10001" + "'", str5, "10001");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2232" + "'", str10, "2232");
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + true + "'", boolean13, true);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1045();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager376();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager973();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean222();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager513();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString149();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean653();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean581();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager13 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager434();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10001" + "'", str5, "10001");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2232" + "'", str10, "2232");
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager13);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager335();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString987();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString894();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean286();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString516();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager497();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager90();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "15313" + "'", str6, "15313");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "11101" + "'", str7, "11101");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "11575" + "'", str9, "11575");
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager335();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean263();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean27();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString328();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString50();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "5576" + "'", str8, "5576");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "613" + "'", str9, "613");
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1045();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager376();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean736();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager647();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString485();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager542();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager456();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10001" + "'", str5, "10001");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10867" + "'", str9, "10867");
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1045();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager376();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString924();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager815();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString169();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean675();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString645();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10001" + "'", str5, "10001");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "11592" + "'", str7, "11592");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2360" + "'", str9, "2360");
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2332" + "'", str11, "2332");
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString569();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean199();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean414();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean896();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean542();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "649" + "'", str4, "649");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString569();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager406();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager283();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "649" + "'", str4, "649");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager995();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager333();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString488();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean462();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager660();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10899" + "'", str7, "10899");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean315();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean681();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString674();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager788();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean544();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5173" + "'", str4, "5173");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean726();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager807();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager471();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager728();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean695();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager225();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1040();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager995();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString566();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean252();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString482();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean925();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean339();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString345();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString1001();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "584" + "'", str6, "584");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2916" + "'", str8, "2916");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10789" + "'", str9, "10789");
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "5965" + "'", str12, "5965");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "22816" + "'", str13, "22816");
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean664();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString437();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1030();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean368();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString152();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString833();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean521();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9890" + "'", str3, "9890");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2241" + "'", str6, "2241");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10520" + "'", str7, "10520");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + false + "'", boolean8, false);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString963();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString312();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager298();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "12162" + "'", str2, "12162");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5204" + "'", str3, "5204");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString871();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager395();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10847" + "'", str6, "10847");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "7216" + "'", str7, "7216");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1045();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager376();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager973();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean222();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager513();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString149();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean653();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean581();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager13 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager799();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager14 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager258();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10001" + "'", str5, "10001");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2232" + "'", str10, "2232");
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager13);
        org.junit.Assert.assertNotNull(deploymentEntityManager14);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager533();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean126();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager311();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString83();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1090" + "'", str9, "1090");
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean458();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean604();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager201();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager956();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString811();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "9803" + "'", str7, "9803");
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager995();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString566();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager198();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager409();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean837();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "584" + "'", str6, "584");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean577();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString429();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean737();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString280();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager572();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean149();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9076" + "'", str3, "9076");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4331" + "'", str5, "4331");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString473();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString382();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean537();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean96();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10628" + "'", str2, "10628");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6661" + "'", str3, "6661");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager995();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager333();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean276();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean835();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean932();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean154();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean619();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager335();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString881();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager401();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10957" + "'", str6, "10957");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString861();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean1060();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager965();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager659();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean809();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean568();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString371();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString648();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager553();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean998();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10711" + "'", str3, "10711");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "6542" + "'", str9, "6542");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2368" + "'", str10, "2368");
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager375();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString664();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean746();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager562();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString602();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5013" + "'", str6, "5013");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1385" + "'", str9, "1385");
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString473();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager507();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager102();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean968();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean116();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean905();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString92();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10628" + "'", str2, "10628");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1263" + "'", str8, "1263");
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString473();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager507();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager102();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager833();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager925();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString605();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10628" + "'", str2, "10628");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1418" + "'", str7, "1418");
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager995();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString566();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean252();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString843();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean670();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString832();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean416();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager13 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager19();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "584" + "'", str6, "584");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1279" + "'", str8, "1279");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10591" + "'", str9, "10591");
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10512" + "'", str11, "10512");
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager13);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
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
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString359();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager13 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager904();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "6312" + "'", str12, "6312");
        org.junit.Assert.assertNotNull(deploymentEntityManager13);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString748();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString634();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager269();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "7506" + "'", str5, "7506");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2064" + "'", str6, "2064");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean726();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString875();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager280();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean518();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager762();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString88();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean424();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10897" + "'", str4, "10897");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", boolean6, false);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1203" + "'", str8, "1203");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager463();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean795();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString180();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString975();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean408();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString864();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean117();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2405" + "'", str4, "2405");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "12342" + "'", str5, "12342");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10730" + "'", str7, "10730");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString448();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString849();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean524();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean728();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager181();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10118" + "'", str5, "10118");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10628" + "'", str6, "10628");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString871();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager201();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager733();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager771();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean290();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean218();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10847" + "'", str6, "10847");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString871();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager201();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean340();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager183();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1043();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean119();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean347();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10847" + "'", str6, "10847");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString871();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager201();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager733();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean569();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean428();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager997();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean673();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10847" + "'", str6, "10847");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean726();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean566();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString473();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString979();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString78();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10628" + "'", str2, "10628");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "12407" + "'", str3, "12407");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1010" + "'", str4, "1010");
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString569();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString317();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean354();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString827();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "649" + "'", str4, "649");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5301" + "'", str5, "5301");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10455" + "'", str7, "10455");
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean263();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager392();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString105();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1692" + "'", str4, "1692");
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager645();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString418();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean631();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString846();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean631();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "7644" + "'", str3, "7644");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10615" + "'", str5, "10615");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString871();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager201();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager733();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean569();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean428();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager443();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager382();
        java.lang.Boolean boolean13 = serializedObjectSupporter0.deserializeObjectBoolean758();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10847" + "'", str6, "10847");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + true + "'", boolean13, true);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager375();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString664();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean1014();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager458();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5013" + "'", str6, "5013");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager995();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString566();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean252();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString242();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager392();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "584" + "'", str6, "584");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2916" + "'", str8, "2916");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString861();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager638();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean830();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager960();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString192();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean670();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString770();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10711" + "'", str3, "10711");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2453" + "'", str7, "2453");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "8748" + "'", str9, "8748");
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager973();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean134();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1059();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString781();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "94" + "'", str4, "94");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "9319" + "'", str5, "9319");
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager533();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean862();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean646();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean652();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager846();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean649();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean263();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager392();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString978();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean459();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString46();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "12388" + "'", str4, "12388");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "544" + "'", str6, "544");
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean920();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean220();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager449();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean926();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString147();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager596();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager446();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager107();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2226" + "'", str3, "2226");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString871();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager201();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1034();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10847" + "'", str6, "10847");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean664();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString437();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean242();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString482();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager297();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean765();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString158();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString960();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean332();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString165();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9890" + "'", str3, "9890");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10789" + "'", str5, "10789");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2259" + "'", str8, "2259");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "12131" + "'", str9, "12131");
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2337" + "'", str11, "2337");
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean431();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager354();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager903();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean529();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString429();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9076" + "'", str6, "9076");
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString963();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean633();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager862();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "12162" + "'", str2, "12162");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager335();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean263();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean1030();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString752();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString926();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean832();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "7669" + "'", str8, "7669");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "12804" + "'", str9, "12804");
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString666();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager260();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager185();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString379();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager170();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5066" + "'", str3, "5066");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "6638" + "'", str6, "6638");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean458();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager711();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager569();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager360();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager335();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean263();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean1030();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean583();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean447();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean1014();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager335();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean263();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean1030();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString752();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString926();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager976();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString544();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "7669" + "'", str8, "7669");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "12804" + "'", str9, "12804");
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "167" + "'", str11, "167");
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager934();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean933();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean709();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString411();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean273();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean151();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5200" + "'", str3, "5200");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "7406" + "'", str5, "7406");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager335();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean263();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString196();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString155();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager242();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean648();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString572();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2469" + "'", str7, "2469");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2250" + "'", str8, "2250");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "702" + "'", str12, "702");
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager335();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean412();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager478();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager162();
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
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean726();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager807();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString732();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean247();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "6483" + "'", str5, "6483");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager863();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString279();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager318();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean46();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean112();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4286" + "'", str3, "4286");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
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
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString589();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean762();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1078" + "'", str10, "1078");
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1045();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString609();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean1062();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean819();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10001" + "'", str5, "10001");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1470" + "'", str6, "1470");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString759();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "8061" + "'", str5, "8061");
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean115();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager166();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString547();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "205" + "'", str6, "205");
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString800();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean701();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString381();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean898();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean136();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString693();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "9562" + "'", str2, "9562");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "6654" + "'", str4, "6654");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", boolean6, false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5580" + "'", str7, "5580");
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean539();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString541();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean865();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString796();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean919();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "12486" + "'", str5, "12486");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "9468" + "'", str7, "9468");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean664();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString437();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean242();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager381();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean710();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9890" + "'", str3, "9890");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString599();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString630();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString421();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean420();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1366" + "'", str6, "1366");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1993" + "'", str7, "1993");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "7879" + "'", str8, "7879");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean920();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean220();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString307();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean978();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "5082" + "'", str9, "5082");
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString963();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString312();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean429();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean859();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean604();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "12162" + "'", str2, "12162");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5204" + "'", str3, "5204");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean315();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean531();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString857();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager972();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10688" + "'", str7, "10688");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean664();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString437();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean810();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1007();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9890" + "'", str3, "9890");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString473();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString382();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager714();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager730();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager165();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean625();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager499();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10628" + "'", str2, "10628");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6661" + "'", str3, "6661");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager533();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean862();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString252();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString782();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean948();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "3263" + "'", str8, "3263");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "9333" + "'", str9, "9333");
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString189();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString759();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2440" + "'", str2, "2440");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8061" + "'", str3, "8061");
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager934();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean933();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean395();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5200" + "'", str3, "5200");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager463();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString983();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager559();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString35();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "12498" + "'", str3, "12498");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "400" + "'", str5, "400");
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean577();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString429();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString683();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString955();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString285();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1062();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean430();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9076" + "'", str3, "9076");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5369" + "'", str4, "5369");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "12071" + "'", str5, "12071");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4514" + "'", str6, "4514");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString569();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager382();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean817();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString46();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "649" + "'", str4, "649");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "544" + "'", str7, "544");
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString369();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager845();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString517();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager228();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "6498" + "'", str5, "6498");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "11578" + "'", str7, "11578");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString699();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager209();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean323();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString938();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager43();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5724" + "'", str2, "5724");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "11868" + "'", str5, "11868");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean883();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean1020();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager995();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString566();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean252();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString594();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager638();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager22();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean962();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean965();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "584" + "'", str6, "584");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1279" + "'", str8, "1279");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
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
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString182();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2413" + "'", str10, "2413");
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString963();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean414();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "12162" + "'", str2, "12162");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2265" + "'", str3, "2265");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString473();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager507();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager102();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString879();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString703();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10628" + "'", str2, "10628");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10932" + "'", str5, "10932");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5787" + "'", str6, "5787");
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString569();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager877();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager207();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString813();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager89();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "649" + "'", str4, "649");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "9919" + "'", str7, "9919");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString569();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager382();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean96();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString352();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString798();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString14();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "649" + "'", str4, "649");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "6136" + "'", str7, "6136");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "9512" + "'", str8, "9512");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "172" + "'", str9, "172");
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString473();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString382();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean537();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean844();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager970();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10628" + "'", str2, "10628");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6661" + "'", str3, "6661");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + false + "'", boolean5, false);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString871();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager201();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean340();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager183();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1043();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean119();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean697();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10847" + "'", str6, "10847");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString169();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager928();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean59();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean708();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean831();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString717();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString161();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean318();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager844();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2360" + "'", str2, "2360");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + false + "'", boolean5, false);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5933" + "'", str7, "5933");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2281" + "'", str8, "2281");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager995();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString566();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean252();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString482();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean925();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean127();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString786();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "584" + "'", str6, "584");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2916" + "'", str8, "2916");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10789" + "'", str9, "10789");
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "9346" + "'", str12, "9346");
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean577();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString429();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString728();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean718();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean973();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString111();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager916();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager31();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9076" + "'", str3, "9076");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "6195" + "'", str4, "6195");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1827" + "'", str7, "1827");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString473();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager507();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean586();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString882();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean389();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean982();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10628" + "'", str2, "10628");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10973" + "'", str5, "10973");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean664();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString437();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean242();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean867();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9890" + "'", str3, "9890");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString800();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1063();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager222();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager297();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1035();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "9562" + "'", str2, "9562");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString369();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager146();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString411();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString961();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean863();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean75();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager315();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "6498" + "'", str5, "6498");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "7406" + "'", str7, "7406");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "12143" + "'", str8, "12143");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString569();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager382();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean817();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString721();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager884();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "649" + "'", str4, "649");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5971" + "'", str7, "5971");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager533();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager454();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean943();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString724();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "5996" + "'", str9, "5996");
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager995();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString566();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean252();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString203();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "584" + "'", str6, "584");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2496" + "'", str8, "2496");
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean1048();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager564();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager272();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString262();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean429();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager749();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3629" + "'", str5, "3629");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString473();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager507();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean586();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean865();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString367();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString842();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10628" + "'", str2, "10628");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "6482" + "'", str6, "6482");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10588" + "'", str7, "10588");
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString699();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1026();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager749();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean598();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean483();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5724" + "'", str2, "5724");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean539();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString541();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean865();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString796();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean1050();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "12486" + "'", str5, "12486");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "9468" + "'", str7, "9468");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString240();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString254();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2867" + "'", str2, "2867");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3373" + "'", str3, "3373");
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString871();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager160();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager698();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString805();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10847" + "'", str6, "10847");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "9646" + "'", str9, "9646");
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString473();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager507();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager102();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager833();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager925();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager181();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean98();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString709();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10628" + "'", str2, "10628");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "5869" + "'", str9, "5869");
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString861();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean1060();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager965();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager659();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean809();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean194();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean198();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager357();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean466();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10711" + "'", str3, "10711");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1045();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager376();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager973();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString538();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager142();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10001" + "'", str5, "10001");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "12399" + "'", str8, "12399");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager463();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString128();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean871();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1002();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager802();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager478();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean214();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean856();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2138" + "'", str3, "2138");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "25304" + "'", str5, "25304");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString279();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean298();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString241();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager181();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager590();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString785();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString892();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean274();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4286" + "'", str3, "4286");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2871" + "'", str5, "2871");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "9343" + "'", str8, "9343");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "11076" + "'", str9, "11076");
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString674();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager419();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString262();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean396();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5173" + "'", str4, "5173");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "3629" + "'", str6, "3629");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString473();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString382();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager714();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager730();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString547();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10628" + "'", str2, "10628");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6661" + "'", str3, "6661");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "205" + "'", str6, "205");
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager533();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean862();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString252();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString259();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1061();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "3263" + "'", str8, "3263");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3568" + "'", str9, "3568");
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString473();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString382();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager714();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager730();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean486();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean108();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager451();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10628" + "'", str2, "10628");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6661" + "'", str3, "6661");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString37();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager808();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager178();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean496();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean554();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString616();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "420" + "'", str1, "420");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "80" + "'", str2, "80");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1686" + "'", str7, "1686");
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager125();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString581();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean198();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager790();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean955();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "878" + "'", str6, "878");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
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
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString110();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager996();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1011();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "584" + "'", str6, "584");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1279" + "'", str8, "1279");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1802" + "'", str10, "1802");
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "42804" + "'", str12, "42804");
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean920();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean220();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean1004();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString616();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean429();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1686" + "'", str9, "1686");
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString569();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager382();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1034();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1030();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean662();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "649" + "'", str4, "649");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "90304" + "'", str7, "90304");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1045();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString609();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean1062();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager967();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10001" + "'", str5, "10001");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1470" + "'", str6, "1470");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString666();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1055();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager895();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString211();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean78();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1024();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5066" + "'", str3, "5066");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "57" + "'", str4, "57");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2526" + "'", str6, "2526");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "75304" + "'", str8, "75304");
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager585();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager822();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString666();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1055();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1037();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean231();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager286();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5066" + "'", str3, "5066");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "57" + "'", str4, "57");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString281();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4376" + "'", str2, "4376");
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString569();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager188();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean954();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString323();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean732();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString234();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "649" + "'", str4, "649");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5455" + "'", str7, "5455");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2844" + "'", str9, "2844");
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean726();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString468();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString628();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager585();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean913();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean803();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString485();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10587" + "'", str4, "10587");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970" + "'", str5, "1970");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10867" + "'", str9, "10867");
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString569();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean199();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean105();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean71();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager185();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager335();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "649" + "'", str4, "649");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager335();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean263();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager624();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager947();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean427();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager375();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean621();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString317();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean690();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean959();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1028();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5301" + "'", str7, "5301");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager136();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean3();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString169();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager928();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString275();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString500();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2360" + "'", str2, "2360");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4130" + "'", str4, "4130");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "11204" + "'", str5, "11204");
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager995();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString566();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean252();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString675();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean710();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager94();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "584" + "'", str6, "584");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "5190" + "'", str8, "5190");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean1048();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString431();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString308();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1057();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean476();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString949();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString693();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9440" + "'", str3, "9440");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5119" + "'", str4, "5119");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "76" + "'", str5, "76");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "12000" + "'", str7, "12000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "5580" + "'", str8, "5580");
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString473();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString382();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager714();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean520();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10628" + "'", str2, "10628");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6661" + "'", str3, "6661");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + false + "'", boolean5, false);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1045();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager376();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager589();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager811();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean814();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager923();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10001" + "'", str5, "10001");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString674();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager788();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString693();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean945();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5173" + "'", str4, "5173");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5580" + "'", str6, "5580");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString666();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager260();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString683();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager47();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean245();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5066" + "'", str3, "5066");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5369" + "'", str5, "5369");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean1048();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager564();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager272();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString262();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean429();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean124();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3629" + "'", str5, "3629");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString279();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean298();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean946();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean460();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString572();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4286" + "'", str3, "4286");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "702" + "'", str7, "702");
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString871();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager201();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager733();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean569();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean428();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager443();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString242();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager13 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager324();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager14 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager498();
        java.lang.String str15 = serializedObjectSupporter0.deserializeObjectString662();
        java.lang.String str16 = serializedObjectSupporter0.deserializeObjectString275();
        java.lang.String str17 = serializedObjectSupporter0.deserializeObjectString504();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10847" + "'", str6, "10847");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2916" + "'", str12, "2916");
        org.junit.Assert.assertNotNull(deploymentEntityManager13);
        org.junit.Assert.assertNotNull(deploymentEntityManager14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2497" + "'", str15, "2497");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "4130" + "'", str16, "4130");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "11332" + "'", str17, "11332");
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString279();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager318();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString675();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager362();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager557();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4286" + "'", str3, "4286");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5190" + "'", str5, "5190");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString514();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "11551" + "'", str5, "11551");
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager802();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean577();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString429();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString683();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager499();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager656();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager734();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9076" + "'", str3, "9076");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5369" + "'", str4, "5369");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean1048();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean59();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager484();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager165();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean446();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString518();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "11581" + "'", str7, "11581");
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager739();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean80();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1045();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager376();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager973();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString538();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString549();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString391();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10001" + "'", str5, "10001");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "12399" + "'", str8, "12399");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "262" + "'", str9, "262");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "6843" + "'", str10, "6843");
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString279();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean298();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString241();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager181();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager590();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager713();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean716();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4286" + "'", str3, "4286");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2871" + "'", str5, "2871");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1045();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager376();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager589();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager811();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean808();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean564();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10001" + "'", str5, "10001");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString861();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean469();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10711" + "'", str3, "10711");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString871();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager201();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager733();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager771();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager840();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager317();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean532();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString80();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10847" + "'", str6, "10847");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1047" + "'", str13, "1047");
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager995();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager333();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean138();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager181();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean1048();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString431();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString116();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean1023();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString570();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString166();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager888();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9440" + "'", str3, "9440");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1924" + "'", str4, "1924");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "663" + "'", str6, "663");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2342" + "'", str7, "2342");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager335();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString987();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager432();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString214();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "15313" + "'", str6, "15313");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2550" + "'", str8, "2550");
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString147();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager596();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager446();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString44();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString110();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2226" + "'", str3, "2226");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "500" + "'", str6, "500");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1802" + "'", str7, "1802");
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString565();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1032();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager233();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString635();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString139();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "574" + "'", str5, "574");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "95304" + "'", str6, "95304");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2083" + "'", str8, "2083");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2202" + "'", str9, "2202");
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager585();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1045();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10001" + "'", str2, "10001");
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString374();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString737();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString743();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "6589" + "'", str4, "6589");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "6856" + "'", str5, "6856");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "7216" + "'", str6, "7216");
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString861();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean1060();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager965();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager659();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager257();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString229();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10711" + "'", str3, "10711");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2781" + "'", str8, "2781");
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString728();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager304();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager186();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager756();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6195" + "'", str3, "6195");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager335();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean263();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString41();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean800();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean822();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5346" + "'", str7, "5346");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "456" + "'", str8, "456");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager463();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1014();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString443();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString303();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10040" + "'", str4, "10040");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4993" + "'", str5, "4993");
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean48();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager879();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString531();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString175();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString158();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "12164" + "'", str5, "12164");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2384" + "'", str6, "2384");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2259" + "'", str7, "2259");
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1045();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager376();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager992();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString897();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager315();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10001" + "'", str5, "10001");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "11164" + "'", str8, "11164");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean664();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString437();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1030();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean368();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString152();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString674();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean1012();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9890" + "'", str3, "9890");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2241" + "'", str6, "2241");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5173" + "'", str7, "5173");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager934();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager488();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean492();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString473();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager507();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString375();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean992();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10628" + "'", str2, "10628");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "6596" + "'", str4, "6596");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString569();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager877();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1002();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager390();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager478();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager747();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager531();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager72();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "649" + "'", str4, "649");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "25304" + "'", str6, "25304");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString666();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1055();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager895();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString365();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5066" + "'", str3, "5066");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "57" + "'", str4, "57");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "6450" + "'", str6, "6450");
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1045();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager376();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager973();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean222();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager513();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString149();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean653();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean788();
        java.lang.Boolean boolean13 = serializedObjectSupporter0.deserializeObjectBoolean928();
        java.lang.Boolean boolean14 = serializedObjectSupporter0.deserializeObjectBoolean673();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10001" + "'", str5, "10001");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2232" + "'", str10, "2232");
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + true + "'", boolean13, true);
        org.junit.Assert.assertEquals("'" + boolean14 + "' != '" + true + "'", boolean14, true);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean794();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1061();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "108" + "'", str5, "108");
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString565();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString140();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager577();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager71();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean756();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "574" + "'", str5, "574");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2205" + "'", str6, "2205");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean920();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean844();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager581();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + false + "'", boolean7, false);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager335();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString987();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString894();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager410();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager62();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager589();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager999();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean482();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "15313" + "'", str6, "15313");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "11101" + "'", str7, "11101");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean726();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager807();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager471();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString409();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString938();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean1009();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager867();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "7386" + "'", str6, "7386");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "11868" + "'", str7, "11868");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager995();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString566();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean252();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString594();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager638();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean494();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean908();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString720();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString90();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString1010();
        java.lang.String str15 = serializedObjectSupporter0.deserializeObjectString440();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager16 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager314();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager17 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager842();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "584" + "'", str6, "584");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1279" + "'", str8, "1279");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "5962" + "'", str12, "5962");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1240" + "'", str13, "1240");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "40304" + "'", str14, "40304");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "9931" + "'", str15, "9931");
        org.junit.Assert.assertNotNull(deploymentEntityManager16);
        org.junit.Assert.assertNotNull(deploymentEntityManager17);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager995();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager333();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean276();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean835();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean932();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager462();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1003();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString691();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString481();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "25307" + "'", str11, "25307");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "5537" + "'", str12, "5537");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10771" + "'", str13, "10771");
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean577();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString429();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean636();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager867();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString487();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9076" + "'", str3, "9076");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10895" + "'", str6, "10895");
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager995();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager333();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean276();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean835();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean932();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager143();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString871();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager201();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager733();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean569();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean349();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager312();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager186();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10847" + "'", str6, "10847");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean883();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean611();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager263();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager429();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager938();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "584" + "'", str6, "584");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2916" + "'", str8, "2916");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1232" + "'", str9, "1232");
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString674();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager788();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager9();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString515();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5173" + "'", str4, "5173");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "11572" + "'", str8, "11572");
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean115();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager166();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString372();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean53();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "6549" + "'", str6, "6549");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString569();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager382();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean96();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString352();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString283();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString626();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "649" + "'", str4, "649");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "6136" + "'", str7, "6136");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4466" + "'", str8, "4466");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1945" + "'", str9, "1945");
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString861();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString192();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager459();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean524();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean957();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10711" + "'", str3, "10711");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2453" + "'", str5, "2453");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager533();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager454();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString351();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "6111" + "'", str8, "6111");
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString861();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean1060();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager247();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean31();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager746();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager610();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10711" + "'", str3, "10711");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString169();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager928();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString749();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2360" + "'", str2, "2360");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7557" + "'", str4, "7557");
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager533();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean126();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean554();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager375();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean800();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager219();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString279();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean298();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString241();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager181();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean710();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager296();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager887();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4286" + "'", str3, "4286");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2871" + "'", str5, "2871");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString861();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean1060();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager247();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1056();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString768();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager978();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10711" + "'", str3, "10711");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "68" + "'", str6, "68");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "8668" + "'", str7, "8668");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1045();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager376();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager973();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean222();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager675();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString890();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10001" + "'", str5, "10001");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "11049" + "'", str10, "11049");
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString569();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager188();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString305();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean831();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "649" + "'", str4, "649");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5021" + "'", str6, "5021");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager516();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1050();
        java.lang.Boolean boolean13 = serializedObjectSupporter0.deserializeObjectBoolean993();
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
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "17" + "'", str12, "17");
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + true + "'", boolean13, true);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1045();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager376();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean736();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager647();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString485();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager542();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager340();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10001" + "'", str5, "10001");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10867" + "'", str9, "10867");
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean577();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString429();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString728();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString302();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9076" + "'", str3, "9076");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "6195" + "'", str4, "6195");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4968" + "'", str5, "4968");
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean445();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager207();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString758();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean94();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean1042();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "8023" + "'", str5, "8023");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString861();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString962();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10711" + "'", str3, "10711");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "12152" + "'", str5, "12152");
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString800();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean701();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString196();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString611();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager352();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString751();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "9562" + "'", str2, "9562");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2469" + "'", str4, "2469");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1545" + "'", str5, "1545");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "7624" + "'", str7, "7624");
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString569();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager382();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean96();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString352();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager383();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager537();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "649" + "'", str4, "649");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "6136" + "'", str7, "6136");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager555();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString87();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1177" + "'", str3, "1177");
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString861();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean1060();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager965();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager102();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager536();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10711" + "'", str3, "10711");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager995();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager333();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean276();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean835();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager741();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1045();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager376();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager992();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString897();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString18();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager241();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10001" + "'", str5, "10001");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "11164" + "'", str8, "11164");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "230" + "'", str9, "230");
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean726();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager807();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager629();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString605();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString34();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1418" + "'", str6, "1418");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "397" + "'", str7, "397");
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString279();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager318();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString675();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager923();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean138();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString747();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4286" + "'", str3, "4286");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5190" + "'", str5, "5190");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "7478" + "'", str8, "7478");
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager995();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString566();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean252();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean592();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager553();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "584" + "'", str6, "584");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1279" + "'", str8, "1279");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean794();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager835();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString871();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString66();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString628();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager773();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean132();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1023();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10847" + "'", str6, "10847");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "789" + "'", str7, "789");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970" + "'", str8, "1970");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + false + "'", boolean10, false);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString37();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager808();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager178();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean496();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean554();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean251();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean297();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "420" + "'", str1, "420");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "80" + "'", str2, "80");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString800();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean554();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean204();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString495();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString866();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString312();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "9562" + "'", str2, "9562");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "11124" + "'", str5, "11124");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10747" + "'", str6, "10747");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5204" + "'", str7, "5204");
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString871();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager201();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager733();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean569();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean428();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager443();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager315();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString329();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager14 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager179();
        deploymentEntityManager14.close();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10847" + "'", str6, "10847");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "5579" + "'", str13, "5579");
        org.junit.Assert.assertNotNull(deploymentEntityManager14);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager812();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager430();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager139();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean726();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString468();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean123();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString439();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager177();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager409();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean624();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager385();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10587" + "'", str4, "10587");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "9918" + "'", str7, "9918");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString871();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager201();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager733();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean569();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean244();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean710();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean86();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager13 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager350();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10847" + "'", str6, "10847");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager13);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager995();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager333();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean276();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean835();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean259();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString731();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean703();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString927();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager13 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager322();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "6396" + "'", str10, "6396");
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "11656" + "'", str12, "11656");
        org.junit.Assert.assertNotNull(deploymentEntityManager13);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager335();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString987();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString894();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean286();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean609();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "15313" + "'", str6, "15313");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "11101" + "'", str7, "11101");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString861();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString192();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean690();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager857();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10711" + "'", str3, "10711");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2453" + "'", str5, "2453");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager533();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean862();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean646();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager628();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString664();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString126();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "5013" + "'", str10, "5013");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2117" + "'", str11, "2117");
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString473();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString382();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager714();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager730();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean486();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean108();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString193();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10628" + "'", str2, "10628");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6661" + "'", str3, "6661");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2456" + "'", str8, "2456");
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager934();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager90();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager335();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString513();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString391();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1003();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager375();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "11513" + "'", str6, "11513");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "6843" + "'", str7, "6843");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean920();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean844();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString651();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager817();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + false + "'", boolean7, false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2389" + "'", str8, "2389");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager375();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString664();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean251();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5013" + "'", str6, "5013");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2844" + "'", str7, "2844");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean577();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString429();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString683();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager499();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager656();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager893();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString211();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9076" + "'", str3, "9076");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5369" + "'", str4, "5369");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2526" + "'", str8, "2526");
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager335();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean263();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean1030();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString752();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString926();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager976();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean511();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString492();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager13 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager20();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "7669" + "'", str8, "7669");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "12804" + "'", str9, "12804");
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "11077" + "'", str12, "11077");
        org.junit.Assert.assertNotNull(deploymentEntityManager13);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager995();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager333();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean276();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean835();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean932();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString868();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10775" + "'", str10, "10775");
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean263();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean838();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager879();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager867();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString473();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager507();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString375();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean581();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString116();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString438();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean425();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString609();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10628" + "'", str2, "10628");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "6596" + "'", str4, "6596");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1924" + "'", str6, "1924");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "9901" + "'", str7, "9901");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1470" + "'", str9, "1470");
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString569();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean199();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean105();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean71();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager185();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean114();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString71();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager127();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager58();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "649" + "'", str4, "649");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "853" + "'", str10, "853");
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString568();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager376();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString28();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "634" + "'", str4, "634");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "312" + "'", str6, "312");
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString473();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager507();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean586();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean715();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager515();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString359();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean355();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10628" + "'", str2, "10628");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "6312" + "'", str7, "6312");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean726();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager807();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString732();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean683();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString681();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean410();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "6483" + "'", str5, "6483");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5328" + "'", str7, "5328");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString800();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean701();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString196();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString611();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString192();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean1027();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager218();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "9562" + "'", str2, "9562");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2469" + "'", str4, "2469");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1545" + "'", str5, "1545");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2453" + "'", str6, "2453");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager585();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager437();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString982();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean691();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean86();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager382();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "12495" + "'", str4, "12495");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString861();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager638();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean830();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString675();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString696();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString199();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10711" + "'", str3, "10711");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5190" + "'", str6, "5190");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5662" + "'", str7, "5662");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2480" + "'", str8, "2480");
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean920();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager631();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager738();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString416();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "7502" + "'", str10, "7502");
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean602();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + false + "'", boolean2, false);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
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
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean658();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager750();
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
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager136();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1032();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager135();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1007();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean280();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString279();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean298();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString241();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager181();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager590();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager713();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString608();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4286" + "'", str3, "4286");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2871" + "'", str5, "2871");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1460" + "'", str10, "1460");
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean1048();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString431();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString116();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean1023();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager686();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9440" + "'", str3, "9440");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1924" + "'", str4, "1924");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString473();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager507();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager102();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager833();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager456();
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter7 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean8 = serializedObjectSupporter7.deserializeObjectBoolean597();
        java.lang.Boolean boolean9 = serializedObjectSupporter7.deserializeObjectBoolean900();
        java.lang.String str10 = serializedObjectSupporter7.deserializeObjectString318();
        java.lang.Boolean boolean11 = serializedObjectSupporter7.deserializeObjectBoolean326();
        java.lang.String str12 = serializedObjectSupporter7.deserializeObjectString1045();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager13 = serializedObjectSupporter7.deserializeObjectDeploymentEntityManager376();
        java.lang.String str14 = serializedObjectSupporter7.deserializeObjectString924();
        java.lang.Boolean boolean15 = serializedObjectSupporter7.deserializeObjectBoolean794();
        java.lang.String str16 = serializedObjectSupporter7.deserializeObjectString1040();
        deploymentEntityManager6.serializedObjectSupporter = serializedObjectSupporter7;
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10628" + "'", str2, "10628");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "5346" + "'", str10, "5346");
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10001" + "'", str12, "10001");
        org.junit.Assert.assertNotNull(deploymentEntityManager13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "11592" + "'", str14, "11592");
        org.junit.Assert.assertEquals("'" + boolean15 + "' != '" + true + "'", boolean15, true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "53" + "'", str16, "53");
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager645();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean198();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean337();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1052();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString832();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean54();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString443();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString639();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10512" + "'", str6, "10512");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10040" + "'", str8, "10040");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2158" + "'", str9, "2158");
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString666();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager260();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString683();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager786();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5066" + "'", str3, "5066");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5369" + "'", str5, "5369");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString473();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString979();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean416();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString948();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString753();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10628" + "'", str2, "10628");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "12407" + "'", str3, "12407");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "11988" + "'", str5, "11988");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "7757" + "'", str6, "7757");
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString473();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager507();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager102();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean968();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean116();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean516();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10628" + "'", str2, "10628");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString666();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1055();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager895();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean971();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager104();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager854();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean862();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5066" + "'", str3, "5066");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "57" + "'", str4, "57");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager995();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString566();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean252();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean476();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "584" + "'", str6, "584");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1279" + "'", str8, "1279");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString473();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString515();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean800();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean867();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10628" + "'", str2, "10628");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11572" + "'", str3, "11572");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString37();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager808();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager178();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager62();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean1051();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean539();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString719();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean1045();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "420" + "'", str1, "420");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "80" + "'", str2, "80");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "5949" + "'", str8, "5949");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager45();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager13 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1012();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString398();
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
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
        org.junit.Assert.assertNotNull(deploymentEntityManager13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "6977" + "'", str14, "6977");
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString666();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager260();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString683();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString165();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5066" + "'", str3, "5066");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5369" + "'", str5, "5369");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2337" + "'", str6, "2337");
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString473();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString979();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean416();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString948();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean90();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean159();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager407();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10628" + "'", str2, "10628");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "12407" + "'", str3, "12407");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "11988" + "'", str5, "11988");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString569();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager877();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1002();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager390();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1054();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "649" + "'", str4, "649");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "25304" + "'", str6, "25304");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString728();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString270();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString409();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean330();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager641();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean919();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6195" + "'", str3, "6195");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "3907" + "'", str4, "3907");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "7386" + "'", str5, "7386");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString800();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean554();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean204();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager497();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString924();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager81();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString194();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "9562" + "'", str2, "9562");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "11592" + "'", str6, "11592");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2461" + "'", str8, "2461");
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString963();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString588();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString775();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean784();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "12162" + "'", str2, "12162");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1056" + "'", str3, "1056");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "8961" + "'", str4, "8961");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean263();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager392();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean255();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager467();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean1065();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString963();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString61();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString406();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1024();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString928();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean724();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "12162" + "'", str2, "12162");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "747" + "'", str3, "747");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7079" + "'", str4, "7079");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "75304" + "'", str5, "75304");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "11667" + "'", str6, "11667");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager136();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1032();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean204();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean559();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString371();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager797();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager57();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "6542" + "'", str9, "6542");
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager533();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean126();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager311();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString401();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean465();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean857();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "7013" + "'", str9, "7013");
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString169();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager928();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString409();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2360" + "'", str2, "2360");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7386" + "'", str4, "7386");
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString871();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString66();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString70();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString19();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager821();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString218();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10847" + "'", str6, "10847");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "789" + "'", str7, "789");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "850" + "'", str8, "850");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "242" + "'", str9, "242");
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2614" + "'", str11, "2614");
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString569();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean199();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean414();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean896();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString524();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString850();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "649" + "'", str4, "649");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "11610" + "'", str8, "11610");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10633" + "'", str9, "10633");
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager995();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString566();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean252();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString594();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager638();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean849();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString576();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString995();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager13 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager572();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString396();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "584" + "'", str6, "584");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1279" + "'", str8, "1279");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + false + "'", boolean10, false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "791" + "'", str11, "791");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "15436" + "'", str12, "15436");
        org.junit.Assert.assertNotNull(deploymentEntityManager13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "6946" + "'", str14, "6946");
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString279();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean298();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean946();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean460();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString353();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean740();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean841();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4286" + "'", str3, "4286");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "6139" + "'", str7, "6139");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString871();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager201();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager733();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean569();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean428();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager443();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString242();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager13 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager324();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager14 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager498();
        java.lang.String str15 = serializedObjectSupporter0.deserializeObjectString662();
        java.lang.String str16 = serializedObjectSupporter0.deserializeObjectString275();
        java.lang.Boolean boolean17 = serializedObjectSupporter0.deserializeObjectBoolean932();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager18 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager853();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10847" + "'", str6, "10847");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2916" + "'", str12, "2916");
        org.junit.Assert.assertNotNull(deploymentEntityManager13);
        org.junit.Assert.assertNotNull(deploymentEntityManager14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2497" + "'", str15, "2497");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "4130" + "'", str16, "4130");
        org.junit.Assert.assertEquals("'" + boolean17 + "' != '" + true + "'", boolean17, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager18);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager265();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager432();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager311();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager522();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean762();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString823();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10406" + "'", str7, "10406");
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean115();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager262();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString336();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager461();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString89();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5756" + "'", str6, "5756");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1232" + "'", str8, "1232");
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString861();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean1060();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager965();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager659();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean809();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean568();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString371();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager112();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean862();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString717();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager13 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager716();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10711" + "'", str3, "10711");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "6542" + "'", str9, "6542");
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "5933" + "'", str12, "5933");
        org.junit.Assert.assertNotNull(deploymentEntityManager13);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager335();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager902();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean857();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager874();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean879();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager335();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString987();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString894();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString900();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "15313" + "'", str6, "15313");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "11101" + "'", str7, "11101");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "11233" + "'", str8, "11233");
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager533();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager454();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean943();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean10();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean263();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean838();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager879();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean311();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean664();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString437();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1030();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString300();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean77();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString99();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean643();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager938();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager246();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager727();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9890" + "'", str3, "9890");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4948" + "'", str5, "4948");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1402" + "'", str7, "1402");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString728();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString231();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean182();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean395();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager726();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1024();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager778();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6195" + "'", str3, "6195");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2809" + "'", str4, "2809");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager995();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString566();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean252();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString620();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "584" + "'", str6, "584");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1792" + "'", str8, "1792");
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString569();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager188();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString305();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString606();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager45();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager644();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "649" + "'", str4, "649");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5021" + "'", str6, "5021");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1434" + "'", str7, "1434");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString565();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean159();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean507();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "574" + "'", str5, "574");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean844();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager654();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager765();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + false + "'", boolean5, false);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager995();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager333();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString488();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString825();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean226();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager386();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString123();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean691();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10899" + "'", str7, "10899");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10437" + "'", str8, "10437");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2061" + "'", str11, "2061");
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean263();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager392();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString978();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString218();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "12388" + "'", str4, "12388");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2614" + "'", str5, "2614");
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean1048();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString431();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString308();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean186();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9440" + "'", str3, "9440");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5119" + "'", str4, "5119");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager973();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean134();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean516();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean728();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager173();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager563();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1057();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager463();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean795();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString180();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString975();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean408();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager222();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2405" + "'", str4, "2405");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "12342" + "'", str5, "12342");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager995();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString566();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean252();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString594();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager638();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean849();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString576();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString995();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString808();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager14 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager422();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager15 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager180();
        java.lang.String str16 = serializedObjectSupporter0.deserializeObjectString111();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "584" + "'", str6, "584");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1279" + "'", str8, "1279");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + false + "'", boolean10, false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "791" + "'", str11, "791");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "15436" + "'", str12, "15436");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "9702" + "'", str13, "9702");
        org.junit.Assert.assertNotNull(deploymentEntityManager14);
        org.junit.Assert.assertNotNull(deploymentEntityManager15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1827" + "'", str16, "1827");
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager125();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager437();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1045();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager376();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager973();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean222();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager513();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString149();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean656();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager324();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager13 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager951();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10001" + "'", str5, "10001");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2232" + "'", str10, "2232");
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
        org.junit.Assert.assertNotNull(deploymentEntityManager13);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager533();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean1040();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager888();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
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
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean658();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager184();
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
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString37();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager808();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager178();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager456();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString922();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "420" + "'", str1, "420");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "80" + "'", str2, "80");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "11555" + "'", str6, "11555");
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager533();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean862();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString252();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean459();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager957();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager778();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager374();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "3263" + "'", str8, "3263");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean1048();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString431();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString116();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean1023();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString570();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean988();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager201();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9440" + "'", str3, "9440");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1924" + "'", str4, "1924");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "663" + "'", str6, "663");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + false + "'", boolean7, false);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString963();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString301();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean1046();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager625();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString870();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "12162" + "'", str2, "12162");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4958" + "'", str3, "4958");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10836" + "'", str6, "10836");
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString37();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager808();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager178();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager62();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1026();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString449();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "420" + "'", str1, "420");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "80" + "'", str2, "80");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "80304" + "'", str6, "80304");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10131" + "'", str7, "10131");
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString569();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager406();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager141();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager986();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "649" + "'", str4, "649");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean539();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString541();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean865();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString796();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString686();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "12486" + "'", str5, "12486");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "9468" + "'", str7, "9468");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "5425" + "'", str8, "5425");
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager335();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean263();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean385();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5346" + "'", str7, "5346");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean726();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString468();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString628();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager585();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean913();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean211();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager619();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10587" + "'", str4, "10587");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970" + "'", str5, "1970");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean577();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString17();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager415();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1011();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean154();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean183();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean594();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "221" + "'", str3, "221");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager995();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager333();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean276();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean835();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean932();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager462();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString816();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10162" + "'", str11, "10162");
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean445();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager207();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString758();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean94();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString937();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString241();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "8023" + "'", str5, "8023");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "11849" + "'", str7, "11849");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2871" + "'", str8, "2871");
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString800();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean701();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString52();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "9562" + "'", str2, "9562");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "634" + "'", str4, "634");
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager995();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString566();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean252();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString594();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager638();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean849();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString576();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString80();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString25();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "584" + "'", str6, "584");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1279" + "'", str8, "1279");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + false + "'", boolean10, false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "791" + "'", str11, "791");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1047" + "'", str12, "1047");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "295" + "'", str13, "295");
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean664();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString437();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1030();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString300();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean77();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString99();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean643();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager938();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager353();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9890" + "'", str3, "9890");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4948" + "'", str5, "4948");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1402" + "'", str7, "1402");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager463();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString128();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean871();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1002();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager350();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1007();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager166();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2138" + "'", str3, "2138");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "25304" + "'", str5, "25304");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString473();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString382();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager141();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager84();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean954();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10628" + "'", str2, "10628");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6661" + "'", str3, "6661");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean1048();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean59();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager530();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager547();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean166();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", boolean6, false);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager516();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean576();
        java.lang.Boolean boolean13 = serializedObjectSupporter0.deserializeObjectBoolean772();
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
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + true + "'", boolean13, true);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString279();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager318();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString675();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager923();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean138();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager568();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString871();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4286" + "'", str3, "4286");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5190" + "'", str5, "5190");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10847" + "'", str9, "10847");
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager934();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean933();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean867();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager129();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5200" + "'", str3, "5200");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager645();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString418();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean60();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString766();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean998();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1015();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "7644" + "'", str3, "7644");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "8557" + "'", str5, "8557");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "52804" + "'", str7, "52804");
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString728();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString231();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager853();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString530();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6195" + "'", str3, "6195");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2809" + "'", str4, "2809");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "12035" + "'", str6, "12035");
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager335();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean263();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean870();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1024();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager244();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager618();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean901();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean304();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "75304" + "'", str8, "75304");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString963();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString301();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString403();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean469();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString885();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString841();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "12162" + "'", str2, "12162");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4958" + "'", str3, "4958");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7042" + "'", str4, "7042");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "11002" + "'", str6, "11002");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10585" + "'", str7, "10585");
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager533();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean862();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager380();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean430();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager152();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString165();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2337" + "'", str11, "2337");
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString569();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager877();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager207();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString17();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString89();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager555();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString880();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "649" + "'", str4, "649");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "221" + "'", str7, "221");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1232" + "'", str8, "1232");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10946" + "'", str10, "10946");
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString674();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager788();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager9();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString935();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5173" + "'", str4, "5173");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "11811" + "'", str7, "11811");
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean315();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean964();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager280();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager533();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean862();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean646();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager628();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString342();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString628();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString705();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager13 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        java.lang.Boolean boolean14 = serializedObjectSupporter0.deserializeObjectBoolean127();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager15 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager767();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "5870" + "'", str10, "5870");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970" + "'", str11, "1970");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "5834" + "'", str12, "5834");
        org.junit.Assert.assertNotNull(deploymentEntityManager13);
        org.junit.Assert.assertEquals("'" + boolean14 + "' != '" + true + "'", boolean14, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager15);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager533();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString94();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString996();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean942();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager996();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1292" + "'", str7, "1292");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "15466" + "'", str8, "15466");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager995();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString566();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean252();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString594();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager768();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean198();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "584" + "'", str6, "584");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1279" + "'", str8, "1279");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString861();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString712();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean406();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10711" + "'", str3, "10711");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5894" + "'", str4, "5894");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString37();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager867();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager225();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager552();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager976();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "420" + "'", str1, "420");
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString169();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString213();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean670();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1000();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean503();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean458();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2360" + "'", str2, "2360");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2547" + "'", str3, "2547");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString569();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager877();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1002();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager390();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager478();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager747();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager531();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean567();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "649" + "'", str4, "649");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "25304" + "'", str6, "25304");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager645();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString418();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean60();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString766();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString104();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "7644" + "'", str3, "7644");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "8557" + "'", str5, "8557");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1670" + "'", str6, "1670");
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
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
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean120();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean793();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager738();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString920();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString189();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager15 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager492();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "584" + "'", str6, "584");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1279" + "'", str8, "1279");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "11527" + "'", str13, "11527");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2440" + "'", str14, "2440");
        org.junit.Assert.assertNotNull(deploymentEntityManager15);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager555();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1053();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString644();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager418();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean475();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "43" + "'", str3, "43");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2322" + "'", str4, "2322");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString569();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString445();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager98();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "649" + "'", str4, "649");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10065" + "'", str5, "10065");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean445();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean9();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString834();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString49();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "595" + "'", str6, "595");
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean726();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString468();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString628();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager585();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean457();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager335();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean1033();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10587" + "'", str4, "10587");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970" + "'", str5, "1970");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean263();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1006();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString624();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager470();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "25316" + "'", str3, "25316");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1918" + "'", str4, "1918");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString565();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString140();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager577();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager71();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString489();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "574" + "'", str5, "574");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2205" + "'", str6, "2205");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10984" + "'", str9, "10984");
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString304();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager872();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString299();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager377();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean274();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5018" + "'", str4, "5018");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4938" + "'", str6, "4938");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean577();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString429();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString728();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean93();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9076" + "'", str3, "9076");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "6195" + "'", str4, "6195");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean115();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager166();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean350();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager897();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean723();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean134();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager265();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString626();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + false + "'", boolean9, false);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1945" + "'", str11, "1945");
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean1048();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString431();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean208();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager872();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString463();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager546();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9440" + "'", str3, "9440");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10406" + "'", str6, "10406");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1045();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager376();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager973();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString538();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean465();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10001" + "'", str5, "10001");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "12399" + "'", str8, "12399");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString37();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager571();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager802();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager389();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString102();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "420" + "'", str1, "420");
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1553" + "'", str5, "1553");
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager533();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean862();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString252();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager994();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager898();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString176();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "3263" + "'", str8, "3263");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2389" + "'", str11, "2389");
    }
}

