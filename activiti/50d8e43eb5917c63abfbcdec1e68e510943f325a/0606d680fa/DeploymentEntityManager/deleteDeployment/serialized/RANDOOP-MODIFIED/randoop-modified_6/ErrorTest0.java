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
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean952();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager478();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager2.deleteDeployment("hi!", false);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean846();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager722();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString263();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString686();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString245();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager907();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager9 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager640();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList11 = deploymentEntityManager9.getDeploymentResourceNames("");
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean412();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean753();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString223();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString227();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager206();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity7 = deploymentEntityManager5.findDeploymentById("2442");
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager1 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager475();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString594();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString733();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean55();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager964();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager850();
        java.lang.Boolean boolean7 = serializedObjectSupporter0.deserializeObjectBoolean801();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager8 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager919();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity10 = deploymentEntityManager8.findLatestDeploymentByName("789");
    }
}

