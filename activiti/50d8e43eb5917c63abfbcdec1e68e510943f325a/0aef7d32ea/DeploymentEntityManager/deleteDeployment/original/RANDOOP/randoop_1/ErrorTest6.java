import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest6 {

    public static boolean debug = false;

    @Test
    public void test03001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03001");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity16 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test03002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03002");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity12 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test03003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03003");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList18 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03004");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList10 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test03005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03005");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity8 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test03006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03006");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList12 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03007");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity10 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test03008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03008");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity10 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test03009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03009");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", true);
    }

    @Test
    public void test03010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03010");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity17 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test03011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03011");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList15 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test03012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03012");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", false);
    }

    @Test
    public void test03013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03013");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity13 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test03014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03014");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList12 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03015");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity13 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test03016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03016");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity18 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test03017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03017");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity10 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test03018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03018");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList15 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test03019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03019");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity13 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test03020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03020");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity16 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test03021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03021");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList15 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03022");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity15 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test03023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03023");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList13 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03024");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", true);
    }

    @Test
    public void test03025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03025");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", true);
    }

    @Test
    public void test03026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03026");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity12 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test03027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03027");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", false);
    }

    @Test
    public void test03028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03028");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", false);
    }

    @Test
    public void test03029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03029");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", true);
    }

    @Test
    public void test03030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03030");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList19 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test03031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03031");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", true);
    }

    @Test
    public void test03032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03032");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList19 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03033");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList14 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test03034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03034");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", true);
    }

    @Test
    public void test03035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03035");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity15 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test03036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03036");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList12 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03037");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity10 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test03038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03038");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity11 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test03039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03039");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList17 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03040");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity8 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test03041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03041");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList15 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03042");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity17 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test03043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03043");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", true);
    }

    @Test
    public void test03044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03044");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity10 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test03045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03045");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList17 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03046");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList19 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03047");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity11 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test03048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03048");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList17 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test03049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03049");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", false);
    }

    @Test
    public void test03050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03050");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", true);
    }

    @Test
    public void test03051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03051");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList17 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test03052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03052");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList10 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03053");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity14 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test03054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03054");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", true);
    }

    @Test
    public void test03055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03055");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList14 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test03056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03056");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity12 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test03057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03057");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList8 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03058");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity17 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test03059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03059");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity16 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test03060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03060");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity14 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test03061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03061");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList17 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test03062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03062");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity16 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test03063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03063");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", true);
    }

    @Test
    public void test03064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03064");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", false);
    }

    @Test
    public void test03065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03065");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", true);
    }

    @Test
    public void test03066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03066");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList17 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03067");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", true);
    }

    @Test
    public void test03068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03068");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", true);
    }

    @Test
    public void test03069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03069");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity12 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test03070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03070");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity10 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test03071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03071");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity18 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test03072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03072");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", true);
    }

    @Test
    public void test03073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03073");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity11 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test03074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03074");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", false);
    }

    @Test
    public void test03075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03075");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", true);
    }

    @Test
    public void test03076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03076");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", false);
    }

    @Test
    public void test03077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03077");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList15 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test03078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03078");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", true);
    }

    @Test
    public void test03079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03079");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", true);
    }

    @Test
    public void test03080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03080");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", true);
    }

    @Test
    public void test03081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03081");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity16 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test03082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03082");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity14 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test03083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03083");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList14 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test03084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03084");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList20 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03085");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity14 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test03086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03086");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", true);
    }

    @Test
    public void test03087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03087");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity10 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test03088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03088");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList17 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03089");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList18 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test03090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03090");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity12 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test03091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03091");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity16 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test03092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03092");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity16 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test03093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03093");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity17 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test03094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03094");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity17 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test03095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03095");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity20 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test03096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03096");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", true);
    }

    @Test
    public void test03097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03097");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity10 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test03098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03098");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", true);
    }

    @Test
    public void test03099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03099");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", false);
    }

    @Test
    public void test03100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03100");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", true);
    }

    @Test
    public void test03101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03101");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity10 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test03102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03102");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", true);
    }

    @Test
    public void test03103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03103");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList14 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03104");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList15 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test03105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03105");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList11 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test03106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03106");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList13 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03107");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity16 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test03108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03108");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity14 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test03109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03109");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity18 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test03110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03110");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList18 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03111");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList12 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test03112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03112");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", false);
    }

    @Test
    public void test03113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03113");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", false);
    }

    @Test
    public void test03114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03114");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity13 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test03115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03115");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity18 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test03116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03116");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity16 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test03117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03117");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", false);
    }

    @Test
    public void test03118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03118");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList14 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03119");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList16 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test03120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03120");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity14 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test03121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03121");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", false);
    }

    @Test
    public void test03122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03122");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity17 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test03123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03123");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", false);
    }

    @Test
    public void test03124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03124");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity10 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test03125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03125");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity11 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test03126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03126");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity10 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test03127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03127");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity20 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test03128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03128");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity17 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test03129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03129");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity18 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test03130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03130");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity12 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test03131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03131");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", true);
    }

    @Test
    public void test03132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03132");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity11 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test03133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03133");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", true);
    }

    @Test
    public void test03134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03134");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity11 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test03135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03135");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity11 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test03136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03136");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity12 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test03137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03137");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity11 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test03138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03138");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity12 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test03139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03139");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity13 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test03140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03140");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", false);
    }

    @Test
    public void test03141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03141");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity13 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test03142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03142");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", true);
    }

    @Test
    public void test03143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03143");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity17 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test03144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03144");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", true);
    }

    @Test
    public void test03145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03145");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity13 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test03146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03146");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", true);
    }

    @Test
    public void test03147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03147");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity12 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test03148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03148");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList14 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03149");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList9 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03150");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", true);
    }

    @Test
    public void test03151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03151");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", true);
    }

    @Test
    public void test03152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03152");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity20 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test03153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03153");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList11 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test03154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03154");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", false);
    }

    @Test
    public void test03155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03155");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", true);
    }

    @Test
    public void test03156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03156");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList19 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03157");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity8 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test03158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03158");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", false);
    }

    @Test
    public void test03159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03159");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList15 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test03160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03160");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity18 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test03161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03161");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity14 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test03162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03162");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity16 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test03163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03163");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity17 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test03164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03164");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity15 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test03165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03165");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList10 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test03166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03166");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", false);
    }

    @Test
    public void test03167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03167");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity13 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test03168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03168");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", false);
    }

    @Test
    public void test03169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03169");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", false);
    }

    @Test
    public void test03170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03170");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity16 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test03171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03171");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList10 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test03172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03172");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", true);
    }

    @Test
    public void test03173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03173");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity11 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test03174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03174");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList15 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test03175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03175");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity15 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test03176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03176");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", true);
    }

    @Test
    public void test03177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03177");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", false);
    }

    @Test
    public void test03178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03178");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity15 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test03179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03179");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity13 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test03180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03180");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", true);
    }

    @Test
    public void test03181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03181");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity12 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test03182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03182");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity18 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test03183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03183");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity18 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test03184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03184");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", true);
    }

    @Test
    public void test03185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03185");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", true);
    }

    @Test
    public void test03186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03186");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", false);
    }

    @Test
    public void test03187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03187");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity9 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test03188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03188");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", true);
    }

    @Test
    public void test03189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03189");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList17 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test03190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03190");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList11 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test03191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03191");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList13 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03192");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity13 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test03193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03193");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity14 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test03194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03194");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList19 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03195");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", false);
    }

    @Test
    public void test03196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03196");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", false);
    }

    @Test
    public void test03197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03197");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList16 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03198");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity19 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test03199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03199");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList9 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03200");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", true);
    }

    @Test
    public void test03201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03201");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity11 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test03202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03202");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList17 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test03203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03203");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList13 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test03204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03204");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity17 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test03205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03205");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList17 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test03206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03206");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList8 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test03207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03207");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity13 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test03208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03208");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", false);
    }

    @Test
    public void test03209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03209");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity14 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test03210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03210");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity14 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test03211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03211");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", true);
    }

    @Test
    public void test03212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03212");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", true);
    }

    @Test
    public void test03213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03213");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", false);
    }

    @Test
    public void test03214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03214");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList15 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03215");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity14 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test03216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03216");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity8 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test03217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03217");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList14 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03218");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity16 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test03219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03219");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity8 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test03220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03220");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity9 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test03221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03221");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity16 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test03222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03222");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity9 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test03223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03223");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", true);
    }

    @Test
    public void test03224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03224");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", false);
    }

    @Test
    public void test03225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03225");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList12 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test03226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03226");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", false);
    }

    @Test
    public void test03227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03227");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList11 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test03228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03228");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity18 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test03229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03229");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity12 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test03230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03230");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList15 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03231");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity11 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test03232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03232");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity11 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test03233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03233");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity17 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test03234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03234");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity16 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test03235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03235");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList15 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test03236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03236");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList16 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test03237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03237");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", false);
    }

    @Test
    public void test03238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03238");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList15 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03239");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity13 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test03240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03240");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", true);
    }

    @Test
    public void test03241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03241");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity13 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test03242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03242");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity17 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test03243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03243");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", true);
    }

    @Test
    public void test03244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03244");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity17 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test03245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03245");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity8 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test03246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03246");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList15 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03247");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity16 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test03248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03248");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity17 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test03249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03249");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", false);
    }

    @Test
    public void test03250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03250");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", true);
    }

    @Test
    public void test03251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03251");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity12 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test03252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03252");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity9 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test03253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03253");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList11 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03254");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity18 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test03255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03255");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", false);
    }

    @Test
    public void test03256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03256");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity20 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test03257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03257");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity12 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test03258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03258");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", false);
    }

    @Test
    public void test03259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03259");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity11 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test03260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03260");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity15 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test03261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03261");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity15 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test03262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03262");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity16 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test03263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03263");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity14 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test03264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03264");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity16 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test03265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03265");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", true);
    }

    @Test
    public void test03266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03266");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity14 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test03267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03267");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity12 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test03268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03268");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", false);
    }

    @Test
    public void test03269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03269");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity10 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test03270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03270");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", true);
    }

    @Test
    public void test03271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03271");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList15 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03272");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", false);
    }

    @Test
    public void test03273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03273");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList16 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test03274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03274");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity15 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test03275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03275");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity11 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test03276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03276");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", false);
    }

    @Test
    public void test03277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03277");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList8 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test03278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03278");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity12 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test03279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03279");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity12 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test03280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03280");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity15 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test03281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03281");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity17 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test03282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03282");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity15 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test03283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03283");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList14 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03284");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", false);
    }

    @Test
    public void test03285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03285");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", false);
    }

    @Test
    public void test03286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03286");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList14 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03287");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList13 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03288");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", true);
    }

    @Test
    public void test03289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03289");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity10 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test03290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03290");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", false);
    }

    @Test
    public void test03291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03291");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity18 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test03292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03292");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", true);
    }

    @Test
    public void test03293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03293");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity15 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test03294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03294");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", true);
    }

    @Test
    public void test03295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03295");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList13 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03296");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList14 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03297");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity20 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test03298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03298");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", false);
    }

    @Test
    public void test03299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03299");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", false);
    }

    @Test
    public void test03300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03300");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity18 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test03301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03301");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity16 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test03302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03302");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList9 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03303");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity15 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test03304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03304");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity9 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test03305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03305");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", true);
    }

    @Test
    public void test03306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03306");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity11 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test03307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03307");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity16 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test03308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03308");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", false);
    }

    @Test
    public void test03309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03309");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", false);
    }

    @Test
    public void test03310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03310");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList14 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03311");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList16 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test03312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03312");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList11 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03313");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", true);
    }

    @Test
    public void test03314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03314");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", true);
    }

    @Test
    public void test03315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03315");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", true);
    }

    @Test
    public void test03316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03316");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList15 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test03317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03317");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity12 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test03318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03318");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList14 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test03319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03319");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity17 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test03320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03320");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity11 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test03321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03321");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity14 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test03322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03322");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity14 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test03323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03323");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity13 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test03324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03324");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity11 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test03325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03325");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity13 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test03326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03326");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", false);
    }

    @Test
    public void test03327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03327");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList18 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test03328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03328");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity9 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test03329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03329");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", true);
    }

    @Test
    public void test03330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03330");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity15 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test03331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03331");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList15 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test03332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03332");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", false);
    }

    @Test
    public void test03333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03333");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", false);
    }

    @Test
    public void test03334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03334");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity13 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test03335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03335");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity17 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test03336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03336");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", true);
    }

    @Test
    public void test03337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03337");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity18 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test03338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03338");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", true);
    }

    @Test
    public void test03339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03339");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", true);
    }

    @Test
    public void test03340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03340");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", true);
    }

    @Test
    public void test03341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03341");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", false);
    }

    @Test
    public void test03342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03342");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity17 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test03343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03343");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList19 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03344");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity11 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test03345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03345");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList12 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test03346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03346");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity21 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test03347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03347");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity20 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test03348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03348");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", true);
    }

    @Test
    public void test03349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03349");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", false);
    }

    @Test
    public void test03350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03350");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList18 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test03351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03351");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList15 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03352");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity14 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test03353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03353");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", true);
    }

    @Test
    public void test03354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03354");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", true);
    }

    @Test
    public void test03355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03355");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity13 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test03356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03356");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList19 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test03357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03357");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList11 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03358");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList7 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test03359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03359");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity12 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test03360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03360");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", true);
    }

    @Test
    public void test03361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03361");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList18 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03362");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList11 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03363");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity11 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test03364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03364");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity11 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test03365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03365");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList13 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03366");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity12 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test03367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03367");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity15 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test03368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03368");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList17 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test03369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03369");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity10 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test03370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03370");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList13 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test03371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03371");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", false);
    }

    @Test
    public void test03372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03372");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList8 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03373");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity13 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test03374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03374");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity11 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test03375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03375");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity9 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test03376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03376");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList8 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test03377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03377");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList14 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03378");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity15 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test03379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03379");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList12 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test03380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03380");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity20 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test03381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03381");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity12 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test03382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03382");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity16 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test03383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03383");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity15 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test03384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03384");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList16 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03385");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", false);
    }

    @Test
    public void test03386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03386");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity17 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test03387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03387");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity9 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test03388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03388");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList16 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test03389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03389");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity14 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test03390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03390");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity13 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test03391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03391");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity11 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test03392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03392");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity11 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test03393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03393");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity15 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test03394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03394");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList12 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03395");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity16 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test03396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03396");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity17 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test03397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03397");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList9 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test03398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03398");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity17 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test03399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03399");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList13 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03400");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity19 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test03401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03401");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity6 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test03402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03402");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList12 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test03403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03403");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", true);
    }

    @Test
    public void test03404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03404");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList10 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03405");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList15 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03406");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList11 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test03407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03407");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity12 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test03408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03408");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity16 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test03409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03409");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList11 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test03410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03410");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", false);
    }

    @Test
    public void test03411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03411");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity14 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test03412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03412");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList12 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03413");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity8 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test03414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03414");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity13 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test03415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03415");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity16 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test03416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03416");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", true);
    }

    @Test
    public void test03417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03417");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", true);
    }

    @Test
    public void test03418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03418");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity15 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test03419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03419");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", false);
    }

    @Test
    public void test03420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03420");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity15 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test03421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03421");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity17 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test03422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03422");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", false);
    }

    @Test
    public void test03423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03423");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", false);
    }

    @Test
    public void test03424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03424");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", true);
    }

    @Test
    public void test03425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03425");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity12 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test03426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03426");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList11 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test03427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03427");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity14 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test03428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03428");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity16 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test03429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03429");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList11 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03430");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", false);
    }

    @Test
    public void test03431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03431");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList21 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03432");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity10 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test03433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03433");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", true);
    }

    @Test
    public void test03434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03434");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity18 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test03435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03435");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", false);
    }

    @Test
    public void test03436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03436");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", false);
    }

    @Test
    public void test03437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03437");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList14 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test03438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03438");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity15 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test03439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03439");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity7 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test03440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03440");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity13 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test03441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03441");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList12 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03442");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList12 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03443");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", true);
    }

    @Test
    public void test03444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03444");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList15 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03445");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList13 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test03446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03446");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity11 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test03447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03447");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity13 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test03448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03448");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity16 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test03449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03449");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity8 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test03450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03450");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity17 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test03451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03451");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList13 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03452");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList16 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test03453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03453");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity17 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test03454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03454");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList15 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03455");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity13 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test03456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03456");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", true);
    }

    @Test
    public void test03457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03457");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList9 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test03458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03458");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity16 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test03459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03459");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList15 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test03460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03460");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity16 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test03461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03461");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList12 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test03462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03462");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity14 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test03463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03463");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", false);
    }

    @Test
    public void test03464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03464");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", true);
    }

    @Test
    public void test03465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03465");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", true);
    }

    @Test
    public void test03466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03466");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity17 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test03467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03467");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList11 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test03468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03468");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity19 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test03469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03469");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", true);
    }

    @Test
    public void test03470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03470");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity13 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test03471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03471");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity12 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test03472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03472");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", true);
    }

    @Test
    public void test03473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03473");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", true);
    }

    @Test
    public void test03474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03474");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity9 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test03475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03475");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", true);
    }

    @Test
    public void test03476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03476");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList12 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03477");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", false);
    }

    @Test
    public void test03478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03478");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList14 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test03479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03479");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList13 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03480");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", true);
    }

    @Test
    public void test03481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03481");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList17 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test03482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03482");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", true);
    }

    @Test
    public void test03483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03483");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", true);
    }

    @Test
    public void test03484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03484");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList13 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test03485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03485");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", false);
    }

    @Test
    public void test03486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03486");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList16 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03487");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", false);
    }

    @Test
    public void test03488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03488");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList16 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03489");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList15 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03490");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity13 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test03491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03491");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", false);
    }

    @Test
    public void test03492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03492");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList17 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03493");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList15 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test03494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03494");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity18 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test03495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03495");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity14 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test03496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03496");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity11 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test03497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03497");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", false);
    }

    @Test
    public void test03498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03498");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", true);
    }

    @Test
    public void test03499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03499");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity18 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test03500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03500");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity13 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }
}

