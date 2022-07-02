import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
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
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean311();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager253();
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
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
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
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean236();
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
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean195();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager70();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean330();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString98();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1380" + "'", str8, "1380");
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean272();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString66();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString98();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager22();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager219();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager160();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean117();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "789" + "'", str3, "789");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1380" + "'", str4, "1380");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager61();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString58();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "704" + "'", str6, "704");
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean272();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString66();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean71();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager188();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString82();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString283();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean340();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "789" + "'", str3, "789");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1083" + "'", str6, "1083");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4466" + "'", str7, "4466");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean272();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager188();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString97();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager68();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager135();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString66();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager101();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean340();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1358" + "'", str4, "1358");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "789" + "'", str7, "789");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString200();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString68();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString177();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean154();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean309();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2485" + "'", str4, "2485");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "812" + "'", str5, "812");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2392" + "'", str6, "2392");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1648" + "'", str8, "1648");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
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
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString117();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString86();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString134();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2617" + "'", str4, "2617");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4853" + "'", str6, "4853");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "5455" + "'", str8, "5455");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1949" + "'", str10, "1949");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1150" + "'", str11, "1150");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2187" + "'", str12, "2187");
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager61();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager276();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString302();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean324();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString258();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager345();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean112();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4968" + "'", str6, "4968");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "3511" + "'", str8, "3511");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean65();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean194();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean258();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager328();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean166();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager289();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager151();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + false + "'", boolean7, false);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean65();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean194();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean258();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString138();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager17();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString290();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager203();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2199" + "'", str6, "2199");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4712" + "'", str8, "4712");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean301();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString265();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager39();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager210();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager226();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString76();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "3778" + "'", str4, "3778");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "951" + "'", str8, "951");
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean173();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager249();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean266();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager61();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean176();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager238();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
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
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString251();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString56();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1974" + "'", str5, "1974");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2262" + "'", str6, "2262");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "5455" + "'", str8, "5455");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "287" + "'", str9, "287");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "3260" + "'", str10, "3260");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "683" + "'", str11, "683");
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean264();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean223();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager289();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean145();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean134();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString93();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager185();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager115();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString251();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + false + "'", boolean7, false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1270" + "'", str8, "1270");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3260" + "'", str11, "3260");
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean65();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString238();
        java.lang.Class class5 = serializedObjectSupporter0.deserializeObjectClass1();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2860" + "'", str4, "2860");
        org.junit.Assert.assertNotNull(class5);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager299();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager331();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean310();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager226();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager53();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager272();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager165();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString196();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2469" + "'", str9, "2469");
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString60();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager206();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager82();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager99();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString290();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager253();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean104();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString10();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "726" + "'", str3, "726");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4712" + "'", str7, "4712");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "128" + "'", str10, "128");
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager132();
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
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager142();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString88();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager285();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1203" + "'", str11, "1203");
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean195();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString144();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean67();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString240();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2217" + "'", str6, "2217");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2867" + "'", str8, "2867");
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString219();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager133();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString295();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString164();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean321();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean7();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean246();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean18();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean131();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2617" + "'", str4, "2617");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4853" + "'", str6, "4853");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2345" + "'", str7, "2345");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager299();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager331();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean310();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager226();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager344();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean171();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString174();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean152();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString233();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager172();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager255();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2381" + "'", str2, "2381");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2837" + "'", str4, "2837");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
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
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString148();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2229" + "'", str11, "2229");
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager94();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager32();
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
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean171();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString174();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean152();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString233();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString206();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager34();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager48();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean291();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2381" + "'", str2, "2381");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2837" + "'", str4, "2837");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2509" + "'", str5, "2509");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean171();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean330();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean85();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean104();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager61();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean166();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager276();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + false + "'", boolean5, false);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean272();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString66();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString98();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean86();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager199();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean119();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString340();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "789" + "'", str3, "789");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1380" + "'", str4, "1380");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "5842" + "'", str8, "5842");
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString60();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager206();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString102();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager224();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager293();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager10();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString80();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "726" + "'", str3, "726");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1553" + "'", str5, "1553");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1047" + "'", str9, "1047");
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean35();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString79();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString75();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString126();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean280();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1040" + "'", str3, "1040");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "888" + "'", str4, "888");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2117" + "'", str5, "2117");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean208();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean187();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager180();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString112();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean335();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1824" + "'", str7, "1824");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean4();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString163();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager195();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString114();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager200();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString339();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean313();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2330" + "'", str5, "2330");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1880" + "'", str7, "1880");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "5797" + "'", str10, "5797");
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean272();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString66();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean71();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager188();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager311();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean86();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "789" + "'", str3, "789");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString326();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean348();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager128();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean322();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5538" + "'", str4, "5538");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString333();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString165();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean234();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager278();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5683" + "'", str4, "5683");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2337" + "'", str5, "2337");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString219();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager133();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean243();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean217();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString305();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2617" + "'", str4, "2617");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "5021" + "'", str8, "5021");
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
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
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean156();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString97();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1358" + "'", str12, "1358");
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager302();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString189();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean188();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString114();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString183();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2440" + "'", str5, "2440");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1880" + "'", str7, "1880");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2416" + "'", str8, "2416");
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
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
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString260();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5538" + "'", str4, "5538");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "5993" + "'", str8, "5993");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "242" + "'", str9, "242");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "3571" + "'", str10, "3571");
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean171();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString250();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean105();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean12();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString145();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3195" + "'", str2, "3195");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2220" + "'", str5, "2220");
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString219();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager133();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString295();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean159();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager103();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean206();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager286();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString8();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2617" + "'", str4, "2617");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4853" + "'", str6, "4853");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "93" + "'", str11, "93");
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean171();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString250();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean134();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager204();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString350();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString198();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean246();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager48();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3195" + "'", str2, "3195");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "6086" + "'", str5, "6086");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2477" + "'", str6, "2477");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
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
        java.lang.Boolean boolean14 = serializedObjectSupporter0.deserializeObjectBoolean250();
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
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
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
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean295();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean265();
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
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean272();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString66();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString98();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean86();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString138();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager265();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "789" + "'", str3, "789");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1380" + "'", str4, "1380");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2199" + "'", str6, "2199");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean264();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean223();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString159();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean206();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager6();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean188();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString75();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager135();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager155();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2262" + "'", str5, "2262");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "888" + "'", str9, "888");
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString219();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager133();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString295();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean162();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean96();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2617" + "'", str4, "2617");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4853" + "'", str6, "4853");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString219();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString27();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString159();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean236();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString125();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager57();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2617" + "'", str4, "2617");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "304" + "'", str5, "304");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2262" + "'", str6, "2262");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2105" + "'", str8, "2105");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString200();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString68();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString177();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean66();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager291();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString12();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean22();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager216();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2265" + "'", str2, "2265");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1902" + "'", str3, "1902");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2485" + "'", str4, "2485");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "812" + "'", str5, "812");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2392" + "'", str6, "2392");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "156" + "'", str9, "156");
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean171();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean330();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean85();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager310();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager197();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString242();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString103();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString219();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager301();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean226();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString150();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager93();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean99();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2916" + "'", str2, "2916");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648" + "'", str3, "1648");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2617" + "'", str4, "2617");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2235" + "'", str7, "2235");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }
}

