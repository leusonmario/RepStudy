import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest17 {

    public static boolean debug = false;

    @Test
    public void test08501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08501");
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
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", false);
    }

    @Test
    public void test08502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08502");
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
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity18 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test08503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08503");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
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
    public void test08504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08504");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity15 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test08505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08505");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity14 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test08506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08506");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity13 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test08507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08507");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", true);
    }

    @Test
    public void test08508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08508");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", false);
    }

    @Test
    public void test08509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08509");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", false);
    }

    @Test
    public void test08510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08510");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity16 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test08511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08511");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity19 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test08512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08512");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity12 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08513");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity17 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test08514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08514");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", true);
    }

    @Test
    public void test08515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08515");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity23 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test08516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08516");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity15 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test08517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08517");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList16 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test08518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08518");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity16 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08519");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", false);
    }

    @Test
    public void test08520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08520");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity12 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test08521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08521");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList5 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test08522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08522");
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
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity20 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test08523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08523");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList15 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test08524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08524");
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
        deploymentEntityManager0.deleteDeployment("hi!", true);
    }

    @Test
    public void test08525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08525");
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
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList20 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test08526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08526");
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
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity21 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test08527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08527");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity14 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test08528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08528");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity17 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test08529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08529");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity17 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test08530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08530");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList15 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test08531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08531");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList17 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test08532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08532");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", true);
    }

    @Test
    public void test08533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08533");
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
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList15 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test08534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08534");
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
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", true);
    }

    @Test
    public void test08535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08535");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", false);
    }

    @Test
    public void test08536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08536");
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
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity15 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08537");
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
        java.util.List<java.lang.String> strList13 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test08538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08538");
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
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", false);
    }

    @Test
    public void test08539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08539");
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
        java.util.List<java.lang.String> strList19 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test08540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08540");
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
        deploymentEntityManager0.deleteDeployment("", false);
    }

    @Test
    public void test08541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08541");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity15 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test08542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08542");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity15 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test08543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08543");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", false);
    }

    @Test
    public void test08544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08544");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity14 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08545");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList21 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test08546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08546");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity10 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test08547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08547");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity16 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08548");
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
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity18 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08549");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", false);
    }

    @Test
    public void test08550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08550");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity15 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test08551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08551");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity18 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08552");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", false);
    }

    @Test
    public void test08553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08553");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity14 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08554");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity19 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08555");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity16 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test08556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08556");
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
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList17 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test08557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08557");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity17 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test08558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08558");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList20 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test08559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08559");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity19 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test08560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08560");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList20 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test08561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08561");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity13 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test08562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08562");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity15 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test08563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08563");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity22 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test08564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08564");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", false);
    }

    @Test
    public void test08565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08565");
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
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList15 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test08566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08566");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity23 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test08567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08567");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity13 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test08568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08568");
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
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", false);
    }

    @Test
    public void test08569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08569");
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
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity18 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08570");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity16 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test08571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08571");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList15 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test08572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08572");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity24 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test08573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08573");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity14 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test08574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08574");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", false);
    }

    @Test
    public void test08575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08575");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList18 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test08576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08576");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList19 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test08577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08577");
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
        deploymentEntityManager0.deleteDeployment("", false);
    }

    @Test
    public void test08578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08578");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", true);
    }

    @Test
    public void test08579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08579");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity13 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08580");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity16 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08581");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList20 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test08582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08582");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity19 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test08583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08583");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity18 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test08584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08584");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity19 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08585");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity16 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test08586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08586");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList16 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test08587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08587");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity14 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test08588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08588");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity16 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test08589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08589");
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
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity17 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08590");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList20 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test08591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08591");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity17 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test08592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08592");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity21 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test08593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08593");
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
    public void test08594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08594");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity23 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test08595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08595");
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
        deploymentEntityManager0.deleteDeployment("hi!", false);
    }

    @Test
    public void test08596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08596");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity14 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08597");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity20 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test08598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08598");
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
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList12 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test08599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08599");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity20 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08600");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity16 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test08601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08601");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity12 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test08602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08602");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity18 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test08603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08603");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity19 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08604");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity14 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test08605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08605");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList13 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test08606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08606");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity18 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test08607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08607");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity20 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test08608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08608");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", false);
    }

    @Test
    public void test08609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08609");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList17 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test08610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08610");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity10 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08611");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity12 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test08612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08612");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", true);
    }

    @Test
    public void test08613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08613");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity19 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08614");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity11 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test08615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08615");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity21 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08616");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
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
        java.util.List<java.lang.String> strList13 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test08617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08617");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity20 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test08618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08618");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity19 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test08619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08619");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity17 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test08620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08620");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", false);
    }

    @Test
    public void test08621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08621");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity16 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test08622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08622");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList17 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test08623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08623");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity13 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08624");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", false);
    }

    @Test
    public void test08625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08625");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity15 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test08626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08626");
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
        java.util.List<java.lang.String> strList10 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test08627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08627");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity12 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test08628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08628");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity17 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test08629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08629");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", false);
    }

    @Test
    public void test08630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08630");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity10 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08631");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", false);
    }

    @Test
    public void test08632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08632");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList8 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test08633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08633");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", false);
    }

    @Test
    public void test08634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08634");
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
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", false);
    }

    @Test
    public void test08635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08635");
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
        deploymentEntityManager0.flush();
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
    public void test08636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08636");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList18 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test08637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08637");
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
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity17 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test08638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08638");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity13 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test08639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08639");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", true);
    }

    @Test
    public void test08640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08640");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity14 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08641");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity17 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test08642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08642");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", false);
    }

    @Test
    public void test08643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08643");
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
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList14 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test08644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08644");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", true);
    }

    @Test
    public void test08645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08645");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity19 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test08646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08646");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity14 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08647");
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
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList15 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test08648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08648");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList18 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test08649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08649");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity15 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08650");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity16 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test08651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08651");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", true);
    }

    @Test
    public void test08652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08652");
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
        java.util.List<java.lang.String> strList13 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test08653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08653");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity11 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test08654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08654");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", false);
    }

    @Test
    public void test08655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08655");
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
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", false);
    }

    @Test
    public void test08656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08656");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity15 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test08657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08657");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList17 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test08658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08658");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity13 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08659");
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
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList15 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test08660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08660");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity8 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test08661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08661");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", true);
    }

    @Test
    public void test08662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08662");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity18 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08663");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity17 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test08664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08664");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList13 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test08665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08665");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity15 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test08666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08666");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
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
        java.util.List<java.lang.String> strList12 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test08667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08667");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList12 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test08668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08668");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity16 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08669");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList23 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test08670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08670");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity15 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08671");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList16 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test08672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08672");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity18 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test08673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08673");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList20 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test08674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08674");
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
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity16 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test08675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08675");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
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
    public void test08676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08676");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity11 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08677");
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
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity15 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08678");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity23 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08679");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", false);
    }

    @Test
    public void test08680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08680");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", false);
    }

    @Test
    public void test08681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08681");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity15 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test08682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08682");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity7 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test08683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08683");
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
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity13 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test08684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08684");
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
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", true);
    }

    @Test
    public void test08685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08685");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity10 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test08686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08686");
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
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity19 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08687");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity14 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test08688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08688");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList17 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test08689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08689");
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
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList18 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test08690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08690");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity16 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08691");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity23 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test08692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08692");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity5 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test08693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08693");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList15 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test08694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08694");
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
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", true);
    }

    @Test
    public void test08695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08695");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity12 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test08696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08696");
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
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity19 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test08697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08697");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity17 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test08698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08698");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", false);
    }

    @Test
    public void test08699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08699");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
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
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity14 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test08700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08700");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity17 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08701");
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
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList16 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test08702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08702");
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
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", true);
    }

    @Test
    public void test08703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08703");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", false);
    }

    @Test
    public void test08704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08704");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity24 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test08705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08705");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
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
        java.util.List<java.lang.String> strList12 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test08706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08706");
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
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", false);
    }

    @Test
    public void test08707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08707");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
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
        deploymentEntityManager0.deleteDeployment("", false);
    }

    @Test
    public void test08708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08708");
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
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity16 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test08709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08709");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity18 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test08710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08710");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity13 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08711");
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
        deploymentEntityManager0.deleteDeployment("", true);
    }

    @Test
    public void test08712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08712");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity10 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test08713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08713");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity19 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test08714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08714");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList17 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test08715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08715");
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
        deploymentEntityManager0.deleteDeployment("", true);
    }

    @Test
    public void test08716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08716");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity15 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test08717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08717");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity9 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test08718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08718");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity22 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test08719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08719");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity17 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test08720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08720");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList20 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test08721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08721");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList18 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test08722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08722");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity16 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test08723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08723");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList15 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test08724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08724");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity15 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08725");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList17 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test08726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08726");
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
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity20 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test08727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08727");
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
        java.util.List<java.lang.String> strList12 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test08728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08728");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity18 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test08729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08729");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity19 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test08730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08730");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList18 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test08731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08731");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity14 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test08732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08732");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList21 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test08733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08733");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity14 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test08734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08734");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity19 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test08735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08735");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity18 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08736");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity16 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test08737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08737");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
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
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList13 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test08738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08738");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList18 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test08739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08739");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", true);
    }

    @Test
    public void test08740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08740");
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
        deploymentEntityManager0.deleteDeployment("", true);
    }

    @Test
    public void test08741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08741");
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
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList15 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test08742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08742");
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
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", false);
    }

    @Test
    public void test08743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08743");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList15 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test08744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08744");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList18 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test08745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08745");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity17 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test08746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08746");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList20 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test08747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08747");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity20 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08748");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", false);
    }

    @Test
    public void test08749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08749");
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
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", true);
    }

    @Test
    public void test08750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08750");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity16 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test08751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08751");
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
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity14 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08752");
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
        deploymentEntityManager0.deleteDeployment("", true);
    }

    @Test
    public void test08753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08753");
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
    public void test08754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08754");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity16 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test08755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08755");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity15 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test08756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08756");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList14 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test08757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08757");
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
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList16 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test08758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08758");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList17 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test08759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08759");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity13 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08760");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity13 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test08761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08761");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity21 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test08762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08762");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList13 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test08763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08763");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", true);
    }

    @Test
    public void test08764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08764");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity15 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test08765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08765");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", true);
    }

    @Test
    public void test08766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08766");
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
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity21 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test08767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08767");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity19 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08768");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", false);
    }

    @Test
    public void test08769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08769");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity15 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08770");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList17 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test08771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08771");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", false);
    }

    @Test
    public void test08772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08772");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity17 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test08773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08773");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity17 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test08774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08774");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList21 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test08775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08775");
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
        deploymentEntityManager0.deleteDeployment("hi!", true);
    }

    @Test
    public void test08776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08776");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList10 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test08777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08777");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", false);
    }

    @Test
    public void test08778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08778");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity10 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08779");
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
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity19 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08780");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity14 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test08781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08781");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity14 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test08782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08782");
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
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity12 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08783");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity15 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test08784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08784");
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
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", true);
    }

    @Test
    public void test08785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08785");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList16 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test08786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08786");
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
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity17 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test08787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08787");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity21 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test08788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08788");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", false);
    }

    @Test
    public void test08789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08789");
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
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList16 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test08790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08790");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
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
    public void test08791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08791");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity22 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test08792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08792");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity17 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test08793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08793");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList14 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test08794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08794");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity13 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test08795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08795");
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
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList13 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test08796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08796");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList14 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test08797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08797");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList24 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test08798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08798");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList20 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test08799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08799");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity21 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test08800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08800");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", false);
    }

    @Test
    public void test08801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08801");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList14 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test08802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08802");
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
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity15 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test08803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08803");
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
        deploymentEntityManager0.deleteDeployment("hi!", false);
    }

    @Test
    public void test08804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08804");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity14 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test08805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08805");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity14 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test08806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08806");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity18 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08807");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity13 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test08808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08808");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList20 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test08809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08809");
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
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity14 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test08810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08810");
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
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity16 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08811");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", true);
    }

    @Test
    public void test08812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08812");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity18 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test08813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08813");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity16 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test08814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08814");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
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
    public void test08815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08815");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList17 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test08816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08816");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity11 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08817");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
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
    public void test08818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08818");
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
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", true);
    }

    @Test
    public void test08819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08819");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList19 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test08820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08820");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
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
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", true);
    }

    @Test
    public void test08821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08821");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList16 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test08822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08822");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", false);
    }

    @Test
    public void test08823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08823");
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
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList13 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test08824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08824");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity18 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08825");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity15 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test08826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08826");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity18 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test08827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08827");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList14 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test08828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08828");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", true);
    }

    @Test
    public void test08829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08829");
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
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList15 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test08830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08830");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity9 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08831");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
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
    public void test08832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08832");
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
        deploymentEntityManager0.deleteDeployment("hi!", true);
    }

    @Test
    public void test08833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08833");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList7 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test08834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08834");
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
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", true);
    }

    @Test
    public void test08835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08835");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", false);
    }

    @Test
    public void test08836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08836");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity15 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08837");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", true);
    }

    @Test
    public void test08838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08838");
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
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList18 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test08839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08839");
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
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity18 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test08840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08840");
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
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity15 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test08841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08841");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity17 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test08842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08842");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList12 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test08843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08843");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity15 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test08844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08844");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity14 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08845");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity13 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test08846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08846");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity20 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test08847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08847");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity17 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test08848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08848");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity16 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test08849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08849");
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
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity17 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test08850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08850");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity13 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test08851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08851");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
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
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity13 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test08852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08852");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity13 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test08853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08853");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", true);
    }

    @Test
    public void test08854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08854");
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
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity18 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08855");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList15 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test08856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08856");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity20 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test08857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08857");
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
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList19 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test08858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08858");
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
        deploymentEntityManager0.deleteDeployment("hi!", false);
    }

    @Test
    public void test08859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08859");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", false);
    }

    @Test
    public void test08860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08860");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity13 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test08861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08861");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
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
        java.util.List<java.lang.String> strList12 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test08862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08862");
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
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity17 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test08863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08863");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", false);
    }

    @Test
    public void test08864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08864");
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
        deploymentEntityManager0.deleteDeployment("", false);
    }

    @Test
    public void test08865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08865");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList18 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test08866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08866");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList9 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test08867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08867");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList16 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test08868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08868");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", false);
    }

    @Test
    public void test08869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08869");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity20 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test08870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08870");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList14 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test08871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08871");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", false);
    }

    @Test
    public void test08872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08872");
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
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity17 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08873");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity16 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test08874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08874");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList7 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test08875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08875");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList23 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test08876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08876");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", false);
    }

    @Test
    public void test08877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08877");
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
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity12 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test08878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08878");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity13 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test08879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08879");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity15 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08880");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity19 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08881");
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
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList12 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test08882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08882");
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
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity14 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test08883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08883");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity21 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test08884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08884");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity18 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08885");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity20 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test08886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08886");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity19 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test08887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08887");
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
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList19 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test08888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08888");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
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
        deploymentEntityManager0.deleteDeployment("hi!", false);
    }

    @Test
    public void test08889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08889");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList13 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test08890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08890");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList12 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test08891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08891");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", true);
    }

    @Test
    public void test08892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08892");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity15 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test08893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08893");
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
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", false);
    }

    @Test
    public void test08894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08894");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity18 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test08895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08895");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity15 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08896");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", false);
    }

    @Test
    public void test08897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08897");
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
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", false);
    }

    @Test
    public void test08898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08898");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity11 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08899");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", false);
    }

    @Test
    public void test08900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08900");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", false);
    }

    @Test
    public void test08901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08901");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList13 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test08902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08902");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity20 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08903");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", false);
    }

    @Test
    public void test08904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08904");
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
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity15 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test08905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08905");
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
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList18 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test08906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08906");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity19 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test08907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08907");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity18 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08908");
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
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList14 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test08909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08909");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
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
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity13 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08910");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity16 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test08911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08911");
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
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList14 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test08912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08912");
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
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", false);
    }

    @Test
    public void test08913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08913");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity18 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test08914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08914");
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
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList18 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test08915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08915");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", true);
    }

    @Test
    public void test08916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08916");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity14 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test08917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08917");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", false);
    }

    @Test
    public void test08918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08918");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity17 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08919");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity20 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test08920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08920");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity19 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test08921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08921");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", false);
    }

    @Test
    public void test08922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08922");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList14 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test08923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08923");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", true);
    }

    @Test
    public void test08924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08924");
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
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity14 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test08925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08925");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
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
        java.util.List<java.lang.String> strList13 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test08926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08926");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity13 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08927");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity13 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test08928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08928");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity20 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test08929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08929");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity10 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08930");
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
        deploymentEntityManager0.deleteDeployment("", false);
    }

    @Test
    public void test08931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08931");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList17 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test08932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08932");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", true);
    }

    @Test
    public void test08933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08933");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity13 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08934");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList11 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test08935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08935");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", true);
    }

    @Test
    public void test08936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08936");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", false);
    }

    @Test
    public void test08937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08937");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList18 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test08938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08938");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList19 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test08939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08939");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity19 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08940");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
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
    public void test08941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08941");
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
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity17 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08942");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList19 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test08943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08943");
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
        deploymentEntityManager0.deleteDeployment("hi!", false);
    }

    @Test
    public void test08944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08944");
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
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", true);
    }

    @Test
    public void test08945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08945");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", false);
    }

    @Test
    public void test08946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08946");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity17 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test08947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08947");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList23 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test08948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08948");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity16 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test08949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08949");
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
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", false);
    }

    @Test
    public void test08950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08950");
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
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", false);
    }

    @Test
    public void test08951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08951");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
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
        deploymentEntityManager0.deleteDeployment("", true);
    }

    @Test
    public void test08952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08952");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity20 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test08953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08953");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity13 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test08954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08954");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
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
        java.util.List<java.lang.String> strList17 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test08955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08955");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity18 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test08956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08956");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList18 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test08957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08957");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", true);
    }

    @Test
    public void test08958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08958");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList20 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test08959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08959");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList20 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test08960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08960");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity16 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test08961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08961");
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
        deploymentEntityManager0.deleteDeployment("", true);
    }

    @Test
    public void test08962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08962");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity14 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test08963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08963");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", false);
    }

    @Test
    public void test08964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08964");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity13 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test08965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08965");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", false);
    }

    @Test
    public void test08966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08966");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity13 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test08967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08967");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity13 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test08968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08968");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList15 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test08969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08969");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", false);
    }

    @Test
    public void test08970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08970");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity19 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test08971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08971");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity20 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08972");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList12 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test08973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08973");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity19 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08974");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList20 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test08975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08975");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
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
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity14 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test08976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08976");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity15 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08977");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity17 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test08978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08978");
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
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity14 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08979");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity19 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test08980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08980");
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
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList19 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test08981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08981");
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
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity18 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08982");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity16 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test08983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08983");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", true);
    }

    @Test
    public void test08984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08984");
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
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList17 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test08985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08985");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", true);
    }

    @Test
    public void test08986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08986");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity18 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test08987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08987");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList17 = deploymentEntityManager0.getDeploymentResourceNames("hi!");
    }

    @Test
    public void test08988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08988");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity16 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test08989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08989");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity15 = deploymentEntityManager0.findLatestDeploymentByName("");
    }

    @Test
    public void test08990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08990");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity20 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test08991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08991");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList20 = deploymentEntityManager0.getDeploymentResourceNames("");
    }

    @Test
    public void test08992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08992");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("", true);
    }

    @Test
    public void test08993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08993");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
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
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", true);
    }

    @Test
    public void test08994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08994");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity23 = deploymentEntityManager0.findDeploymentById("");
    }

    @Test
    public void test08995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08995");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity11 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test08996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08996");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        deploymentEntityManager0.deleteDeployment("hi!", true);
    }

    @Test
    public void test08997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08997");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity20 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test08998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08998");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity16 = deploymentEntityManager0.findLatestDeploymentByName("hi!");
    }

    @Test
    public void test08999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08999");
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
        deploymentEntityManager0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity15 = deploymentEntityManager0.findDeploymentById("hi!");
    }

    @Test
    public void test09000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test09000");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<java.lang.String> strList14 = deploymentEntityManager0.getDeploymentResourceNames("");
    }
}

