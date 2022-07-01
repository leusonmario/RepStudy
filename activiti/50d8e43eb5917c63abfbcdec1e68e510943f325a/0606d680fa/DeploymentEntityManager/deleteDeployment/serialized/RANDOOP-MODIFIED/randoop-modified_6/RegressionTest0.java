import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager570();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager239();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager821();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager560();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean270();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean838();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1047();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString872();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager902();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean890();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10862" + "'", str4, "10862");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean662();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean769();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager966();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager923();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString414();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager520();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager336();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager713();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean78();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "7440" + "'", str6, "7440");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager478();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean617();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString617();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager839();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1693" + "'", str5, "1693");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean60();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean183();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString979();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "12407" + "'", str6, "12407");
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean753();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString223();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager75();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2638" + "'", str3, "2638");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString414();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1064();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString413();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager976();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "7440" + "'", str6, "7440");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "7429" + "'", str8, "7429");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean320();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString572();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager255();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList8 = deploymentEntityManager4.findDeploymentsByNativeQuery(strMap5, (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "702" + "'", str2, "702");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager478();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString782();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean391();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager975();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager855();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9333" + "'", str3, "9333");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString910();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager938();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager742();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1059();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager498();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11414" + "'", str4, "11414");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager898();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString481();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10771" + "'", str7, "10771");
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean753();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString223();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager711();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2638" + "'", str3, "2638");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean270();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString745();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean324();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "7366" + "'", str2, "7366");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString414();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString298();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager168();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "7440" + "'", str6, "7440");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4928" + "'", str7, "4928");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString244();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean864();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager579();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "3006" + "'", str4, "3006");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean270();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean838();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString724();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager9();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean908();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5996" + "'", str3, "5996");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean662();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean951();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager57();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString853();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10670" + "'", str6, "10670");
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean1047();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean732();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean789();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean876();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean775();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager570();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean634();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager634();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString217();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString676();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager346();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager959();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2611" + "'", str6, "2611");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5200" + "'", str7, "5200");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean60();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager243();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager118();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean662();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager562();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean158();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager693();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean753();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean869();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager646();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager136();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager573();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager605();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean225();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean201();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager648();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean543();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean270();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean838();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString910();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean1037();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean650();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11414" + "'", str3, "11414");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean270();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean838();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString724();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager9();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString274();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString310();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5996" + "'", str3, "5996");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4085" + "'", str5, "4085");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5156" + "'", str6, "5156");
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean483();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager245();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString414();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1064();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager979();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager416();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "7440" + "'", str6, "7440");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString910();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean937();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1060();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString338();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean115();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11414" + "'", str4, "11414");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5794" + "'", str7, "5794");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean270();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString745();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean324();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString764();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString771();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager574();
        deploymentEntityManager6.close();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "7366" + "'", str2, "7366");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "8439" + "'", str4, "8439");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "8784" + "'", str5, "8784");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean60();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString128();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString458();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2138" + "'", str5, "2138");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10229" + "'", str6, "10229");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean753();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean869();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager646();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean541();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString541();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean832();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "12486" + "'", str6, "12486");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager898();
        org.activiti.engine.impl.db.PersistentObject persistentObject7 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager6.insert(persistentObject7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean270();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean838();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString910();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean1037();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11414" + "'", str3, "11414");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager130();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean853();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager750();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString421();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean998();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "7879" + "'", str9, "7879");
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager573();
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity6 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager5.insertDeployment(deploymentEntity6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager570();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager239();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager821();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean397();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager52();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean435();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager130();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager732();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager763();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString514();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager402();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString568();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString721();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString931();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager826();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11551" + "'", str3, "11551");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "634" + "'", str5, "634");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5971" + "'", str6, "5971");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "11707" + "'", str7, "11707");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean683();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString173();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString539();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager634();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2376" + "'", str6, "2376");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "12414" + "'", str7, "12414");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1043();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString879();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10932" + "'", str6, "10932");
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean753();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString223();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString434();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean236();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString32();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean607();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2638" + "'", str3, "2638");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "9762" + "'", str4, "9762");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "374" + "'", str6, "374");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager570();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager122();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString538();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "12399" + "'", str5, "12399");
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1043();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean981();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean60();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString128();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString430();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2138" + "'", str5, "2138");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9349" + "'", str6, "9349");
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager570();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager239();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString171();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2368" + "'", str5, "2368");
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString180();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean546();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager881();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2405" + "'", str5, "2405");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString514();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString717();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager857();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString671();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean111();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager637();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11551" + "'", str3, "11551");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5933" + "'", str4, "5933");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5132" + "'", str6, "5132");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean483();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean985();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", boolean6, false);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean662();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean769();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString572();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean227();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "702" + "'", str5, "702");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean820();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString148();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2229" + "'", str3, "2229");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager214();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager485();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager990();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString180();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager836();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager924();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2405" + "'", str5, "2405");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString910();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager938();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager742();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1059();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager180();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString980();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11414" + "'", str4, "11414");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "12422" + "'", str9, "12422");
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean683();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString173();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString539();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString465();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean678();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2376" + "'", str6, "2376");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "12414" + "'", str7, "12414");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10538" + "'", str8, "10538");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString514();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager402();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString568();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean981();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11551" + "'", str3, "11551");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "634" + "'", str5, "634");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString910();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager938();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager742();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1059();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager744();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString125();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11414" + "'", str4, "11414");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2105" + "'", str9, "2105");
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean662();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean769();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString436();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "9880" + "'", str5, "9880");
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString910();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean937();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1060();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString338();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1057();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean1017();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString551();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager242();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11414" + "'", str4, "11414");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5794" + "'", str7, "5794");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "286" + "'", str10, "286");
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString910();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString396();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11414" + "'", str4, "11414");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "6946" + "'", str5, "6946");
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1043();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString644();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean1057();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString379();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager81();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2322" + "'", str6, "2322");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "6638" + "'", str8, "6638");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1043();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString644();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean1057();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString379();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean518();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager382();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager77();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager400();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2322" + "'", str6, "2322");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "6638" + "'", str8, "6638");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + false + "'", boolean9, false);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString244();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean864();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean54();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString764();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "3006" + "'", str4, "3006");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "8439" + "'", str7, "8439");
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean753();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString223();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString227();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean825();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString373();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2638" + "'", str3, "2638");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2775" + "'", str4, "2775");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "6581" + "'", str6, "6581");
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean219();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean840();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager86();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager491();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean274();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1043();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString644();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString457();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString334();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager56();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2322" + "'", str6, "2322");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10225" + "'", str7, "10225");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "5708" + "'", str8, "5708");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean753();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString223();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString434();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean236();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager563();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString668();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2638" + "'", str3, "2638");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "9762" + "'", str4, "9762");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5093" + "'", str7, "5093");
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString653();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean749();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean271();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2398" + "'", str5, "2398");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString217();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager764();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1009();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean1000();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2611" + "'", str6, "2611");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean683();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString173();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString800();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1008();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2376" + "'", str6, "2376");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "9562" + "'", str7, "9562");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "30304" + "'", str8, "30304");
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager478();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString782();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean391();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager975();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager701();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager554();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager848();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9333" + "'", str3, "9333");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString414();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager520();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager336();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager713();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean186();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "7440" + "'", str6, "7440");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager570();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean634();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString65();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean782();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager926();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager917();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager496();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean722();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean1063();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "781" + "'", str5, "781");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean662();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean951();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager480();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean995();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager624();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean320();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString572();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager255();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean232();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean722();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean705();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager477();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager615();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "702" + "'", str2, "702");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString910();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager938();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager548();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11414" + "'", str4, "11414");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString910();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager938();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean647();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11414" + "'", str4, "11414");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean320();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString572();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager255();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean561();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "702" + "'", str2, "702");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean320();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString572();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager26();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString312();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean163();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager532();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "702" + "'", str2, "702");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5204" + "'", str5, "5204");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean753();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager730();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager334();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString910();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager938();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager742();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString761();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager959();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString146();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11414" + "'", str4, "11414");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "8141" + "'", str7, "8141");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2223" + "'", str9, "2223");
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean904();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager717();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager422();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager979();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager570();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager239();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager821();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean397();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager181();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString334();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString612();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "5708" + "'", str8, "5708");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1595" + "'", str9, "1595");
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString617();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString297();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString111();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager181();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString834();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1693" + "'", str5, "1693");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4920" + "'", str6, "4920");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1827" + "'", str7, "1827");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1" + "'", str9, "1");
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean952();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString785();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean995();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager579();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "9343" + "'", str2, "9343");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean952();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString785();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean995();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager677();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "9343" + "'", str2, "9343");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString217();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString138();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2611" + "'", str6, "2611");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5200" + "'", str7, "5200");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "61" + "'", str8, "61");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2199" + "'", str9, "2199");
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString910();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager887();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11414" + "'", str4, "11414");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean320();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString572();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager319();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean836();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager278();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "702" + "'", str2, "702");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean753();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString120();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1028();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean750();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager40();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString647();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2005" + "'", str3, "2005");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2360" + "'", str7, "2360");
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean60();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString128();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean712();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString523();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2138" + "'", str5, "2138");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "11606" + "'", str7, "11606");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean753();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager730();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString807();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1021();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager60();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "9677" + "'", str4, "9677");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean753();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString120();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean491();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2005" + "'", str3, "2005");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean270();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean838();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString724();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager976();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5996" + "'", str3, "5996");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager478();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager408();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString27();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1022();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString719();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "304" + "'", str4, "304");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5949" + "'", str6, "5949");
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean320();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString572();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager255();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean232();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean722();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean705();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager477();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString451();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager734();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "702" + "'", str2, "702");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10137" + "'", str9, "10137");
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString872();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean152();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager380();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10862" + "'", str4, "10862");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean952();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString785();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean304();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString78();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString58();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager84();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "9343" + "'", str2, "9343");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1010" + "'", str4, "1010");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "704" + "'", str5, "704");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean320();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString572();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager26();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager124();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean148();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager894();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "702" + "'", str2, "702");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean320();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString572();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager26();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager124();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString131();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean1013();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "702" + "'", str2, "702");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2178" + "'", str6, "2178");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean753();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString223();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString434();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager407();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString195();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2638" + "'", str3, "2638");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "9762" + "'", str4, "9762");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2464" + "'", str6, "2464");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean982();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString67();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "800" + "'", str5, "800");
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString414();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager520();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager336();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean758();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager672();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager48();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "7440" + "'", str6, "7440");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager570();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString701();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager86();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager668();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5764" + "'", str4, "5764");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager898();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager729();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString414();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager395();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "7440" + "'", str6, "7440");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager570();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean634();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString65();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean782();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager926();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager917();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager507();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "781" + "'", str5, "781");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager319();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean198();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString217();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean329();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString322();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2611" + "'", str6, "2611");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5200" + "'", str7, "5200");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "5450" + "'", str9, "5450");
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager478();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager408();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString27();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1022();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString666();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "304" + "'", str4, "304");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5066" + "'", str6, "5066");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString414();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString298();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager443();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString77();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "7440" + "'", str6, "7440");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4928" + "'", str7, "4928");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "984" + "'", str9, "984");
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1043();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString644();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean1057();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean330();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean231();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2322" + "'", str6, "2322");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager570();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean634();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString65();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager18();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager630();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "781" + "'", str5, "781");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean320();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager934();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager485();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager232();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean943();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean662();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean769();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager220();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager657();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager528();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean1007();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean320();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString572();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager255();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean232();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager781();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean440();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean630();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "702" + "'", str2, "702");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean753();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString120();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString488();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString653();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2005" + "'", str3, "2005");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10899" + "'", str4, "10899");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2398" + "'", str5, "2398");
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean683();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString173();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean782();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager388();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2376" + "'", str6, "2376");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString514();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString717();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString238();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean412();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager739();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString953();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11551" + "'", str3, "11551");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5933" + "'", str4, "5933");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2860" + "'", str5, "2860");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "12058" + "'", str8, "12058");
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString217();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString676();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager346();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager70();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager384();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2611" + "'", str6, "2611");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5200" + "'", str7, "5200");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString910();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString863();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager296();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString549();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11414" + "'", str4, "11414");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10720" + "'", str5, "10720");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "262" + "'", str8, "262");
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString217();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1047();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager895();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager725();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2611" + "'", str6, "2611");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "15001" + "'", str7, "15001");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean270();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean838();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager870();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager598();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager907();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean904();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager356();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean167();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean662();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean769();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean291();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager791();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager630();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager132();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean824();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean683();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString173();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean782();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString808();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager980();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString21();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2376" + "'", str6, "2376");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "9702" + "'", str8, "9702");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "256" + "'", str10, "256");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString414();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1064();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString413();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager842();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean159();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "7440" + "'", str6, "7440");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "7429" + "'", str8, "7429");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString217();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager467();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString440();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2611" + "'", str6, "2611");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "9931" + "'", str8, "9931");
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager130();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1047();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString782();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString220();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "9333" + "'", str8, "9333");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2624" + "'", str9, "2624");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1043();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean913();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager997();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString315();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean893();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager93();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "5273" + "'", str9, "5273");
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString244();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean864();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString763();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager410();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager388();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager558();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "3006" + "'", str4, "3006");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "8351" + "'", str6, "8351");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean753();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString223();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean669();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString264();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString416();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2638" + "'", str3, "2638");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3733" + "'", str5, "3733");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "7502" + "'", str6, "7502");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString872();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1064();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10862" + "'", str4, "10862");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString910();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean937();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1060();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager87();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager601();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager175();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager544();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11414" + "'", str4, "11414");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean662();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager564();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager535();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean120();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager478();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager408();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString467();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10563" + "'", str4, "10563");
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean270();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean838();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager17();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager459();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean60();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString128();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString801();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager682();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString196();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2138" + "'", str5, "2138");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9572" + "'", str6, "9572");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2469" + "'", str8, "2469");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString872();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager376();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString605();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager96();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10862" + "'", str4, "10862");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1418" + "'", str6, "1418");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager673();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean39();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1043();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString644();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager873();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager980();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean284();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2322" + "'", str6, "2322");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean904();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean66();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager690();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString843();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10591" + "'", str7, "10591");
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString395();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "6905" + "'", str4, "6905");
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString910();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager938();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager742();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1059();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager201();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1043();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager794();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString62();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager664();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11414" + "'", str4, "11414");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "765" + "'", str11, "765");
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1043();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean913();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager997();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString315();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString622();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean84();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean938();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "5273" + "'", str9, "5273");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1885" + "'", str10, "1885");
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager86();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager491();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString515();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "11572" + "'", str6, "11572");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager507();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager570();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean634();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString65();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean782();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean816();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean708();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "781" + "'", str5, "781");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + false + "'", boolean8, false);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean60();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager243();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean632();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean777();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager367();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean751();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager405();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean320();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString572();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager255();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean232();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean722();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean705();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager477();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString451();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager69();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "702" + "'", str2, "702");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10137" + "'", str9, "10137");
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager130();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean853();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager750();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1053();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager710();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean820();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean989();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean1027();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString394();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean21();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "6877" + "'", str5, "6877");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean270();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean838();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager870();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean596();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager678();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean753();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString120();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1028();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean750();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString879();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean376();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1005();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2005" + "'", str3, "2005");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10932" + "'", str6, "10932");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "25313" + "'", str8, "25313");
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1043();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString644();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean1057();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString379();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean528();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager421();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2322" + "'", str6, "2322");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "6638" + "'", str8, "6638");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString910();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager938();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager742();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1059();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager969();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean681();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean448();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11414" + "'", str4, "11414");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean662();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean769();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean291();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager695();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean268();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString226();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager610();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2772" + "'", str8, "2772");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean753();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager730();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString371();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager288();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5538" + "'", str4, "5538");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "6542" + "'", str5, "6542");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean60();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString128();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString801();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager457();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString256();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2138" + "'", str5, "2138");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9572" + "'", str6, "9572");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "3463" + "'", str8, "3463");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString910();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString863();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString221();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11414" + "'", str4, "11414");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10720" + "'", str5, "10720");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2627" + "'", str6, "2627");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean270();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean838();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString724();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager9();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString274();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager298();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString626();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager893();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean194();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString453();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5996" + "'", str3, "5996");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4085" + "'", str5, "4085");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1945" + "'", str7, "1945");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10173" + "'", str10, "10173");
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean60();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean661();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString151();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager116();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2238" + "'", str6, "2238");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean270();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean838();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString724();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager9();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString274();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager298();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString626();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager893();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean194();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean256();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5996" + "'", str3, "5996");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4085" + "'", str5, "4085");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1945" + "'", str7, "1945");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean683();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString173();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean782();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString859();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2376" + "'", str6, "2376");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10694" + "'", str8, "10694");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean753();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean869();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager646();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean541();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString541();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString88();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "12486" + "'", str6, "12486");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1203" + "'", str7, "1203");
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean662();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean769();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean291();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager695();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean268();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager76();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean643();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager482();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager964();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager850();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString984();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "15304" + "'", str7, "15304");
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean753();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString120();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1028();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean750();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager40();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean1054();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2005" + "'", str3, "2005");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean753();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString120();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1028();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean750();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager40();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean96();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager242();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean1038();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2005" + "'", str3, "2005");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean753();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString120();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1028();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean750();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString879();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1006();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager597();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2005" + "'", str3, "2005");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10932" + "'", str6, "10932");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "25316" + "'", str7, "25316");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1043();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString644();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean1057();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString379();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean528();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager550();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2322" + "'", str6, "2322");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "6638" + "'", str8, "6638");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager130();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean853();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager750();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean325();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString872();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager376();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString388();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10862" + "'", str4, "10862");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "6729" + "'", str6, "6729");
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString910();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager938();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean717();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean109();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager458();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager347();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString776();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11414" + "'", str4, "11414");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "9025" + "'", str10, "9025");
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager964();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager850();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean801();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString367();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString775();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "6482" + "'", str8, "6482");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "8961" + "'", str9, "8961");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString244();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString929();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager916();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager581();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean2();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "3006" + "'", str4, "3006");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "11675" + "'", str5, "11675");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + false + "'", boolean8, false);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean753();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean869();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager646();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean541();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString541();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager684();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString254();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean276();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "12486" + "'", str6, "12486");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "3373" + "'", str8, "3373");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1010();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager653();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString659();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean392();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean948();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2464" + "'", str6, "2464");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString217();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString827();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager602();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager110();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2611" + "'", str6, "2611");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10455" + "'", str7, "10455");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString910();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager938();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager742();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1059();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager201();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1043();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager794();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager641();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11414" + "'", str4, "11414");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean753();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString223();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean669();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean1028();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1061();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1016();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2638" + "'", str3, "2638");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "108" + "'", str6, "108");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean683();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString173();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString539();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString465();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean460();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1061();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2376" + "'", str6, "2376");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "12414" + "'", str7, "12414");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10538" + "'", str8, "10538");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString244();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "3006" + "'", str4, "3006");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager478();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString782();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean391();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager975();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager701();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString957();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString968();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString750();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9333" + "'", str3, "9333");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "12097" + "'", str7, "12097");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "12244" + "'", str8, "12244");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "7590" + "'", str9, "7590");
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean320();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString572();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager255();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean232();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean722();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean705();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager477();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString451();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1047();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager113();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "702" + "'", str2, "702");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10137" + "'", str9, "10137");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "15001" + "'", str10, "15001");
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean60();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString128();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean712();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager92();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean348();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2138" + "'", str5, "2138");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean753();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString223();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString434();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean236();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString32();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager56();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager313();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2638" + "'", str3, "2638");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "9762" + "'", str4, "9762");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "374" + "'", str6, "374");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString217();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString676();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager292();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean687();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2611" + "'", str6, "2611");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5200" + "'", str7, "5200");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean270();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString745();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager183();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString978();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean519();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "7366" + "'", str2, "7366");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "12388" + "'", str4, "12388");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + false + "'", boolean5, false);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString217();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager764();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString283();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString248();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2611" + "'", str6, "2611");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4466" + "'", str8, "4466");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3135" + "'", str9, "3135");
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean753();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString120();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1028();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean750();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager40();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1003();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2005" + "'", str3, "2005");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1010();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager653();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString659();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean392();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString343();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2464" + "'", str6, "2464");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "5915" + "'", str8, "5915");
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean60();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager243();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager543();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager392();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean270();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean838();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString724();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1022();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean47();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5996" + "'", str3, "5996");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "70304" + "'", str4, "70304");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString617();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString297();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString111();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean493();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean831();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager932();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1693" + "'", str5, "1693");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4920" + "'", str6, "4920");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1827" + "'", str7, "1827");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString653();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString319();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean138();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean7();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2398" + "'", str5, "2398");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5371" + "'", str6, "5371");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean753();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager335();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager640();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager152();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1043();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString644();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean1057();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString379();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean528();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString143();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString380();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2322" + "'", str6, "2322");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "6638" + "'", str8, "6638");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2214" + "'", str10, "2214");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "6646" + "'", str11, "6646");
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean753();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean869();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString472();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10618" + "'", str4, "10618");
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString244();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString929();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager916();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString914();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager844();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "3006" + "'", str4, "3006");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "11675" + "'", str5, "11675");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "11472" + "'", str7, "11472");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean320();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString572();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager255();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean232();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager781();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString255();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "702" + "'", str2, "702");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "3418" + "'", str8, "3418");
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString414();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString298();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean782();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager51();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString727();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "7440" + "'", str6, "7440");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4928" + "'", str7, "4928");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "6151" + "'", str10, "6151");
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1043();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString644();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager873();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager980();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1059();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2322" + "'", str6, "2322");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "94" + "'", str9, "94");
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString217();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean475();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager575();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString928();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString719();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2611" + "'", str6, "2611");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5200" + "'", str7, "5200");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "11667" + "'", str10, "11667");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "5949" + "'", str11, "5949");
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean60();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString128();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean712();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager92();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean167();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1000();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2138" + "'", str5, "2138");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "22813" + "'", str10, "22813");
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString910();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean937();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1060();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager87();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager904();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean943();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11414" + "'", str4, "11414");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean320();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString572();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager264();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean577();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager235();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "702" + "'", str2, "702");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean270();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean838();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString724();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager9();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean661();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString459();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager949();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5996" + "'", str3, "5996");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10323" + "'", str6, "10323");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean320();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString572();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager26();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString312();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean301();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "702" + "'", str2, "702");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5204" + "'", str5, "5204");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString617();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString297();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager610();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1693" + "'", str5, "1693");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4920" + "'", str6, "4920");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean270();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean529();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString312();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5204" + "'", str3, "5204");
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager478();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString938();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager394();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString122();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11868" + "'", str3, "11868");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2027" + "'", str5, "2027");
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean753();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString223();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString434();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager407();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager913();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2638" + "'", str3, "2638");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "9762" + "'", str4, "9762");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString377();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager632();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6624" + "'", str2, "6624");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString910();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean937();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1060();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager87();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager601();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean499();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager350();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString902();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11414" + "'", str4, "11414");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "11270" + "'", str11, "11270");
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean60();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean183();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean621();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean857();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager914();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString910();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean937();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString92();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString83();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString620();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11414" + "'", str4, "11414");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1263" + "'", str6, "1263");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1090" + "'", str7, "1090");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1792" + "'", str8, "1792");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean270();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean838();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString910();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean166();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager770();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager300();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11414" + "'", str3, "11414");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager964();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager984();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean258();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean270();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean838();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString724();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager9();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString96();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString429();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager371();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean64();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5996" + "'", str3, "5996");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1336" + "'", str5, "1336");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9076" + "'", str6, "9076");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager570();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean634();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString65();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean850();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean888();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString794();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "781" + "'", str5, "781");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", boolean6, false);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "9433" + "'", str8, "9433");
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean60();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean183();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean621();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean351();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean320();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager934();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean87();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean44();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString910();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean937();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString185();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1016();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11414" + "'", str4, "11414");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2424" + "'", str6, "2424");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "55304" + "'", str7, "55304");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString910();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString745();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean498();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean684();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean262();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager862();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean394();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager900();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11414" + "'", str4, "11414");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "7366" + "'", str5, "7366");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString414();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString298();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean782();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager51();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean951();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean773();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "7440" + "'", str6, "7440");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4928" + "'", str7, "4928");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean270();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean529();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager763();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString792();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager544();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "9410" + "'", str4, "9410");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString414();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean745();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString588();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager880();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "7440" + "'", str6, "7440");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1056" + "'", str8, "1056");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean753();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString223();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString227();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean825();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager93();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager890();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager996();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2638" + "'", str3, "2638");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2775" + "'", str4, "2775");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString910();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager938();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager742();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString761();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1030();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager636();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString544();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11414" + "'", str4, "11414");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "8141" + "'", str7, "8141");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "90304" + "'", str8, "90304");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "167" + "'", str10, "167");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager130();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1047();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager387();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager573();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager738();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager101();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean952();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString785();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString418();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager693();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString247();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "9343" + "'", str2, "9343");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "7644" + "'", str3, "7644");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3132" + "'", str5, "3132");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean952();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString785();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString150();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager835();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager765();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "9343" + "'", str2, "9343");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2235" + "'", str3, "2235");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString217();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString827();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString67();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean216();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean686();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString716();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2611" + "'", str6, "2611");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10455" + "'", str7, "10455");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "800" + "'", str8, "800");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "5926" + "'", str11, "5926");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean301();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean270();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString745();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean324();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString764();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean917();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "7366" + "'", str2, "7366");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "8439" + "'", str4, "8439");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        deploymentEntityManager3.flush();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean753();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString223();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString227();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean825();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString263();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean403();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager172();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString276();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString334();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2638" + "'", str3, "2638");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2775" + "'", str4, "2775");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "3688" + "'", str6, "3688");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4175" + "'", str9, "4175");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "5708" + "'", str10, "5708");
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1043();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean913();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager997();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString315();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString622();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean621();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "5273" + "'", str9, "5273");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1885" + "'", str10, "1885");
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString217();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString676();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager346();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager70();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean762();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2611" + "'", str6, "2611");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5200" + "'", str7, "5200");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString910();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager938();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager742();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1059();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean20();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11414" + "'", str4, "11414");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString910();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager938();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager742();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1059();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager59();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString98();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11414" + "'", str4, "11414");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1380" + "'", str9, "1380");
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean320();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString572();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager255();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean232();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean722();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean705();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString390();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean666();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager915();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString878();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "702" + "'", str2, "702");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "6831" + "'", str8, "6831");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10924" + "'", str11, "10924");
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean320();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString572();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager26();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean291();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "702" + "'", str2, "702");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString910();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString863();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager296();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString241();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11414" + "'", str4, "11414");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10720" + "'", str5, "10720");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2871" + "'", str8, "2871");
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString414();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1064();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString322();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "7440" + "'", str6, "7440");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "5450" + "'", str8, "5450");
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean753();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager335();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString362();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "6363" + "'", str4, "6363");
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean662();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean769();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString572();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean306();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean535();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager576();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "702" + "'", str5, "702");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString910();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager938();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean717();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean109();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager458();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager347();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString790();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString918();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11414" + "'", str4, "11414");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "9385" + "'", str10, "9385");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "11504" + "'", str11, "11504");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean753();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString223();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean669();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString264();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager545();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString880();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2638" + "'", str3, "2638");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3733" + "'", str5, "3733");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10946" + "'", str7, "10946");
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString872();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager902();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager450();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10862" + "'", str4, "10862");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString244();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean864();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean54();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean112();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean575();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean875();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "3006" + "'", str4, "3006");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean904();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString206();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean262();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean224();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2509" + "'", str5, "2509");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString514();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString717();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString337();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager619();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11551" + "'", str3, "11551");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5933" + "'", str4, "5933");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5759" + "'", str5, "5759");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean753();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString223();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString434();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean236();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager563();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean305();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager58();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager15();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2638" + "'", str3, "2638");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "9762" + "'", str4, "9762");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean270();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString745();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean324();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString764();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString771();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager574();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString572();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "7366" + "'", str2, "7366");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "8439" + "'", str4, "8439");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "8784" + "'", str5, "8784");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "702" + "'", str7, "702");
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString244();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString929();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString517();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString575();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "3006" + "'", str4, "3006");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "11675" + "'", str5, "11675");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "11578" + "'", str6, "11578");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "771" + "'", str7, "771");
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString244();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean864();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean54();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean112();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean517();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString104();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "3006" + "'", str4, "3006");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + false + "'", boolean8, false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1670" + "'", str9, "1670");
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1043();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString653();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString863();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2398" + "'", str7, "2398");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10720" + "'", str8, "10720");
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString514();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString717();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString238();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean412();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager739();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager417();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString479();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11551" + "'", str3, "11551");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5933" + "'", str4, "5933");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2860" + "'", str5, "2860");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10750" + "'", str9, "10750");
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean960();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString351();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1007();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6111" + "'", str2, "6111");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean952();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString785();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean995();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString835();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "9343" + "'", str2, "9343");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4" + "'", str4, "4");
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1043();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean728();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager512();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager130();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager732();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager789();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1039();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean590();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager73();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString542();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "45" + "'", str9, "45");
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "81" + "'", str12, "81");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean753();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString223();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString227();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager493();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager575();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager280();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2638" + "'", str3, "2638");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2775" + "'", str4, "2775");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager570();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager122();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean775();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager26();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean320();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString572();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager255();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString319();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean450();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "702" + "'", str2, "702");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5371" + "'", str5, "5371");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString414();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString298();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager443();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean783();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "7440" + "'", str6, "7440");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4928" + "'", str7, "4928");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean270();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString745();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager183();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long5 = deploymentEntityManager3.findDeploymentCountByNativeQuery(strMap4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "7366" + "'", str2, "7366");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString910();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString745();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean498();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString358();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean332();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString245();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager190();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean888();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11414" + "'", str4, "11414");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "7366" + "'", str5, "7366");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "6262" + "'", str7, "6262");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3051" + "'", str9, "3051");
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean753();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString223();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString227();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean825();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager93();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString698();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager883();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2638" + "'", str3, "2638");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2775" + "'", str4, "2775");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5704" + "'", str7, "5704");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean662();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean769();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager220();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager657();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager528();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1064();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean808();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean724();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager567();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "134" + "'", str8, "134");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString263();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString686();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString245();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager907();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager651();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager566();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager730();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager601();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3688" + "'", str5, "3688");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5425" + "'", str6, "5425");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3051" + "'", str7, "3051");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager570();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean634();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString58();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager111();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager702();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "704" + "'", str5, "704");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager478();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString782();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean391();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager975();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager701();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString957();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean594();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager227();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager909();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9333" + "'", str3, "9333");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "12097" + "'", str7, "12097");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean270();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean838();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString724();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager9();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString96();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString188();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString946();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5996" + "'", str3, "5996");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1336" + "'", str5, "1336");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2437" + "'", str6, "2437");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "11962" + "'", str7, "11962");
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean753();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString223();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean669();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString264();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager545();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager280();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2638" + "'", str3, "2638");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3733" + "'", str5, "3733");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager570();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean634();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager845();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean371();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager760();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString414();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString298();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString515();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean726();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean395();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean269();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "7440" + "'", str6, "7440");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4928" + "'", str7, "4928");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "11572" + "'", str8, "11572");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString726();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean115();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString186();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "6115" + "'", str1, "6115");
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2429" + "'", str3, "2429");
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString514();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11551" + "'", str4, "11551");
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1043();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString644();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString457();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString334();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean438();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager440();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2322" + "'", str6, "2322");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10225" + "'", str7, "10225");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "5708" + "'", str8, "5708");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager478();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString782();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean391();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager54();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1002();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9333" + "'", str3, "9333");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "25304" + "'", str6, "25304");
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1043();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString644();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean1057();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString379();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean528();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString143();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean17();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2322" + "'", str6, "2322");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "6638" + "'", str8, "6638");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2214" + "'", str10, "2214");
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString217();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean475();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager283();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager399();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2611" + "'", str6, "2611");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5200" + "'", str7, "5200");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean270();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean838();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString724();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager9();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString274();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager504();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean672();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5996" + "'", str3, "5996");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4085" + "'", str5, "4085");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager615();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString910();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString745();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean498();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString358();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager766();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager785();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11414" + "'", str4, "11414");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "7366" + "'", str5, "7366");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "6262" + "'", str7, "6262");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean753();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager730();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager865();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1008();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1043();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString644();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean1057();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager710();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2322" + "'", str6, "2322");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString910();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString745();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString121();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean880();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11414" + "'", str4, "11414");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "7366" + "'", str5, "7366");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2030" + "'", str6, "2030");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString414();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString161();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString25();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean792();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "7440" + "'", str6, "7440");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2281" + "'", str7, "2281");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "295" + "'", str8, "295");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean320();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString572();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager319();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean836();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString720();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "702" + "'", str2, "702");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5962" + "'", str6, "5962");
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString653();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString319();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString49();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2398" + "'", str5, "2398");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5371" + "'", str6, "5371");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "595" + "'", str7, "595");
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean662();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean769();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager220();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager657();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager528();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean944();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean36();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager948();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager849();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1010();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager653();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString659();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean392();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean373();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2464" + "'", str6, "2464");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean60();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString128();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean712();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager92();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean167();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager748();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString233();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2138" + "'", str5, "2138");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2837" + "'", str10, "2837");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString653();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString319();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString382();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2398" + "'", str5, "2398");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5371" + "'", str6, "5371");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "6661" + "'", str7, "6661");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager478();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString938();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager394();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1057();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean1007();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11868" + "'", str3, "11868");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager964();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager850();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean801();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager919();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString244();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean864();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean54();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean112();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager318();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1042();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "3006" + "'", str4, "3006");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2501" + "'", str9, "2501");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean789();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString989();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "15319" + "'", str6, "15319");
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean320();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString572();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager26();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString968();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean438();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "702" + "'", str2, "702");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "12244" + "'", str5, "12244");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean412();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager299();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean648();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean662();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager562();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager561();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString514();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString617();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString22();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString995();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11551" + "'", str3, "11551");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1693" + "'", str4, "1693");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "266" + "'", str5, "266");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "15436" + "'", str6, "15436");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean270();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean529();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean684();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager630();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean753();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString120();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1028();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString8();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager479();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager837();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager555();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2005" + "'", str3, "2005");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "93" + "'", str5, "93");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString514();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString717();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager857();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString671();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean111();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager677();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean108();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11551" + "'", str3, "11551");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5933" + "'", str4, "5933");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5132" + "'", str6, "5132");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager130();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean797();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean354();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean60();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString128();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean712();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager92();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager302();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString821();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString744();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2138" + "'", str5, "2138");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10379" + "'", str9, "10379");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "7263" + "'", str10, "7263");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean270();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean838();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager17();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager459();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString357();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "6259" + "'", str5, "6259");
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean270();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean838();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString910();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean166();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager797();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11414" + "'", str3, "11414");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean753();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString223();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean669();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString264();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager545();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager896();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean779();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString265();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2638" + "'", str3, "2638");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3733" + "'", str5, "3733");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3778" + "'", str9, "3778");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean683();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString173();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString800();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString863();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2376" + "'", str6, "2376");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "9562" + "'", str7, "9562");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10720" + "'", str8, "10720");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean320();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString572();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager26();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager124();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager670();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean1025();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString807();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "702" + "'", str2, "702");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "9677" + "'", str8, "9677");
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager195();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager632();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString274();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4085" + "'", str7, "4085");
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean753();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString223();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1018();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager917();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean549();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2638" + "'", str3, "2638");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean753();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString223();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString227();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager493();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager575();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean230();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2638" + "'", str3, "2638");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2775" + "'", str4, "2775");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString910();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager938();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean717();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean109();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean651();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11414" + "'", str4, "11414");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager478();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString938();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString134();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean602();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager102();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager59();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11868" + "'", str3, "11868");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2187" + "'", str4, "2187");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + false + "'", boolean5, false);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5371" + "'", str7, "5371");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager314();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager271();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString776();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1061();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "9025" + "'", str4, "9025");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "108" + "'", str5, "108");
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean320();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString572();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager255();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean232();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean722();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean705();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager477();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager635();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager440();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "702" + "'", str2, "702");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager478();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString782();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean391();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager31();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9333" + "'", str3, "9333");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager570();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean634();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString203();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2496" + "'", str5, "2496");
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean683();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString173();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean782();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean110();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager309();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString647();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2376" + "'", str6, "2376");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2360" + "'", str10, "2360");
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean753();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean869();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager646();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager107();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString808();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString910();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString387();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9702" + "'", str6, "9702");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "11414" + "'", str7, "11414");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "6717" + "'", str8, "6717");
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean60();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString749();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager535();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "7557" + "'", str5, "7557");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean753();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString223();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString434();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean236();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager563();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager501();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString941();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager705();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString844();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2638" + "'", str3, "2638");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "9762" + "'", str4, "9762");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "11904" + "'", str8, "11904");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10603" + "'", str10, "10603");
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString244();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean864();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean54();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean112();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean517();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager234();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString905();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "3006" + "'", str4, "3006");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + false + "'", boolean8, false);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "11318" + "'", str10, "11318");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString653();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager641();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString946();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2398" + "'", str5, "2398");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "11962" + "'", str7, "11962");
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager478();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString938();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString134();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean269();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager195();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11868" + "'", str3, "11868");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2187" + "'", str4, "2187");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean753();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString223();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean669();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean297();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager163();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean489();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2638" + "'", str3, "2638");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean662();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean769();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean291();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager695();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean17();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1034();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1039();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "45" + "'", str9, "45");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean904();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString206();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean262();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager153();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2509" + "'", str5, "2509");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString514();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean867();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean891();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11551" + "'", str3, "11551");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager919();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean892();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean270();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean838();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString724();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager9();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString274();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager298();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString626();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString105();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5996" + "'", str3, "5996");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4085" + "'", str5, "4085");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1945" + "'", str7, "1945");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1692" + "'", str8, "1692");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1034();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean683();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString173();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString800();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString870();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString195();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString559();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2376" + "'", str6, "2376");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "9562" + "'", str7, "9562");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10836" + "'", str8, "10836");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2464" + "'", str9, "2464");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "439" + "'", str10, "439");
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager570();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean634();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString58();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString982();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1034();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString989();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "704" + "'", str5, "704");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "12495" + "'", str6, "12495");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "15319" + "'", str8, "15319");
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean753();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString120();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString194();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2005" + "'", str3, "2005");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2461" + "'", str4, "2461");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString217();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString827();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString67();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean216();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString722();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager669();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2611" + "'", str6, "2611");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10455" + "'", str7, "10455");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "800" + "'", str8, "800");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "5978" + "'", str10, "5978");
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager570();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager239();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean76();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean434();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager478();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString782();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean391();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager975();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager701();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString957();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean594();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1012();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9333" + "'", str3, "9333");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "12097" + "'", str7, "12097");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "45304" + "'", str9, "45304");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString263();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean79();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString402();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3688" + "'", str5, "3688");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "7027" + "'", str7, "7027");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean60();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean661();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString151();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager888();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager306();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2238" + "'", str6, "2238");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString217();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean475();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString209();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2611" + "'", str6, "2611");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5200" + "'", str7, "5200");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2518" + "'", str9, "2518");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean60();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager158();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager396();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString640();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2200" + "'", str7, "2200");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean820();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean989();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean1027();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean881();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean13();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString414();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString298();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString515();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager581();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager497();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "7440" + "'", str6, "7440");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4928" + "'", str7, "4928");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "11572" + "'", str8, "11572");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean952();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString785();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean569();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "9343" + "'", str2, "9343");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager570();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString701();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager86();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager104();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5764" + "'", str4, "5764");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean662();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean769();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString572();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean306();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString382();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean600();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "702" + "'", str5, "702");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "6661" + "'", str7, "6661");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean753();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString223();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean669();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString264();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean826();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean338();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2638" + "'", str3, "2638");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3733" + "'", str5, "3733");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString263();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString686();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString245();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager907();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager651();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager566();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager730();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString651();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3688" + "'", str5, "3688");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5425" + "'", str6, "5425");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3051" + "'", str7, "3051");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2389" + "'", str12, "2389");
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1043();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString644();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString457();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString972();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2322" + "'", str6, "2322");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10225" + "'", str7, "10225");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "12296" + "'", str8, "12296");
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager130();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager732();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager789();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean151();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager466();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean662();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean769();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean291();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString345();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean878();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5965" + "'", str6, "5965");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1043();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString653();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString228();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean409();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString537();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager284();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2398" + "'", str7, "2398");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2778" + "'", str8, "2778");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "12333" + "'", str10, "12333");
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean320();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString572();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager26();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString312();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString549();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean978();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString472();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager950();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "702" + "'", str2, "702");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5204" + "'", str5, "5204");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "262" + "'", str6, "262");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10618" + "'", str8, "10618");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString910();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean937();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1060();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager87();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager601();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean499();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean524();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean72();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11414" + "'", str4, "11414");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean753();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString223();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString227();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean825();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager995();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean532();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean206();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2638" + "'", str3, "2638");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2775" + "'", str4, "2775");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1043();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean913();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean25();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString910();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager938();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager742();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1059();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager201();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1043();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager172();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager680();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1026();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11414" + "'", str4, "11414");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1043();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString644();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean1057();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString379();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean528();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString168();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager415();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager777();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2322" + "'", str6, "2322");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "6638" + "'", str8, "6638");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2357" + "'", str10, "2357");
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString263();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString686();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager39();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean491();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString458();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3688" + "'", str5, "3688");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5425" + "'", str6, "5425");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10229" + "'", str9, "10229");
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString653();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString319();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean138();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString313();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2398" + "'", str5, "2398");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5371" + "'", str6, "5371");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "5229" + "'", str8, "5229");
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString514();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString717();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1015();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean507();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager186();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11551" + "'", str3, "11551");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5933" + "'", str4, "5933");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean683();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString173();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString800();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager215();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2376" + "'", str6, "2376");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "9562" + "'", str7, "9562");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean60();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager243();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean632();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager279();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString961();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean1020();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "12143" + "'", str8, "12143");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1043();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString653();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString569();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString852();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2398" + "'", str7, "2398");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "649" + "'", str8, "649");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10645" + "'", str9, "10645");
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean753();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean869();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager646();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean541();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString541();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean142();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "12486" + "'", str6, "12486");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5346" + "'", str7, "5346");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString514();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString717();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString238();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString588();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11551" + "'", str3, "11551");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5933" + "'", str4, "5933");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2860" + "'", str5, "2860");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1056" + "'", str7, "1056");
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1043();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString644();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager873();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString699();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2322" + "'", str6, "2322");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "5724" + "'", str8, "5724");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString910();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager938();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager742();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1059();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager180();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString848();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11414" + "'", str4, "11414");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10623" + "'", str9, "10623");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean952();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString785();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean995();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1009();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "9343" + "'", str2, "9343");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString910();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager938();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager742();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1059();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager201();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1043();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager794();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager21();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean250();
        java.lang.Boolean boolean13 = serializedObjectSupporter0.deserializeObjectBoolean753();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString55();
        java.lang.Boolean boolean15 = serializedObjectSupporter0.deserializeObjectBoolean977();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11414" + "'", str4, "11414");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + true + "'", boolean13, true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "664" + "'", str14, "664");
        org.junit.Assert.assertEquals("'" + boolean15 + "' != '" + true + "'", boolean15, true);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean753();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString223();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString227();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean825();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager995();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString365();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString814();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2638" + "'", str3, "2638");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2775" + "'", str4, "2775");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "6450" + "'", str7, "6450");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "9980" + "'", str8, "9980");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager130();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager732();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager789();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager556();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean823();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean23();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager372();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString479();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10750" + "'", str13, "10750");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean456();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean10();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager726();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean320();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager934();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean87();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean529();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean320();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString572();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager26();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager124();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager670();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager601();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean751();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "702" + "'", str2, "702");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean753();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString223();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean669();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString264();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString417();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString904();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2638" + "'", str3, "2638");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3733" + "'", str5, "3733");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "7595" + "'", str6, "7595");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "11303" + "'", str7, "11303");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager478();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString782();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean391();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager975();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager701();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString957();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean594();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean983();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9333" + "'", str3, "9333");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "12097" + "'", str7, "12097");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString617();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString297();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString111();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager181();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager276();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString782();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1693" + "'", str5, "1693");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4920" + "'", str6, "4920");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1827" + "'", str7, "1827");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "9333" + "'", str10, "9333");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean753();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString223();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString227();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager493();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean412();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2638" + "'", str3, "2638");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2775" + "'", str4, "2775");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager570();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager239();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager821();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean397();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager181();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean947();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString414();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager520();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager336();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean758();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager672();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager773();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "7440" + "'", str6, "7440");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean753();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString223();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString227();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager206();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean453();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString912();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2638" + "'", str3, "2638");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2775" + "'", str4, "2775");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "11445" + "'", str7, "11445");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString872();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager376();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager459();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager777();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager660();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10862" + "'", str4, "10862");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString217();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString676();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager346();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager70();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString647();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString918();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2611" + "'", str6, "2611");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5200" + "'", str7, "5200");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2360" + "'", str10, "2360");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "11504" + "'", str11, "11504");
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean270();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager131();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean650();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString206();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager651();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2509" + "'", str4, "2509");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean753();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean869();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager838();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager962();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager79();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString38();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "426" + "'", str7, "426");
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean270();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean838();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString724();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager9();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString274();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager377();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager121();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5996" + "'", str3, "5996");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4085" + "'", str5, "4085");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString263();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString686();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString245();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString427();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean932();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3688" + "'", str5, "3688");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5425" + "'", str6, "5425");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3051" + "'", str7, "3051");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "8787" + "'", str8, "8787");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString217();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean1035();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean380();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean186();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager141();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2611" + "'", str6, "2611");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5200" + "'", str7, "5200");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "61" + "'", str8, "61");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString321();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5425" + "'", str5, "5425");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString910();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString745();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean498();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString358();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString712();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean980();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString483();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11414" + "'", str4, "11414");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "7366" + "'", str5, "7366");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "6262" + "'", str7, "6262");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "5894" + "'", str8, "5894");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10807" + "'", str10, "10807");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString910();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString745();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean498();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString358();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean332();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString245();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean729();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11414" + "'", str4, "11414");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "7366" + "'", str5, "7366");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "6262" + "'", str7, "6262");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3051" + "'", str9, "3051");
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager478();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager202();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager86();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager686();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString263();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString686();
        java.lang.Class class7 = serializedObjectSupporter0.deserializeObjectClass1();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3688" + "'", str5, "3688");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5425" + "'", str6, "5425");
        org.junit.Assert.assertNotNull(class7);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean320();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1037();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10" + "'", str2, "10");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager214();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager485();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean10();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean662();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean769();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager220();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager657();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager528();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1064();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean808();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1031();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean197();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "134" + "'", str8, "134");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean662();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean769();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean291();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager695();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean17();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1034();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean980();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1056();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean320();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString572();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager319();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString467();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString800();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "702" + "'", str2, "702");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10563" + "'", str4, "10563");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "9562" + "'", str5, "9562");
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager570();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager122();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString368();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString286();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString755();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager992();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "6489" + "'", str5, "6489");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4579" + "'", str6, "4579");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "7857" + "'", str7, "7857");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString217();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString676();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager292();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean1044();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager46();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString548();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2611" + "'", str6, "2611");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5200" + "'", str7, "5200");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + false + "'", boolean9, false);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "251" + "'", str11, "251");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean753();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager730();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString371();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean464();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5538" + "'", str4, "5538");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "6542" + "'", str5, "6542");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean320();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString572();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager255();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean232();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean722();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean828();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString238();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean9();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "702" + "'", str2, "702");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2860" + "'", str8, "2860");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString217();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString827();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager515();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2611" + "'", str6, "2611");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10455" + "'", str7, "10455");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean60();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager158();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean728();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager130();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager732();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean750();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager863();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean60();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager734();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString217();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString827();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager515();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager298();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1058();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2611" + "'", str6, "2611");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10455" + "'", str7, "10455");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString910();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager938();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager742();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1059();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager744();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean173();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11414" + "'", str4, "11414");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString910();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean937();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1060();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString338();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1057();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean1017();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager233();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean1064();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11414" + "'", str4, "11414");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5794" + "'", str7, "5794");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString910();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager938();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager750();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean659();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean408();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11414" + "'", str4, "11414");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager570();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager239();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager821();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean397();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager52();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean990();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager535();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + false + "'", boolean8, false);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString910();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager938();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager742();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1059();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager969();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1034();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean204();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11414" + "'", str4, "11414");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString910();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean937();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1060();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager87();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager601();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean499();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager439();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11414" + "'", str4, "11414");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager573();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean563();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1050();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString872();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean305();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager890();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10862" + "'", str4, "10862");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1043();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean913();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager131();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString910();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager938();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager742();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1059();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager201();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1043();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager794();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString418();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager699();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString823();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11414" + "'", str4, "11414");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "7644" + "'", str11, "7644");
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10406" + "'", str13, "10406");
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString244();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString929();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager916();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString914();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager566();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "3006" + "'", str4, "3006");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "11675" + "'", str5, "11675");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "11472" + "'", str7, "11472");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean219();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString730();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "6358" + "'", str5, "6358");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager573();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString154();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2247" + "'", str6, "2247");
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString910();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager938();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager742();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1059();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager201();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1043();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager794();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString62();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager883();
        java.lang.Boolean boolean13 = serializedObjectSupporter0.deserializeObjectBoolean250();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11414" + "'", str4, "11414");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "765" + "'", str11, "765");
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + true + "'", boolean13, true);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager130();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager732();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager789();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager556();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager331();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString491();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "11071" + "'", str11, "11071");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager969();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager942();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString217();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean475();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager283();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString921();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2611" + "'", str6, "2611");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5200" + "'", str7, "5200");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "11547" + "'", str10, "11547");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean60();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager243();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean632();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager279();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1059();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "94" + "'", str8, "94");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString244();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean864();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString763();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager410();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString450();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean327();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString915();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "3006" + "'", str4, "3006");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "8351" + "'", str6, "8351");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10134" + "'", str8, "10134");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "11475" + "'", str10, "11475");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean753();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString223();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString227();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean825();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString263();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean403();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager172();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean312();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2638" + "'", str3, "2638");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2775" + "'", str4, "2775");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "3688" + "'", str6, "3688");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean753();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString223();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString434();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean236();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager563();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString316();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean679();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean370();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2638" + "'", str3, "2638");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "9762" + "'", str4, "9762");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5298" + "'", str7, "5298");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean60();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString128();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString801();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString980();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString555();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString83();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager704();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2138" + "'", str5, "2138");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9572" + "'", str6, "9572");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "12422" + "'", str7, "12422");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "374" + "'", str8, "374");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1090" + "'", str9, "1090");
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean270();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean838();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString724();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString452();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5996" + "'", str3, "5996");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10140" + "'", str4, "10140");
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1043();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString644();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString457();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString334();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1043();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2322" + "'", str6, "2322");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10225" + "'", str7, "10225");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "5708" + "'", str8, "5708");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean320();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString572();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager26();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager124();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager670();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString847();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean891();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager508();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "702" + "'", str2, "702");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10620" + "'", str7, "10620");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString578();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString193();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "849" + "'", str4, "849");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2456" + "'", str5, "2456");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean270();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean838();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString724();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager9();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString96();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString429();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager371();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager734();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5996" + "'", str3, "5996");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1336" + "'", str5, "1336");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9076" + "'", str6, "9076");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean789();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean212();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager478();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString938();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString134();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean602();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString291();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean531();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean504();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager814();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11868" + "'", str3, "11868");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2187" + "'", str4, "2187");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + false + "'", boolean5, false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4715" + "'", str6, "4715");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean753();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager730();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString807();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1012();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean387();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString639();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean446();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager633();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "9677" + "'", str4, "9677");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "45304" + "'", str5, "45304");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2158" + "'", str7, "2158");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean683();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString173();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean782();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean110();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString970();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2376" + "'", str6, "2376");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "12278" + "'", str9, "12278");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean320();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager934();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager485();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean158();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString403();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "7042" + "'", str5, "7042");
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString910();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean937();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1060();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager87();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager601();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager175();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean378();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean853();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11414" + "'", str4, "11414");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean753();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString223();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString227();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean825();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString263();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean957();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2638" + "'", str3, "2638");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2775" + "'", str4, "2775");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "3688" + "'", str6, "3688");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean270();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean838();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString724();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean982();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager422();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5996" + "'", str3, "5996");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean753();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager730();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString807();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1012();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean387();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString639();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean446();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString437();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "9677" + "'", str4, "9677");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "45304" + "'", str5, "45304");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2158" + "'", str7, "2158");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "9890" + "'", str9, "9890");
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager130();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1047();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager387();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString745();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "7366" + "'", str9, "7366");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString217();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean475();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager283();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager62();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2611" + "'", str6, "2611");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5200" + "'", str7, "5200");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1006();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean775();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager697();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager623();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager570();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager239();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager821();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean397();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager181();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString334();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean579();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean376();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean1064();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager31();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "5708" + "'", str8, "5708");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager130();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager732();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager789();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1039();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean264();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString687();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean816();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString285();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager14 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager885();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "45" + "'", str9, "45");
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "5441" + "'", str11, "5441");
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4514" + "'", str13, "4514");
        org.junit.Assert.assertNotNull(deploymentEntityManager14);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean662();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean769();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean291();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager695();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean17();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1034();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager150();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1038();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "18" + "'", str10, "18");
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1043();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString653();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager903();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager838();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2398" + "'", str7, "2398");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1043();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString653();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager903();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager800();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString992();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2398" + "'", str7, "2398");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "15345" + "'", str10, "15345");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString414();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString298();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean782();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager51();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean639();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "7440" + "'", str6, "7440");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4928" + "'", str7, "4928");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean952();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString785();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString150();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString929();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "9343" + "'", str2, "9343");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2235" + "'", str3, "2235");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11675" + "'", str4, "11675");
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean753();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager730();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString371();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager580();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager290();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5538" + "'", str4, "5538");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "6542" + "'", str5, "6542");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean993();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager109();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString244();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString929();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean497();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean581();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "3006" + "'", str4, "3006");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "11675" + "'", str5, "11675");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean60();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString128();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean712();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager92();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean167();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager290();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager815();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2138" + "'", str5, "2138");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean753();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager730();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString371();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean188();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString9();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5538" + "'", str4, "5538");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "6542" + "'", str5, "6542");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "106" + "'", str7, "106");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString217();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString676();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager346();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager70();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString662();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1008();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2611" + "'", str6, "2611");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5200" + "'", str7, "5200");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2497" + "'", str10, "2497");
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean270();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean529();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString679();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString782();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString341();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5244" + "'", str3, "5244");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "9333" + "'", str4, "9333");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5867" + "'", str5, "5867");
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean753();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString223();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString227();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean825();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString263();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean403();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean994();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2638" + "'", str3, "2638");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2775" + "'", str4, "2775");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "3688" + "'", str6, "3688");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString244();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean864();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean54();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean112();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager320();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager660();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean675();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "3006" + "'", str4, "3006");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean320();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString572();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager255();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean232();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean722();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean828();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString238();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean27();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager731();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "702" + "'", str2, "702");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2860" + "'", str8, "2860");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean320();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString572();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager264();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager233();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "702" + "'", str2, "702");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean753();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString120();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1028();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean750();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString879();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1006();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager555();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2005" + "'", str3, "2005");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10932" + "'", str6, "10932");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "25316" + "'", str7, "25316");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString910();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager938();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean717();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString635();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11414" + "'", str4, "11414");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2083" + "'", str7, "2083");
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean60();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString128();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString801();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager682();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1050();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager541();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2138" + "'", str5, "2138");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9572" + "'", str6, "9572");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean683();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString173();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean782();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean110();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager309();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean258();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2376" + "'", str6, "2376");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean662();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1029();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "87804" + "'", str4, "87804");
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString910();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString745();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean498();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString358();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean332();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean486();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11414" + "'", str4, "11414");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "7366" + "'", str5, "7366");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "6262" + "'", str7, "6262");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean789();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager723();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager478();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString938();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString134();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString341();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11868" + "'", str3, "11868");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2187" + "'", str4, "2187");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5867" + "'", str5, "5867");
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString244();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean864();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString763();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean1066();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "3006" + "'", str4, "3006");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "8351" + "'", str6, "8351");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean270();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean838();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString724();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager9();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean661();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString459();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager949();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager2();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager391();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5996" + "'", str3, "5996");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10323" + "'", str6, "10323");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString943();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean904();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString206();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean262();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean368();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager685();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11927" + "'", str3, "11927");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2509" + "'", str5, "2509");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString514();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString617();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString22();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString520();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11551" + "'", str3, "11551");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1693" + "'", str4, "1693");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "266" + "'", str5, "266");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "11587" + "'", str7, "11587");
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString217();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString183();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString621();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2611" + "'", str6, "2611");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2416" + "'", str7, "2416");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1825" + "'", str8, "1825");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString910();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager938();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager742();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1059();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager969();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean681();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager8();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString50();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11414" + "'", str4, "11414");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "613" + "'", str12, "613");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean789();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean876();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString689();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager831();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5475" + "'", str7, "5475");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString148();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager796();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6544" + "'", str3, "6544");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2229" + "'", str6, "2229");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }
}

