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
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter1 = deploymentEntityManager0.serializedObjectSupporter;
        org.junit.Assert.assertNull(serializedObjectSupporter1);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        org.activiti.engine.impl.db.PersistentObject persistentObject1 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        org.activiti.engine.impl.db.PersistentObject persistentObject1 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString510();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11417" + "'", str2, "11417");
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString861();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean598();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10711" + "'", str3, "10711");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager973();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean577();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString17();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager609();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "221" + "'", str3, "221");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager585();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager437();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean106();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString861();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean1060();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager965();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager659();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean2();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10711" + "'", str3, "10711");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + false + "'", boolean7, false);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager973();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager263();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString861();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean1060();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager965();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager659();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean748();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10711" + "'", str3, "10711");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1045();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString609();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean413();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean596();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString378();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10001" + "'", str5, "10001");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1470" + "'", str6, "1470");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "6631" + "'", str9, "6631");
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager136();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1032();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString859();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10694" + "'", str7, "10694");
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager995();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString566();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean252();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean1043();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "584" + "'", str6, "584");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString800();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean701();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager335();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean875();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "9562" + "'", str2, "9562");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean920();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager151();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager335();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean263();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean1036();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager585();
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
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean664();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString437();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean810();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString933();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9890" + "'", str3, "9890");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "11742" + "'", str5, "11742");
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString169();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager651();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2360" + "'", str2, "2360");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean577();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString429();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString683();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1044();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager807();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean247();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9076" + "'", str3, "9076");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5369" + "'", str4, "5369");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString871();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager201();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager733();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager803();
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
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString800();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString820();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "9562" + "'", str2, "9562");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10368" + "'", str3, "10368");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1045();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager376();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager589();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager811();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager307();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10001" + "'", str5, "10001");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager645();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean198();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean337();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1052();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager997();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString264();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3733" + "'", str7, "3733");
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString473();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager507();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString375();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean581();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager963();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10628" + "'", str2, "10628");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "6596" + "'", str4, "6596");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean1048();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString260();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager193();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3571" + "'", str3, "3571");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
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
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean652();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager833();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
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
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString37();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager571();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean479();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString465();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString515();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "420" + "'", str1, "420");
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10538" + "'", str4, "10538");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "11572" + "'", str5, "11572");
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
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
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean797();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "75304" + "'", str8, "75304");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean664();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString437();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1030();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString300();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean77();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString99();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString42();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9890" + "'", str3, "9890");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4948" + "'", str5, "4948");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1402" + "'", str7, "1402");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "473" + "'", str8, "473");
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString37();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean533();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "420" + "'", str1, "420");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "80" + "'", str2, "80");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager995();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString566();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString540();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "584" + "'", str6, "584");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "12473" + "'", str7, "12473");
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString569();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager877();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager207();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString17();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean87();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "649" + "'", str4, "649");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "221" + "'", str7, "221");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString569();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean199();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean414();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString202();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean834();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "649" + "'", str4, "649");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2493" + "'", str7, "2493");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString861();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean1060();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager965();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager102();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager899();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10711" + "'", str3, "10711");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager973();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString762();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8291" + "'", str3, "8291");
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString800();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean554();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean204();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager497();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString853();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "9562" + "'", str2, "9562");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10670" + "'", str6, "10670");
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean577();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString429();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean636();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString151();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9076" + "'", str3, "9076");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2238" + "'", str5, "2238");
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean726();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager807();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager471();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean226();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean263();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean612();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString482();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10789" + "'", str4, "10789");
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean398();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1052();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString646();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2352" + "'", str5, "2352");
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString963();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean633();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString235();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString495();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString244();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "12162" + "'", str2, "12162");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2851" + "'", str4, "2851");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "11124" + "'", str5, "11124");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "3006" + "'", str6, "3006");
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean90();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString798();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager994();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9512" + "'", str3, "9512");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager995();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString566();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean252();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString594();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager677();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "584" + "'", str6, "584");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1279" + "'", str8, "1279");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1045();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString609();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean413();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString866();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10001" + "'", str5, "10001");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1470" + "'", str6, "1470");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10747" + "'", str8, "10747");
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean577();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString429();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString728();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean718();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean973();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager903();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString838();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9076" + "'", str3, "9076");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "6195" + "'", str4, "6195");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10557" + "'", str8, "10557");
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean577();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString17();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager957();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString59();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString831();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "221" + "'", str3, "221");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "715" + "'", str5, "715");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10499" + "'", str6, "10499");
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean1048();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean59();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager530();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean792();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString835();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4" + "'", str6, "4");
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString147();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager276();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean398();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean688();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2226" + "'", str3, "2226");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean1048();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString431();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager62();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9440" + "'", str3, "9440");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString569();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager188();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString305();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager257();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "649" + "'", str4, "649");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5021" + "'", str6, "5021");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString871();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString970();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString937();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10847" + "'", str6, "10847");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "12278" + "'", str7, "12278");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "11849" + "'", str8, "11849");
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager973();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean134();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean516();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager211();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString811();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString642();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9803" + "'", str6, "9803");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2264" + "'", str7, "2264");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString169();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString14();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager242();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2360" + "'", str2, "2360");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "172" + "'", str3, "172");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager645();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString418();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean60();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager798();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "7644" + "'", str3, "7644");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager533();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString94();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1040();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean303();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean95();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1292" + "'", str7, "1292");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "53" + "'", str8, "53");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString800();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1063();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString895();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "9562" + "'", str2, "9562");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11135" + "'", str4, "11135");
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString728();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString270();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1025();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6195" + "'", str3, "6195");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "3907" + "'", str4, "3907");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "77804" + "'", str5, "77804");
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean577();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString429();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString683();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString589();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9076" + "'", str3, "9076");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5369" + "'", str4, "5369");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1078" + "'", str5, "1078");
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean1048();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager564();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager272();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean744();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean398();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager840();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString569();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager188();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean954();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString323();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean732();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager222();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString97();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "649" + "'", str4, "649");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5455" + "'", str7, "5455");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1358" + "'", str10, "1358");
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager739();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean845();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString189();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean176();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2440" + "'", str2, "2440");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1045();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager376();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean217();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10001" + "'", str5, "10001");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean726();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager807();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager471();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager728();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean695();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString402();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager670();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "7027" + "'", str8, "7027");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString963();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString61();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString406();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean957();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean623();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean575();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "12162" + "'", str2, "12162");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "747" + "'", str3, "747");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7079" + "'", str4, "7079");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString963();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean633();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString235();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager563();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "12162" + "'", str2, "12162");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2851" + "'", str4, "2851");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager533();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean603();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + false + "'", boolean8, false);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1045();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager376();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean736();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean44();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager779();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString827();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10001" + "'", str5, "10001");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10455" + "'", str10, "10455");
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString37();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager571();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString538();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean7();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "420" + "'", str1, "420");
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "12399" + "'", str3, "12399");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString369();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager750();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "6498" + "'", str5, "6498");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString569();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager877();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager207();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString17();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean12();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "649" + "'", str4, "649");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "221" + "'", str7, "221");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager330();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean598();
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
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
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
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean491();
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
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager493();
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
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
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
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString74();
        java.lang.Boolean boolean13 = serializedObjectSupporter0.deserializeObjectBoolean458();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "871" + "'", str12, "871");
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + true + "'", boolean13, true);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean726();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager807();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager471();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString409();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString760();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "7386" + "'", str6, "7386");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "8093" + "'", str7, "8093");
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString861();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean1060();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager965();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager659();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean630();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10711" + "'", str3, "10711");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean664();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString437();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean242();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager381();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean63();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9890" + "'", str3, "9890");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean726();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager807();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString732();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean683();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString681();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager534();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "6483" + "'", str5, "6483");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5328" + "'", str7, "5328");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString569();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean199();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString714();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "649" + "'", str4, "649");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5904" + "'", str6, "5904");
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString569();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager188();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean954();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager24();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString426();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "649" + "'", str4, "649");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "8732" + "'", str8, "8732");
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString871();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString66();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString628();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean16();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean282();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10847" + "'", str6, "10847");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "789" + "'", str7, "789");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970" + "'", str8, "1970");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
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
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString668();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "584" + "'", str6, "584");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1279" + "'", str8, "1279");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "5093" + "'", str10, "5093");
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
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
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean652();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString71();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean342();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "853" + "'", str11, "853");
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString279();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean298();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString241();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean790();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4286" + "'", str3, "4286");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2871" + "'", str5, "2871");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString37();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager571();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean479();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean267();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "420" + "'", str1, "420");
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager463();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString128();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean871();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1002();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager802();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager805();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean26();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2138" + "'", str3, "2138");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "25304" + "'", str5, "25304");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1033();
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
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean1048();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString260();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean459();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3571" + "'", str3, "3571");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString963();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString61();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString517();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "12162" + "'", str2, "12162");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "747" + "'", str3, "747");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11578" + "'", str4, "11578");
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString800();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean701();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString196();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean1052();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString978();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "9562" + "'", str2, "9562");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2469" + "'", str4, "2469");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "12388" + "'", str6, "12388");
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString728();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString270();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString409();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean1002();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6195" + "'", str3, "6195");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "3907" + "'", str4, "3907");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "7386" + "'", str5, "7386");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString448();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString849();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean524();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean728();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean663();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10118" + "'", str5, "10118");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10628" + "'", str6, "10628");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString599();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString914();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1366" + "'", str6, "1366");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "11472" + "'", str7, "11472");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager265();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean374();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager768();
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
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString569();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean199();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean105();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean71();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager185();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager901();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "649" + "'", str4, "649");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager645();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean198();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean337();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1052();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager997();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean521();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + false + "'", boolean7, false);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1045();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager376();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean736();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager134();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString803();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10001" + "'", str5, "10001");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "9614" + "'", str9, "9614");
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean458();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager711();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager569();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString941();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "11904" + "'", str6, "11904");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString569();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager382();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1034();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager998();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "649" + "'", str4, "649");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager335();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString987();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean916();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager110();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "15313" + "'", str6, "15313");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + false + "'", boolean7, false);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1045();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager376();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean736();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean454();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10001" + "'", str5, "10001");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager770();
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
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString569();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString317();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1028();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "649" + "'", str4, "649");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5301" + "'", str5, "5301");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "85304" + "'", str6, "85304");
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1045();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager376();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString924();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager815();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager282();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager691();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean517();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10001" + "'", str5, "10001");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "11592" + "'", str7, "11592");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + false + "'", boolean11, false);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString800();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean554();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean204();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString495();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager314();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "9562" + "'", str2, "9562");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "11124" + "'", str5, "11124");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean664();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString437();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean810();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager950();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString807();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9890" + "'", str3, "9890");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9677" + "'", str6, "9677");
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
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
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean652();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString71();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString602();
        java.lang.Boolean boolean13 = serializedObjectSupporter0.deserializeObjectBoolean505();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "853" + "'", str11, "853");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1385" + "'", str12, "1385");
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + true + "'", boolean13, true);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean431();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager354();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean891();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
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
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean954();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10001" + "'", str5, "10001");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10867" + "'", str9, "10867");
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString169();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString213();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager988();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2360" + "'", str2, "2360");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2547" + "'", str3, "2547");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString569();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager188();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager236();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString342();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "649" + "'", str4, "649");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5870" + "'", str7, "5870");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean441();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString279();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean298();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString241();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager181();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager590();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = deploymentEntityManager7.findDeploymentCountByNativeQuery(strMap8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4286" + "'", str3, "4286");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2871" + "'", str5, "2871");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
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
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString629();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2469" + "'", str7, "2469");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2250" + "'", str8, "2250");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1983" + "'", str10, "1983");
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean190();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean717();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1045();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString609();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean413();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString119();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10001" + "'", str5, "10001");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1470" + "'", str6, "1470");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1971" + "'", str8, "1971");
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString800();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean701();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean110();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "9562" + "'", str2, "9562");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean664();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString437();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean242();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString482();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString489();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager439();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9890" + "'", str3, "9890");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10789" + "'", str5, "10789");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10984" + "'", str6, "10984");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean1048();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean59();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean449();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager934();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString144();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean373();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2217" + "'", str2, "2217");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString963();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString312();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString824();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean354();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "12162" + "'", str2, "12162");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5204" + "'", str3, "5204");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10423" + "'", str4, "10423");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString666();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean767();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager349();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5066" + "'", str3, "5066");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString728();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString270();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean134();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager693();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6195" + "'", str3, "6195");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "3907" + "'", str4, "3907");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + false + "'", boolean5, false);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
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
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean26();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9890" + "'", str3, "9890");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4948" + "'", str5, "4948");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1402" + "'", str7, "1402");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString666();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1055();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString383();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5066" + "'", str3, "5066");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "57" + "'", str4, "57");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "6677" + "'", str5, "6677");
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean664();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString437();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean242();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString646();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean88();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean520();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9890" + "'", str3, "9890");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2352" + "'", str5, "2352");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + false + "'", boolean7, false);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean213();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString473();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager507();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean586();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager859();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10628" + "'", str2, "10628");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean263();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager392();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString156();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2253" + "'", str4, "2253");
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean844();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString924();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + false + "'", boolean5, false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "11592" + "'", str6, "11592");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
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
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean652();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString71();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString602();
        java.lang.Boolean boolean13 = serializedObjectSupporter0.deserializeObjectBoolean906();
        java.lang.Boolean boolean14 = serializedObjectSupporter0.deserializeObjectBoolean80();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager15 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager726();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager16 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager334();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "853" + "'", str11, "853");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1385" + "'", str12, "1385");
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + true + "'", boolean13, true);
        org.junit.Assert.assertEquals("'" + boolean14 + "' != '" + true + "'", boolean14, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager15);
        org.junit.Assert.assertNotNull(deploymentEntityManager16);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager995();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString566();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean252();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean196();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean1052();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager460();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager905();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager13 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager624();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "584" + "'", str6, "584");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2916" + "'", str8, "2916");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
        org.junit.Assert.assertNotNull(deploymentEntityManager13);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager995();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString566();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean252();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean282();
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
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager265();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager144();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString569();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager382();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean817();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString864();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "649" + "'", str4, "649");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10730" + "'", str7, "10730");
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
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
        java.lang.String str15 = serializedObjectSupporter0.deserializeObjectString953();
        java.lang.String str16 = serializedObjectSupporter0.deserializeObjectString938();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "12058" + "'", str15, "12058");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "11868" + "'", str16, "11868");
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean664();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString437();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean242();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean818();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean215();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean814();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9890" + "'", str3, "9890");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager335();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean127();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean823();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString942();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "11910" + "'", str8, "11910");
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1045();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager376();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean736();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager134();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean648();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString190();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10001" + "'", str5, "10001");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2445" + "'", str10, "2445");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager938();
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
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager335();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean263();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager624();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager947();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean975();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString390();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "6831" + "'", str10, "6831");
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString569();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean552();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString258();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "649" + "'", str4, "649");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "3511" + "'", str6, "3511");
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
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
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString491();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "3263" + "'", str8, "3263");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "9333" + "'", str9, "9333");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "11071" + "'", str10, "11071");
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager335();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean412();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager205();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString28();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "312" + "'", str8, "312");
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString37();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager571();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString538();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager12();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "420" + "'", str1, "420");
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "12399" + "'", str3, "12399");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString369();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1051();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString724();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager509();
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
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager842();
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
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager330();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager987();
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
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean934();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
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
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString141();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2208" + "'", str11, "2208");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager463();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean764();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager533();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager454();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean943();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean268();
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
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager645();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString418();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1044();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager683();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "7644" + "'", str3, "7644");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager995();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean952();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString299();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4938" + "'", str7, "4938");
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean445();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean9();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString75();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "888" + "'", str5, "888");
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager533();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager454();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString752();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "7669" + "'", str8, "7669");
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString963();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString301();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString403();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean469();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString810();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "12162" + "'", str2, "12162");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4958" + "'", str3, "4958");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7042" + "'", str4, "7042");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9725" + "'", str6, "9725");
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString800();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean701();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString196();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString611();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString192();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean830();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "9562" + "'", str2, "9562");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2469" + "'", str4, "2469");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1545" + "'", str5, "1545");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2453" + "'", str6, "2453");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean1048();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean495();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager8();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString279();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString505();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager51();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4286" + "'", str3, "4286");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11342" + "'", str4, "11342");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager335();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString513();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString391();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager289();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "11513" + "'", str6, "11513");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "6843" + "'", str7, "6843");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
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
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString821();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10379" + "'", str11, "10379");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean577();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString17();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString652();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean148();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "221" + "'", str3, "221");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2384" + "'", str4, "2384");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString728();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString270();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString549();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6195" + "'", str3, "6195");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "3907" + "'", str4, "3907");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "262" + "'", str5, "262");
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
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
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString903();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "584" + "'", str6, "584");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1279" + "'", str8, "1279");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "11279" + "'", str10, "11279");
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString37();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager808();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager178();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager854();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "420" + "'", str1, "420");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "80" + "'", str2, "80");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager335();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean157();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager43();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString979();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "12407" + "'", str8, "12407");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString800();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean554();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString36();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString753();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager382();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "9562" + "'", str2, "9562");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "413" + "'", str4, "413");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "7757" + "'", str5, "7757");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString569();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString317();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean354();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1029();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "649" + "'", str4, "649");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5301" + "'", str5, "5301");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString473();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager507();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager102();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean835();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString322();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager442();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString650();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10628" + "'", str2, "10628");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5450" + "'", str6, "5450");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2376" + "'", str8, "2376");
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
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
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString574();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString942();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean405();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10847" + "'", str6, "10847");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "735" + "'", str10, "735");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "11910" + "'", str11, "11910");
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager335();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean412();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager205();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager589();
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
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString963();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString61();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager906();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "12162" + "'", str2, "12162");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "747" + "'", str3, "747");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1045();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager376();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean736();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean44();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager779();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager404();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10001" + "'", str5, "10001");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager476();
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter4 = deploymentEntityManager3.serializedObjectSupporter;
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNull(serializedObjectSupporter4);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString279();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString505();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString612();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4286" + "'", str3, "4286");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11342" + "'", str4, "11342");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1595" + "'", str5, "1595");
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString473();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager507();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString375();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean581();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean852();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean104();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10628" + "'", str2, "10628");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "6596" + "'", str4, "6596");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean577();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString429();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString728();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean501();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9076" + "'", str3, "9076");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "6195" + "'", str4, "6195");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager136();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean708();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString133();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager603();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", boolean6, false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2184" + "'", str7, "2184");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean431();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager354();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager903();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean743();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean575();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager592();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString800();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager21();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "9562" + "'", str2, "9562");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
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
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean630();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString728();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString231();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager853();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean194();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager318();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6195" + "'", str3, "6195");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2809" + "'", str4, "2809");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean115();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager262();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString336();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager359();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager484();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5756" + "'", str6, "5756");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString728();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString231();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager853();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean200();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean932();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6195" + "'", str3, "6195");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2809" + "'", str4, "2809");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean726();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString875();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager280();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean518();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean845();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10897" + "'", str4, "10897");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", boolean6, false);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager995();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString566();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean252();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString553();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "584" + "'", str6, "584");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2916" + "'", str8, "2916");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "359" + "'", str9, "359");
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager533();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager454();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean308();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString279();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean298();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString464();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4286" + "'", str3, "4286");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10490" + "'", str5, "10490");
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean577();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString429();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString728();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean926();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager120();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9076" + "'", str3, "9076");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "6195" + "'", str4, "6195");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
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
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean961();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager883();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean676();
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
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString569();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager877();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager207();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager825();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString406();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "649" + "'", str4, "649");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "7079" + "'", str8, "7079");
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean577();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString429();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean636();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager867();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString383();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9076" + "'", str3, "9076");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "6677" + "'", str6, "6677");
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager533();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean1059();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString473();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString979();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean916();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString860();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10628" + "'", str2, "10628");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "12407" + "'", str3, "12407");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10717" + "'", str5, "10717");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1045();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager376();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean736();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean44();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager779();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString707();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10001" + "'", str5, "10001");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "5855" + "'", str10, "5855");
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString569();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager382();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean817();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager580();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "649" + "'", str4, "649");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString37();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager571();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager802();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager476();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean552();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "420" + "'", str1, "420");
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager463();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString128();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean871();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1002();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager350();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean251();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager236();
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
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager533();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString94();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString123();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1292" + "'", str7, "1292");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2061" + "'", str8, "2061");
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString800();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean701();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString381();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString245();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "9562" + "'", str2, "9562");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "6654" + "'", str4, "6654");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3051" + "'", str5, "3051");
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
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
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString882();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10973" + "'", str10, "10973");
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString861();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean1060();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager247();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString637();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10711" + "'", str3, "10711");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2112" + "'", str6, "2112");
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString963();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString301();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean1046();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager625();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean772();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "12162" + "'", str2, "12162");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4958" + "'", str3, "4958");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1057();
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
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString861();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean1060();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager247();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean1050();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10711" + "'", str3, "10711");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
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
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString758();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "8023" + "'", str12, "8023");
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString473();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString382();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager714();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager730();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString89();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10628" + "'", str2, "10628");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6661" + "'", str3, "6661");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1232" + "'", str6, "1232");
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean115();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager166();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean526();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean599();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString861();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean1060();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager965();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager102();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString106();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10711" + "'", str3, "10711");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1714" + "'", str7, "1714");
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean726();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager807();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager629();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean889();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean726();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString468();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean123();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString439();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean487();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString652();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10587" + "'", str4, "10587");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "9918" + "'", str7, "9918");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2384" + "'", str9, "2384");
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString473();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString979();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean416();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString948();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager754();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10628" + "'", str2, "10628");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "12407" + "'", str3, "12407");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "11988" + "'", str5, "11988");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString473();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString382();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager714();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString471();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10628" + "'", str2, "10628");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6661" + "'", str3, "6661");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10606" + "'", str5, "10606");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager433();
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
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString565();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString140();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager310();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "574" + "'", str5, "574");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2205" + "'", str6, "2205");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean726();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString106();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1714" + "'", str4, "1714");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager585();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager743();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean230();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean577();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString429();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean493();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager642();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9076" + "'", str3, "9076");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString674();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager788();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString693();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString690();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5173" + "'", str4, "5173");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5580" + "'", str6, "5580");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5485" + "'", str7, "5485");
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean263();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean634();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean715();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean664();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString437();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1030();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString300();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean77();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager280();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean142();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9890" + "'", str3, "9890");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4948" + "'", str5, "4948");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
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
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean456();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager44();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "3263" + "'", str8, "3263");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean577();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString429();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean737();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean451();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9076" + "'", str3, "9076");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString963();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString588();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString775();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString248();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean200();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "12162" + "'", str2, "12162");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1056" + "'", str3, "1056");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "8961" + "'", str4, "8961");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3135" + "'", str5, "3135");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString599();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager504();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1366" + "'", str6, "1366");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean445();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager207();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString930();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager426();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString611();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString507();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString798();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "11700" + "'", str5, "11700");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1545" + "'", str7, "1545");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "11360" + "'", str8, "11360");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "9512" + "'", str9, "9512");
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager375();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean621();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString317();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean465();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString587();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5301" + "'", str7, "5301");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "994" + "'", str9, "994");
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager934();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString398();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6977" + "'", str2, "6977");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean1048();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString431();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString308();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean133();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9440" + "'", str3, "9440");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5119" + "'", str4, "5119");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + false + "'", boolean5, false);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager335();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString513();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString564();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean566();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "11513" + "'", str6, "11513");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "543" + "'", str7, "543");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager934();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean933();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean709();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString785();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString399();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5200" + "'", str3, "5200");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "9343" + "'", str5, "9343");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "6989" + "'", str6, "6989");
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString169();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager928();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString491();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString741();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2360" + "'", str2, "2360");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11071" + "'", str4, "11071");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "7053" + "'", str5, "7053");
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean664();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString437();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean242();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean818();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString607();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9890" + "'", str3, "9890");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1450" + "'", str6, "1450");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
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
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean967();
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
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString473();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager507();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager102();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString879();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean330();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10628" + "'", str2, "10628");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10932" + "'", str5, "10932");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString674();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager788();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString693();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean397();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5173" + "'", str4, "5173");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5580" + "'", str6, "5580");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString37();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager571();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager802();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager476();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager312();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString31();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "420" + "'", str1, "420");
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "357" + "'", str6, "357");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
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
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager913();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean56();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "584" + "'", str6, "584");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1279" + "'", str8, "1279");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "19" + "'", str10, "19");
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean664();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString437();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean242();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString482();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager297();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean765();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString636();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString991();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9890" + "'", str3, "9890");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10789" + "'", str5, "10789");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2094" + "'", str8, "2094");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "15337" + "'", str9, "15337");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean726();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager807();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager471();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString765();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean459();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean295();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "8470" + "'", str6, "8470");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString800();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean701();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString196();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager49();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString366();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "9562" + "'", str2, "9562");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2469" + "'", str4, "2469");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "6457" + "'", str6, "6457");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager375();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean621();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager650();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
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
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean664();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "3263" + "'", str8, "3263");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3568" + "'", str9, "3568");
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager656();
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
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString968();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager912();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "12244" + "'", str4, "12244");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean664();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString437();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean242();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString482();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager297();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean765();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString636();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean958();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9890" + "'", str3, "9890");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10789" + "'", str5, "10789");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2094" + "'", str8, "2094");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString473();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString515();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager767();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean1055();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean408();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString586();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10628" + "'", str2, "10628");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11572" + "'", str3, "11572");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "955" + "'", str7, "955");
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
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
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString293();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10587" + "'", str4, "10587");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "9918" + "'", str7, "9918");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4826" + "'", str10, "4826");
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager653();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString800();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean701();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString381();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean95();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString628();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean582();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "9562" + "'", str2, "9562");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "6654" + "'", str4, "6654");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970" + "'", str6, "1970");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1045();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager376();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager589();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString350();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager834();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10001" + "'", str5, "10001");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "6086" + "'", str8, "6086");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager522();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString437();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9890" + "'", str6, "9890");
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1045();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString609();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean1062();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString216();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10001" + "'", str5, "10001");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1470" + "'", str6, "1470");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2563" + "'", str8, "2563");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager934();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean933();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean709();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString785();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager300();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5200" + "'", str3, "5200");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "9343" + "'", str5, "9343");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString800();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean701();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString381();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean898();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean901();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean288();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "9562" + "'", str2, "9562");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "6654" + "'", str4, "6654");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString963();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString312();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString824();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean364();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "12162" + "'", str2, "12162");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5204" + "'", str3, "5204");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10423" + "'", str4, "10423");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager335();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean263();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager624();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString135();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2190" + "'", str8, "2190");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
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
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString699();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "5724" + "'", str11, "5724");
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager995();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager333();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString488();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager660();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean186();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10899" + "'", str7, "10899");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
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
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean732();
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
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean1048();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager564();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager272();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager730();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean823();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager962();
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
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean664();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString437();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean242();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean818();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean215();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean735();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager611();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9890" + "'", str3, "9890");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString861();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager638();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean830();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager960();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager51();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10711" + "'", str3, "10711");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
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
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean652();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString71();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString602();
        java.lang.Boolean boolean13 = serializedObjectSupporter0.deserializeObjectBoolean792();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "853" + "'", str11, "853");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1385" + "'", str12, "1385");
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + true + "'", boolean13, true);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean726();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString875();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager280();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean714();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10897" + "'", str4, "10897");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean263();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean838();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager879();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean469();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean312();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString960();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "12131" + "'", str7, "12131");
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean263();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager392();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager157();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString448();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString849();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString569();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10118" + "'", str5, "10118");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10628" + "'", str6, "10628");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "649" + "'", str7, "649");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString871();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString970();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean71();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10847" + "'", str6, "10847");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "12278" + "'", str7, "12278");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager136();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean708();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString12();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean1048();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", boolean6, false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "156" + "'", str7, "156");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager405();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean577();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString429();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean737();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString280();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString907();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean515();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9076" + "'", str3, "9076");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4331" + "'", str5, "4331");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "11349" + "'", str6, "11349");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager555();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1053();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager632();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "43" + "'", str3, "43");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean315();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean964();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean231();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager315();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager995();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString645();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2332" + "'", str6, "2332");
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean726();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString468();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean123();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean481();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean713();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString312();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10587" + "'", str4, "10587");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "5204" + "'", str8, "5204");
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager645();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString418();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1044();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean697();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString460();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "7644" + "'", str3, "7644");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10335" + "'", str6, "10335");
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString728();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString270();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString265();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6195" + "'", str3, "6195");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "3907" + "'", str4, "3907");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3778" + "'", str5, "3778");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
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
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString14();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager247();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "172" + "'", str10, "172");
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1045();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager376();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean736();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager647();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean522();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10001" + "'", str5, "10001");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
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
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString390();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager429();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9890" + "'", str3, "9890");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4948" + "'", str5, "4948");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1402" + "'", str7, "1402");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "6831" + "'", str10, "6831");
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager463();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean795();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString180();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString975();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean408();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean885();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2405" + "'", str4, "2405");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "12342" + "'", str5, "12342");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean664();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean531();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString121();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean786();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2030" + "'", str4, "2030");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1045();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager376();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean736();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean44();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean60();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString905();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10001" + "'", str5, "10001");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "11318" + "'", str10, "11318");
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager463();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean795();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString180();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean1032();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager317();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2405" + "'", str4, "2405");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean920();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean220();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager561();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager597();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString714();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString631();
        java.lang.Boolean boolean13 = serializedObjectSupporter0.deserializeObjectBoolean216();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "5904" + "'", str11, "5904");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2013" + "'", str12, "2013");
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + true + "'", boolean13, true);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString861();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString192();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean761();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10711" + "'", str3, "10711");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2453" + "'", str5, "2453");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager645();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString418();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1044();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString484();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "7644" + "'", str3, "7644");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10846" + "'", str5, "10846");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString800();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean554();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString36();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean529();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString670();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "9562" + "'", str2, "9562");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "413" + "'", str4, "413");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5124" + "'", str6, "5124");
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString861();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString192();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager459();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager701();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10711" + "'", str3, "10711");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2453" + "'", str5, "2453");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
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
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString766();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString91();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "584" + "'", str6, "584");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2916" + "'", str8, "2916");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10789" + "'", str9, "10789");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "8557" + "'", str10, "8557");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1248" + "'", str11, "1248");
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString800();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean554();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString36();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean697();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString559();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager161();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "9562" + "'", str2, "9562");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "413" + "'", str4, "413");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "439" + "'", str6, "439");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
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
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean595();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager13 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager214();
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
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager13);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString800();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean701();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean132();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "9562" + "'", str2, "9562");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean577();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString17();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager415();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager6();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "221" + "'", str3, "221");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager955();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10847" + "'", str6, "10847");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "789" + "'", str7, "789");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString871();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString66();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1043();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager934();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10847" + "'", str6, "10847");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "789" + "'", str7, "789");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString473();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager507();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager102();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean835();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString322();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager442();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString659();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10628" + "'", str2, "10628");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5450" + "'", str6, "5450");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2464" + "'", str8, "2464");
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
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
        java.lang.Boolean boolean14 = serializedObjectSupporter0.deserializeObjectBoolean513();
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
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager335();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString987();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString894();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager110();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "15313" + "'", str6, "15313");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "11101" + "'", str7, "11101");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager533();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString94();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString996();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean115();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1292" + "'", str7, "1292");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "15466" + "'", str8, "15466");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager934();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean933();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1049();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString576();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean598();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "791" + "'", str4, "791");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString963();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean982();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "12162" + "'", str2, "12162");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager136();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean708();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString133();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager770();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString759();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", boolean6, false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2184" + "'", str7, "2184");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "8061" + "'", str9, "8061");
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager335();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager902();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean707();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString913();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "11469" + "'", str8, "11469");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
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
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1056();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "68" + "'", str12, "68");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager995();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager333();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean276();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString445();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean905();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString846();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean50();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10065" + "'", str8, "10065");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10615" + "'", str10, "10615");
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString666();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager260();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean682();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5066" + "'", str3, "5066");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager335();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString987();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString894();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean286();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager837();
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity10 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager9.insertDeployment(deploymentEntity10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "15313" + "'", str6, "15313");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "11101" + "'", str7, "11101");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
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
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean561();
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
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean664();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString437();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean242();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean818();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString446();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean805();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9890" + "'", str3, "9890");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10078" + "'", str6, "10078");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager645();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString418();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean631();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean382();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "7644" + "'", str3, "7644");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager463();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1014();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager670();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
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
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean276();
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
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager335();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager331();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString786();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString943();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "9346" + "'", str7, "9346");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "11927" + "'", str8, "11927");
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean577();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString429();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString683();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString955();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString285();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager9();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9076" + "'", str3, "9076");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5369" + "'", str4, "5369");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "12071" + "'", str5, "12071");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4514" + "'", str6, "4514");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString569();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager877();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1002();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString137();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager153();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "649" + "'", str4, "649");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "25304" + "'", str6, "25304");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2196" + "'", str7, "2196");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString569();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString317();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean354();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean800();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean750();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "649" + "'", str4, "649");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5301" + "'", str5, "5301");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1045();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager376();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean736();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean44();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean1016();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean271();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10001" + "'", str5, "10001");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager125();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString581();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager279();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString644();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager450();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "878" + "'", str6, "878");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2322" + "'", str8, "2322");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager698();
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
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString565();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString761();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager69();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "574" + "'", str5, "574");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "8141" + "'", str6, "8141");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
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
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean652();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString71();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString602();
        java.lang.Boolean boolean13 = serializedObjectSupporter0.deserializeObjectBoolean906();
        java.lang.Boolean boolean14 = serializedObjectSupporter0.deserializeObjectBoolean80();
        java.lang.String str15 = serializedObjectSupporter0.deserializeObjectString557();
        java.lang.Boolean boolean16 = serializedObjectSupporter0.deserializeObjectBoolean25();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "853" + "'", str11, "853");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1385" + "'", str12, "1385");
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + true + "'", boolean13, true);
        org.junit.Assert.assertEquals("'" + boolean14 + "' != '" + true + "'", boolean14, true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "418" + "'", str15, "418");
        org.junit.Assert.assertEquals("'" + boolean16 + "' != '" + true + "'", boolean16, true);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString764();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager399();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean132();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "8439" + "'", str5, "8439");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + false + "'", boolean7, false);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager375();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean621();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString317();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean465();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager707();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5301" + "'", str7, "5301");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean726();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager807();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager471();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString409();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString938();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString251();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString961();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "7386" + "'", str6, "7386");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "11868" + "'", str7, "11868");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "3260" + "'", str8, "3260");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "12143" + "'", str9, "12143");
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean579();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager375();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean621();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString317();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString240();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5301" + "'", str7, "5301");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2867" + "'", str8, "2867");
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean1048();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean495();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean713();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString569();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager877();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1002();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager390();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager478();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString475();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "649" + "'", str4, "649");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "25304" + "'", str6, "25304");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10717" + "'", str9, "10717");
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString728();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString231();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager853();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString722();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6195" + "'", str3, "6195");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2809" + "'", str4, "2809");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5978" + "'", str6, "5978");
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1045();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager376();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean736();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean44();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager779();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager540();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager676();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10001" + "'", str5, "10001");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString304();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager872();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString299();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean949();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1026();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5018" + "'", str4, "5018");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4938" + "'", str6, "4938");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "80304" + "'", str8, "80304");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager533();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean862();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean214();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean146();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager995();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString566();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean252();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString675();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean971();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "584" + "'", str6, "584");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "5190" + "'", str8, "5190");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString369();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager146();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean387();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "6498" + "'", str5, "6498");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString666();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager260();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager379();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5066" + "'", str3, "5066");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager645();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean198();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager871();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString395();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean191();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager121();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean1062();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "6905" + "'", str5, "6905");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean398();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString614();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1628" + "'", str4, "1628");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString473();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager507();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean586();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean865();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean32();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString30();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10628" + "'", str2, "10628");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "340" + "'", str7, "340");
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString963();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean633();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString235();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString726();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "12162" + "'", str2, "12162");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2851" + "'", str4, "2851");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "6115" + "'", str5, "6115");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager934();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean933();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean618();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString504();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11332" + "'", str4, "11332");
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager375();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean621();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager197();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean517();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString769();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2265" + "'", str8, "2265");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + false + "'", boolean9, false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "8714" + "'", str10, "8714");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager943();
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
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
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
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString187();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2432" + "'", str14, "2432");
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean577();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString429();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString617();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean633();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9076" + "'", str3, "9076");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1693" + "'", str4, "1693");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager533();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString94();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1040();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean303();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean826();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean106();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1292" + "'", str7, "1292");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "53" + "'", str8, "53");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1045();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager376();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager589();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString350();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager594();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10001" + "'", str5, "10001");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "6086" + "'", str8, "6086");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager125();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString581();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager279();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString644();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean635();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1048();
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
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString473();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString382();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean537();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean844();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString415();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10628" + "'", str2, "10628");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6661" + "'", str3, "6661");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + false + "'", boolean5, false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "7451" + "'", str6, "7451");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString728();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString231();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager853();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean672();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6195" + "'", str3, "6195");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2809" + "'", str4, "2809");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean263();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1006();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean717();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1028();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "25316" + "'", str3, "25316");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "85304" + "'", str5, "85304");
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString37();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager808();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager178();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean496();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean554();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager674();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager11();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "420" + "'", str1, "420");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "80" + "'", str2, "80");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString473();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString122();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10628" + "'", str2, "10628");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2027" + "'", str3, "2027");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString473();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager507();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString375();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean581();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean852();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString359();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10628" + "'", str2, "10628");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "6596" + "'", str4, "6596");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "6312" + "'", str7, "6312");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString861();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString192();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager459();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager954();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10711" + "'", str3, "10711");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2453" + "'", str5, "2453");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString861();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean1060();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager965();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager659();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString158();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean154();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10711" + "'", str3, "10711");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2259" + "'", str7, "2259");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString800();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean554();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString36();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager640();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean481();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "9562" + "'", str2, "9562");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "413" + "'", str4, "413");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean664();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean531();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager483();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager31();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString764();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean93();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "8439" + "'", str6, "8439");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager335();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager902();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean857();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager339();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
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
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString273();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean471();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "878" + "'", str6, "878");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2322" + "'", str8, "2322");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4020" + "'", str10, "4020");
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString666();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1055();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager895();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString211();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean693();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1022();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5066" + "'", str3, "5066");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "57" + "'", str4, "57");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2526" + "'", str6, "2526");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean445();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager207();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString930();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager426();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString611();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString507();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean416();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager389();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "11700" + "'", str5, "11700");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1545" + "'", str7, "1545");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "11360" + "'", str8, "11360");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString569();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager877();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1002();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString137();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean820();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString50();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "649" + "'", str4, "649");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "25304" + "'", str6, "25304");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2196" + "'", str7, "2196");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "613" + "'", str9, "613");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean726();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager807();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString471();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString536();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean808();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10606" + "'", str5, "10606");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "12252" + "'", str6, "12252");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean930();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager136();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean708();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString12();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean98();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", boolean6, false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "156" + "'", str7, "156");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager973();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString573();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "722" + "'", str3, "722");
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString565();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString140();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager577();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager516();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "574" + "'", str5, "574");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2205" + "'", str6, "2205");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString666();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager260();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager185();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean1031();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5066" + "'", str3, "5066");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
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
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean933();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean150();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString973();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "584" + "'", str6, "584");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1279" + "'", str8, "1279");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "19" + "'", str10, "19");
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "12312" + "'", str13, "12312");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean726();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString875();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean149();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10897" + "'", str4, "10897");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString473();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager507();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager102();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean968();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean116();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean308();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10628" + "'", str2, "10628");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString279();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean298();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString241();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager181();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager590();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString634();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean511();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4286" + "'", str3, "4286");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2871" + "'", str5, "2871");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2064" + "'", str8, "2064");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager463();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean824();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
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
        java.lang.Boolean boolean13 = serializedObjectSupporter0.deserializeObjectBoolean147();
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
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + true + "'", boolean13, true);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString861();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean1060();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager965();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager102();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager344();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10711" + "'", str3, "10711");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString963();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString312();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString824();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString586();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString345();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "12162" + "'", str2, "12162");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5204" + "'", str3, "5204");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10423" + "'", str4, "10423");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "955" + "'", str5, "955");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5965" + "'", str6, "5965");
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString861();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString611();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString469();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10711" + "'", str3, "10711");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1545" + "'", str4, "1545");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10590" + "'", str5, "10590");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString147();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager596();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager446();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager36();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean1004();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2226" + "'", str3, "2226");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager973();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean134();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean516();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager211();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString302();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString415();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4968" + "'", str6, "4968");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "7451" + "'", str7, "7451");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean664();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean531();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager483();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager31();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString764();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean1044();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "8439" + "'", str6, "8439");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + false + "'", boolean7, false);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString569();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager877();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager207();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager825();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager33();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "649" + "'", str4, "649");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean726();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString468();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean123();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean481();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString867();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10587" + "'", str4, "10587");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10755" + "'", str7, "10755");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
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
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean837();
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
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
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
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean1022();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager174();
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
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString473();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager507();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager102();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean968();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1023();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10628" + "'", str2, "10628");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "72804" + "'", str6, "72804");
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1045();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager376();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager973();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString538();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString259();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10001" + "'", str5, "10001");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "12399" + "'", str8, "12399");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3568" + "'", str9, "3568");
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager375();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean621();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString317();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean465();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager957();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5301" + "'", str7, "5301");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
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
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString41();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "456" + "'", str14, "456");
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean1048();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString431();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean208();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager872();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString564();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString974();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString573();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9440" + "'", str3, "9440");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "543" + "'", str6, "543");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "12321" + "'", str7, "12321");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "722" + "'", str8, "722");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString871();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString66();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean447();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString267();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10847" + "'", str6, "10847");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "789" + "'", str7, "789");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3846" + "'", str9, "3846");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString963();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean633();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean857();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "12162" + "'", str2, "12162");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString569();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString317();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean48();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "649" + "'", str4, "649");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5301" + "'", str5, "5301");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager533();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean862();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean214();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager449();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager125();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1021();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString37();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager571();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager802();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager955();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean831();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean151();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "420" + "'", str1, "420");
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString728();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString231();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager853();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean498();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString281();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean79();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6195" + "'", str3, "6195");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2809" + "'", str4, "2809");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4376" + "'", str7, "4376");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString666();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1055();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager895();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString211();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean693();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager156();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString533();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5066" + "'", str3, "5066");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "57" + "'", str4, "57");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2526" + "'", str6, "2526");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "12195" + "'", str9, "12195");
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString800();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean701();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString381();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean898();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString486();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean395();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean697();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "9562" + "'", str2, "9562");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "6654" + "'", str4, "6654");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10871" + "'", str6, "10871");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean726();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager807();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager471();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString409();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString938();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString251();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString749();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "7386" + "'", str6, "7386");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "11868" + "'", str7, "11868");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "3260" + "'", str8, "3260");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "7557" + "'", str9, "7557");
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString800();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean701();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString381();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager673();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean599();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "9562" + "'", str2, "9562");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "6654" + "'", str4, "6654");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager739();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString913();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager651();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "11469" + "'", str5, "11469");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1045();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager376();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString924();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager815();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager282();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager691();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1023();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10001" + "'", str5, "10001");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "11592" + "'", str7, "11592");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "72804" + "'", str11, "72804");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager463();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString221();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager221();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2627" + "'", str3, "2627");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean539();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean406();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString569();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager188();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString305();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString606();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString173();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager355();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString92();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "649" + "'", str4, "649");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5021" + "'", str6, "5021");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1434" + "'", str7, "1434");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2376" + "'", str8, "2376");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1263" + "'", str10, "1263");
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString800();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean554();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean204();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager497();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString924();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager767();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "9562" + "'", str2, "9562");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "11592" + "'", str6, "11592");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager14 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager47();
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
        org.junit.Assert.assertNotNull(deploymentEntityManager14);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager188();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString455();
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
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10222" + "'", str12, "10222");
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean726();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager807();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager471();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString409();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString717();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "7386" + "'", str6, "7386");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5933" + "'", str7, "5933");
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean1048();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager564();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean788();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager66();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager159();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean920();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean220();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager561();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager597();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString714();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString631();
        java.lang.Boolean boolean13 = serializedObjectSupporter0.deserializeObjectBoolean525();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString659();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "5904" + "'", str11, "5904");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2013" + "'", str12, "2013");
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + true + "'", boolean13, true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2464" + "'", str14, "2464");
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString569();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean199();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean105();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString997();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString900();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "649" + "'", str4, "649");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "22804" + "'", str7, "22804");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "11233" + "'", str8, "11233");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString666();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager502();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager862();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager893();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5066" + "'", str3, "5066");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString37();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager867();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager225();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager552();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean816();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "420" + "'", str1, "420");
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString37();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager808();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager178();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean496();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString314();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "420" + "'", str1, "420");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "80" + "'", str2, "80");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5236" + "'", str6, "5236");
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString169();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager928();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean59();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean708();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean831();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager812();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager59();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2360" + "'", str2, "2360");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + false + "'", boolean5, false);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager555();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString586();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "955" + "'", str3, "955");
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString963();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString301();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager702();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "12162" + "'", str2, "12162");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4958" + "'", str3, "4958");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString764();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager399();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager165();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "8439" + "'", str5, "8439");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean664();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString437();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean242();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString482();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean50();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString471();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9890" + "'", str3, "9890");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10789" + "'", str5, "10789");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10606" + "'", str7, "10606");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager335();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString513();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager558();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "11513" + "'", str6, "11513");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString800();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString48();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager305();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "9562" + "'", str2, "9562");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "578" + "'", str3, "578");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString666();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1055();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager193();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean516();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString671();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5066" + "'", str3, "5066");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "57" + "'", str4, "57");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5132" + "'", str7, "5132");
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean431();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager398();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager462();
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
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager125();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString581();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString774();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "878" + "'", str6, "878");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "8914" + "'", str7, "8914");
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager645();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean198();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean337();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean1012();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager824();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1366" + "'", str6, "1366");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager136();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean708();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString133();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager770();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager606();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", boolean6, false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2184" + "'", str7, "2184");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString674();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager419();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString262();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager533();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean229();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean991();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5173" + "'", str4, "5173");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "3629" + "'", str6, "3629");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + false + "'", boolean9, false);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager645();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean774();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString989();
        java.lang.Boolean boolean13 = serializedObjectSupporter0.deserializeObjectBoolean481();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "15319" + "'", str12, "15319");
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + true + "'", boolean13, true);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString169();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString213();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean283();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2360" + "'", str2, "2360");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2547" + "'", str3, "2547");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString800();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean701();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString381();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean898();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString501();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean659();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager699();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean595();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "9562" + "'", str2, "9562");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "6654" + "'", str4, "6654");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "11212" + "'", str6, "11212");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean90();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString798();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager785();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9512" + "'", str3, "9512");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean794();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager586();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager343();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString854();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10656" + "'", str11, "10656");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager533();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString94();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString789();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean803();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean1052();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean914();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1292" + "'", str7, "1292");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "9364" + "'", str8, "9364");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager299();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10001" + "'", str5, "10001");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "7366" + "'", str9, "7366");
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString728();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager304();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager488();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6195" + "'", str3, "6195");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString569();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager877();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager207();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString813();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager568();
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
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean1048();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager564();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager272();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString10();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "128" + "'", str5, "128");
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean115();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager166();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean350();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager897();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean922();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager955();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString11();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "136" + "'", str10, "136");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager335();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean263();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean870();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1024();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString992();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "75304" + "'", str8, "75304");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "15345" + "'", str9, "15345");
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString473();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager507();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString375();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean581();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean852();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString499();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10628" + "'", str2, "10628");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "6596" + "'", str4, "6596");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "11191" + "'", str7, "11191");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1045();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager376();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean172();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager683();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager962();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean789();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10001" + "'", str5, "10001");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString963();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString301();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString288();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "12162" + "'", str2, "12162");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4958" + "'", str3, "4958");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4639" + "'", str4, "4639");
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager265();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager432();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean933();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString169();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean652();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString4();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2360" + "'", str2, "2360");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "52" + "'", str4, "52");
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean726();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager807();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString732();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "6483" + "'", str5, "6483");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager335();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean449();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
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
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString107();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10899" + "'", str7, "10899");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1736" + "'", str10, "1736");
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean794();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString504();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "11332" + "'", str5, "11332");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
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
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString48();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10001" + "'", str5, "10001");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1470" + "'", str6, "1470");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10899" + "'", str9, "10899");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "578" + "'", str10, "578");
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager463();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString983();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager559();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString393();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "12498" + "'", str3, "12498");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "6870" + "'", str5, "6870");
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager934();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean933();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean618();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean651();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager178();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString748();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager743();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8473" + "'", str2, "8473");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "7506" + "'", str5, "7506");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString728();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString270();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString409();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean330();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager636();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString872();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager194();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6195" + "'", str3, "6195");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "3907" + "'", str4, "3907");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "7386" + "'", str5, "7386");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10862" + "'", str8, "10862");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString871();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString66();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString628();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager887();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10847" + "'", str6, "10847");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "789" + "'", str7, "789");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970" + "'", str8, "1970");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean458();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager711();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean510();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString226();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2772" + "'", str6, "2772");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString861();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean1060();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager965();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager659();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean809();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString737();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10711" + "'", str3, "10711");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "6856" + "'", str8, "6856");
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
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
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString102();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean162();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "15313" + "'", str6, "15313");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "11101" + "'", str7, "11101");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1553" + "'", str10, "1553");
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
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
        java.lang.Boolean boolean15 = serializedObjectSupporter0.deserializeObjectBoolean644();
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
        org.junit.Assert.assertEquals("'" + boolean15 + "' != '" + true + "'", boolean15, true);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString569();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager877();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager207();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager825();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString209();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "649" + "'", str4, "649");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2518" + "'", str8, "2518");
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager335();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean263();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean1030();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1011();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager631();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "42804" + "'", str8, "42804");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager13 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager325();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString674();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "5173" + "'", str14, "5173");
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1045();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager376();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager992();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString897();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager719();
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
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager335();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean263();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean27();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager12();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean557();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844" + "'", str3, "2844");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7263" + "'", str4, "7263");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager973();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean134();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean516();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager211();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString139();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString751();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2202" + "'", str6, "2202");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "7624" + "'", str7, "7624");
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString473();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager507();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager102();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager833();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager456();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString540();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean60();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10628" + "'", str2, "10628");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "12473" + "'", str7, "12473");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString800();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean554();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString36();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean697();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean424();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager767();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "9562" + "'", str2, "9562");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "413" + "'", str4, "413");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean733();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString41();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager555();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "456" + "'", str4, "456");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean115();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager166();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean350();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager897();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString980();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "12422" + "'", str8, "12422");
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager533();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString94();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString789();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean803();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1036();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean736();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1292" + "'", str7, "1292");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "9364" + "'", str8, "9364");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager934();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean933();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean709();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString411();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager412();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5200" + "'", str3, "5200");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "7406" + "'", str5, "7406");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString234();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString744();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean315();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean531();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString857();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager53();
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
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
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
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean158();
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
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager136();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1032();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean204();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager963();
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
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString569();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean199();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean414();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString202();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1018();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager744();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean699();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "649" + "'", str4, "649");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2493" + "'", str7, "2493");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "60304" + "'", str8, "60304");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager125();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString581();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager279();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString644();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString62();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean229();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "878" + "'", str6, "878");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2322" + "'", str8, "2322");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "765" + "'", str9, "765");
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager85();
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
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString37();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean631();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean411();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "420" + "'", str1, "420");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "80" + "'", str2, "80");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean726();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager807();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString732();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean683();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString681();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString977();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager40();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "6483" + "'", str5, "6483");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5328" + "'", str7, "5328");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "12374" + "'", str8, "12374");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean577();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString429();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean737();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString280();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString907();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString623();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean174();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9076" + "'", str3, "9076");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4331" + "'", str5, "4331");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "11349" + "'", str6, "11349");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1900" + "'", str7, "1900");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString800();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean554();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString36();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager640();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString581();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "9562" + "'", str2, "9562");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "413" + "'", str4, "413");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "878" + "'", str6, "878");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean664();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString437();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1030();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager196();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9890" + "'", str3, "9890");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString718();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString147();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager349();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940" + "'", str2, "5940");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2226" + "'", str3, "2226");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean726();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager807();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString732();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean683();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString681();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString977();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean245();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "6483" + "'", str5, "6483");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5328" + "'", str7, "5328");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "12374" + "'", str8, "12374");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString676();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean577();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString17();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager415();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1011();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean334();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5200" + "'", str1, "5200");
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "221" + "'", str3, "221");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean920();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean220();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1004();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager561();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager597();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString714();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString631();
        java.lang.Boolean boolean13 = serializedObjectSupporter0.deserializeObjectBoolean525();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager14 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager507();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "5904" + "'", str11, "5904");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2013" + "'", str12, "2013");
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + true + "'", boolean13, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager14);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean900();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString318();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1045();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager376();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean172();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager683();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager962();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean47();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5346" + "'", str3, "5346");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10001" + "'", str5, "10001");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean539();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString395();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean467();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6905" + "'", str2, "6905");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }
}

