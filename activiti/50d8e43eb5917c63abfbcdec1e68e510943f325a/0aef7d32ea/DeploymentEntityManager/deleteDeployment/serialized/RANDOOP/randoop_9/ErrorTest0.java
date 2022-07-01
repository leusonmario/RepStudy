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
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter1 = deploymentEntityManager0.serializedObjectSupporter;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList3 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean385();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString425();
        java.lang.Boolean boolean3 = serializedObjectSupporter0.deserializeObjectBoolean445();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager4 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager207();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString930();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager6 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager426();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity8 = deploymentEntityManager6.findDeploymentById("2217");
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean319();
        java.lang.Boolean boolean2 = serializedObjectSupporter0.deserializeObjectBoolean768();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString861();
        java.lang.Boolean boolean4 = serializedObjectSupporter0.deserializeObjectBoolean1060();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager5 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager247();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity7 = deploymentEntityManager5.findLatestDeploymentByName("483");
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter serializedObjectSupporter0 = new org.activiti.engine.impl.persistence.entity.SerializedObjectSupporter();
        java.lang.Boolean boolean1 = serializedObjectSupporter0.deserializeObjectBoolean597();
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager2 = serializedObjectSupporter0.deserializeObjectDeploymentEntityManager416();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager2.deleteDeployment("10652", true);
    }
}

