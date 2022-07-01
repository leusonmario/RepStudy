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
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString717();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString617();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager887();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager969();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString776();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean808();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean737();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean307();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager357();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5933" + "'", str3, "5933");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1693" + "'", str4, "1693");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "9025" + "'", str7, "9025");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean662();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager239();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString223();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager86();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager803();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2638" + "'", str6, "2638");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean876();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager755();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean1009();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager81();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString4();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "52" + "'", str6, "52");
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean634();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString263();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean498();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "3688" + "'", str8, "3688");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager255();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString114();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString185();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString928();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString462();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean449();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1880" + "'", str7, "1880");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2424" + "'", str8, "2424");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "11667" + "'", str9, "11667");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10396" + "'", str10, "10396");
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean951();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean782();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString764();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString965();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean262();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString658();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager105();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1032();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "8439" + "'", str4, "8439");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "12200" + "'", str5, "12200");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2453" + "'", str7, "2453");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "95304" + "'", str9, "95304");
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString717();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean561();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean112();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1056();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString340();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager996();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5933" + "'", str3, "5933");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5842" + "'", str7, "5842");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1047();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean227();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString107();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1736" + "'", str4, "1736");
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager292();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString228();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString504();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2778" + "'", str8, "2778");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "11332" + "'", str9, "11332");
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager301();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean206();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString48();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "578" + "'", str7, "578");
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager221();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean556();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager913();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean527();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean866();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString393();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "6870" + "'", str7, "6870");
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString151();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager916();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager263();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager733();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean187();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString40();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean646();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString635();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager178();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6544" + "'", str2, "6544");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2238" + "'", str3, "2238");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "449" + "'", str8, "449");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2083" + "'", str10, "2083");
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1060();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString28();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString265();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean908();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager512();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString110();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager226();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager743();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "312" + "'", str5, "312");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "3778" + "'", str6, "3778");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1802" + "'", str9, "1802");
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean634();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean864();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager653();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean158();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString717();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "5933" + "'", str11, "5933");
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean634();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean864();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager595();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean170();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager9();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean320();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager752();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString388();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1054();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6729" + "'", str3, "6729");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "50" + "'", str4, "50");
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean952();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean850();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString782();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager574();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager993();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean409();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager371();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString258();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean238();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager13 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager194();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + false + "'", boolean5, false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9333" + "'", str6, "9333");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3511" + "'", str11, "3511");
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager13);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString201();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString203();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString417();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager915();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager426();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString574();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2488" + "'", str5, "2488");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2496" + "'", str6, "2496");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "7595" + "'", str7, "7595");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "735" + "'", str12, "735");
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean634();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean864();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString514();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString653();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager907();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString883();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager13 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager887();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "11551" + "'", str9, "11551");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2398" + "'", str10, "2398");
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10981" + "'", str12, "10981");
        org.junit.Assert.assertNotNull(deploymentEntityManager13);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean634();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString263();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString79();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean998();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString226();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "3688" + "'", str8, "3688");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1040" + "'", str9, "1040");
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2772" + "'", str11, "2772");
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean320();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean341();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean39();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString452();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager175();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager72();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10140" + "'", str4, "10140");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean634();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean864();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager595();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean650();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager668();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean753();
        java.lang.Boolean boolean13 = serializedObjectSupporter0.deserializeObjectBoolean414();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager14 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager649();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + true + "'", boolean13, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager14);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean662();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager319();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString900();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager553();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager881();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager590();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager484();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean893();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean997();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager871();
        java.lang.Boolean boolean13 = serializedObjectSupporter0.deserializeObjectBoolean780();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "11233" + "'", str5, "11233");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + true + "'", boolean13, true);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean662();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager239();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString712();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean789();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean229();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString737();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5894" + "'", str6, "5894");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "6856" + "'", str9, "6856");
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString457();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager736();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean681();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean661();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager399();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6544" + "'", str2, "6544");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10225" + "'", str3, "10225");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean836();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString31();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager416();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager530();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager196();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6544" + "'", str2, "6544");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "357" + "'", str4, "357");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager821();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean838();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager873();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean774();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean644();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString161();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean995();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1005();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager373();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString995();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString209();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2281" + "'", str2, "2281");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "25313" + "'", str4, "25313");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "15436" + "'", str6, "15436");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2518" + "'", str7, "2518");
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean876();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager201();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager477();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString978();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager563();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "12388" + "'", str4, "12388");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager821();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean838();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager873();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean456();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean541();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager849();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager171();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager631();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1043();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager65();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString65();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString195();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager932();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString674();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "781" + "'", str7, "781");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2464" + "'", str8, "2464");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "5173" + "'", str10, "5173");
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean662();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager319();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString900();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString825();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager719();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "11233" + "'", str5, "11233");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10437" + "'", str6, "10437");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1043();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager65();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager402();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager979();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager914();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager332();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager178();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean843();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString910();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString244();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager299();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean112();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager190();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1045();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean557();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11414" + "'", str3, "11414");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "3006" + "'", str4, "3006");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean863();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString698();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean804();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString443();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5704" + "'", str3, "5704");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10040" + "'", str5, "10040");
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean753();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString551();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString751();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "286" + "'", str8, "286");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "7624" + "'", str9, "7624");
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString910();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString244();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString653();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString450();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString428();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean60();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11414" + "'", str3, "11414");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "3006" + "'", str4, "3006");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2398" + "'", str5, "2398");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10134" + "'", str6, "10134");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "9022" + "'", str7, "9022");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean952();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean850();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString782();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager959();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString416();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean132();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1054();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + false + "'", boolean5, false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9333" + "'", str6, "9333");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "7502" + "'", str8, "7502");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + false + "'", boolean9, false);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString457();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString801();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean1012();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean379();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean25();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager746();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager767();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6544" + "'", str2, "6544");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10225" + "'", str3, "10225");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "9572" + "'", str4, "9572");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager821();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString679();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager890();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager640();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager151();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager968();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager389();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5244" + "'", str5, "5244");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager821();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean838();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager873();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean456();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString172();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean859();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2373" + "'", str8, "2373");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString572();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean632();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString58();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager977();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1060();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString10();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "702" + "'", str2, "702");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "704" + "'", str4, "704");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "101" + "'", str6, "101");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "128" + "'", str7, "128");
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString217();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString691();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2611" + "'", str4, "2611");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5537" + "'", str5, "5537");
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean662();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager239();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString712();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean661();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager81();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager694();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager739();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager31();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean318();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5894" + "'", str6, "5894");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1043();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager65();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString65();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString195();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager932();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager83();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "781" + "'", str7, "781");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2464" + "'", str8, "2464");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean662();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager239();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString712();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean789();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager629();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString586();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5894" + "'", str6, "5894");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "955" + "'", str9, "955");
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager86();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean853();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager555();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean634();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString263();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString79();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager644();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "3688" + "'", str8, "3688");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1040" + "'", str9, "1040");
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString910();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString434();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString8();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager953();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager675();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager299();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11414" + "'", str3, "11414");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "9762" + "'", str4, "9762");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "93" + "'", str5, "93");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager821();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean838();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager873();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean456();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean541();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager849();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean290();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString980();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "12422" + "'", str11, "12422");
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean634();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString15();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString396();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString634();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "185" + "'", str8, "185");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "6946" + "'", str9, "6946");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2064" + "'", str10, "2064");
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString717();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean232();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager281();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean1000();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean992();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1053();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean377();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager412();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5933" + "'", str3, "5933");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean634();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean864();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean782();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString172();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2373" + "'", str10, "2373");
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString745();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager122();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean935();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString621();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "7366" + "'", str7, "7366");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1825" + "'", str10, "1825");
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean357();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean1013();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString992();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString808();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "15345" + "'", str9, "15345");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "9702" + "'", str10, "9702");
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager821();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean838();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager873();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean790();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager728();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString250();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager528();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager597();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean220();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager13 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager875();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager14 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1037();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3195" + "'", str9, "3195");
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager13);
        org.junit.Assert.assertNotNull(deploymentEntityManager14);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString733();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager570();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString263();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean1057();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager504();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean128();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager561();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean1035();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean278();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager963();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6544" + "'", str2, "6544");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "3688" + "'", str4, "3688");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString733();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager570();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString263();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager182();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean286();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean459();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6544" + "'", str2, "6544");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "3688" + "'", str4, "3688");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager220();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString480();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean43();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean84();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean894();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean699();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10768" + "'", str5, "10768");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean634();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean864();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager202();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean683();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString816();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean264();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager13 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1040();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10162" + "'", str11, "10162");
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager13);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString572();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean594();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString462();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean229();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "702" + "'", str2, "702");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10396" + "'", str4, "10396");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString572();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean594();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString698();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString25();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager196();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString348();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "702" + "'", str2, "702");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5704" + "'", str4, "5704");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "295" + "'", str5, "295");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "6036" + "'", str7, "6036");
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean528();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean630();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean411();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString457();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString801();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean659();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString166();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6544" + "'", str2, "6544");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10225" + "'", str3, "10225");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "9572" + "'", str4, "9572");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "61" + "'", str6, "61");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2342" + "'", str7, "2342");
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString298();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager640();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString742();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean394();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager229();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager40();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4928" + "'", str4, "4928");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "7115" + "'", str6, "7115");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString745();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean381();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString78();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString19();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean206();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean174();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "7366" + "'", str7, "7366");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1010" + "'", str9, "1010");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "242" + "'", str10, "242");
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean634();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean864();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager595();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean715();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager699();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager540();
        java.lang.Boolean boolean13 = serializedObjectSupporter0.deserializeObjectBoolean430();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + true + "'", boolean13, true);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString151();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString168();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString538();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean717();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager410();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString581();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6544" + "'", str2, "6544");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2238" + "'", str3, "2238");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2357" + "'", str4, "2357");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "12399" + "'", str5, "12399");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "878" + "'", str8, "878");
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager221();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean556();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager913();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager365();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager196();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString717();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString881();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean23();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager309();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5933" + "'", str3, "5933");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10957" + "'", str4, "10957");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean961();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString533();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString863();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager352();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "12195" + "'", str3, "12195");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10720" + "'", str4, "10720");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString749();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean838();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean491();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager349();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "7557" + "'", str2, "7557");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager821();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean872();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString872();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean404();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString410();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean245();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10862" + "'", str6, "10862");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "7396" + "'", str8, "7396");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager821();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean838();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager873();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean790();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager728();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString168();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean577();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager499();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager810();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString370();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2357" + "'", str9, "2357");
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "6505" + "'", str13, "6505");
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString161();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean995();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1005();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager373();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager615();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean334();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2281" + "'", str2, "2281");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "25313" + "'", str4, "25313");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager507();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager221();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean579();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean787();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager859();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString313();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager572();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString790();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5229" + "'", str7, "5229");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "9385" + "'", str9, "9385");
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager243();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager745();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean467();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager221();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean579();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager15();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString197();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString29();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2472" + "'", str6, "2472");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "330" + "'", str7, "330");
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager821();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString679();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager890();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString588();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1049();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString909();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5244" + "'", str5, "5244");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1056" + "'", str7, "1056");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "9" + "'", str8, "9");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "11397" + "'", str9, "11397");
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString457();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager493();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager709();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString632();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager159();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6544" + "'", str2, "6544");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10225" + "'", str3, "10225");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2027" + "'", str6, "2027");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager511();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean349();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager398();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager82();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString524();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "11610" + "'", str7, "11610");
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager255();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString114();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString185();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager707();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1880" + "'", str7, "1880");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2424" + "'", str8, "2424");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString717();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean232();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString853();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5933" + "'", str3, "5933");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10670" + "'", str5, "10670");
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager573();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString414();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean529();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager646();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager398();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean15();
        java.lang.Boolean boolean13 = serializedObjectSupporter0.deserializeObjectBoolean499();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager14 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager759();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "7440" + "'", str8, "7440");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + true + "'", boolean13, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager14);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean662();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean290();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString687();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString207();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager870();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean775();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString651();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5441" + "'", str5, "5441");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2512" + "'", str6, "2512");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2389" + "'", str9, "2389");
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString733();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager570();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString263();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean1057();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager504();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean128();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager566();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean529();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6544" + "'", str2, "6544");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "3688" + "'", str4, "3688");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean876();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager201();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager477();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean685();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager44();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString665();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager488();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString244();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager44();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString529();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5044" + "'", str2, "5044");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "3006" + "'", str4, "3006");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "11917" + "'", str6, "11917");
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString910();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager70();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager420();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString325();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager508();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString732();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11414" + "'", str3, "11414");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5513" + "'", str7, "5513");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "6483" + "'", str9, "6483");
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1060();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString28();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString265();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString108();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean271();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager641();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1010();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "312" + "'", str5, "312");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "3778" + "'", str6, "3778");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1758" + "'", str7, "1758");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager86();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager719();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager556();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1040();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean690();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean943();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean748();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager53();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager220();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager609();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString781();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9319" + "'", str6, "9319");
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString390();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString278();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean159();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean350();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager526();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString275();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString87();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "6831" + "'", str4, "6831");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4241" + "'", str5, "4241");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4130" + "'", str9, "4130");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1177" + "'", str10, "1177");
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager184();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager757();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager559();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager601();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString512();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean366();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "11491" + "'", str10, "11491");
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean951();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean782();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean334();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager276();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString271();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString446();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "3972" + "'", str6, "3972");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10078" + "'", str7, "10078");
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString151();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager916();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager263();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager733();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean187();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager394();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager635();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean949();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString866();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6544" + "'", str2, "6544");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2238" + "'", str3, "2238");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10747" + "'", str11, "10747");
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager821();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean838();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString274();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString893();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean214();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager491();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager585();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4085" + "'", str6, "4085");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "11091" + "'", str7, "11091");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString572();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean632();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean996();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager866();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager233();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean327();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager561();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "702" + "'", str2, "702");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean662();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager239();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean1034();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString125();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager590();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean443();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2105" + "'", str7, "2105");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1059();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString599();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager970();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString188();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager109();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager967();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1366" + "'", str5, "1366");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2437" + "'", str7, "2437");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1060();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString28();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString265();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean908();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager418();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "312" + "'", str5, "312");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "3778" + "'", str6, "3778");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean634();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean864();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString514();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString653();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean207();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean100();
        java.lang.Boolean boolean13 = serializedObjectSupporter0.deserializeObjectBoolean563();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager14 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager303();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "11551" + "'", str9, "11551");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2398" + "'", str10, "2398");
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + true + "'", boolean13, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager14);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean634();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean864();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString514();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString824();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString202();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString18();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager13 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager712();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "11551" + "'", str9, "11551");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10423" + "'", str10, "10423");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2493" + "'", str11, "2493");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "230" + "'", str12, "230");
        org.junit.Assert.assertNotNull(deploymentEntityManager13);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager86();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager719();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager556();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1040();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString781();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager794();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString230();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean787();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager806();
        java.lang.Boolean boolean13 = serializedObjectSupporter0.deserializeObjectBoolean516();
        java.lang.Boolean boolean14 = serializedObjectSupporter0.deserializeObjectBoolean869();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "9319" + "'", str8, "9319");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2798" + "'", str10, "2798");
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + true + "'", boolean13, true);
        org.junit.Assert.assertEquals("'" + boolean14 + "' != '" + true + "'", boolean14, true);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager836();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager888();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString785();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString807();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager58();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager999();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9343" + "'", str3, "9343");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "9677" + "'", str4, "9677");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString910();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString223();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean378();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11414" + "'", str3, "11414");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2638" + "'", str5, "2638");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean952();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean850();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString782();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager574();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean115();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean393();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + false + "'", boolean5, false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9333" + "'", str6, "9333");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean662();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager239();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString712();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean661();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager81();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager694();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager739();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager31();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean798();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString557();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString785();
        java.lang.String str15 = serializedObjectSupporter0.deserializeObjectString1055();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5894" + "'", str6, "5894");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "418" + "'", str13, "418");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "9343" + "'", str14, "9343");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "57" + "'", str15, "57");
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString306();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager632();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager179();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean42();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5079" + "'", str7, "5079");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1043();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager65();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString65();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString195();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager932();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager85();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean601();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "781" + "'", str7, "781");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2464" + "'", str8, "2464");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + false + "'", boolean11, false);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager243();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager238();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean409();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean905();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager116();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean142();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean625();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager821();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean838();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager873();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean790();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean271();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString784();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString593();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager805();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "9340" + "'", str9, "9340");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1262" + "'", str10, "1262");
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString457();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString801();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager531();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString938();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString183();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString769();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString517();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6544" + "'", str2, "6544");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10225" + "'", str3, "10225");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "9572" + "'", str4, "9572");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "11868" + "'", str6, "11868");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2416" + "'", str7, "2416");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "8714" + "'", str8, "8714");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "11578" + "'", str9, "11578");
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString717();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean232();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager281();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean1000();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean175();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean64();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager160();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5933" + "'", str3, "5933");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1060();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean397();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString544();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean675();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1012();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1024();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "167" + "'", str6, "167");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager467();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean533();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean948();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager967();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean453();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean948();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean370();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager267();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString466();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean20();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6544" + "'", str2, "6544");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10559" + "'", str7, "10559");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean634();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean864();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager595();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean270();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager799();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean634();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager780();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean116();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager220();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1047();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString992();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "15345" + "'", str6, "15345");
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean634();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString263();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString79();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean998();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString438();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager120();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "3688" + "'", str8, "3688");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1040" + "'", str9, "1040");
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "9901" + "'", str11, "9901");
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager220();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager907();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString104();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager705();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean600();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString767();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1670" + "'", str6, "1670");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "8629" + "'", str9, "8629");
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean662();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean290();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString687();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString207();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager870();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean216();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1002();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString103();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5441" + "'", str5, "5441");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2512" + "'", str6, "2512");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "25304" + "'", str9, "25304");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1648" + "'", str10, "1648");
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString665();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean80();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString247();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5044" + "'", str2, "5044");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8473" + "'", str3, "8473");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3132" + "'", str5, "3132");
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1043();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager65();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager331();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString625();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString686();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1932" + "'", str8, "1932");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "5425" + "'", str9, "5425");
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString910();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager70();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager420();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager970();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString885();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11414" + "'", str3, "11414");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "11002" + "'", str8, "11002");
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean412();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager277();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager472();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean863();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager256();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager964();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean3();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean893();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager821();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean838();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean705();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager543();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean25();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager74();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager301();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager915();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager18();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager729();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean104();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager573();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString414();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean529();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager646();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean475();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean667();
        java.lang.Boolean boolean13 = serializedObjectSupporter0.deserializeObjectBoolean580();
        java.lang.Boolean boolean14 = serializedObjectSupporter0.deserializeObjectBoolean884();
        java.lang.Boolean boolean15 = serializedObjectSupporter0.deserializeObjectBoolean750();
        java.lang.String str16 = serializedObjectSupporter0.deserializeObjectString157();
        java.lang.Boolean boolean17 = serializedObjectSupporter0.deserializeObjectBoolean1018();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager18 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager669();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "7440" + "'", str8, "7440");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + true + "'", boolean13, true);
        org.junit.Assert.assertEquals("'" + boolean14 + "' != '" + true + "'", boolean14, true);
        org.junit.Assert.assertEquals("'" + boolean15 + "' != '" + true + "'", boolean15, true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2256" + "'", str16, "2256");
        org.junit.Assert.assertEquals("'" + boolean17 + "' != '" + true + "'", boolean17, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager18);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager821();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean872();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString872();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString526();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean369();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10862" + "'", str6, "10862");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "11620" + "'", str7, "11620");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager141();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean504();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean997();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager188();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean668();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean110();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString466();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10559" + "'", str6, "10559");
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString201();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager67();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString269();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString236();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString939();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2488" + "'", str5, "2488");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3904" + "'", str7, "3904");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2854" + "'", str8, "2854");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "11887" + "'", str9, "11887");
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager86();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager719();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean717();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager215();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString401();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean653();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "7013" + "'", str8, "7013");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean668();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean490();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1008();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean9();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "30304" + "'", str6, "30304");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean753();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString551();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager765();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString823();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString850();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean562();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "286" + "'", str8, "286");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10406" + "'", str10, "10406");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10633" + "'", str11, "10633");
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean268();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager136();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager699();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager561();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString278();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager753();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4241" + "'", str10, "4241");
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString745();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean381();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString78();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager184();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean386();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "7366" + "'", str7, "7366");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1010" + "'", str9, "1010");
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean634();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean864();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean111();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager999();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager821();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean838();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager873();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean790();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager728();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString250();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager553();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1024();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3195" + "'", str9, "3195");
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "75304" + "'", str11, "75304");
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean634();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean864();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager595();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean1047();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean888();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager172();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager13 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager317();
        java.lang.Boolean boolean14 = serializedObjectSupporter0.deserializeObjectBoolean85();
        java.lang.String str15 = serializedObjectSupporter0.deserializeObjectString751();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
        org.junit.Assert.assertNotNull(deploymentEntityManager13);
        org.junit.Assert.assertEquals("'" + boolean14 + "' != '" + true + "'", boolean14, true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "7624" + "'", str15, "7624");
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager573();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString414();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager867();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean416();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager223();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString456();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "7440" + "'", str8, "7440");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10219" + "'", str12, "10219");
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager821();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean838();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager873();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean790();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager728();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString250();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager528();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean115();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager634();
        java.lang.Boolean boolean13 = serializedObjectSupporter0.deserializeObjectBoolean174();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString916();
        java.lang.String str15 = serializedObjectSupporter0.deserializeObjectString741();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3195" + "'", str9, "3195");
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + true + "'", boolean13, true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "11485" + "'", str14, "11485");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "7053" + "'", str15, "7053");
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString190();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString249();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2445" + "'", str7, "2445");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "3192" + "'", str8, "3192");
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager243();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager238();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean547();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager487();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString138();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean297();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2199" + "'", str7, "2199");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean662();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager319();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString900();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager553();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager881();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager682();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean886();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager995();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager927();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString402();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "11233" + "'", str5, "11233");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "7027" + "'", str12, "7027");
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager184();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager757();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager559();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1006();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager555();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString746();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "25316" + "'", str9, "25316");
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "7430" + "'", str11, "7430");
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean863();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager919();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString399();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString922();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "6989" + "'", str4, "6989");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "11555" + "'", str6, "11555");
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager243();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager630();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean563();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean662();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager239();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager919();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager473();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1019();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager829();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "62804" + "'", str8, "62804");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean836();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString880();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager718();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString566();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6544" + "'", str2, "6544");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10946" + "'", str4, "10946");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "584" + "'", str6, "584");
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager821();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean838();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString274();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString893();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean214();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager491();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean913();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4085" + "'", str6, "4085");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "11091" + "'", str7, "11091");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString745();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean381();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString78();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager544();
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity11 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager10.insertDeployment(deploymentEntity11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "7366" + "'", str7, "7366");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1010" + "'", str9, "1010");
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager821();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean838();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager873();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean456();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean541();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager849();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean290();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager553();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager821();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean838();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager873();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean790();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean271();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString784();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString593();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean1014();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "9340" + "'", str9, "9340");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1262" + "'", str10, "1262");
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1059();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString599();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager487();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager239();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1366" + "'", str5, "1366");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString749();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean838();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean491();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean1054();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean706();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "7557" + "'", str2, "7557");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString910();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager70();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager563();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager787();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager878();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager821();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11414" + "'", str3, "11414");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString390();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString278();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager957();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "6831" + "'", str4, "6831");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4241" + "'", str5, "4241");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean951();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString776();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean646();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9025" + "'", str3, "9025");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString298();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager640();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean867();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean1038();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString535();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean429();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4928" + "'", str4, "4928");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "12230" + "'", str8, "12230");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString617();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager732();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean793();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean524();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1058();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean999();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6544" + "'", str2, "6544");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1693" + "'", str3, "1693");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString201();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString203();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean885();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2488" + "'", str5, "2488");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2496" + "'", str6, "2496");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString745();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean381();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString78();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString436();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString859();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1041();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "7366" + "'", str7, "7366");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1010" + "'", str9, "1010");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "9880" + "'", str10, "9880");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10694" + "'", str11, "10694");
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean668();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean490();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString853();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager336();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10670" + "'", str6, "10670");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager821();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean838();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager873();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean790();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager728();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString250();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager528();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1053();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString738();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3195" + "'", str9, "3195");
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "6918" + "'", str12, "6918");
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1043();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager65();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager402();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager817();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean116();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean130();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager324();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager13 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager800();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager14 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager610();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "5371" + "'", str12, "5371");
        org.junit.Assert.assertNotNull(deploymentEntityManager13);
        org.junit.Assert.assertNotNull(deploymentEntityManager14);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString910();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString244();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager520();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString980();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean697();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean1048();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString776();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11414" + "'", str3, "11414");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "3006" + "'", str4, "3006");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "12422" + "'", str6, "12422");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "9025" + "'", str9, "9025");
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1043();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager65();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager402();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager979();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager914();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager332();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean560();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString42();
        java.lang.Boolean boolean13 = serializedObjectSupporter0.deserializeObjectBoolean820();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString155();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "473" + "'", str12, "473");
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + true + "'", boolean13, true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2250" + "'", str14, "2250");
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString847();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString406();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString480();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10620" + "'", str3, "10620");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7079" + "'", str4, "7079");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10768" + "'", str5, "10768");
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString827();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString173();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager346();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean391();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString565();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager179();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager535();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager549();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean450();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString765();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString66();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString938();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10455" + "'", str2, "10455");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2376" + "'", str3, "2376");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "574" + "'", str6, "574");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "8470" + "'", str11, "8470");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "789" + "'", str12, "789");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "11868" + "'", str13, "11868");
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager86();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager719();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager556();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean1044();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean767();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString216();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + false + "'", boolean7, false);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2563" + "'", str9, "2563");
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean634();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean864();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString514();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString929();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString914();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager25();
        java.lang.Boolean boolean13 = serializedObjectSupporter0.deserializeObjectBoolean366();
        java.lang.Boolean boolean14 = serializedObjectSupporter0.deserializeObjectBoolean656();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "11551" + "'", str9, "11551");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "11675" + "'", str10, "11675");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "11472" + "'", str11, "11472");
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + true + "'", boolean13, true);
        org.junit.Assert.assertEquals("'" + boolean14 + "' != '" + true + "'", boolean14, true);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager821();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean838();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager873();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean790();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager728();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString168();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager848();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean954();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean670();
        java.lang.Boolean boolean13 = serializedObjectSupporter0.deserializeObjectBoolean383();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2357" + "'", str9, "2357");
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + true + "'", boolean13, true);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString151();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString168();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean502();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6544" + "'", str2, "6544");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2238" + "'", str3, "2238");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2357" + "'", str4, "2357");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString717();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString617();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager887();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString586();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean327();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager653();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5933" + "'", str3, "5933");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1693" + "'", str4, "1693");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "955" + "'", str6, "955");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean519();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager7();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager406();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString454();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString582();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10216" + "'", str6, "10216");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "889" + "'", str7, "889");
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString717();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean561();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean112();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1056();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean946();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5933" + "'", str3, "5933");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager221();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean579();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager222();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager957();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1008();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager69();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString801();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "30304" + "'", str6, "30304");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "9572" + "'", str8, "9572");
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager836();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean960();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager640();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean634();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean864();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString724();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString157();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager840();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager739();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString659();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString75();
        java.lang.Boolean boolean15 = serializedObjectSupporter0.deserializeObjectBoolean330();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "5996" + "'", str9, "5996");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2256" + "'", str10, "2256");
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2464" + "'", str13, "2464");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "888" + "'", str14, "888");
        org.junit.Assert.assertEquals("'" + boolean15 + "' != '" + true + "'", boolean15, true);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager821();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean261();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean429();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean634();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean864();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager202();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean683();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager640();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager880();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString151();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager916();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager263();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString171();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString720();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean393();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager505();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6544" + "'", str2, "6544");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2238" + "'", str3, "2238");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2368" + "'", str6, "2368");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5962" + "'", str7, "5962");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString201();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString203();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString417();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager915();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager426();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager14();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2488" + "'", str5, "2488");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2496" + "'", str6, "2496");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "7595" + "'", str7, "7595");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString745();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean381();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString78();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString19();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean206();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager440();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString517();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "7366" + "'", str7, "7366");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1010" + "'", str9, "1010");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "242" + "'", str10, "242");
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "11578" + "'", str13, "11578");
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString457();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString801();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean659();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean1024();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean423();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6544" + "'", str2, "6544");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10225" + "'", str3, "10225");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "9572" + "'", str4, "9572");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString390();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString278();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean159();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager93();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean793();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager946();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString417();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "6831" + "'", str4, "6831");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4241" + "'", str5, "4241");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "7595" + "'", str10, "7595");
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString617();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager732();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean217();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString825();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean592();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager993();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6544" + "'", str2, "6544");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1693" + "'", str3, "1693");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10437" + "'", str6, "10437");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString745();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean381();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString78();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString19();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager148();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "7366" + "'", str7, "7366");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1010" + "'", str9, "1010");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "242" + "'", str10, "242");
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean634();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean864();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString514();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString929();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString914();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean579();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString654();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager14 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager478();
        java.lang.Boolean boolean15 = serializedObjectSupporter0.deserializeObjectBoolean920();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "11551" + "'", str9, "11551");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "11675" + "'", str10, "11675");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "11472" + "'", str11, "11472");
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2410" + "'", str13, "2410");
        org.junit.Assert.assertNotNull(deploymentEntityManager14);
        org.junit.Assert.assertEquals("'" + boolean15 + "' != '" + true + "'", boolean15, true);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1043();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean326();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString675();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean792();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager920();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1035();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString519();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5190" + "'", str7, "5190");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "11584" + "'", str11, "11584");
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean662();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager239();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString223();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString961();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean138();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2638" + "'", str6, "2638");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "12143" + "'", str7, "12143");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean634();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean864();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString724();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString157();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean115();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager641();
        java.lang.Boolean boolean13 = serializedObjectSupporter0.deserializeObjectBoolean10();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString576();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "5996" + "'", str9, "5996");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2256" + "'", str10, "2256");
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + true + "'", boolean13, true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "791" + "'", str14, "791");
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString717();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString881();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager490();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean252();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5933" + "'", str3, "5933");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10957" + "'", str4, "10957");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean662();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager319();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString900();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager553();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager881();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager682();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean886();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager995();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager983();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString579();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "11233" + "'", str5, "11233");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "860" + "'", str12, "860");
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean662();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager239();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager919();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1028();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean753();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager764();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString589();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean288();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1078" + "'", str9, "1078");
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean634();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean864();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager595();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean1047();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString990();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager571();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "15330" + "'", str11, "15330");
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean634();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean864();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString514();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString929();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString914();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager25();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager13 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager759();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString127();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager15 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager994();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager16 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager869();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "11551" + "'", str9, "11551");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "11675" + "'", str10, "11675");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "11472" + "'", str11, "11472");
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
        org.junit.Assert.assertNotNull(deploymentEntityManager13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2129" + "'", str14, "2129");
        org.junit.Assert.assertNotNull(deploymentEntityManager15);
        org.junit.Assert.assertNotNull(deploymentEntityManager16);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean876();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager201();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager477();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean63();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString605();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1418" + "'", str5, "1418");
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean634();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString263();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean498();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString745();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager324();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "3688" + "'", str8, "3688");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "7366" + "'", str10, "7366");
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString644();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager799();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2322" + "'", str4, "2322");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager243();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager238();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean547();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager487();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean103();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString733();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager570();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString263();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean1057();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager504();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString432();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString661();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean465();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6544" + "'", str2, "6544");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "3688" + "'", str4, "3688");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "9491" + "'", str7, "9491");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2486" + "'", str8, "2486");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager221();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean556();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager365();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean643();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager710();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString108();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1758" + "'", str7, "1758");
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager573();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString414();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean529();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager789();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager808();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString148();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString426();
        java.lang.Boolean boolean14 = serializedObjectSupporter0.deserializeObjectBoolean516();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager15 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager604();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager16 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager143();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "7440" + "'", str8, "7440");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2229" + "'", str12, "2229");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "8732" + "'", str13, "8732");
        org.junit.Assert.assertEquals("'" + boolean14 + "' != '" + true + "'", boolean14, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager15);
        org.junit.Assert.assertNotNull(deploymentEntityManager16);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager836();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean960();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager422();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean798();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString325();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean69();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager499();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString796();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5513" + "'", str5, "5513");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "9468" + "'", str8, "9468");
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean63();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean236();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString508();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean727();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager13 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager960();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "11381" + "'", str9, "11381");
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager13);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString733();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager570();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager744();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean16();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean839();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean219();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6544" + "'", str2, "6544");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean662();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString297();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString96();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager350();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean333();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4920" + "'", str4, "4920");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1336" + "'", str5, "1336");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean634();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean864();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager202();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean683();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean937();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString261();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString151();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager14 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager359();
        java.lang.Boolean boolean15 = serializedObjectSupporter0.deserializeObjectBoolean691();
        java.lang.Boolean boolean16 = serializedObjectSupporter0.deserializeObjectBoolean916();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "3626" + "'", str12, "3626");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2238" + "'", str13, "2238");
        org.junit.Assert.assertNotNull(deploymentEntityManager14);
        org.junit.Assert.assertEquals("'" + boolean15 + "' != '" + true + "'", boolean15, true);
        org.junit.Assert.assertEquals("'" + boolean16 + "' != '" + false + "'", boolean16, false);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1043();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager598();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean1063();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager693();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager870();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1034();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager983();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString161();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean995();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString67();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2281" + "'", str2, "2281");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "800" + "'", str4, "800");
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager821();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean838();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean705();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager543();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager296();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean43();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString901();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "11249" + "'", str10, "11249");
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString298();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager640();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean867();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean1038();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString535();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString927();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4928" + "'", str4, "4928");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "12230" + "'", str8, "12230");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "11656" + "'", str9, "11656");
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString390();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString278();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager291();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString459();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager395();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString143();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean694();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "6831" + "'", str4, "6831");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4241" + "'", str5, "4241");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10323" + "'", str7, "10323");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2214" + "'", str9, "2214");
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean836();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString31();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean370();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString208();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1059();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6544" + "'", str2, "6544");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "357" + "'", str4, "357");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2515" + "'", str6, "2515");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "94" + "'", str7, "94");
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean163();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean784();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString966();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "12216" + "'", str4, "12216");
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean952();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean850();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString782();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager959();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString416();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString635();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean20();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + false + "'", boolean5, false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9333" + "'", str6, "9333");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "7502" + "'", str8, "7502");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2083" + "'", str9, "2083");
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1043();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager65();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager331();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1039();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1058();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1004();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "45" + "'", str8, "45");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "83" + "'", str9, "83");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "25310" + "'", str10, "25310");
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1043();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager65();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager331();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString625();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager10();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString624();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1932" + "'", str8, "1932");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1918" + "'", str10, "1918");
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean836();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString31();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager416();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean898();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString286();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager511();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString712();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6544" + "'", str2, "6544");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "357" + "'", str4, "357");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4579" + "'", str7, "4579");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "5894" + "'", str9, "5894");
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1043();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager65();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager402();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager979();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager914();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString232();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean145();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean740();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager13 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2828" + "'", str10, "2828");
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager13);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1043();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager995();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean195();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager421();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean635();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager479();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean171();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager86();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager719();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager556();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1040();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString781();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1012();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString50();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "9319" + "'", str8, "9319");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "45304" + "'", str9, "45304");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "613" + "'", str10, "613");
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager86();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager719();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager556();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1040();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString781();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager794();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean412();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager558();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager624();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager13 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager979();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "9319" + "'", str8, "9319");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
        org.junit.Assert.assertNotNull(deploymentEntityManager13);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1060();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean397();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString544();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean675();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager875();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager379();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "167" + "'", str6, "167");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean836();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString31();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager416();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean898();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager770();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean571();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString894();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean668();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString958();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6544" + "'", str2, "6544");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "357" + "'", str4, "357");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "11101" + "'", str10, "11101");
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "12107" + "'", str12, "12107");
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString910();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString244();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager520();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString120();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1019();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11414" + "'", str3, "11414");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "3006" + "'", str4, "3006");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2005" + "'", str6, "2005");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString733();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager570();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString263();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean1057();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager504();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString432();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean266();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6544" + "'", str2, "6544");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "3688" + "'", str4, "3688");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "9491" + "'", str7, "9491");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString910();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString244();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString653();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean54();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString133();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager341();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean416();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11414" + "'", str3, "11414");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "3006" + "'", str4, "3006");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2398" + "'", str5, "2398");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2184" + "'", str8, "2184");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString457();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString801();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean1012();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean379();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean25();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString132();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6544" + "'", str2, "6544");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10225" + "'", str3, "10225");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "9572" + "'", str4, "9572");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2181" + "'", str8, "2181");
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean662();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager319();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString641();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2242" + "'", str5, "2242");
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean634();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean864();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean236();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString254();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString255();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager549();
        java.lang.Boolean boolean13 = serializedObjectSupporter0.deserializeObjectBoolean549();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "3373" + "'", str10, "3373");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3418" + "'", str11, "3418");
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + true + "'", boolean13, true);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean63();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean236();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString508();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean674();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager174();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager912();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString123();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "11381" + "'", str9, "11381");
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2061" + "'", str13, "2061");
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean662();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager239();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString712();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean789();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean180();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager548();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager630();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean972();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5894" + "'", str6, "5894");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager221();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean579();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager222();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager957();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager111();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString989();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean498();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "15319" + "'", str7, "15319");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1047();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString265();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean850();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager501();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager380();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3778" + "'", str3, "3778");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean634();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean864();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString514();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString929();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString914();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager25();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager13 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager759();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString127();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager15 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager994();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager16 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager995();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "11551" + "'", str9, "11551");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "11675" + "'", str10, "11675");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "11472" + "'", str11, "11472");
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
        org.junit.Assert.assertNotNull(deploymentEntityManager13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2129" + "'", str14, "2129");
        org.junit.Assert.assertNotNull(deploymentEntityManager15);
        org.junit.Assert.assertNotNull(deploymentEntityManager16);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager821();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean838();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString274();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString893();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager309();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager630();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean349();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4085" + "'", str6, "4085");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "11091" + "'", str7, "11091");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean668();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString750();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1035();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean713();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString900();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "7590" + "'", str5, "7590");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "11233" + "'", str8, "11233");
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1043();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager65();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager402();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager817();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean116();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean130();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString319();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "5371" + "'", str11, "5371");
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager221();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean579();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean787();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager859();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean420();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString607();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1450" + "'", str8, "1450");
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean668();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean490();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean352();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean695();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean60();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean270();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager26();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1056();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString189();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "68" + "'", str5, "68");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2440" + "'", str6, "2440");
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString390();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString278();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean72();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean284();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean449();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager35();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "6831" + "'", str4, "6831");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4241" + "'", str5, "4241");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean634();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean864();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString724();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString157();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager942();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString374();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "5996" + "'", str9, "5996");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2256" + "'", str10, "2256");
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "6589" + "'", str12, "6589");
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager221();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean556();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager365();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager161();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager488();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean662();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean290();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString687();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString207();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager870();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean216();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1002();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager15();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5441" + "'", str5, "5441");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2512" + "'", str6, "2512");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "25304" + "'", str9, "25304");
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean836();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString31();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager416();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean898();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager770();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean571();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean597();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString366();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager312();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6544" + "'", str2, "6544");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "357" + "'", str4, "357");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "6457" + "'", str10, "6457");
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager836();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager888();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString671();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean644();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5132" + "'", str3, "5132");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1043();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager65();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager402();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager306();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString795();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean453();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "9449" + "'", str9, "9449");
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean662();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString297();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString96();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager350();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString150();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager747();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager134();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4920" + "'", str4, "4920");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1336" + "'", str5, "1336");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2235" + "'", str7, "2235");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1043();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString393();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean206();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString274();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString820();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "6870" + "'", str6, "6870");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4085" + "'", str8, "4085");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10368" + "'", str9, "10368");
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean951();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean782();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager56();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager156();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean566();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean554();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean836();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager512();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager300();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager562();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6544" + "'", str2, "6544");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager86();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean853();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean408();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1038();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean299();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1043();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1012();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean662();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager239();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString712();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean661();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager545();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager984();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5894" + "'", str6, "5894");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean662();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager239();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager919();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager473();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString88();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1203" + "'", str8, "1203");
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString92();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString597();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString807();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager862();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager626();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1263" + "'", str4, "1263");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1319" + "'", str5, "1319");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9677" + "'", str6, "9677");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager836();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager888();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString785();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString807();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString641();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1037();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean591();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9343" + "'", str3, "9343");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "9677" + "'", str4, "9677");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2242" + "'", str5, "2242");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean634();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean864();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean236();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean464();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString869();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10812" + "'", str11, "10812");
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager347();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager680();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager221();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean579();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager222();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager957();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager111();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString293();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager79();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString618();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager376();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager810();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4826" + "'", str7, "4826");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1753" + "'", str9, "1753");
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager821();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean838();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean705();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager543();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager296();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean43();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager696();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1061();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager387();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString918();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "108" + "'", str11, "108");
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "11504" + "'", str13, "11504");
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean63();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean236();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString508();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean743();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString93();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean795();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "11381" + "'", str9, "11381");
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1270" + "'", str11, "1270");
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString390();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString278();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager291();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString459();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean913();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1021();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "6831" + "'", str4, "6831");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4241" + "'", str5, "4241");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10323" + "'", str7, "10323");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString390();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString180();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager414();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean968();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager692();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean158();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean74();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "6831" + "'", str4, "6831");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2405" + "'", str5, "2405");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean876();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean626();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean930();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager821();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString679();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager890();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager319();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean760();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5244" + "'", str5, "5244");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager255();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString114();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString185();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString928();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString462();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager171();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager987();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1880" + "'", str7, "1880");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2424" + "'", str8, "2424");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "11667" + "'", str9, "11667");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10396" + "'", str10, "10396");
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString910();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager70();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager420();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean998();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString417();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString47();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean130();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11414" + "'", str3, "11414");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "7595" + "'", str9, "7595");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "561" + "'", str10, "561");
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager821();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean872();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString872();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean1020();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString54();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString748();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager254();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString825();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager137();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10862" + "'", str6, "10862");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "655" + "'", str8, "655");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "7506" + "'", str9, "7506");
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10437" + "'", str11, "10437");
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager467();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString418();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1006();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString559();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString853();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "7644" + "'", str2, "7644");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "439" + "'", str4, "439");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10670" + "'", str5, "10670");
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager821();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString679();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString111();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean1027();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager738();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5244" + "'", str5, "5244");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1827" + "'", str6, "1827");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1059();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString599();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager412();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString608();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1366" + "'", str5, "1366");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1460" + "'", str7, "1460");
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1043();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager65();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager402();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean966();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager86();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean853();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean408();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean273();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString866();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString976();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10747" + "'", str8, "10747");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "12360" + "'", str9, "12360");
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean951();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean782();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString764();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString965();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean262();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString658();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager105();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString644();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager907();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "8439" + "'", str4, "8439");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "12200" + "'", str5, "12200");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2453" + "'", str7, "2453");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2322" + "'", str9, "2322");
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager86();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager719();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager556();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1040();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean690();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString175();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean145();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2384" + "'", str9, "2384");
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager86();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean853();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean408();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString345();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5965" + "'", str7, "5965");
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager221();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean579();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager15();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager415();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean662();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager239();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager485();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString831();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString13();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10499" + "'", str7, "10499");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "159" + "'", str8, "159");
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager573();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString414();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean529();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager789();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager808();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString148();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString426();
        java.lang.Boolean boolean14 = serializedObjectSupporter0.deserializeObjectBoolean516();
        java.lang.String str15 = serializedObjectSupporter0.deserializeObjectString715();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager16 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager719();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "7440" + "'", str8, "7440");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2229" + "'", str12, "2229");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "8732" + "'", str13, "8732");
        org.junit.Assert.assertEquals("'" + boolean14 + "' != '" + true + "'", boolean14, true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "5919" + "'", str15, "5919");
        org.junit.Assert.assertNotNull(deploymentEntityManager16);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean634();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean864();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString514();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString929();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager763();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager828();
        java.lang.Boolean boolean13 = serializedObjectSupporter0.deserializeObjectBoolean529();
        java.lang.Boolean boolean14 = serializedObjectSupporter0.deserializeObjectBoolean199();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "11551" + "'", str9, "11551");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "11675" + "'", str10, "11675");
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + true + "'", boolean13, true);
        org.junit.Assert.assertEquals("'" + boolean14 + "' != '" + true + "'", boolean14, true);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString572();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean632();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString58();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager977();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString843();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "702" + "'", str2, "702");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "704" + "'", str4, "704");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10591" + "'", str6, "10591");
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString457();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString801();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean659();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager280();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager297();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6544" + "'", str2, "6544");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10225" + "'", str3, "10225");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "9572" + "'", str4, "9572");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean876();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager755();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean1009();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1064();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean634();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean864();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString514();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString653();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean207();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean100();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString345();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager14 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager641();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager15 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager8();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager16 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager856();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "11551" + "'", str9, "11551");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2398" + "'", str10, "2398");
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "5965" + "'", str13, "5965");
        org.junit.Assert.assertNotNull(deploymentEntityManager14);
        org.junit.Assert.assertNotNull(deploymentEntityManager15);
        org.junit.Assert.assertNotNull(deploymentEntityManager16);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean662();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean290();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString687();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString207();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager870();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean216();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager152();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString71();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5441" + "'", str5, "5441");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2512" + "'", str6, "2512");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "853" + "'", str10, "853");
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean662();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager319();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString314();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean382();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean501();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean113();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5236" + "'", str5, "5236");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean662();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager239();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString712();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1000();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean575();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean25();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager417();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5894" + "'", str6, "5894");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "22813" + "'", str7, "22813");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager836();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean960();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager422();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean798();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString325();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean787();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean101();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5513" + "'", str5, "5513");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString827();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString153();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager152();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10455" + "'", str2, "10455");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2244" + "'", str3, "2244");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString151();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager916();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager263();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString171();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean1021();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString822();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean118();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6544" + "'", str2, "6544");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2238" + "'", str3, "2238");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2368" + "'", str6, "2368");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10395" + "'", str8, "10395");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean952();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean850();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager165();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean858();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + false + "'", boolean5, false);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean634();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean864();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager202();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean683();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager306();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString717();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean232();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager252();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean82();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean941();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean119();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5933" + "'", str3, "5933");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString733();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager570();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager750();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean17();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean529();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean658();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6544" + "'", str2, "6544");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString717();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean191();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString74();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString33();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean436();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager631();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean192();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5933" + "'", str3, "5933");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "871" + "'", str5, "871");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "392" + "'", str6, "392");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager86();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager719();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager556();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1040();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString781();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager794();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean412();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager558();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString187();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString123();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "9319" + "'", str8, "9319");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2432" + "'", str12, "2432");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2061" + "'", str13, "2061");
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean163();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean784();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager306();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean194();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean1065();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager836();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean960();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager422();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean798();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString490();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "11023" + "'", str5, "11023");
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1060();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString28();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString265();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean908();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager512();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString158();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "312" + "'", str5, "312");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "3778" + "'", str6, "3778");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2259" + "'", str9, "2259");
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean836();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString31();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean370();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString208();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean936();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString696();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6544" + "'", str2, "6544");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "357" + "'", str4, "357");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2515" + "'", str6, "2515");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "5662" + "'", str8, "5662");
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString717();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean561();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString606();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager734();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5933" + "'", str3, "5933");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1434" + "'", str5, "1434");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString665();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager488();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString244();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager317();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager613();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager702();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5044" + "'", str2, "5044");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "3006" + "'", str4, "3006");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager86();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager719();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager556();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean1044();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString668();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + false + "'", boolean7, false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "5093" + "'", str8, "5093");
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString827();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager612();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean454();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1040();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10455" + "'", str2, "10455");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "53" + "'", str5, "53");
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean634();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean864();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager595();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean1047();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean888();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString957();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "12097" + "'", str12, "12097");
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean662();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager133();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString369();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString905();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "6498" + "'", str5, "6498");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "11318" + "'", str6, "11318");
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString390();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString278();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager852();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean602();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean543();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString82();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean450();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager454();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "6831" + "'", str4, "6831");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4241" + "'", str5, "4241");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + false + "'", boolean7, false);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1083" + "'", str9, "1083");
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString827();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString173();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager346();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean16();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager111();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10455" + "'", str2, "10455");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2376" + "'", str3, "2376");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString457();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString801();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager292();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6544" + "'", str2, "6544");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10225" + "'", str3, "10225");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "9572" + "'", str4, "9572");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager821();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean838();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager873();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean790();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean271();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString784();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString593();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString778();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "9340" + "'", str9, "9340");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1262" + "'", str10, "1262");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "9101" + "'", str11, "9101");
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager573();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString414();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean529();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager249();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean512();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "7440" + "'", str8, "7440");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager220();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager907();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager196();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean646();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager301();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1005();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString468();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager154();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean707();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "25313" + "'", str6, "25313");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10587" + "'", str7, "10587");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString457();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString920();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean161();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean454();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6544" + "'", str2, "6544");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10225" + "'", str3, "10225");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11527" + "'", str4, "11527");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean634();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean864();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean236();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean464();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean365();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager326();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean662();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString297();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean60();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean625();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4920" + "'", str4, "4920");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean876();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager201();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager477();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean63();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager118();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString206();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString717();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString234();
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2509" + "'", str6, "2509");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5933" + "'", str7, "5933");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2844" + "'", str8, "2844");
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager573();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString414();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean529();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager789();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1015();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString610();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "7440" + "'", str8, "7440");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "52804" + "'", str11, "52804");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1494" + "'", str12, "1494");
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean634();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean864();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager202();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean683();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager233();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean159();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString745();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager288();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString562();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean639();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1020();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean237();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "7366" + "'", str7, "7366");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "483" + "'", str9, "483");
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager573();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString414();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean529();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean642();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean596();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString31();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString523();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager14 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager255();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "7440" + "'", str8, "7440");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "357" + "'", str12, "357");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "11606" + "'", str13, "11606");
        org.junit.Assert.assertNotNull(deploymentEntityManager14);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString605();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString24();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager277();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager422();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1418" + "'", str2, "1418");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "287" + "'", str4, "287");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean662();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager239();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString712();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean789();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager9();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean687();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString445();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5894" + "'", str6, "5894");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10065" + "'", str10, "10065");
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager478();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString312();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString382();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean926();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5204" + "'", str7, "5204");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "6661" + "'", str8, "6661");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager573();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString414();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean712();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString326();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString265();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "7440" + "'", str8, "7440");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "5538" + "'", str10, "5538");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3778" + "'", str11, "3778");
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean634();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean864();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString724();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString612();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString80();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString525();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "5996" + "'", str9, "5996");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1595" + "'", str10, "1595");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1047" + "'", str11, "1047");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "11613" + "'", str12, "11613");
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString572();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean632();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString58();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager977();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1060();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean503();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "702" + "'", str2, "702");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "704" + "'", str4, "704");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "101" + "'", str6, "101");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager289();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString298();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager640();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1040();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1052();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean928();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4928" + "'", str4, "4928");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "36" + "'", str7, "36");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean753();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1024();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager592();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1042();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager548();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString518();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean86();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2501" + "'", str5, "2501");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "11581" + "'", str7, "11581");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean163();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean784();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString653();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager425();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString82();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2398" + "'", str4, "2398");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1083" + "'", str6, "1083");
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean662();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString297();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString96();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString204();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager235();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4920" + "'", str4, "4920");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1336" + "'", str5, "1336");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2501" + "'", str6, "2501");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager86();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager719();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager556();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1040();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString781();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager794();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString505();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager934();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "9319" + "'", str8, "9319");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "11342" + "'", str10, "11342");
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager292();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString418();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager93();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString429();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "7644" + "'", str8, "7644");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "9076" + "'", str10, "9076");
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager821();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString679();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager890();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager640();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean734();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString289();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5244" + "'", str5, "5244");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4642" + "'", str9, "4642");
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString910();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString244();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString653();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean990();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean880();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager244();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11414" + "'", str3, "11414");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "3006" + "'", str4, "3006");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2398" + "'", str5, "2398");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", boolean6, false);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean836();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString31();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager416();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean898();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager770();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager850();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean638();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6544" + "'", str2, "6544");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "357" + "'", str4, "357");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1059();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString599();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean825();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1366" + "'", str5, "1366");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean357();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean1013();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean421();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager573();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString414();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean529();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager789();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager808();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean610();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager13 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        java.lang.Boolean boolean14 = serializedObjectSupporter0.deserializeObjectBoolean929();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager15 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager488();
        java.lang.Boolean boolean16 = serializedObjectSupporter0.deserializeObjectBoolean302();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "7440" + "'", str8, "7440");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager13);
        org.junit.Assert.assertEquals("'" + boolean14 + "' != '" + true + "'", boolean14, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager15);
        org.junit.Assert.assertEquals("'" + boolean16 + "' != '" + true + "'", boolean16, true);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1047();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean18();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString394();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean380();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean716();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "6877" + "'", str4, "6877");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager511();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager116();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager573();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString414();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean529();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager789();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager808();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString148();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString426();
        java.lang.Boolean boolean14 = serializedObjectSupporter0.deserializeObjectBoolean516();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager15 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1054();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager16 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager200();
        java.lang.Boolean boolean17 = serializedObjectSupporter0.deserializeObjectBoolean798();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager18 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager866();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "7440" + "'", str8, "7440");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2229" + "'", str12, "2229");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "8732" + "'", str13, "8732");
        org.junit.Assert.assertEquals("'" + boolean14 + "' != '" + true + "'", boolean14, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager15);
        org.junit.Assert.assertNotNull(deploymentEntityManager16);
        org.junit.Assert.assertEquals("'" + boolean17 + "' != '" + true + "'", boolean17, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager18);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean60();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean270();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager601();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean305();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString203();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString40();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString492();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2496" + "'", str6, "2496");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "449" + "'", str7, "449");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "11077" + "'", str8, "11077");
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString910();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString244();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager299();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean112();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager190();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean569();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString558();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean925();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11414" + "'", str3, "11414");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "3006" + "'", str4, "3006");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "433" + "'", str9, "433");
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager221();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean556();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString353();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean159();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean76();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "6139" + "'", str4, "6139");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean662();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager319();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString314();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean382();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager87();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString749();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager430();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5236" + "'", str5, "5236");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "7557" + "'", str8, "7557");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString201();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString203();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString330();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager558();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2488" + "'", str5, "2488");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2496" + "'", str6, "2496");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5616" + "'", str7, "5616");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean634();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean864();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager595();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean684();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean944();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean659();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString272();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString204();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4017" + "'", str13, "4017");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2501" + "'", str14, "2501");
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager255();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager574();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString77();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager422();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean531();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "984" + "'", str8, "984");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean634();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean864();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager595();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean1047();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString371();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager932();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager13 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager830();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager14 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager275();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "6542" + "'", str11, "6542");
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
        org.junit.Assert.assertNotNull(deploymentEntityManager13);
        org.junit.Assert.assertNotNull(deploymentEntityManager14);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean662();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString297();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString96();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager350();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString150();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean901();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4920" + "'", str4, "4920");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1336" + "'", str5, "1336");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2235" + "'", str7, "2235");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean662();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager239();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString712();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean789();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager9();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString373();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1061();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager688();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString804();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5894" + "'", str6, "5894");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "6581" + "'", str9, "6581");
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "9633" + "'", str12, "9633");
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager467();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString413();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean265();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean891();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager838();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean675();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString462();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "7429" + "'", str2, "7429");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10396" + "'", str7, "10396");
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager821();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean838();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager873();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean456();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean541();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager849();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean290();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString283();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4466" + "'", str11, "4466");
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1043();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString128();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager57();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean362();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2138" + "'", str6, "2138");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean668();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean490();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean526();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager597();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager821();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString679();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager890();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString588();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1049();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean28();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean439();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager482();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5244" + "'", str5, "5244");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1056" + "'", str7, "1056");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "9" + "'", str8, "9");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + false + "'", boolean9, false);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1060();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString28();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString265();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString108();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager550();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString645();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "312" + "'", str5, "312");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "3778" + "'", str6, "3778");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1758" + "'", str7, "1758");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2332" + "'", str9, "2332");
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean63();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean236();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString508();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean365();
        java.lang.Boolean boolean13 = serializedObjectSupporter0.deserializeObjectBoolean70();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "11381" + "'", str9, "11381");
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + true + "'", boolean13, true);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean952();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean850();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString782();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager574();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager993();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean440();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean592();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + false + "'", boolean5, false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9333" + "'", str6, "9333");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager980();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean920();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager434();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean634();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString263();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean498();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager845();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString755();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean857();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager13 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager90();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "3688" + "'", str8, "3688");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "7857" + "'", str11, "7857");
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager13);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager221();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean556();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString353();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString50();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "6139" + "'", str4, "6139");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "613" + "'", str5, "613");
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager821();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean838();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager873();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean456();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean541();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager849();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager877();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean1061();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString910();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString244();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager299();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean112();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager190();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean569();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean1025();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager53();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager456();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11414" + "'", str3, "11414");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "3006" + "'", str4, "3006");
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager821();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString679();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString451();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString321();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1045();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString645();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5244" + "'", str5, "5244");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10137" + "'", str6, "10137");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5425" + "'", str7, "5425");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10001" + "'", str8, "10001");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2332" + "'", str9, "2332");
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager821();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString679();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager890();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString588();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean532();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5244" + "'", str5, "5244");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1056" + "'", str7, "1056");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1059();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString599();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString459();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1366" + "'", str5, "1366");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10323" + "'", str6, "10323");
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager821();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean872();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString872();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean1020();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean542();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10862" + "'", str6, "10862");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean634();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString263();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean498();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager845();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString755();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean857();
        java.lang.Boolean boolean13 = serializedObjectSupporter0.deserializeObjectBoolean380();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString980();
        java.lang.Boolean boolean15 = serializedObjectSupporter0.deserializeObjectBoolean144();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager16 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager283();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "3688" + "'", str8, "3688");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "7857" + "'", str11, "7857");
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + true + "'", boolean13, true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "12422" + "'", str14, "12422");
        org.junit.Assert.assertEquals("'" + boolean15 + "' != '" + true + "'", boolean15, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager16);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean634();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean864();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString724();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString157();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager840();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager739();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString659();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager14 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager948();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager15 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager825();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager16 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager660();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "5996" + "'", str9, "5996");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2256" + "'", str10, "2256");
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2464" + "'", str13, "2464");
        org.junit.Assert.assertNotNull(deploymentEntityManager14);
        org.junit.Assert.assertNotNull(deploymentEntityManager15);
        org.junit.Assert.assertNotNull(deploymentEntityManager16);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager220();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager907();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString104();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager705();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean600();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean946();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString523();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean681();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1670" + "'", str6, "1670");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "11606" + "'", str10, "11606");
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager821();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString679();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager890();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager640();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager151();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString324();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean544();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5244" + "'", str5, "5244");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "5488" + "'", str9, "5488");
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager86();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager719();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager556();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString373();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager7();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString943();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "6581" + "'", str7, "6581");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "11927" + "'", str9, "11927");
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString733();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager721();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean47();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1040();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6544" + "'", str2, "6544");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean634();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString263();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean498();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager845();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString755();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean857();
        java.lang.Boolean boolean13 = serializedObjectSupporter0.deserializeObjectBoolean380();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString980();
        java.lang.Boolean boolean15 = serializedObjectSupporter0.deserializeObjectBoolean144();
        java.lang.String str16 = serializedObjectSupporter0.deserializeObjectString103();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "3688" + "'", str8, "3688");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "7857" + "'", str11, "7857");
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + true + "'", boolean13, true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "12422" + "'", str14, "12422");
        org.junit.Assert.assertEquals("'" + boolean15 + "' != '" + true + "'", boolean15, true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1648" + "'", str16, "1648");
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager292();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager45();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString717();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean232();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager281();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString742();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager286();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1001();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5933" + "'", str3, "5933");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "7115" + "'", str6, "7115");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "22816" + "'", str8, "22816");
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString298();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean521();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4928" + "'", str4, "4928");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + false + "'", boolean5, false);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager573();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString414();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean529();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager646();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean475();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean667();
        java.lang.Boolean boolean13 = serializedObjectSupporter0.deserializeObjectBoolean580();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager14 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager651();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager15 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager268();
        java.lang.String str16 = serializedObjectSupporter0.deserializeObjectString344();
        java.lang.Boolean boolean17 = serializedObjectSupporter0.deserializeObjectBoolean379();
        java.lang.String str18 = serializedObjectSupporter0.deserializeObjectString869();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "7440" + "'", str8, "7440");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + true + "'", boolean13, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager14);
        org.junit.Assert.assertNotNull(deploymentEntityManager15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "5940" + "'", str16, "5940");
        org.junit.Assert.assertEquals("'" + boolean17 + "' != '" + true + "'", boolean17, true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10812" + "'", str18, "10812");
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean662();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString297();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString96();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager350();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString150();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager747();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager298();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4920" + "'", str4, "4920");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1336" + "'", str5, "1336");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2235" + "'", str7, "2235");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1043();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString128();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager57();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean982();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString913();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager840();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString703();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager417();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2138" + "'", str6, "2138");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "11469" + "'", str9, "11469");
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "5787" + "'", str11, "5787");
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager5();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1059();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean1058();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString555();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager28();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "374" + "'", str6, "374");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString910();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString244();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString653();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean451();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean678();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString632();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString633();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager395();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11414" + "'", str3, "11414");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "3006" + "'", str4, "3006");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2398" + "'", str5, "2398");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2027" + "'", str8, "2027");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2041" + "'", str9, "2041");
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString745();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean381();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString78();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString19();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean206();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString719();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager13 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager258();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "7366" + "'", str7, "7366");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1010" + "'", str9, "1010");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "242" + "'", str10, "242");
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "5949" + "'", str12, "5949");
        org.junit.Assert.assertNotNull(deploymentEntityManager13);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean528();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString84();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString83();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1116" + "'", str3, "1116");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1090" + "'", str4, "1090");
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString390();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString180();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager414();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString811();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "6831" + "'", str4, "6831");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2405" + "'", str5, "2405");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "9803" + "'", str7, "9803");
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean662();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager239();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString223();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean837();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2638" + "'", str6, "2638");
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString733();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager570();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString263();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean1057();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager504();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString432();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean149();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6544" + "'", str2, "6544");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "3688" + "'", str4, "3688");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "9491" + "'", str7, "9491");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager821();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean838();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString274();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager216();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean13();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean96();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4085" + "'", str6, "4085");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString827();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean521();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager766();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10455" + "'", str2, "10455");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString161();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean995();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean517();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager456();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager871();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString122();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString715();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2281" + "'", str2, "2281");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2027" + "'", str7, "2027");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "5919" + "'", str8, "5919");
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString910();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString244();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean722();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean273();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean619();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11414" + "'", str3, "11414");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "3006" + "'", str4, "3006");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1043();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager65();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString65();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString933();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean75();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "781" + "'", str7, "781");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "11742" + "'", str8, "11742");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean519();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager7();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager401();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager573();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString414();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean712();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString326();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString434();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean832();
        java.lang.Boolean boolean13 = serializedObjectSupporter0.deserializeObjectBoolean998();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "7440" + "'", str8, "7440");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "5538" + "'", str10, "5538");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "9762" + "'", str11, "9762");
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + true + "'", boolean13, true);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean952();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean850();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString782();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager574();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager993();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean409();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager371();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString258();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean271();
        java.lang.Boolean boolean13 = serializedObjectSupporter0.deserializeObjectBoolean159();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + false + "'", boolean5, false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9333" + "'", str6, "9333");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3511" + "'", str11, "3511");
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + true + "'", boolean13, true);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString827();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString173();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager346();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean391();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString565();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager179();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager535();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean736();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager47();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10455" + "'", str2, "10455");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2376" + "'", str3, "2376");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "574" + "'", str6, "574");
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager573();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString414();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean529();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager789();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager808();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString148();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString426();
        java.lang.Boolean boolean14 = serializedObjectSupporter0.deserializeObjectBoolean516();
        java.lang.String str15 = serializedObjectSupporter0.deserializeObjectString715();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager16 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager40();
        java.lang.String str17 = serializedObjectSupporter0.deserializeObjectString602();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "7440" + "'", str8, "7440");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2229" + "'", str12, "2229");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "8732" + "'", str13, "8732");
        org.junit.Assert.assertEquals("'" + boolean14 + "' != '" + true + "'", boolean14, true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "5919" + "'", str15, "5919");
        org.junit.Assert.assertNotNull(deploymentEntityManager16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1385" + "'", str17, "1385");
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString617();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager732();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager705();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString92();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6544" + "'", str2, "6544");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1693" + "'", str3, "1693");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1263" + "'", str6, "1263");
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean634();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean864();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager202();
        java.lang.Boolean boolean10 = serializedObjectSupporter0.deserializeObjectBoolean683();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString816();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString905();
        java.lang.Boolean boolean13 = serializedObjectSupporter0.deserializeObjectBoolean394();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString605();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + true + "'", boolean10, true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10162" + "'", str11, "10162");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "11318" + "'", str12, "11318");
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + true + "'", boolean13, true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1418" + "'", str14, "1418");
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString717();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean232();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean183();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean238();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5933" + "'", str3, "5933");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1043();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager65();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString143();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean54();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean1039();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2214" + "'", str7, "2214");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean951();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString414();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager592();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "7440" + "'", str3, "7440");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString390();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString278();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager291();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString459();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager19();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "6831" + "'", str4, "6831");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4241" + "'", str5, "4241");
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10323" + "'", str7, "10323");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean662();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager319();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager239();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager919();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager473();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1019();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager743();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager904();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1279" + "'", str2, "1279");
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "62804" + "'", str8, "62804");
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager821();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean838();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager873();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean790();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager728();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString250();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager528();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean115();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager634();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager13 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager749();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager14 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager144();
        java.lang.String str15 = serializedObjectSupporter0.deserializeObjectString521();
        java.lang.String str16 = serializedObjectSupporter0.deserializeObjectString846();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3195" + "'", str9, "3195");
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
        org.junit.Assert.assertNotNull(deploymentEntityManager13);
        org.junit.Assert.assertNotNull(deploymentEntityManager14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "11600" + "'", str15, "11600");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10615" + "'", str16, "10615");
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString745();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean381();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString78();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager734();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1033();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager672();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "7366" + "'", str7, "7366");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1010" + "'", str9, "1010");
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "97804" + "'", str11, "97804");
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager478();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString312();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager221();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager372();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager500();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager323();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5204" + "'", str7, "5204");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean412();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager277();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager724();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager269();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager7);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertNotNull(deploymentEntityManager9);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString733();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager570();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString263();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean1057();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager504();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean128();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager463();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean430();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString499();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean424();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6544" + "'", str2, "6544");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "3688" + "'", str4, "3688");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "11191" + "'", str10, "11191");
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager945();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString745();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean381();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString78();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString19();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager11 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager365();
        java.lang.Boolean boolean12 = serializedObjectSupporter0.deserializeObjectBoolean917();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "7366" + "'", str7, "7366");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1010" + "'", str9, "1010");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "242" + "'", str10, "242");
        org.junit.Assert.assertNotNull(deploymentEntityManager11);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + true + "'", boolean12, true);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString151();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString168();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean661();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager40();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString782();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager997();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6544" + "'", str2, "6544");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2238" + "'", str3, "2238");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2357" + "'", str4, "2357");
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "9333" + "'", str7, "9333");
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager321();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean634();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1055();
        java.lang.Boolean boolean9 = serializedObjectSupporter0.deserializeObjectBoolean117();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertNotNull(deploymentEntityManager5);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager821();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean838();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager873();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean790();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager728();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString168();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager10 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager848();
        java.lang.Boolean boolean11 = serializedObjectSupporter0.deserializeObjectBoolean954();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager12 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager181();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11927" + "'", str2, "11927");
        org.junit.Assert.assertNotNull(deploymentEntityManager3);
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + true + "'", boolean5, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager6);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2357" + "'", str9, "2357");
        org.junit.Assert.assertNotNull(deploymentEntityManager10);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertNotNull(deploymentEntityManager12);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString827();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString173();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager346();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString411();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean450();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean908();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean218();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10455" + "'", str2, "10455");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2376" + "'", str3, "2376");
        org.junit.Assert.assertNotNull(deploymentEntityManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "7406" + "'", str5, "7406");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager1047();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean18();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean347();
        org.junit.Assert.assertNotNull(deploymentEntityManager1);
        org.junit.Assert.assertNotNull(deploymentEntityManager2);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }
}

