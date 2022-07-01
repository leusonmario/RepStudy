import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test02501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02501");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl13 = null;
        org.activiti.engine.impl.Page page14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList15 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl13, page14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02502");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        java.lang.Class<?> wildcardClass9 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test02503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02503");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl14 = null;
        org.activiti.engine.impl.Page page15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList16 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl14, page15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02504");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl13 = null;
        org.activiti.engine.impl.Page page14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList15 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl13, page14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02505");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02506");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject15 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02507");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl12 = null;
        org.activiti.engine.impl.Page page13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList14 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl12, page13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02508");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.db.PersistentObject persistentObject6 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02509");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity17 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insertDeployment(deploymentEntity17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02510");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList13 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap10, (int) (short) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02511");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02512");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList15 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap12, (int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02513");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject14 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02514");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02515");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList12 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap9, (int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02516");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02517");
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
        deploymentEntityManager0.flush();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02518");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList13 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap10, (int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02519");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02520");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl17 = null;
        org.activiti.engine.impl.Page page18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList19 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl17, page18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02521");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList13 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap10, (int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02522");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject10 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02523");
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
        java.lang.Class<?> wildcardClass16 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test02524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02524");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl14 = null;
        org.activiti.engine.impl.Page page15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList16 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl14, page15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02525");
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
        java.lang.Class<?> wildcardClass13 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test02526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02526");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02527");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02528");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject15 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02529");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl13 = null;
        org.activiti.engine.impl.Page page14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList15 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl13, page14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02530");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long5 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02531");
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
        java.lang.Class<?> wildcardClass11 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02532");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList12 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap9, (-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02533");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl9 = null;
        org.activiti.engine.impl.Page page10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList11 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl9, page10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02534");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02535");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02536");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl10 = null;
        org.activiti.engine.impl.Page page11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList12 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl10, page11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02537");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long15 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02538");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity15 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insertDeployment(deploymentEntity15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02539");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02540");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList17 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap14, (int) (byte) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02541");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long16 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02542");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList8 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap5, (int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02543");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02544");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        org.activiti.engine.impl.db.PersistentObject persistentObject9 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02545");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.db.PersistentObject persistentObject6 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02546");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02547");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        java.lang.Class<?> wildcardClass5 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test02548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02548");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long14 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02549");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl14 = null;
        org.activiti.engine.impl.Page page15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList16 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl14, page15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02550");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject11 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02551");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity16 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insertDeployment(deploymentEntity16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02552");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity13 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insertDeployment(deploymentEntity13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02553");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList18 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap15, (int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02554");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        org.activiti.engine.impl.db.PersistentObject persistentObject9 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02555");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl14 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long15 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02556");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject14 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02557");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl10 = null;
        org.activiti.engine.impl.Page page11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList12 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl10, page11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02558");
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
        deploymentEntityManager0.flush();
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity11 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insertDeployment(deploymentEntity11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02559");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList18 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap15, (int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02560");
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
        java.lang.Class<?> wildcardClass16 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test02561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02561");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        java.lang.Class<?> wildcardClass8 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test02562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02562");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long14 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02563");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl13 = null;
        org.activiti.engine.impl.Page page14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList15 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl13, page14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02564");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02565");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject14 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02566");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList16 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap13, (int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02567");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList14 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap11, (int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02568");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02569");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject11 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02570");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02571");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        org.activiti.engine.impl.db.PersistentObject persistentObject5 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02572");
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
        deploymentEntityManager0.close();
        org.activiti.engine.impl.db.PersistentObject persistentObject12 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02573");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.db.PersistentObject persistentObject8 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02574");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        org.activiti.engine.impl.db.PersistentObject persistentObject8 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02575");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl9 = null;
        org.activiti.engine.impl.Page page10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList11 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl9, page10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02576");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity12 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insertDeployment(deploymentEntity12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02577");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList12 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap9, (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02578");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl13 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long14 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02579");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject14 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02580");
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
        deploymentEntityManager0.flush();
        java.lang.Class<?> wildcardClass14 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test02581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02581");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList13 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap10, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02582");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02583");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList12 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap9, (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02584");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList5 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap2, 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02585");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList16 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap13, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02586");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList15 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap12, 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02587");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long15 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02588");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02589");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList14 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap11, (int) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02590");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject11 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02591");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity13 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insertDeployment(deploymentEntity13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02592");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList13 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap10, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02593");
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
        java.lang.Class<?> wildcardClass14 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test02594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02594");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.db.PersistentObject persistentObject9 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02595");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl14 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long15 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02596");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject14 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02597");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject10 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02598");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity14 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insertDeployment(deploymentEntity14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02599");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.db.PersistentObject persistentObject9 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02600");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject16 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02601");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity16 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insertDeployment(deploymentEntity16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02602");
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
        java.lang.Class<?> wildcardClass11 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02603");
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
        java.lang.Class<?> wildcardClass16 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test02604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02604");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02605");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02606");
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
        java.lang.Class<?> wildcardClass14 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test02607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02607");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList17 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap14, (int) (short) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02608");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02609");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        java.lang.Class<?> wildcardClass8 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test02610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02610");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList11 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap8, (int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02611");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02612");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList9 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap6, (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02613");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList10 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap7, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02614");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject10 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02615");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02616");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject10 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02617");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject13 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02618");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject14 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02619");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity7 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insertDeployment(deploymentEntity7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02620");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList14 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap11, (int) (byte) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02621");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity14 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insertDeployment(deploymentEntity14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02622");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList16 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap13, (int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02623");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity11 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insertDeployment(deploymentEntity11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02624");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long14 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02625");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList14 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap11, 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02626");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity14 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insertDeployment(deploymentEntity14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02627");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity9 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insertDeployment(deploymentEntity9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02628");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList11 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap8, (int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02629");
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
        deploymentEntityManager0.flush();
        org.activiti.engine.impl.db.PersistentObject persistentObject12 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02630");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02631");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02632");
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
        java.lang.Class<?> wildcardClass11 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02633");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl14 = null;
        org.activiti.engine.impl.Page page15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList16 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl14, page15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02634");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02635");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList15 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap12, (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02636");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList8 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap5, (int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02637");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject14 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02638");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject15 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02639");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject11 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02640");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl14 = null;
        org.activiti.engine.impl.Page page15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList16 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl14, page15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02641");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02642");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity9 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insertDeployment(deploymentEntity9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02643");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject12 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02644");
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
        java.lang.Class<?> wildcardClass11 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02645");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02646");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02647");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02648");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02649");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        org.activiti.engine.impl.db.PersistentObject persistentObject8 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02650");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity8 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insertDeployment(deploymentEntity8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02651");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList10 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap7, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02652");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList13 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap10, (int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02653");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02654");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList11 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap8, (int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02655");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject16 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02656");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        java.lang.Class<?> wildcardClass9 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test02657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02657");
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
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long20 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02658");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02659");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02660");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl14 = null;
        org.activiti.engine.impl.Page page15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList16 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl14, page15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02661");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList15 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap12, (int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02662");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject14 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02663");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity14 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insertDeployment(deploymentEntity14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02664");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject17 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02665");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.db.PersistentObject persistentObject7 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02666");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject10 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02667");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity13 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insertDeployment(deploymentEntity13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02668");
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
        java.lang.Class<?> wildcardClass14 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test02669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02669");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long14 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02670");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long14 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02671");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02672");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList9 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap6, (int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02673");
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
        java.lang.Class<?> wildcardClass10 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test02674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02674");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long16 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02675");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02676");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject15 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02677");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.db.PersistentObject persistentObject8 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02678");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList11 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap8, (int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02679");
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
        java.lang.Class<?> wildcardClass10 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test02680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02680");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity13 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insertDeployment(deploymentEntity13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02681");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList16 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap13, (int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02682");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl14 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long15 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02683");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject14 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02684");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject18 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02685");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList12 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap9, 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02686");
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
        java.lang.Class<?> wildcardClass13 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test02687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02687");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02688");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl12 = null;
        org.activiti.engine.impl.Page page13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList14 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl12, page13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02689");
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
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList16 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap13, (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02690");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long14 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02691");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList11 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap8, (int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02692");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl15 = null;
        org.activiti.engine.impl.Page page16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList17 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl15, page16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02693");
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
        java.lang.Class<?> wildcardClass11 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02694");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList10 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap7, (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02695");
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
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList17 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap14, (int) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02696");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList17 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap14, (int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02697");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long17 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02698");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList17 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap14, (int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02699");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02700");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        org.activiti.engine.impl.db.PersistentObject persistentObject7 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02701");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList19 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap16, (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02702");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity11 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insertDeployment(deploymentEntity11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02703");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject12 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02704");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.db.PersistentObject persistentObject7 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02705");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        java.lang.Class<?> wildcardClass8 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test02706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02706");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList18 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap15, (int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02707");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList12 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap9, (int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02708");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList13 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap10, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02709");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject10 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02710");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02711");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject15 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02712");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        org.activiti.engine.impl.db.PersistentObject persistentObject6 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02713");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject11 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02714");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        org.activiti.engine.impl.db.PersistentObject persistentObject9 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02715");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02716");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        org.activiti.engine.impl.db.PersistentObject persistentObject8 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02717");
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
        java.lang.Class<?> wildcardClass16 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test02718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02718");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity7 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insertDeployment(deploymentEntity7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02719");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList14 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap11, (-1), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02720");
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
        java.lang.Class<?> wildcardClass15 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test02721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02721");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02722");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02723");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl14 = null;
        org.activiti.engine.impl.Page page15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList16 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl14, page15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02724");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject15 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02725");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02726");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02727");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject13 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02728");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject10 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02729");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList21 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap18, (int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02730");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject11 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02731");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02732");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02733");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject10 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02734");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long18 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02735");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long14 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02736");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList13 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap10, (int) '4', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02737");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02738");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList12 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap9, (int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02739");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02740");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02741");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject15 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02742");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList15 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap12, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02743");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList7 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap4, (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02744");
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
        java.lang.Class<?> wildcardClass12 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test02745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02745");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject16 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02746");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject16 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02747");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity13 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insertDeployment(deploymentEntity13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02748");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity16 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insertDeployment(deploymentEntity16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02749");
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
        java.lang.Class<?> wildcardClass14 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test02750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02750");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject11 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02751");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject11 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02752");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList17 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap14, 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02753");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02754");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList11 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap8, (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02755");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject11 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02756");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject18 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02757");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList15 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap12, (int) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02758");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl15 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long16 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02759");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject12 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02760");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList18 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap15, 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02761");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity14 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insertDeployment(deploymentEntity14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02762");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject10 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02763");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl13 = null;
        org.activiti.engine.impl.Page page14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList15 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl13, page14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02764");
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
        java.lang.Class<?> wildcardClass11 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02765");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02766");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject10 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02767");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList17 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap14, 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02768");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity16 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insertDeployment(deploymentEntity16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02769");
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
        java.lang.Class<?> wildcardClass15 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test02770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02770");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl15 = null;
        org.activiti.engine.impl.Page page16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList17 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl15, page16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02771");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject13 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02772");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02773");
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
        java.lang.Class<?> wildcardClass15 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test02774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02774");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity13 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insertDeployment(deploymentEntity13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02775");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject11 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02776");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.db.PersistentObject persistentObject6 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02777");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject16 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02778");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList20 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap17, (int) (byte) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02779");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity10 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insertDeployment(deploymentEntity10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02780");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList18 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap15, (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02781");
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
        deploymentEntityManager0.close();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl14 = null;
        org.activiti.engine.impl.Page page15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList16 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl14, page15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02782");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02783");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject11 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02784");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long16 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02785");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02786");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        org.activiti.engine.impl.db.PersistentObject persistentObject7 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02787");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02788");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject15 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02789");
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
        deploymentEntityManager0.close();
        org.activiti.engine.impl.db.PersistentObject persistentObject13 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02790");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList9 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap6, (-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02791");
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
        java.lang.Class<?> wildcardClass11 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02792");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        java.lang.Class<?> wildcardClass9 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test02793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02793");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.db.PersistentObject persistentObject8 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02794");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02795");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl8 = null;
        org.activiti.engine.impl.Page page9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList10 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl8, page9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02796");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject13 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02797");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity16 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insertDeployment(deploymentEntity16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02798");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList14 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap11, (int) ' ', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02799");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList15 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap12, (int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02800");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02801");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02802");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.db.PersistentObject persistentObject7 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02803");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl14 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long15 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02804");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        java.lang.Class<?> wildcardClass8 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test02805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02805");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02806");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.db.PersistentObject persistentObject9 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02807");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl17 = null;
        org.activiti.engine.impl.Page page18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList19 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl17, page18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02808");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList18 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap15, (int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02809");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject11 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02810");
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
        java.lang.Class<?> wildcardClass11 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02811");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long14 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02812");
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
        java.lang.Class<?> wildcardClass13 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test02813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02813");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long14 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02814");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject17 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02815");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject10 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02816");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02817");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject12 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02818");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl13 = null;
        org.activiti.engine.impl.Page page14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList15 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl13, page14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02819");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        org.activiti.engine.impl.db.PersistentObject persistentObject9 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02820");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject16 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02821");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl8 = null;
        org.activiti.engine.impl.Page page9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList10 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl8, page9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02822");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl9 = null;
        org.activiti.engine.impl.Page page10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList11 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl9, page10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02823");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject14 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02824");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        java.lang.Class<?> wildcardClass9 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test02825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02825");
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
        java.lang.Class<?> wildcardClass14 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test02826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02826");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity9 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insertDeployment(deploymentEntity9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02827");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl15 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long16 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02828");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject19 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02829");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity17 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insertDeployment(deploymentEntity17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02830");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject12 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02831");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject12 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02832");
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
        java.lang.Class<?> wildcardClass17 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test02833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02833");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl13 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long14 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02834");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl12 = null;
        org.activiti.engine.impl.Page page13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList14 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl12, page13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02835");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl13 = null;
        org.activiti.engine.impl.Page page14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList15 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl13, page14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02836");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject17 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02837");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02838");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject10 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02839");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long16 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02840");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl12 = null;
        org.activiti.engine.impl.Page page13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList14 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl12, page13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02841");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl8 = null;
        org.activiti.engine.impl.Page page9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList10 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl8, page9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02842");
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
        java.lang.Class<?> wildcardClass11 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02843");
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
        java.lang.Class<?> wildcardClass16 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test02844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02844");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject10 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02845");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl13 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long14 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02846");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl11 = null;
        org.activiti.engine.impl.Page page12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList13 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl11, page12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02847");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList15 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap12, (int) (byte) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02848");
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
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList17 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap14, (int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02849");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02850");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02851");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.db.PersistentObject persistentObject8 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02852");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl15 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long16 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02853");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject12 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02854");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02855");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl14 = null;
        org.activiti.engine.impl.Page page15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList16 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl14, page15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02856");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity11 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insertDeployment(deploymentEntity11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02857");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        org.activiti.engine.impl.db.PersistentObject persistentObject7 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02858");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject13 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02859");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject14 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02860");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02861");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList17 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap14, (int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02862");
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
        java.lang.Class<?> wildcardClass16 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test02863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02863");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList17 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap14, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02864");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject13 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02865");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl13 = null;
        org.activiti.engine.impl.Page page14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList15 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl13, page14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02866");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long15 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02867");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02868");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl14 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long15 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02869");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02870");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity9 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insertDeployment(deploymentEntity9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02871");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02872");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList15 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap12, (int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02873");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList15 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap12, (int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02874");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl17 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long18 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02875");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList15 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap12, (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02876");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        org.activiti.engine.impl.db.PersistentObject persistentObject7 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02877");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject13 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02878");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl11 = null;
        org.activiti.engine.impl.Page page12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList13 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl11, page12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02879");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity9 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insertDeployment(deploymentEntity9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02880");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList12 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap9, (int) (byte) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02881");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList18 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap15, 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02882");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity15 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insertDeployment(deploymentEntity15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02883");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject11 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02884");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl14 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long15 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02885");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject13 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02886");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl14 = null;
        org.activiti.engine.impl.Page page15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList16 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl14, page15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02887");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject10 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02888");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject11 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02889");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl12 = null;
        org.activiti.engine.impl.Page page13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList14 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl12, page13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02890");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        java.lang.Class<?> wildcardClass8 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test02891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02891");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject10 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02892");
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
        deploymentEntityManager0.close();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl14 = null;
        org.activiti.engine.impl.Page page15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList16 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl14, page15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02893");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl18 = null;
        org.activiti.engine.impl.Page page19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList20 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl18, page19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02894");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl13 = null;
        org.activiti.engine.impl.Page page14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList15 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl13, page14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02895");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity15 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insertDeployment(deploymentEntity15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02896");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList14 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap11, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02897");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity14 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insertDeployment(deploymentEntity14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02898");
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
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList17 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap14, 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02899");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl19 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long20 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02900");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity12 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insertDeployment(deploymentEntity12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02901");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity13 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insertDeployment(deploymentEntity13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02902");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl8 = null;
        org.activiti.engine.impl.Page page9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList10 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl8, page9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02903");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.db.PersistentObject persistentObject8 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02904");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl15 = null;
        org.activiti.engine.impl.Page page16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList17 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl15, page16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02905");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02906");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject14 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02907");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject15 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02908");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        java.lang.Class<?> wildcardClass9 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test02909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02909");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject11 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02910");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject14 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02911");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject10 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02912");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject17 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02913");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02914");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        java.lang.Class<?> wildcardClass9 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test02915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02915");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList15 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap12, (int) (short) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02916");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList21 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap18, (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02917");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList15 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap12, 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02918");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList14 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap11, (int) ' ', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02919");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long14 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02920");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02921");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl4 = null;
        org.activiti.engine.impl.Page page5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList6 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl4, page5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02922");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList15 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap12, (int) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02923");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject11 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02924");
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
        java.lang.Class<?> wildcardClass15 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test02925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02925");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl9 = null;
        org.activiti.engine.impl.Page page10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList11 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl9, page10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02926");
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
        java.lang.Class<?> wildcardClass13 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test02927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02927");
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
        java.lang.Class<?> wildcardClass13 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test02928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02928");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02929");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02930");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList17 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap14, 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02931");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl15 = null;
        org.activiti.engine.impl.Page page16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList17 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl15, page16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02932");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList16 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap13, (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02933");
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
        java.lang.Class<?> wildcardClass13 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test02934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02934");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList11 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap8, (int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02935");
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
        deploymentEntityManager0.close();
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity14 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insertDeployment(deploymentEntity14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02936");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02937");
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
        java.lang.Class<?> wildcardClass14 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test02938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02938");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList12 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap9, (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02939");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl13 = null;
        org.activiti.engine.impl.Page page14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList15 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl13, page14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02940");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl7 = null;
        org.activiti.engine.impl.Page page8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList9 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl7, page8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02941");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject13 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02942");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02943");
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
        java.lang.Class<?> wildcardClass12 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test02944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02944");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long15 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02945");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02946");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList19 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap16, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02947");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList17 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap14, 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02948");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity12 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insertDeployment(deploymentEntity12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02949");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02950");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject15 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02951");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02952");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl16 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long17 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02953");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject17 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02954");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        java.lang.Class<?> wildcardClass8 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test02955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02955");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject10 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02956");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl8 = null;
        org.activiti.engine.impl.Page page9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList10 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl8, page9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02957");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl11 = null;
        org.activiti.engine.impl.Page page12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList13 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl11, page12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02958");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject10 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02959");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject10 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02960");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02961");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList14 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap11, (int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02962");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02963");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.db.PersistentObject persistentObject7 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02964");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02965");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject12 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02966");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject13 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02967");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl12 = null;
        org.activiti.engine.impl.Page page13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList14 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl12, page13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02968");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject10 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02969");
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
        deploymentEntityManager0.flush();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl12 = null;
        org.activiti.engine.impl.Page page13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList14 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl12, page13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02970");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02971");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
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
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02972");
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
        deploymentEntityManager0.flush();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl14 = null;
        org.activiti.engine.impl.Page page15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList16 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl14, page15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02973");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long14 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02974");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl8 = null;
        org.activiti.engine.impl.Page page9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList10 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl8, page9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02975");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity14 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insertDeployment(deploymentEntity14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02976");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl9 = null;
        org.activiti.engine.impl.Page page10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList11 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl9, page10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02977");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl15 = null;
        org.activiti.engine.impl.Page page16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList17 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl15, page16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02978");
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
        java.lang.Class<?> wildcardClass11 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02979");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject11 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02980");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl12 = null;
        org.activiti.engine.impl.Page page13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList14 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl12, page13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02981");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl11 = null;
        org.activiti.engine.impl.Page page12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList13 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl11, page12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02982");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList17 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap14, (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02983");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long14 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02984");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject10 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02985");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl6 = null;
        org.activiti.engine.impl.Page page7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList8 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl6, page7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02986");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        java.lang.Class<?> wildcardClass9 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test02987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02987");
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
        deploymentEntityManager0.flush();
        org.activiti.engine.impl.db.PersistentObject persistentObject12 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02988");
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
        deploymentEntityManager0.flush();
        org.activiti.engine.impl.db.PersistentObject persistentObject14 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02989");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity15 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insertDeployment(deploymentEntity15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02990");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02991");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl17 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long18 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02992");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject12 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02993");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        org.activiti.engine.impl.db.PersistentObject persistentObject8 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02994");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02995");
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
        java.lang.Class<?> wildcardClass12 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test02996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02996");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity12 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insertDeployment(deploymentEntity12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02997");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl12 = null;
        org.activiti.engine.impl.Page page13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList14 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl12, page13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02998");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList17 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap14, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02999");
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
        java.lang.Class<?> wildcardClass11 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test03000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test03000");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity15 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insertDeployment(deploymentEntity15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }
}

