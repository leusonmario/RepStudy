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
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager1.deleteDeployment("hi!", false);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString390();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString278();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager291();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList8 = deploymentEntityManager6.getDeploymentResourceNames("");
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager821();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString679();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager890();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity8 = deploymentEntityManager6.findDeploymentById("10620");
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager720();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager378();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager255();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager658();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity9 = deploymentEntityManager7.findLatestDeploymentByName("888");
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString943();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager820();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager821();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean838();
        java.lang.Boolean boolean6 = serializedObjectSupporter0.deserializeObjectBoolean705();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager543();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager406();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager8.deleteDeployment("7644", true);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager368();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager3 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean952();
        java.lang.Boolean boolean5 = serializedObjectSupporter0.deserializeObjectBoolean850();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString782();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager7 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager574();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager644();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity10 = deploymentEntityManager8.findDeploymentById("256");
    }
}

