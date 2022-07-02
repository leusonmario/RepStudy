import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString60();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager206();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager4.deleteDeployment("304", true);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString184();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager145();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity6 = deploymentEntityManager4.findDeploymentById("");
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager299();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager2.deleteDeployment("5021", true);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList11 = deploymentEntityManager9.getDeploymentResourceNames("2105");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean272();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString66();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString98();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager22();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager146();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager242();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList9 = deploymentEntityManager7.getDeploymentResourceNames("2208");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager299();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager331();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity5 = deploymentEntityManager3.findDeploymentById("4511");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString184();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager145();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity6 = deploymentEntityManager4.findLatestDeploymentByName("275");
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean4();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString163();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager335();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager6.deleteDeployment("5450", false);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString115();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean208();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean348();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean263();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean17();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager66();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity10 = deploymentEntityManager8.findLatestDeploymentByName("52");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity15 = deploymentEntityManager13.findLatestDeploymentByName("861");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean272();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString66();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString98();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString328();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean17();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean195();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager56();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity10 = deploymentEntityManager8.findLatestDeploymentByName("2376");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList13 = deploymentEntityManager11.getDeploymentResourceNames("3733");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean48();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString160();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean264();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean223();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString159();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean322();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString200();
        java.lang.Boolean boolean8 = serializedObjectSupporter0.deserializeObjectBoolean328();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager343();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity11 = deploymentEntityManager9.findDeploymentById("2778");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean170();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString58();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean177();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString239();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString13();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager22();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager6.deleteDeployment("5400", false);
    }
}

