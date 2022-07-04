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
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager61();
        deploymentEntityManager4.flush();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean208();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean348();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean206();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString333();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager177();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager193();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5683" + "'", str4, "5683");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean35();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString26();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString346();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "308" + "'", str3, "308");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5990" + "'", str4, "5990");
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean272();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager188();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString97();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean130();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1358" + "'", str4, "1358");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean195();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString93();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1270" + "'", str5, "1270");
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean35();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString79();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean72();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager36();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1040" + "'", str3, "1040");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean264();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager329();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString103();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1648" + "'", str5, "1648");
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean171();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean330();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean205();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager131();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString219();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager119();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean230();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString8();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean95();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2617" + "'", str4, "2617");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "93" + "'", str7, "93");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString60();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager206();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean192();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString8();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean311();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean34();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "726" + "'", str3, "726");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "93" + "'", str6, "93");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean171();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean330();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString172();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString119();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager29();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2373" + "'", str3, "2373");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1971" + "'", str4, "1971");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager149();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString70();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean201();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "850" + "'", str5, "850");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean173();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager249();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager284();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString42();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "473" + "'", str7, "473");
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString184();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager289();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2421" + "'", str3, "2421");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean35();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString26();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager84();
        deploymentEntityManager4.close();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "308" + "'", str3, "308");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString219();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager119();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean230();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager3();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager195();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2617" + "'", str4, "2617");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean264();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean223();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager289();
        org.activiti.engine.impl.db.PersistentObject persistentObject6 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager5.insert(persistentObject6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean264();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean223();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString159();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean322();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString143();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2262" + "'", str5, "2262");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2214" + "'", str7, "2214");
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean170();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString58();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString105();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "704" + "'", str2, "704");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1692" + "'", str3, "1692");
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean270();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager285();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean272();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString66();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString98();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString328();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString125();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "789" + "'", str3, "789");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1380" + "'", str4, "1380");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5576" + "'", str5, "5576");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2105" + "'", str6, "2105");
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean35();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString26();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString128();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "308" + "'", str3, "308");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2138" + "'", str4, "2138");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager164();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString219();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager133();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString295();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager89();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean330();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager238();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList13 = deploymentEntityManager9.findDeploymentsByNativeQuery(strMap10, (int) (short) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2617" + "'", str4, "2617");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4853" + "'", str6, "4853");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean170();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager44();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString32();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "374" + "'", str3, "374");
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString333();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager233();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean305();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5683" + "'", str4, "5683");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean272();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString66();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString98();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString328();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString244();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString335();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "789" + "'", str3, "789");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1380" + "'", str4, "1380");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5576" + "'", str5, "5576");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "3006" + "'", str6, "3006");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5711" + "'", str7, "5711");
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString219();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager133();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString295();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean333();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2617" + "'", str4, "2617");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4853" + "'", str6, "4853");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager42();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString192();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean255();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString268();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2453" + "'", str5, "2453");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3849" + "'", str7, "3849");
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString219();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager133();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString295();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager89();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString331();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2617" + "'", str4, "2617");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4853" + "'", str6, "4853");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "5641" + "'", str8, "5641");
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean272();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString66();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager218();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString32();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager83();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager249();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "789" + "'", str3, "789");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "374" + "'", str5, "374");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean272();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString66();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean71();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager15();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "789" + "'", str3, "789");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean208();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean348();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean263();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean17();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString213();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager230();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2547" + "'", str8, "2547");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean65();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean194();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean258();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager144();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString182();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString90();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean252();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean159();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean328();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager115();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2413" + "'", str3, "2413");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1240" + "'", str4, "1240");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean249();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString305();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString169();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5021" + "'", str4, "5021");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2360" + "'", str5, "2360");
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString60();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager206();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString102();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean10();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager153();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean34();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString261();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean88();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "726" + "'", str3, "726");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1553" + "'", str5, "1553");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3626" + "'", str9, "3626");
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean272();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString66();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager218();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString11();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "789" + "'", str3, "789");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "136" + "'", str5, "136");
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean264();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager329();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString118();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean92();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1974" + "'", str5, "1974");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean272();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString66();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString98();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager22();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString322();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "789" + "'", str3, "789");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1380" + "'", str4, "1380");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5450" + "'", str6, "5450");
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString60();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager206();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean192();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean264();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean113();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean84();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString136();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "726" + "'", str3, "726");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2193" + "'", str9, "2193");
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean171();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean330();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString172();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString119();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean193();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean14();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2373" + "'", str3, "2373");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1971" + "'", str4, "1971");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString184();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean188();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean235();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager304();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2421" + "'", str3, "2421");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean264();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager218();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager247();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean173();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager343();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean83();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString219();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager133();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString295();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean159();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean211();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean281();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean275();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean349();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2617" + "'", str4, "2617");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4853" + "'", str6, "4853");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString60();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager206();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean192();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean264();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean113();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean84();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager44();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "726" + "'", str3, "726");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString60();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager206();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager94();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean279();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager61();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "726" + "'", str3, "726");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean272();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString66();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString98();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager244();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean95();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean23();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString169();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "789" + "'", str3, "789");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1380" + "'", str4, "1380");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2360" + "'", str8, "2360");
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString60();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager206();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean192();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString8();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString117();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean349();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "726" + "'", str3, "726");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "93" + "'", str6, "93");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1949" + "'", str7, "1949");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean272();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString66();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString98();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager244();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean95();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean23();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager157();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "789" + "'", str3, "789");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1380" + "'", str4, "1380");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean264();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString147();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean263();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean74();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean7();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString328();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2226" + "'", str4, "2226");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "5576" + "'", str8, "5576");
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager302();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager192();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean272();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager188();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString97();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager68();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager135();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager24();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1358" + "'", str4, "1358");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager61();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean176();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager278();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean208();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager22();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean135();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean98();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean21();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString262();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager275();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", boolean6, false);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3629" + "'", str9, "3629");
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString219();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager133();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString295();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean159();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager103();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean132();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2617" + "'", str4, "2617");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4853" + "'", str6, "4853");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + false + "'", boolean9, false);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean272();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager188();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString97();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager68();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString140();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1358" + "'", str4, "1358");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2205" + "'", str6, "2205");
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean173();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager349();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString184();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager145();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString111();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2421" + "'", str3, "2421");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1827" + "'", str6, "1827");
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean35();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString26();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString49();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager343();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString20();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "308" + "'", str3, "308");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "595" + "'", str4, "595");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "247" + "'", str6, "247");
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean208();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean348();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean263();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean72();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean299();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager241();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean173();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager249();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager284();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean197();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean272();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString66();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString98();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString328();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager232();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "789" + "'", str3, "789");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1380" + "'", str4, "1380");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5576" + "'", str5, "5576");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean35();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString79();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager317();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString170();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean127();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString297();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1040" + "'", str3, "1040");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2365" + "'", str5, "2365");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4920" + "'", str7, "4920");
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean272();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString66();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager218();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString32();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean93();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString93();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "789" + "'", str3, "789");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "374" + "'", str5, "374");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1270" + "'", str7, "1270");
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString184();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager145();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean227();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2421" + "'", str3, "2421");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString219();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager133();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString295();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString164();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean321();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString184();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2617" + "'", str4, "2617");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4853" + "'", str6, "4853");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2345" + "'", str7, "2345");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2421" + "'", str9, "2421");
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString219();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager119();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean355();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString120();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager211();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2617" + "'", str4, "2617");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2005" + "'", str7, "2005");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString60();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager206();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString102();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean10();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager153();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean34();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean308();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean223();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "726" + "'", str3, "726");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1553" + "'", str5, "1553");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean264();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString147();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean263();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean74();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager186();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2226" + "'", str4, "2226");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager61();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager276();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager70();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString278();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString77();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean69();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4241" + "'", str7, "4241");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "984" + "'", str8, "984");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean264();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager329();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString118();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean89();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager316();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString324();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1974" + "'", str5, "1974");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "5488" + "'", str8, "5488");
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean182();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean268();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager250();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean171();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString250();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean105();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager83();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3195" + "'", str2, "3195");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter1 = null;
        deploymentEntityManager0.serializedObjectSupporter = serializedObjectSupporter1;
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl3 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long4 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean264();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString147();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean181();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean175();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString134();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2226" + "'", str4, "2226");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2187" + "'", str7, "2187");
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean171();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean330();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean205();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager270();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager103();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean272();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString66();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString98();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager22();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager146();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager242();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "789" + "'", str3, "789");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1380" + "'", str4, "1380");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean65();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString238();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString282();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2860" + "'", str4, "2860");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4421" + "'", str5, "4421");
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean270();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean23();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString286();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4579" + "'", str6, "4579");
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean270();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean23();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString140();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager63();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2205" + "'", str6, "2205");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager61();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager276();
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity6 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager5.insertDeployment(deploymentEntity6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean171();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean330();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean205();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager270();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager274();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean264();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean223();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager289();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = deploymentEntityManager5.findDeploymentCountByQueryCriteria(deploymentQueryImpl6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean173();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager249();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager230();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean162();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean202();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString297();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4920" + "'", str9, "4920");
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager61();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager276();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager70();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString278();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString159();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString245();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager289();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4241" + "'", str7, "4241");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2262" + "'", str8, "2262");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3051" + "'", str9, "3051");
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager61();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager276();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager70();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString89();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString218();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1232" + "'", str7, "1232");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2614" + "'", str8, "2614");
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean35();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString26();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString49();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager343();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager66();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "308" + "'", str3, "308");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "595" + "'", str4, "595");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString182();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean269();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean167();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2413" + "'", str3, "2413");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean171();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString250();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean134();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager128();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString240();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean91();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3195" + "'", str2, "3195");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2867" + "'", str5, "2867");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString60();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager206();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString102();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager224();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager292();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean135();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString128();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "726" + "'", str3, "726");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1553" + "'", str5, "1553");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + false + "'", boolean8, false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2138" + "'", str9, "2138");
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean208();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean187();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString30();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString183();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "340" + "'", str6, "340");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2416" + "'", str7, "2416");
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean208();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean348();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean263();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString168();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString295();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString116();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2357" + "'", str7, "2357");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4853" + "'", str8, "4853");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1924" + "'", str9, "1924");
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString219();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager133();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString295();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean159();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean211();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean281();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean275();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean311();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2617" + "'", str4, "2617");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4853" + "'", str6, "4853");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean272();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString66();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString98();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString328();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString244();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean20();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager207();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean15();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString324();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean317();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "789" + "'", str3, "789");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1380" + "'", str4, "1380");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5576" + "'", str5, "5576");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "3006" + "'", str6, "3006");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "5488" + "'", str10, "5488");
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean272();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString66();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString98();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString328();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean17();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString152();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "789" + "'", str3, "789");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1380" + "'", str4, "1380");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5576" + "'", str5, "5576");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2241" + "'", str7, "2241");
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean153();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString147();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2226" + "'", str4, "2226");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean153();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager165();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString64();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "778" + "'", str5, "778");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean264();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean223();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager289();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString48();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager128();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList11 = deploymentEntityManager7.findDeploymentsByNativeQuery(strMap8, (int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "578" + "'", str6, "578");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString60();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager206();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString102();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager224();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager293();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean224();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean200();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "726" + "'", str3, "726");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1553" + "'", str5, "1553");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean264();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean223();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager289();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString48();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean150();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager314();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean44();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager297();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "578" + "'", str6, "578");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString182();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString90();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean252();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager291();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2413" + "'", str3, "2413");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1240" + "'", str4, "1240");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString182();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString90();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean252();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean159();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean328();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString53();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2413" + "'", str3, "2413");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1240" + "'", str4, "1240");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "642" + "'", str8, "642");
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean357();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager116();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean262();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean141();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean272();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString66();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString98();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString284();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager136();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "789" + "'", str3, "789");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1380" + "'", str4, "1380");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4511" + "'", str5, "4511");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean272();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager188();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString144();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean20();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2217" + "'", str4, "2217");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean35();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString26();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager84();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString53();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString15();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "308" + "'", str3, "308");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "642" + "'", str5, "642");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "185" + "'", str6, "185");
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean264();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean223();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString159();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean206();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean182();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean46();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2262" + "'", str5, "2262");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean272();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString66();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString98();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean86();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager199();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString321();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "789" + "'", str3, "789");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1380" + "'", str4, "1380");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5425" + "'", str7, "5425");
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString184();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager145();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean85();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean2();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager50();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean278();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString95();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString201();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager164();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2421" + "'", str3, "2421");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", boolean6, false);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1314" + "'", str9, "1314");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2488" + "'", str10, "2488");
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean208();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean348();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean263();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean72();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString289();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean205();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString322();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager38();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString102();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4642" + "'", str8, "4642");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "5450" + "'", str10, "5450");
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1553" + "'", str12, "1553");
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean208();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean348();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean263();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager332();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString13();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString143();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "159" + "'", str8, "159");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2214" + "'", str9, "2214");
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean272();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString66();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString98();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean86();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString107();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "789" + "'", str3, "789");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1380" + "'", str4, "1380");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1736" + "'", str6, "1736");
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean65();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean194();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean119();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager256();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager61();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager276();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager70();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString235();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString117();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager325();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager339();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean181();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean164();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2851" + "'", str7, "2851");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1949" + "'", str8, "1949");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString219();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean156();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean198();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2617" + "'", str4, "2617");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager61();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager276();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager70();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString235();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString117();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager325();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager339();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean181();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean162();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2851" + "'", str7, "2851");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1949" + "'", str8, "1949");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager149();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long6 = deploymentEntityManager4.findDeploymentCountByQueryCriteria(deploymentQueryImpl5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean272();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString66();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString98();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean86();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString138();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean36();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager109();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean110();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "789" + "'", str3, "789");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1380" + "'", str4, "1380");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2199" + "'", str6, "2199");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean171();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean330();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString172();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString119();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean105();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager316();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean144();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2373" + "'", str3, "2373");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1971" + "'", str4, "1971");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean272();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString66();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString98();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager22();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean40();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "789" + "'", str3, "789");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1380" + "'", str4, "1380");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean208();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean348();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean263();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean72();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString64();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "778" + "'", str8, "778");
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString219();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager301();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean226();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString150();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString272();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2617" + "'", str4, "2617");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2235" + "'", str7, "2235");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4017" + "'", str8, "4017");
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean173();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager249();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean3();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager238();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager270();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean272();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString66();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString98();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString328();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString244();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString292();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "789" + "'", str3, "789");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1380" + "'", str4, "1380");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5576" + "'", str5, "5576");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "3006" + "'", str6, "3006");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4781" + "'", str7, "4781");
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean270();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean23();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager266();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean264();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString147();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean263();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean74();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean202();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean317();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2226" + "'", str4, "2226");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString219();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager133();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString295();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager89();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean330();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager238();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager331();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2617" + "'", str4, "2617");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4853" + "'", str6, "4853");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString60();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager206();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString102();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager224();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager293();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager347();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString324();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean10();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "726" + "'", str3, "726");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1553" + "'", str5, "1553");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "5488" + "'", str9, "5488");
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean208();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager22();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean135();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean98();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean21();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager180();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", boolean6, false);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString184();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager145();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean85();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean2();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager50();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean278();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString139();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString240();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager179();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString329();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString136();
        java.lang.Boolean boolean14 = serializedObjectSupporter0.deserializeObjectBoolean357();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2421" + "'", str3, "2421");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", boolean6, false);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2202" + "'", str9, "2202");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2867" + "'", str10, "2867");
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "5579" + "'", str12, "5579");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2193" + "'", str13, "2193");
        org.junit.Assert.assertEquals("'" + boolean14 + "' != '" + true + "'", boolean14, true);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean35();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString26();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager60();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "308" + "'", str3, "308");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean208();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager22();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean135();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean98();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean21();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString262();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager37();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString347();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", boolean6, false);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3629" + "'", str9, "3629");
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "5993" + "'", str11, "5993");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean173();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager249();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean3();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString306();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean28();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean138();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5079" + "'", str7, "5079");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + false + "'", boolean8, false);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean171();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString250();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean134();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager128();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager100();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean269();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3195" + "'", str2, "3195");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean272();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString66();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString98();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager132();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean104();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean202();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "789" + "'", str3, "789");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1380" + "'", str4, "1380");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean30();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager333();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean343();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager121();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager118();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean208();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean46();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager38();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager81();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager202();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager226();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager61();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager276();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager70();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString208();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager186();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = deploymentEntityManager8.findDeploymentCountByNativeQuery(strMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2515" + "'", str7, "2515");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString326();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean348();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager128();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean258();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5538" + "'", str4, "5538");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager61();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean263();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean215();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean171();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString250();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean105();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager239();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3195" + "'", str2, "3195");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString60();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager206();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager94();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean179();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "726" + "'", str3, "726");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "106" + "'", str6, "106");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean264();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager329();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString118();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean215();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1974" + "'", str5, "1974");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean357();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager344();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString4();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "52" + "'", str6, "52");
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean272();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString66();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString98();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean86();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString138();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean36();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager109();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean157();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "789" + "'", str3, "789");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1380" + "'", str4, "1380");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2199" + "'", str6, "2199");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean173();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager249();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean3();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString306();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean28();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean141();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5079" + "'", str7, "5079");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + false + "'", boolean8, false);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean171();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean330();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString172();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString119();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager322();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean314();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2373" + "'", str3, "2373");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1971" + "'", str4, "1971");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean30();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean184();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean35();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString26();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager84();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString46();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "308" + "'", str3, "308");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "544" + "'", str5, "544");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager302();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager71();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString180();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager309();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2405" + "'", str6, "2405");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString219();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager133();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager61();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager151();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString189();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2617" + "'", str4, "2617");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2440" + "'", str8, "2440");
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean35();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString26();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString49();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString163();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString322();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "308" + "'", str3, "308");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "595" + "'", str4, "595");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2330" + "'", str5, "2330");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5450" + "'", str6, "5450");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean171();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean330();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean18();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString60();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager206();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager82();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager99();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString290();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager83();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager151();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "726" + "'", str3, "726");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4712" + "'", str7, "4712");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean171();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean330();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString172();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString119();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager322();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean5();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean267();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager85();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean56();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager217();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2373" + "'", str3, "2373");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1971" + "'", str4, "1971");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean208();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager22();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean135();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean98();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean268();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean18();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", boolean6, false);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString219();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager133();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString295();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager116();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean191();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2617" + "'", str4, "2617");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4853" + "'", str6, "4853");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean173();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean199();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean148();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString95();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1314" + "'", str7, "1314");
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString219();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager133();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString295();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean159();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString323();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean234();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean314();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager254();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2617" + "'", str4, "2617");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4853" + "'", str6, "4853");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "5455" + "'", str8, "5455");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean171();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString250();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean134();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString138();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString214();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean69();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString315();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3195" + "'", str2, "3195");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2199" + "'", str4, "2199");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2550" + "'", str5, "2550");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5273" + "'", str7, "5273");
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager299();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString215();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString119();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2555" + "'", str3, "2555");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1971" + "'", str4, "1971");
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString219();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager119();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean230();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString8();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager335();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager350();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager265();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean140();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2617" + "'", str4, "2617");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "93" + "'", str7, "93");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString194();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager225();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString117();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString298();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2461" + "'", str3, "2461");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1949" + "'", str5, "1949");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4928" + "'", str6, "4928");
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean65();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean194();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean119();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString347();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5993" + "'", str6, "5993");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager61();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager276();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString302();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString353();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString8();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4968" + "'", str6, "4968");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "6139" + "'", str7, "6139");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "93" + "'", str8, "93");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString219();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager119();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean230();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString325();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2617" + "'", str4, "2617");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5513" + "'", str7, "5513");
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean272();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString66();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString27();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean300();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "789" + "'", str3, "789");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "304" + "'", str4, "304");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean272();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString66();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString98();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean86();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString138();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean36();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager109();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager296();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager300();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "789" + "'", str3, "789");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1380" + "'", str4, "1380");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2199" + "'", str6, "2199");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean30();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager290();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString197();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString244();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString354();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString131();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2472" + "'", str3, "2472");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "3006" + "'", str4, "3006");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "6184" + "'", str5, "6184");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2178" + "'", str6, "2178");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean171();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString250();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean105();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean12();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean323();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString348();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3195" + "'", str2, "3195");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "6036" + "'", str6, "6036");
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean208();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean348();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean263();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean72();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString289();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean130();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4642" + "'", str8, "4642");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean65();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean194();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean119();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean96();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager61();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager276();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager70();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString235();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString117();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager325();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString221();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2851" + "'", str7, "2851");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1949" + "'", str8, "1949");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2627" + "'", str10, "2627");
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean35();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString79();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean186();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString270();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager93();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1040" + "'", str3, "1040");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3907" + "'", str5, "3907");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString219();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager133();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString295();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager116();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString271();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager145();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean6();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2617" + "'", str4, "2617");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4853" + "'", str6, "4853");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "3972" + "'", str8, "3972");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString184();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager145();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean85();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean2();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager50();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean278();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString95();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager10();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean351();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2421" + "'", str3, "2421");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", boolean6, false);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1314" + "'", str9, "1314");
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager61();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager276();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager70();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString235();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString117();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString188();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2851" + "'", str7, "2851");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1949" + "'", str8, "1949");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2437" + "'", str9, "2437");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString60();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager206();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean192();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean253();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString173();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager218();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "726" + "'", str3, "726");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2376" + "'", str7, "2376");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean264();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean223();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString270();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean102();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3907" + "'", str5, "3907");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString184();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean188();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean235();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager144();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager12();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2421" + "'", str3, "2421");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean182();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager4();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean264();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager329();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString118();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString159();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager156();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean262();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean315();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1974" + "'", str5, "1974");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2262" + "'", str6, "2262");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean35();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString26();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager227();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "308" + "'", str3, "308");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString60();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString266();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "726" + "'", str3, "726");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "3781" + "'", str4, "3781");
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean171();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean330();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString172();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString119();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager322();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager110();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager117();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2373" + "'", str3, "2373");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1971" + "'", str4, "1971");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString60();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager206();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean192();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString8();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager194();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "726" + "'", str3, "726");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "93" + "'", str6, "93");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean208();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager22();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString271();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString153();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "3972" + "'", str6, "3972");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2244" + "'", str7, "2244");
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean264();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean223();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString159();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean206();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean249();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean182();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2262" + "'", str5, "2262");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString182();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString135();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString178();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2413" + "'", str3, "2413");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2190" + "'", str4, "2190");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2397" + "'", str5, "2397");
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString60();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager206();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager94();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager318();
        org.activiti.engine.impl.db.PersistentObject persistentObject7 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager6.delete(persistentObject7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "726" + "'", str3, "726");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString182();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString90();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString282();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager304();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString267();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2413" + "'", str3, "2413");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1240" + "'", str4, "1240");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4421" + "'", str5, "4421");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3846" + "'", str7, "3846");
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean208();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager22();
        java.lang.Class<?> wildcardClass6 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean171();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean330();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString172();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString119();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager322();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean5();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean180();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2373" + "'", str3, "2373");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1971" + "'", str4, "1971");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString219();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager133();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString295();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager89();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean330();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean174();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2617" + "'", str4, "2617");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4853" + "'", str6, "4853");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean171();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager35();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString82();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean56();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager27();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1083" + "'", str3, "1083");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean208();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean348();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean263();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean72();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString289();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager226();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString304();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4642" + "'", str8, "4642");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "5018" + "'", str10, "5018");
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean173();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager325();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager54();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean171();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString250();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean134();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager128();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString121();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3195" + "'", str2, "3195");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2030" + "'", str5, "2030");
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean4();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString163();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean264();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean357();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager176();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2330" + "'", str5, "2330");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean264();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager329();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString118();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager126();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1974" + "'", str5, "1974");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean208();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean348();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean263();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean17();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager28();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean171();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean330();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean136();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString18();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString100();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "230" + "'", str4, "230");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1424" + "'", str5, "1424");
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString60();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager206();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager82();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager113();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean167();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean12();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "726" + "'", str3, "726");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString333();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString181();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean222();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager73();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5683" + "'", str4, "5683");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2408" + "'", str5, "2408");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString200();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString68();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString177();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean66();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean160();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2485" + "'", str4, "2485");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "812" + "'", str5, "812");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2392" + "'", str6, "2392");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean272();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString66();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean71();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager188();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString82();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString283();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString178();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "789" + "'", str3, "789");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1083" + "'", str6, "1083");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4466" + "'", str7, "4466");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2397" + "'", str8, "2397");
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean264();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager218();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager96();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean264();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean223();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean264();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString326();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean348();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager128();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean243();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager278();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5538" + "'", str4, "5538");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean272();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager188();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString97();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager68();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager135();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString101();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager9();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1358" + "'", str4, "1358");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1544" + "'", str7, "1544");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean171();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean330();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean136();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString183();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2416" + "'", str4, "2416");
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString60();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager206();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString102();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean10();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager153();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean34();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean308();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean143();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "726" + "'", str3, "726");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1553" + "'", str5, "1553");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean35();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString79();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager317();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString170();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean127();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString34();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1040" + "'", str3, "1040");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2365" + "'", str5, "2365");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "397" + "'", str7, "397");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager61();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager276();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager70();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean243();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean33();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean165();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + false + "'", boolean9, false);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString200();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString68();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager49();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean187();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager31();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2485" + "'", str4, "2485");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "812" + "'", str5, "812");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString219();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager119();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean230();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager3();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString309();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean26();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean356();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean161();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString172();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager13 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager19();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager14 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager333();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2617" + "'", str4, "2617");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "5122" + "'", str8, "5122");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2373" + "'", str12, "2373");
        org.junit.Assert.assertNotNull(deploymentEntityManager13);
        org.junit.Assert.assertNotNull(deploymentEntityManager14);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString219();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager133();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString295();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean159();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean211();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean281();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager55();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean78();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2617" + "'", str4, "2617");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4853" + "'", str6, "4853");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean171();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager35();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString82();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean30();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1083" + "'", str3, "1083");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean171();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString250();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean134();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager128();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString240();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager234();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3195" + "'", str2, "3195");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2867" + "'", str5, "2867");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean171();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean330();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString172();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString230();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2373" + "'", str3, "2373");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2798" + "'", str4, "2798");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean171();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager35();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString322();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5450" + "'", str3, "5450");
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString60();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager206();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean192();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean264();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean113();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean84();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean134();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean159();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "726" + "'", str3, "726");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + false + "'", boolean9, false);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString60();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager206();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean192();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString161();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString307();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "726" + "'", str3, "726");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2281" + "'", str6, "2281");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5082" + "'", str7, "5082");
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString219();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager119();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean230();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager3();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean186();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean285();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean98();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString159();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2617" + "'", str4, "2617");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2262" + "'", str11, "2262");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean272();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString66();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager218();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString32();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager82();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "789" + "'", str3, "789");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "374" + "'", str5, "374");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean195();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString231();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2809" + "'", str5, "2809");
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager302();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager71();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean69();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString200();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString68();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager49();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean187();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString304();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString29();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2485" + "'", str4, "2485");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "812" + "'", str5, "812");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "5018" + "'", str8, "5018");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "330" + "'", str9, "330");
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString182();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString90();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean252();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean159();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean328();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager186();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager285();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean335();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString323();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2413" + "'", str3, "2413");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1240" + "'", str4, "1240");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "5455" + "'", str11, "5455");
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean170();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString58();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean177();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager149();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean220();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean318();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "704" + "'", str2, "704");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString60();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager206();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager82();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager99();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString290();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager83();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean141();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString75();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "726" + "'", str3, "726");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4712" + "'", str7, "4712");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "888" + "'", str10, "888");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean65();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean194();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean119();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean178();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean208();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean348();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean263();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean72();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString289();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean205();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString322();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager38();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager247();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4642" + "'", str8, "4642");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "5450" + "'", str10, "5450");
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean272();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString66();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager218();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString32();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager83();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString331();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager193();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager224();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString31();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "789" + "'", str3, "789");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "374" + "'", str5, "374");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5641" + "'", str7, "5641");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "357" + "'", str10, "357");
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString182();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString90();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean252();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString255();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager206();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2413" + "'", str3, "2413");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1240" + "'", str4, "1240");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "3418" + "'", str6, "3418");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean272();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString66();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager93();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean103();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "789" + "'", str3, "789");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean171();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString250();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean134();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager128();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString327();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean228();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager209();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager166();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean149();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3195" + "'", str2, "3195");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5543" + "'", str5, "5543");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager61();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager276();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString302();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString353();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString182();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4968" + "'", str6, "4968");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "6139" + "'", str7, "6139");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2413" + "'", str8, "2413");
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean264();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean223();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString159();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString319();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2262" + "'", str5, "2262");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5371" + "'", str6, "5371");
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean171();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString250();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean134();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager128();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString240();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean308();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString43();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3195" + "'", str2, "3195");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2867" + "'", str5, "2867");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "483" + "'", str7, "483");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString333();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager177();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean210();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean278();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString230();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager23();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean332();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean1();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean136();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5683" + "'", str4, "5683");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2798" + "'", str8, "2798");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + false + "'", boolean12, false);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString60();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager206();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean192();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString8();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager10();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager350();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean348();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "726" + "'", str3, "726");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "93" + "'", str6, "93");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString333();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString112();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager104();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean357();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager233();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5683" + "'", str4, "5683");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1824" + "'", str5, "1824");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString219();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager301();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean226();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString21();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2617" + "'", str4, "2617");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "256" + "'", str7, "256");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString200();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString68();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString177();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean167();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2485" + "'", str4, "2485");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "812" + "'", str5, "812");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2392" + "'", str6, "2392");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean208();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager22();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean135();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean98();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean21();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString262();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager37();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean182();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", boolean6, false);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3629" + "'", str9, "3629");
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString184();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager145();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean85();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean2();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager50();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean278();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString95();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString246();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager75();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager271();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2421" + "'", str3, "2421");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", boolean6, false);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1314" + "'", str9, "1314");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "3054" + "'", str10, "3054");
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString219();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager133();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString295();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager89();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean330();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean30();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean150();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2617" + "'", str4, "2617");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4853" + "'", str6, "4853");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString219();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager119();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean230();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager3();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString309();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean26();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager278();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager355();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2617" + "'", str4, "2617");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "5122" + "'", str8, "5122");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean173();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager249();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager284();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager54();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager157();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean346();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean170();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString58();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean177();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager149();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean48();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "704" + "'", str2, "704");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString219();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager301();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean226();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean133();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2617" + "'", str4, "2617");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + false + "'", boolean7, false);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString219();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager119();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean230();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString3();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean56();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2617" + "'", str4, "2617");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "37" + "'", str7, "37");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager302();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString189();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean188();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager246();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2440" + "'", str5, "2440");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager61();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager276();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager70();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString235();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean60();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean93();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString151();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2851" + "'", str7, "2851");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2238" + "'", str10, "2238");
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager299();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString215();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager148();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2555" + "'", str3, "2555");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString219();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString27();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString159();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager82();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager93();
        org.activiti.engine.impl.db.PersistentObject persistentObject9 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager8.insert(persistentObject9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2617" + "'", str4, "2617");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "304" + "'", str5, "304");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2262" + "'", str6, "2262");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString219();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager119();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean230();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager3();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString309();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean26();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean356();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean161();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString172();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager13 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager19();
        java.lang.Boolean boolean14 = serializedObjectSupporter0.deserializeObjectBoolean230();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2617" + "'", str4, "2617");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "5122" + "'", str8, "5122");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2373" + "'", str12, "2373");
        org.junit.Assert.assertNotNull(deploymentEntityManager13);
        org.junit.Assert.assertEquals("'" + boolean14 + "' != '" + true + "'", boolean14, true);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean208();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean348();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean263();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager332();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean243();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean35();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString26();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString49();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager343();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean100();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString191();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager180();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "308" + "'", str3, "308");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "595" + "'", str4, "595");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2448" + "'", str7, "2448");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString333();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString181();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean222();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean342();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager306();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5683" + "'", str4, "5683");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2408" + "'", str5, "2408");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString60();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager206();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean192();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString8();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString17();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager24();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager282();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "726" + "'", str3, "726");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "93" + "'", str6, "93");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "221" + "'", str7, "221");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean171();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean330();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString172();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString119();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager322();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean5();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean267();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager195();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString354();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean356();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean267();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2373" + "'", str3, "2373");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1971" + "'", str4, "1971");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "6184" + "'", str9, "6184");
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean208();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean348();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean263();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean17();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString213();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean53();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean209();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2547" + "'", str8, "2547");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean264();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean223();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager289();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString48();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean150();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString268();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "578" + "'", str6, "578");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "3849" + "'", str8, "3849");
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean270();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean206();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString215();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean169();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2555" + "'", str6, "2555");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager61();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager144();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean146();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString219();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager133();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString295();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager89();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean330();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean30();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager33();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager146();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager66();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2617" + "'", str4, "2617");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4853" + "'", str6, "4853");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean173();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString281();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean316();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4376" + "'", str5, "4376");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean171();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean330();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString172();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString119();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager322();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean5();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean267();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean348();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean44();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2373" + "'", str3, "2373");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1971" + "'", str4, "1971");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean4();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString163();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean264();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean14();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString81();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager22();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2330" + "'", str5, "2330");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1056" + "'", str8, "1056");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager299();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager331();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean306();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString123();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean92();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString181();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString301();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2061" + "'", str5, "2061");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2408" + "'", str7, "2408");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4958" + "'", str8, "4958");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean4();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString163();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean264();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean357();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString208();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2330" + "'", str5, "2330");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2515" + "'", str8, "2515");
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString184();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager145();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean85();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString288();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager265();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager17();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2421" + "'", str3, "2421");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4639" + "'", str6, "4639");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager302();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager171();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean95();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean272();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString66();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString98();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString328();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean17();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean245();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean198();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "789" + "'", str3, "789");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1380" + "'", str4, "1380");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5576" + "'", str5, "5576");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString333();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString181();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean222();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager261();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5683" + "'", str4, "5683");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2408" + "'", str5, "2408");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString326();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean348();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager128();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean229();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager78();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5538" + "'", str4, "5538");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString184();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager145();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean85();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean2();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager50();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean278();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString139();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString240();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager179();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager275();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2421" + "'", str3, "2421");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", boolean6, false);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2202" + "'", str9, "2202");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2867" + "'", str10, "2867");
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString326();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean348();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager128();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager148();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString347();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString19();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager106();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5538" + "'", str4, "5538");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "5993" + "'", str8, "5993");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "242" + "'", str9, "242");
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean171();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString174();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean152();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean25();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2381" + "'", str2, "2381");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager61();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager276();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager70();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString278();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString48();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString184();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString45();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean25();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4241" + "'", str7, "4241");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "578" + "'", str8, "578");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2421" + "'", str9, "2421");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "522" + "'", str10, "522");
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean264();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean223();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString169();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager60();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString230();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2360" + "'", str5, "2360");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2798" + "'", str7, "2798");
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString184();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager145();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean85();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean2();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager50();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean278();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString139();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString240();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager236();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2421" + "'", str3, "2421");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", boolean6, false);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2202" + "'", str9, "2202");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2867" + "'", str10, "2867");
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString219();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager119();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean230();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString10();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString228();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2617" + "'", str4, "2617");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "128" + "'", str7, "128");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2778" + "'", str8, "2778");
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString184();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager145();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean85();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean2();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager50();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager262();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager102();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean166();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2421" + "'", str3, "2421");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", boolean6, false);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + false + "'", boolean10, false);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString60();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager206();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager94();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString267();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean352();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "726" + "'", str3, "726");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "106" + "'", str6, "106");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3846" + "'", str7, "3846");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean173();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager249();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean3();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager238();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString45();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString89();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "522" + "'", str8, "522");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1232" + "'", str9, "1232");
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean272();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager188();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString97();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager68();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager135();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString101();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString207();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean113();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1358" + "'", str4, "1358");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1544" + "'", str7, "1544");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2512" + "'", str8, "2512");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean264();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString147();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean263();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean74();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean7();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager301();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager65();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean57();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString276();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2226" + "'", str4, "2226");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4175" + "'", str11, "4175");
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString219();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString27();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString159();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager256();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2617" + "'", str4, "2617");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "304" + "'", str5, "304");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2262" + "'", str6, "2262");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager61();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager276();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager70();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString278();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString159();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager232();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager79();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager353();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4241" + "'", str7, "4241");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2262" + "'", str8, "2262");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean264();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean223();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString159();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean206();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean249();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString228();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean293();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2262" + "'", str5, "2262");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2778" + "'", str8, "2778");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean272();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager188();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString97();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager68();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager224();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean313();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean12();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1358" + "'", str4, "1358");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean272();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString66();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString98();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager244();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString69();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString213();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "789" + "'", str3, "789");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1380" + "'", str4, "1380");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "844" + "'", str6, "844");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2547" + "'", str7, "2547");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean30();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager290();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString197();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString244();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString241();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2472" + "'", str3, "2472");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "3006" + "'", str4, "3006");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2871" + "'", str5, "2871");
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString333();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager177();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean210();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean278();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString230();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager23();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean332();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean1();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager26();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5683" + "'", str4, "5683");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2798" + "'", str8, "2798");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean173();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager249();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean3();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean141();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean316();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString60();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager206();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager94();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString267();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString18();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "726" + "'", str3, "726");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "106" + "'", str6, "106");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3846" + "'", str7, "3846");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "230" + "'", str8, "230");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean195();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString102();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean291();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1553" + "'", str5, "1553");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean208();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager22();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean135();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean98();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean21();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean102();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager301();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", boolean6, false);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean173();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager249();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean3();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString306();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString153();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager93();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager300();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5079" + "'", str7, "5079");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2244" + "'", str8, "2244");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean272();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString66();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString98();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager150();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager138();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean337();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "789" + "'", str3, "789");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1380" + "'", str4, "1380");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString333();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager177();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean210();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean278();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString230();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager23();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString161();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5683" + "'", str4, "5683");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2798" + "'", str8, "2798");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2281" + "'", str10, "2281");
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString346();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString161();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5538" + "'", str4, "5538");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5990" + "'", str5, "5990");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2281" + "'", str6, "2281");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString200();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString68();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager49();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean187();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean145();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager112();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2485" + "'", str4, "2485");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "812" + "'", str5, "812");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean195();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager70();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString111();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager242();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1827" + "'", str7, "1827");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString60();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager206();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager109();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "726" + "'", str3, "726");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString219();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString27();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString159();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager241();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString280();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2617" + "'", str4, "2617");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "304" + "'", str5, "304");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2262" + "'", str6, "2262");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4331" + "'", str8, "4331");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean65();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean194();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean258();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager328();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager25();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean208();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean348();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean263();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean72();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean97();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean272();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager188();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager240();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean272();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString66();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager218();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString32();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString288();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager155();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "789" + "'", str3, "789");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "374" + "'", str5, "374");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4639" + "'", str6, "4639");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString219();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager133();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString295();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean159();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean211();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean303();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString338();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString24();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString53();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2617" + "'", str4, "2617");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4853" + "'", str6, "4853");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "5794" + "'", str10, "5794");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "287" + "'", str11, "287");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1648" + "'", str12, "1648");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "642" + "'", str13, "642");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean171();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean330();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean85();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean142();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean272();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString66();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager218();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString32();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString303();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean305();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean46();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "789" + "'", str3, "789");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "374" + "'", str5, "374");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4993" + "'", str6, "4993");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString219();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager301();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager98();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager35();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2617" + "'", str4, "2617");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean272();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString66();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString98();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager22();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager219();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString210();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "789" + "'", str3, "789");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1380" + "'", str4, "1380");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2521" + "'", str8, "2521");
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean208();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean348();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean263();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean72();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString289();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean205();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString322();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean63();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4642" + "'", str8, "4642");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "5450" + "'", str10, "5450");
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean35();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString26();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString49();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager343();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean100();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString191();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager67();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager192();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "308" + "'", str3, "308");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "595" + "'", str4, "595");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2448" + "'", str7, "2448");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString333();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager177();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean210();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean278();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean156();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5683" + "'", str4, "5683");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean270();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString38();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean49();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean85();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "426" + "'", str5, "426");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean65();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean194();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean258();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager328();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean166();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager289();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString241();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + false + "'", boolean7, false);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2871" + "'", str9, "2871");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean195();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager70();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString66();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "789" + "'", str7, "789");
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean264();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager329();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString118();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString159();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager156();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString323();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean268();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString310();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1974" + "'", str5, "1974");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2262" + "'", str6, "2262");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "5455" + "'", str8, "5455");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "5156" + "'", str10, "5156");
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean272();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString66();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager218();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString32();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean86();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "789" + "'", str3, "789");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "374" + "'", str5, "374");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean4();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString163();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean264();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean14();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString14();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager188();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2330" + "'", str5, "2330");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "172" + "'", str8, "172");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean173();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString281();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString50();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString172();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager214();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4376" + "'", str5, "4376");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "613" + "'", str6, "613");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2373" + "'", str7, "2373");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean264();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean223();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString159();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean206();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString250();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager158();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2262" + "'", str5, "2262");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3195" + "'", str7, "3195");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager18();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString326();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean348();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager128();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean340();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5538" + "'", str4, "5538");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean264();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean223();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager289();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString48();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean150();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager314();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager91();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "578" + "'", str6, "578");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager61();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager276();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager70();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString278();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString159();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager232();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString265();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean15();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4241" + "'", str7, "4241");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2262" + "'", str8, "2262");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "3778" + "'", str10, "3778");
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean65();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean196();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString184();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean21();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager255();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager129();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2421" + "'", str3, "2421");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean264();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean223();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager289();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean145();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean134();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString217();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager70();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + false + "'", boolean7, false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1270" + "'", str8, "1270");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2611" + "'", str9, "2611");
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager42();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString192();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean255();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager30();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2453" + "'", str5, "2453");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString60();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager206();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean192();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString8();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString17();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean158();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "726" + "'", str3, "726");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "93" + "'", str6, "93");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "221" + "'", str7, "221");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean171();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString250();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean134();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager204();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString350();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString90();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3195" + "'", str2, "3195");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "6086" + "'", str5, "6086");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1240" + "'", str6, "1240");
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean171();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString250();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean134();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager204();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString350();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString198();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString65();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3195" + "'", str2, "3195");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "6086" + "'", str5, "6086");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2477" + "'", str6, "2477");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "781" + "'", str7, "781");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean264();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString302();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString174();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4968" + "'", str4, "4968");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2381" + "'", str5, "2381");
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString194();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager225();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString117();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean273();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2461" + "'", str3, "2461");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1949" + "'", str5, "1949");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean170();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager44();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean311();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean171();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString174();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString251();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2381" + "'", str2, "2381");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3260" + "'", str3, "3260");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean208();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean348();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean263();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean17();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager66();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString335();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "5711" + "'", str9, "5711");
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager302();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager71();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager15();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean171();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean330();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString172();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString119();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager122();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2373" + "'", str3, "2373");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1971" + "'", str4, "1971");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean208();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean348();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean263();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean72();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean299();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean266();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean190();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager244();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager77();
        java.lang.Boolean boolean13 = serializedObjectSupporter0.deserializeObjectBoolean93();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + true + "'", boolean13, true);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean171();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString250();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean341();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager170();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3195" + "'", str2, "3195");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString182();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString90();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean252();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean159();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager121();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2413" + "'", str3, "2413");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1240" + "'", str4, "1240");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString184();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager145();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean71();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString313();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2421" + "'", str3, "2421");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5229" + "'", str6, "5229");
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString219();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager133();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString295();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager89();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean330();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean30();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager33();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean200();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2617" + "'", str4, "2617");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4853" + "'", str6, "4853");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString184();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager145();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean85();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean2();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager50();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean278();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString139();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString240();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager179();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager147();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2421" + "'", str3, "2421");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", boolean6, false);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2202" + "'", str9, "2202");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2867" + "'", str10, "2867");
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString219();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager133();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString295();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean159();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean211();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean281();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString129();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager249();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2617" + "'", str4, "2617");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4853" + "'", str6, "4853");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2156" + "'", str10, "2156");
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean272();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString66();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString98();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager126();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager201();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString116();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString263();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "789" + "'", str3, "789");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1380" + "'", str4, "1380");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1924" + "'", str7, "1924");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "3688" + "'", str8, "3688");
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean171();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString250();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean105();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean12();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean75();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3195" + "'", str2, "3195");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString60();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager206();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString102();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean10();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager153();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean34();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString341();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean97();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "726" + "'", str3, "726");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1553" + "'", str5, "1553");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "5867" + "'", str9, "5867");
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean171();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean330();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean85();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString327();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5543" + "'", str4, "5543");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString184();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager145();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean85();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean2();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager50();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean278();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString95();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean63();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2421" + "'", str3, "2421");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", boolean6, false);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1314" + "'", str9, "1314");
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean208();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean46();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager254();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString305();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager239();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5021" + "'", str7, "5021");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString219();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager133();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean227();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2617" + "'", str4, "2617");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean32();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString299();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager156();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean131();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4938" + "'", str5, "4938");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean171();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean330();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString172();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString119();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString276();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager42();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2373" + "'", str3, "2373");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1971" + "'", str4, "1971");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4175" + "'", str5, "4175");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean171();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean330();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString172();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString119();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager322();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean5();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean267();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean348();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString4();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2373" + "'", str3, "2373");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1971" + "'", str4, "1971");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "52" + "'", str9, "52");
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean272();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString66();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager218();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString32();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager83();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean106();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "789" + "'", str3, "789");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "374" + "'", str5, "374");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean272();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString66();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString98();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager150();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager138();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager323();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "789" + "'", str3, "789");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1380" + "'", str4, "1380");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString219();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager133();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString295();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean159();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString323();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean234();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean314();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString120();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2617" + "'", str4, "2617");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4853" + "'", str6, "4853");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "5455" + "'", str8, "5455");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2005" + "'", str11, "2005");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean171();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean330();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString172();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString119();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean193();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean15();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2373" + "'", str3, "2373");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1971" + "'", str4, "1971");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean4();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString163();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager335();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2330" + "'", str5, "2330");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean208();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager22();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean135();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean98();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean21();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager320();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean3();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean343();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", boolean6, false);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean4();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString163();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString157();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString263();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString344();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2330" + "'", str5, "2330");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2256" + "'", str6, "2256");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3688" + "'", str7, "3688");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "5940" + "'", str8, "5940");
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean173();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager249();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean3();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager238();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString45();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean25();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean353();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString96();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "522" + "'", str8, "522");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1336" + "'", str11, "1336");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1" + "'", str12, "1");
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean171();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString250();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean134();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString138();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString214();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean69();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager152();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean348();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3195" + "'", str2, "3195");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2199" + "'", str4, "2199");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2550" + "'", str5, "2550");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString184();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager145();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean85();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString288();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager58();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2421" + "'", str3, "2421");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4639" + "'", str6, "4639");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString60();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager206();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager82();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager99();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString290();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager83();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean324();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean7();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "726" + "'", str3, "726");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4712" + "'", str7, "4712");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager299();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager331();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean306();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager80();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString252();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean122();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager282();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "3263" + "'", str6, "3263");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString219();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager133();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString295();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString164();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean321();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString318();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2617" + "'", str4, "2617");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4853" + "'", str6, "4853");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2345" + "'", str7, "2345");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "5346" + "'", str9, "5346");
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean171();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString250();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean134();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager128();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager112();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3195" + "'", str2, "3195");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean171();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString250();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean341();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager17();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3195" + "'", str2, "3195");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean208();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean348();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean263();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean72();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString289();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager14();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean113();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4642" + "'", str8, "4642");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString200();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString68();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString277();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean143();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager114();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager180();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2485" + "'", str4, "2485");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "812" + "'", str5, "812");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4178" + "'", str6, "4178");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString184();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean188();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean235();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean266();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2421" + "'", str3, "2421");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString60();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager206();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager82();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager99();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean30();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString106();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager164();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager224();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean63();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString254();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "726" + "'", str3, "726");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1714" + "'", str8, "1714");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "3373" + "'", str12, "3373");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean35();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString26();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString23();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean209();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean282();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "308" + "'", str3, "308");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "275" + "'", str4, "275");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString194();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString173();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager234();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2461" + "'", str3, "2461");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2376" + "'", str4, "2376");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean171();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean330();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString172();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString119();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean105();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager316();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean274();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager305();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager250();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2373" + "'", str3, "2373");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1971" + "'", str4, "1971");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString219();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager348();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString96();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean213();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean76();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2617" + "'", str4, "2617");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1336" + "'", str6, "1336");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean30();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager290();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString197();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString244();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString46();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2472" + "'", str3, "2472");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "3006" + "'", str4, "3006");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "544" + "'", str5, "544");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean264();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean223();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString270();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean157();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3907" + "'", str5, "3907");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean208();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager22();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean135();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean98();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean21();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString262();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString334();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", boolean6, false);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3629" + "'", str9, "3629");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "5708" + "'", str10, "5708");
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString184();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean188();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean148();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean331();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString339();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2421" + "'", str3, "2421");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5797" + "'", str7, "5797");
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString60();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager206();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean192();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean264();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean113();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean84();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager219();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "726" + "'", str3, "726");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString200();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString68();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString277();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean143();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager343();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2485" + "'", str4, "2485");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "812" + "'", str5, "812");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4178" + "'", str6, "4178");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean171();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean330();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString172();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString119();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager322();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean5();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString108();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2373" + "'", str3, "2373");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1971" + "'", str4, "1971");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1758" + "'", str7, "1758");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager299();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager331();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean310();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString200();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager181();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2485" + "'", str5, "2485");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean170();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString58();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean177();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager149();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean220();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString301();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "704" + "'", str2, "704");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4958" + "'", str6, "4958");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean272();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager188();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString97();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager151();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager312();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1358" + "'", str4, "1358");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString333();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager177();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean210();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString22();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager286();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString94();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5683" + "'", str4, "5683");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "266" + "'", str7, "266");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1292" + "'", str9, "1292");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean208();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean46();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager38();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager81();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean9();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean171();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean330();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean85();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager246();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString64();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "778" + "'", str6, "778");
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean170();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean235();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString71();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "853" + "'", str3, "853");
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager61();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager276();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager70();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString235();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString117();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean85();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager27();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2851" + "'", str7, "2851");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1949" + "'", str8, "1949");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean272();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString66();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString98();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString328();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean17();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean245();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean299();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager251();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "789" + "'", str3, "789");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1380" + "'", str4, "1380");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5576" + "'", str5, "5576");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString219();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager133();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager61();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager125();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager193();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2617" + "'", str4, "2617");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString219();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString27();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString159();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager241();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString200();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2617" + "'", str4, "2617");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "304" + "'", str5, "304");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2262" + "'", str6, "2262");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2485" + "'", str8, "2485");
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean171();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString250();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean134();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager128();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString327();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString328();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3195" + "'", str2, "3195");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5543" + "'", str5, "5543");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5576" + "'", str6, "5576");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean272();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString66();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager218();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString32();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager83();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString331();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager193();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager224();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager204();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "789" + "'", str3, "789");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "374" + "'", str5, "374");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5641" + "'", str7, "5641");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString326();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean348();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager128();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager148();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString347();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString19();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean96();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5538" + "'", str4, "5538");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "5993" + "'", str8, "5993");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "242" + "'", str9, "242");
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean171();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean330();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString172();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString119();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager322();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager325();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString50();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString165();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean182();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean216();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2373" + "'", str3, "2373");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1971" + "'", str4, "1971");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "613" + "'", str7, "613");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2337" + "'", str8, "2337");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager61();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager276();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager70();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString235();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean60();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean247();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2851" + "'", str7, "2851");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager61();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager276();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager70();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString278();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString159();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager232();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString10();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean203();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4241" + "'", str7, "4241");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2262" + "'", str8, "2262");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "128" + "'", str10, "128");
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString219();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager133();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString295();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean159();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString323();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean234();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean314();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager220();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager194();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager13 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager198();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2617" + "'", str4, "2617");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4853" + "'", str6, "4853");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "5455" + "'", str8, "5455");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
        org.junit.Assert.assertNotNull(deploymentEntityManager13);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean4();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString163();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean264();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean166();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2330" + "'", str5, "2330");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + false + "'", boolean7, false);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean208();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean348();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean263();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager332();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean212();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString333();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager177();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString181();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5683" + "'", str4, "5683");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2408" + "'", str6, "2408");
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean173();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager249();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean3();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager238();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString45();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean25();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString86();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean51();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "522" + "'", str8, "522");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1150" + "'", str10, "1150");
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager61();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager276();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager70();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString278();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString77();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager184();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager84();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4241" + "'", str7, "4241");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "984" + "'", str8, "984");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString184();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager145();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean85();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString288();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager265();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager185();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2421" + "'", str3, "2421");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4639" + "'", str6, "4639");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager61();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager276();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager70();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString235();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString223();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2851" + "'", str7, "2851");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2638" + "'", str9, "2638");
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean272();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString66();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString27();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean162();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "789" + "'", str3, "789");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "304" + "'", str4, "304");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString219();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager133();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString295();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean159();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString323();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean234();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean314();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString183();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2617" + "'", str4, "2617");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4853" + "'", str6, "4853");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "5455" + "'", str8, "5455");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2416" + "'", str11, "2416");
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString219();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager119();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean230();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString8();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager335();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager350();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager265();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager18();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2617" + "'", str4, "2617");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "93" + "'", str7, "93");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean173();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager343();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString28();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString66();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString315();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "312" + "'", str6, "312");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "789" + "'", str7, "789");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "5273" + "'", str8, "5273");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean208();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean348();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean263();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean17();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager293();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean208();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean348();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean263();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager332();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString13();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString159();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "159" + "'", str8, "159");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2262" + "'", str9, "2262");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString60();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager206();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager82();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager113();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean271();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager316();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean143();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "726" + "'", str3, "726");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean182();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean268();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString338();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5794" + "'", str6, "5794");
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean208();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean348();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean263();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean17();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString213();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager34();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString53();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2547" + "'", str8, "2547");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "642" + "'", str10, "642");
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString60();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager206();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString102();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager224();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager293();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager347();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean148();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager131();
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = deploymentEntityManager10.findDeploymentCountByNativeQuery(strMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "726" + "'", str3, "726");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1553" + "'", str5, "1553");
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
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString219();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager119();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean230();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString10();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager315();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2617" + "'", str4, "2617");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "128" + "'", str7, "128");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString184();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager145();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean85();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean2();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager50();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean278();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString95();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString246();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager75();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean154();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2421" + "'", str3, "2421");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", boolean6, false);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1314" + "'", str9, "1314");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "3054" + "'", str10, "3054");
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean272();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString66();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString98();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean86();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString138();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean36();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean224();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean11();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager295();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString273();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "789" + "'", str3, "789");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1380" + "'", str4, "1380");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2199" + "'", str6, "2199");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4020" + "'", str11, "4020");
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean272();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString66();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString98();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager244();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager33();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = deploymentEntityManager6.findDeploymentCountByQueryCriteria(deploymentQueryImpl7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "789" + "'", str3, "789");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1380" + "'", str4, "1380");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString60();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager206();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager82();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager99();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean30();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString106();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager164();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString41();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "726" + "'", str3, "726");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1714" + "'", str8, "1714");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "456" + "'", str10, "456");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString184();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager145();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean85();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean2();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager50();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager262();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager66();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean157();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2421" + "'", str3, "2421");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", boolean6, false);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString182();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString90();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean252();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean159();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean328();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager302();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString203();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2413" + "'", str3, "2413");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1240" + "'", str4, "1240");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2496" + "'", str9, "2496");
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean35();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString26();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString49();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager343();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean100();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString191();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean7();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "308" + "'", str3, "308");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "595" + "'", str4, "595");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2448" + "'", str7, "2448");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean65();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean349();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString222();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2630" + "'", str5, "2630");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString219();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager119();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean230();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager3();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean186();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString155();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString12();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean316();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager13 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager351();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2617" + "'", str4, "2617");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2250" + "'", str9, "2250");
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "156" + "'", str11, "156");
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager13);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean171();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString174();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean152();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString36();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2381" + "'", str2, "2381");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "413" + "'", str4, "413");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString200();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager146();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString336();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2485" + "'", str4, "2485");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5756" + "'", str6, "5756");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager61();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager276();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager70();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString278();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString159();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager232();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager79();
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList14 = deploymentEntityManager10.findDeploymentsByNativeQuery(strMap11, (int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4241" + "'", str7, "4241");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2262" + "'", str8, "2262");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean35();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString79();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean295();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1040" + "'", str3, "1040");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean264();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager329();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString118();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString159();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager156();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString323();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString24();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean199();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager77();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager224();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1974" + "'", str5, "1974");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2262" + "'", str6, "2262");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "5455" + "'", str8, "5455");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "287" + "'", str9, "287");
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean35();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString26();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString23();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager318();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "308" + "'", str3, "308");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "275" + "'", str4, "275");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean208();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager22();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean135();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean98();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean21();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean102();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean96();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager95();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString224();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", boolean6, false);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2641" + "'", str12, "2641");
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean264();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager9();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager150();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl6 = null;
        org.activiti.engine.impl.Page page7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList8 = deploymentEntityManager5.findDeploymentsByQueryCriteria(deploymentQueryImpl6, page7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean173();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager249();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean3();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager238();
        java.lang.Class class8 = serializedObjectSupporter0.deserializeObjectClass1();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean78();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString219();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager133();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString295();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean159();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean211();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager342();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString154();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2617" + "'", str4, "2617");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4853" + "'", str6, "4853");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2247" + "'", str10, "2247");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean264();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean223();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString159();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean322();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString200();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean334();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString220();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2262" + "'", str5, "2262");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2485" + "'", str7, "2485");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2624" + "'", str9, "2624");
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString184();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager145();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean85();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean2();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager50();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean278();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString139();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString240();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager179();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean1();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2421" + "'", str3, "2421");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", boolean6, false);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2202" + "'", str9, "2202");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2867" + "'", str10, "2867");
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString219();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager133();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager61();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = deploymentEntityManager6.findDeploymentCountByQueryCriteria(deploymentQueryImpl7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2617" + "'", str4, "2617");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString182();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString90();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean252();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean159();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean328();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager302();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager100();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2413" + "'", str3, "2413");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1240" + "'", str4, "1240");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean171();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString250();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean134();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString138();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean106();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3195" + "'", str2, "3195");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2199" + "'", str4, "2199");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString60();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager206();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString102();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager224();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager293();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean312();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString240();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "726" + "'", str3, "726");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1553" + "'", str5, "1553");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2867" + "'", str9, "2867");
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean171();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager35();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString204();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2501" + "'", str3, "2501");
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean30();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager290();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString197();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString244();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString354();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager311();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString37();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2472" + "'", str3, "2472");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "3006" + "'", str4, "3006");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "6184" + "'", str5, "6184");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "420" + "'", str8, "420");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean270();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean8();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean48();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager61();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager276();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString302();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager71();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4968" + "'", str6, "4968");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean208();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean348();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean263();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString168();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager47();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean179();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2357" + "'", str7, "2357");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean195();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager70();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString111();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString71();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager118();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager285();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1827" + "'", str7, "1827");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "853" + "'", str8, "853");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean171();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString250();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean134();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager128();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString240();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean308();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString227();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager309();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3195" + "'", str2, "3195");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2867" + "'", str5, "2867");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2775" + "'", str7, "2775");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString333();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager177();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean210();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean278();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString230();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager23();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean332();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean214();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5683" + "'", str4, "5683");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2798" + "'", str8, "2798");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager61();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager276();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString302();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean148();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean105();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString70();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString286();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4968" + "'", str6, "4968");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "850" + "'", str9, "850");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4579" + "'", str10, "4579");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString60();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager206();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager82();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager99();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean30();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString43();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean31();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean187();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "726" + "'", str3, "726");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "483" + "'", str8, "483");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean272();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString66();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager218();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString32();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean93();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager268();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString56();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "789" + "'", str3, "789");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "374" + "'", str5, "374");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "683" + "'", str8, "683");
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager61();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager276();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager70();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString208();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean127();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2515" + "'", str7, "2515");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString60();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager206();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString102();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean10();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager153();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean34();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString131();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager83();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager285();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "726" + "'", str3, "726");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1553" + "'", str5, "1553");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2178" + "'", str9, "2178");
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString184();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager145();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean85();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean2();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager50();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager262();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager102();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString191();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2421" + "'", str3, "2421");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", boolean6, false);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2448" + "'", str10, "2448");
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean208();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean46();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager254();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager270();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString60();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager206();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString102();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager224();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager293();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager347();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString324();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean299();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager259();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "726" + "'", str3, "726");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1553" + "'", str5, "1553");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "5488" + "'", str9, "5488");
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean272();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString66();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString98();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString284();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString24();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager355();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "789" + "'", str3, "789");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1380" + "'", str4, "1380");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4511" + "'", str5, "4511");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "287" + "'", str6, "287");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean264();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString147();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean263();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean74();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean202();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString268();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString90();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2226" + "'", str4, "2226");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "3849" + "'", str8, "3849");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1240" + "'", str9, "1240");
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean272();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString66();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString98();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean86();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString138();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean36();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean224();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean11();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean351();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "789" + "'", str3, "789");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1380" + "'", str4, "1380");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2199" + "'", str6, "2199");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean301();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString265();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager39();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager210();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString282();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "3778" + "'", str4, "3778");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4421" + "'", str7, "4421");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString60();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager206();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean192();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString8();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString17();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean66();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager39();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString227();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "726" + "'", str3, "726");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "93" + "'", str6, "93");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "221" + "'", str7, "221");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2775" + "'", str10, "2775");
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString219();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager301();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean226();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString329();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean288();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean302();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2617" + "'", str4, "2617");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5579" + "'", str7, "5579");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean182();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager170();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString60();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager206();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString102();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager224();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager292();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean135();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString353();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "726" + "'", str3, "726");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1553" + "'", str5, "1553");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + false + "'", boolean8, false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "6139" + "'", str9, "6139");
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean272();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString66();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager218();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString32();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager83();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString331();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager193();
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter9 = deploymentEntityManager8.serializedObjectSupporter;
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "789" + "'", str3, "789");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "374" + "'", str5, "374");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5641" + "'", str7, "5641");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNull(serializedObjectSupporter9);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean182();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString284();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager241();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean263();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4511" + "'", str5, "4511");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString60();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager206();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager82();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager113();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean167();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager307();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "726" + "'", str3, "726");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString200();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString68();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager49();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean9();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2485" + "'", str4, "2485");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "812" + "'", str5, "812");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString184();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean188();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager346();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString238();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2421" + "'", str3, "2421");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2860" + "'", str6, "2860");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean171();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString250();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean134();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager128();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString240();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString313();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean62();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3195" + "'", str2, "3195");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2867" + "'", str5, "2867");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5229" + "'", str6, "5229");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString219();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager119();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean230();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager3();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean186();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString155();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager346();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2617" + "'", str4, "2617");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2250" + "'", str9, "2250");
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean272();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString66();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager218();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString32();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean93();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager150();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "789" + "'", str3, "789");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "374" + "'", str5, "374");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean65();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean194();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean258();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager328();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean166();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString145();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + false + "'", boolean7, false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2220" + "'", str8, "2220");
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString182();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString90();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean252();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean159();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean175();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2413" + "'", str3, "2413");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1240" + "'", str4, "1240");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager61();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager276();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager70();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString278();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString159();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString144();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4241" + "'", str7, "4241");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2262" + "'", str8, "2262");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2217" + "'", str9, "2217");
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean171();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString250();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean105();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean12();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean71();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager104();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean208();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3195" + "'", str2, "3195");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean264();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString147();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean263();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager163();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean253();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2226" + "'", str4, "2226");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean208();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager22();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean135();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean98();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean21();
        java.lang.Class<?> wildcardClass9 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", boolean6, false);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString219();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager119();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean230();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager3();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString309();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean26();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager211();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager159();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager76();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2617" + "'", str4, "2617");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "5122" + "'", str8, "5122");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean264();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager152();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString219();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager119();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean212();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString240();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager304();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString272();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager162();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2617" + "'", str4, "2617");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2867" + "'", str7, "2867");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4017" + "'", str9, "4017");
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }
}

