import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest58 {

    public static boolean debug = false;

    @Test
    public void test29001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29001");
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
    public void test29002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29002");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList12 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap9, (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29003");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        java.lang.Class<?> wildcardClass13 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test29004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29004");
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
    public void test29005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29005");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList20 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap17, 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29006");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList12 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap9, 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29007");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
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
    public void test29008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29008");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
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
    public void test29009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29009");
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
    public void test29010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29010");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList19 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap16, (int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29011");
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
    public void test29012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29012");
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
    public void test29013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29013");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList23 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap20, (int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29014");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
    }

    @Test
    public void test29015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29015");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList15 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap12, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29016");
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
    public void test29017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29017");
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
        deploymentEntityManager0.flush();
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
    public void test29018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29018");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
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
    public void test29019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29019");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList13 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap10, (int) (byte) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29020");
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
        deploymentEntityManager0.close();
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
    public void test29021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29021");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        java.lang.Class<?> wildcardClass20 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test29022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29022");
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
        deploymentEntityManager0.flush();
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
    public void test29023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29023");
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
        deploymentEntityManager0.flush();
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
    public void test29024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29024");
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
    public void test29025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29025");
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
    public void test29026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29026");
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
    public void test29027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29027");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList14 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap11, (int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29028");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
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
    public void test29029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29029");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        java.lang.Class<?> wildcardClass19 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test29030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29030");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl19 = null;
        org.activiti.engine.impl.Page page20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList21 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl19, page20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29031");
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
    public void test29032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29032");
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
        java.lang.Class<?> wildcardClass16 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test29033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29033");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList19 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap16, 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29034");
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
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity18 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insertDeployment(deploymentEntity18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29035");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        java.lang.Class<?> wildcardClass15 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test29036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29036");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
    }

    @Test
    public void test29037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29037");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList28 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap25, (int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29038");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl20 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long21 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29039");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl19 = null;
        org.activiti.engine.impl.Page page20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList21 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl19, page20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29040");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList22 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap19, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29041");
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
    public void test29042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29042");
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
    public void test29043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29043");
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
    public void test29044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29044");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl20 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long21 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29045");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity18 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insertDeployment(deploymentEntity18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29046");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
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
    public void test29047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29047");
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
    public void test29048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29048");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity21 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insertDeployment(deploymentEntity21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29049");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList22 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap19, (int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29050");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
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
    public void test29051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29051");
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
    public void test29052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29052");
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
    public void test29053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29053");
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
    public void test29054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29054");
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
        deploymentEntityManager0.close();
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
    public void test29055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29055");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
    }

    @Test
    public void test29056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29056");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
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
    public void test29057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29057");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList15 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap12, 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29058");
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
    public void test29059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29059");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
    }

    @Test
    public void test29060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29060");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
    }

    @Test
    public void test29061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29061");
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
    public void test29062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29062");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList25 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap22, (int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29063");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
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
    public void test29064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29064");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList13 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap10, (int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29065");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
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
    public void test29066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29066");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList21 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap18, (int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29067");
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
        deploymentEntityManager0.close();
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
    public void test29068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29068");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        java.lang.Class<?> wildcardClass14 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test29069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29069");
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
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList21 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap18, (int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29070");
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
        deploymentEntityManager0.close();
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
    public void test29071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29071");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        org.activiti.engine.impl.db.PersistentObject persistentObject24 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29072");
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
        deploymentEntityManager0.flush();
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
    public void test29073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29073");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList21 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap18, 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29074");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
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
    public void test29075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29075");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList22 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap19, (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29076");
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
    public void test29077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29077");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList25 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap22, (int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29078");
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
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList19 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap16, (int) (short) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29079");
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
    public void test29080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29080");
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
    public void test29081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29081");
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
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList20 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap17, (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29082");
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
        deploymentEntityManager0.flush();
        java.lang.Class<?> wildcardClass17 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test29083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29083");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
    }

    @Test
    public void test29084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29084");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList15 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap12, (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29085");
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
        deploymentEntityManager0.flush();
        java.lang.Class<?> wildcardClass16 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test29086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29086");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
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
    public void test29087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29087");
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
        deploymentEntityManager0.flush();
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
    public void test29088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29088");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
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
    public void test29089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29089");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
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
    public void test29090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29090");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList10 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap7, (int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29091");
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
    public void test29092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29092");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
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
    public void test29093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29093");
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
    public void test29094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29094");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
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
    public void test29095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29095");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        java.lang.Class<?> wildcardClass12 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test29096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29096");
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
        deploymentEntityManager0.flush();
        java.lang.Class<?> wildcardClass14 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test29097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29097");
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
        java.lang.Class<?> wildcardClass23 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test29098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29098");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        java.lang.Class<?> wildcardClass17 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test29099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29099");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList25 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap22, (int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29100");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl22 = null;
        org.activiti.engine.impl.Page page23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList24 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl22, page23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29101");
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
    public void test29102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29102");
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
    public void test29103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29103");
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
        deploymentEntityManager0.close();
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
    public void test29104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29104");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        java.lang.Class<?> wildcardClass20 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test29105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29105");
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
        deploymentEntityManager0.flush();
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
    public void test29106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29106");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
    }

    @Test
    public void test29107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29107");
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
        deploymentEntityManager0.close();
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
    public void test29108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29108");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList11 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap8, (int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29109");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
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
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList15 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap12, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29110");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList22 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap19, 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29111");
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
    public void test29112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29112");
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
        deploymentEntityManager0.flush();
        java.lang.Class<?> wildcardClass21 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test29113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29113");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList10 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap7, (int) (short) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29114");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList28 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap25, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29115");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList15 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap12, (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29116");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
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
    public void test29117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29117");
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
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long21 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29118");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl21 = null;
        org.activiti.engine.impl.Page page22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList23 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl21, page22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29119");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
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
    public void test29120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29120");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        java.lang.Class<?> wildcardClass17 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test29121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29121");
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
    public void test29122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29122");
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

    @Test
    public void test29123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29123");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList16 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap13, (int) (byte) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29124");
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
    public void test29125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29125");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        org.activiti.engine.impl.db.PersistentObject persistentObject20 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29126");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList19 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap16, 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29127");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
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
    public void test29128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29128");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        java.lang.Class<?> wildcardClass25 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test29129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29129");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
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
    public void test29130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29130");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
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
    public void test29131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29131");
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
        deploymentEntityManager0.close();
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
    public void test29132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29132");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long22 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29133");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
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
    }

    @Test
    public void test29134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29134");
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
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList11 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap8, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29135");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
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
    public void test29136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29136");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
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
    public void test29137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29137");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
    }

    @Test
    public void test29138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29138");
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
        deploymentEntityManager0.close();
        java.lang.Class<?> wildcardClass15 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test29139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29139");
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
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList17 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap14, 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29140");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        java.lang.Class<?> wildcardClass18 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test29141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29141");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.db.PersistentObject persistentObject20 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29142");
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
        deploymentEntityManager0.flush();
        java.lang.Class<?> wildcardClass22 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test29143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29143");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
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
    public void test29144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29144");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
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

    @Test
    public void test29145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29145");
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
        org.activiti.engine.impl.db.PersistentObject persistentObject20 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29146");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        java.lang.Class<?> wildcardClass18 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test29147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29147");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList28 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap25, (int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29148");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
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
    public void test29149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29149");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList23 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap20, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29150");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
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
    public void test29151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29151");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl16 = null;
        org.activiti.engine.impl.Page page17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList18 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl16, page17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29152");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long19 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29153");
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
    public void test29154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29154");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList24 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap21, (int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29155");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
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
    public void test29156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29156");
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
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList25 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap22, (int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29157");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList18 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap15, (int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29158");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
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
    public void test29159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29159");
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
    public void test29160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29160");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
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
        java.lang.Class<?> wildcardClass14 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test29161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29161");
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
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList20 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap17, (int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29162");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
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
    public void test29163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29163");
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
    public void test29164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29164");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
    }

    @Test
    public void test29165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29165");
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
    public void test29166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29166");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        java.lang.Class<?> wildcardClass20 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test29167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29167");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
    }

    @Test
    public void test29168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29168");
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
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList20 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap17, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29169");
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
        deploymentEntityManager0.flush();
        java.lang.Class<?> wildcardClass20 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test29170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29170");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        java.lang.Class<?> wildcardClass20 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test29171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29171");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
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
    public void test29172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29172");
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
        deploymentEntityManager0.flush();
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
    public void test29173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29173");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        org.activiti.engine.impl.db.PersistentObject persistentObject21 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29174");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList21 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap18, (-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29175");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        java.lang.Class<?> wildcardClass19 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test29176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29176");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl20 = null;
        org.activiti.engine.impl.Page page21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList22 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl20, page21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29177");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
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
    public void test29178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29178");
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
        deploymentEntityManager0.close();
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
    public void test29179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29179");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
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
    public void test29180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29180");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList18 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap15, (int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29181");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
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
    public void test29182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29182");
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
    public void test29183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29183");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList24 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap21, (int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29184");
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
        deploymentEntityManager0.flush();
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
    public void test29185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29185");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList19 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap16, (int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29186");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        java.lang.Class<?> wildcardClass20 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test29187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29187");
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
    public void test29188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29188");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity18 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insertDeployment(deploymentEntity18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29189");
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
    public void test29190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29190");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList18 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap15, (int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29191");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long19 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29192");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.db.PersistentObject persistentObject19 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29193");
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
    public void test29194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29194");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
    }

    @Test
    public void test29195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29195");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl18 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long19 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29196");
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
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList17 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap14, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29197");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList22 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap19, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29198");
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
    public void test29199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29199");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList24 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap21, (int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29200");
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
    public void test29201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29201");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity22 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insertDeployment(deploymentEntity22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29202");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList15 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap12, (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29203");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList23 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap20, 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29204");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl21 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long22 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29205");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList17 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap14, (int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29206");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        java.lang.Class<?> wildcardClass10 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test29207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29207");
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
    public void test29208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29208");
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
        deploymentEntityManager0.close();
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
    public void test29209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29209");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList24 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap21, (int) ' ', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29210");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList19 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap16, (int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29211");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
    }

    @Test
    public void test29212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29212");
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
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList17 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap14, (int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29213");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
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
    public void test29214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29214");
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
    public void test29215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29215");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long22 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29216");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList20 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap17, 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29217");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList24 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap21, (int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29218");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        org.activiti.engine.impl.db.PersistentObject persistentObject21 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29219");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
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

    @Test
    public void test29220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29220");
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
    public void test29221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29221");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList21 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap18, (int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29222");
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
    public void test29223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29223");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
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
    public void test29224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29224");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        java.lang.Class<?> wildcardClass14 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test29225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29225");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList23 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap20, (int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29226");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity21 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insertDeployment(deploymentEntity21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29227");
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
    public void test29228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29228");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
    }

    @Test
    public void test29229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29229");
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
        deploymentEntityManager0.close();
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
    public void test29230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29230");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
    }

    @Test
    public void test29231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29231");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
    }

    @Test
    public void test29232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29232");
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
    public void test29233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29233");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        java.lang.Class<?> wildcardClass25 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test29234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29234");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList19 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap16, (int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29235");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        java.lang.Class<?> wildcardClass21 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test29236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29236");
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
    public void test29237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29237");
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
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList17 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap14, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29238");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
    }

    @Test
    public void test29239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29239");
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
    public void test29240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29240");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl16 = null;
        org.activiti.engine.impl.Page page17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList18 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl16, page17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29241");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        java.lang.Class<?> wildcardClass19 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test29242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29242");
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
        deploymentEntityManager0.flush();
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
    public void test29243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29243");
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
    public void test29244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29244");
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
    public void test29245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29245");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl18 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long19 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29246");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        java.lang.Class<?> wildcardClass21 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test29247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29247");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity21 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insertDeployment(deploymentEntity21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29248");
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
    public void test29249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29249");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
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
    public void test29250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29250");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList23 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap20, (int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29251");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList21 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap18, 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29252");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity24 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insertDeployment(deploymentEntity24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29253");
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
    public void test29254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29254");
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
    public void test29255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29255");
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
    public void test29256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29256");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long21 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29257");
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
    public void test29258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29258");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
    }

    @Test
    public void test29259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29259");
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
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList20 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap17, (int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29260");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        java.lang.Class<?> wildcardClass16 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test29261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29261");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList20 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap17, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29262");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList21 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap18, (int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29263");
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
    public void test29264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29264");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
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
    public void test29265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29265");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        java.lang.Class<?> wildcardClass17 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test29266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29266");
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
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList18 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap15, (-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29267");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
    }

    @Test
    public void test29268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29268");
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
    public void test29269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29269");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
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
    public void test29270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29270");
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
    public void test29271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29271");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList21 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap18, (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29272");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        java.lang.Class<?> wildcardClass12 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test29273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29273");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
    }

    @Test
    public void test29274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29274");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
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
        deploymentEntityManager0.flush();
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
    public void test29275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29275");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl21 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long22 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29276");
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
        deploymentEntityManager0.flush();
        java.lang.Class<?> wildcardClass13 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test29277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29277");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long21 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29278");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList21 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap18, (int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29279");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList25 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap22, (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29280");
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
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList21 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap18, (int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29281");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.db.PersistentObject persistentObject23 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29282");
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
    public void test29283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29283");
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
    public void test29284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29284");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList11 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap8, (int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29285");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
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
        deploymentEntityManager0.close();
        java.lang.Class<?> wildcardClass12 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test29286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29286");
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
    public void test29287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29287");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        java.lang.Class<?> wildcardClass19 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test29288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29288");
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
    public void test29289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29289");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
    }

    @Test
    public void test29290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29290");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl18 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long19 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29291");
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
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList18 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap15, (int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29292");
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
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList20 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap17, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29293");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
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
    public void test29294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29294");
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
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList11 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap8, (int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29295");
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
    public void test29296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29296");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
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
    public void test29297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29297");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList22 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap19, 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29298");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList17 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap14, (int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29299");
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
        deploymentEntityManager0.flush();
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity20 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insertDeployment(deploymentEntity20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29300");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
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
    public void test29301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29301");
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
    public void test29302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29302");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
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
    public void test29303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29303");
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
    public void test29304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29304");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        java.lang.Class<?> wildcardClass10 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test29305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29305");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList22 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap19, (int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29306");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        java.lang.Class<?> wildcardClass10 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test29307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29307");
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
        deploymentEntityManager0.flush();
        java.lang.Class<?> wildcardClass17 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test29308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29308");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
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
    public void test29309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29309");
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
        deploymentEntityManager0.flush();
    }

    @Test
    public void test29310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29310");
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
    public void test29311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29311");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
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
        deploymentEntityManager0.close();
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
    public void test29312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29312");
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
    public void test29313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29313");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList17 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap14, (int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29314");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        java.lang.Class<?> wildcardClass20 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test29315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29315");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
    }

    @Test
    public void test29316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29316");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
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
    public void test29317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29317");
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
    public void test29318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29318");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
    }

    @Test
    public void test29319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29319");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
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
    public void test29320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29320");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
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
    public void test29321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29321");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        org.activiti.engine.impl.db.PersistentObject persistentObject19 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29322");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        java.lang.Class<?> wildcardClass9 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test29323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29323");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl16 = null;
        org.activiti.engine.impl.Page page17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList18 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl16, page17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29324");
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
        deploymentEntityManager0.flush();
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
    public void test29325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29325");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
    }

    @Test
    public void test29326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29326");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
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
    public void test29327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29327");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList21 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap18, (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29328");
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
    public void test29329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29329");
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
    public void test29330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29330");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        java.lang.Class<?> wildcardClass17 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test29331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29331");
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
        deploymentEntityManager0.flush();
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
    public void test29332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29332");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
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
    public void test29333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29333");
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
        deploymentEntityManager0.flush();
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
    public void test29334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29334");
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
    public void test29335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29335");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        org.activiti.engine.impl.db.PersistentObject persistentObject19 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29336");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl22 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long23 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29337");
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
    public void test29338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29338");
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
        deploymentEntityManager0.close();
        java.lang.Class<?> wildcardClass22 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test29339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29339");
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
    public void test29340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29340");
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
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList21 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap18, (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29341");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl21 = null;
        org.activiti.engine.impl.Page page22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList23 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl21, page22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29342");
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
    public void test29343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29343");
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
    public void test29344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29344");
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
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl21 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long22 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29345");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl19 = null;
        org.activiti.engine.impl.Page page20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList21 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl19, page20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29346");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList11 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap8, (int) (short) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29347");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        java.lang.Class<?> wildcardClass10 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test29348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29348");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
    }

    @Test
    public void test29349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29349");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList12 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap9, (int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29350");
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
    public void test29351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29351");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
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
    public void test29352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29352");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        org.activiti.engine.impl.db.PersistentObject persistentObject20 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29353");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl19 = null;
        org.activiti.engine.impl.Page page20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList21 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl19, page20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29354");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        org.activiti.engine.impl.db.PersistentObject persistentObject24 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29355");
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
    public void test29356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29356");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
    }

    @Test
    public void test29357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29357");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity21 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insertDeployment(deploymentEntity21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29358");
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
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long19 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29359");
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
    public void test29360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29360");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList21 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap18, (int) (byte) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29361");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long23 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29362");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList15 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap12, (int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29363");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.db.PersistentObject persistentObject21 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29364");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
    }

    @Test
    public void test29365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29365");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        java.lang.Class<?> wildcardClass18 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test29366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29366");
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
    public void test29367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29367");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity23 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insertDeployment(deploymentEntity23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29368");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
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
        java.lang.Class<?> wildcardClass11 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test29369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29369");
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
    public void test29370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29370");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList14 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap11, (int) (short) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29371");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long25 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29372");
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
    public void test29373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29373");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
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
    public void test29374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29374");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl18 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long19 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29375");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        org.activiti.engine.impl.db.PersistentObject persistentObject21 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29376");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        java.lang.Class<?> wildcardClass22 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test29377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29377");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        java.lang.Class<?> wildcardClass17 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test29378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29378");
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
    public void test29379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29379");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList16 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap13, (int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29380");
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
    public void test29381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29381");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl20 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long21 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29382");
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
    public void test29383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29383");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
    }

    @Test
    public void test29384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29384");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList22 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap19, (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29385");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
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
    public void test29386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29386");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList17 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap14, (int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29387");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
    }

    @Test
    public void test29388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29388");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl21 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long22 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29389");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
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
        deploymentEntityManager0.close();
    }

    @Test
    public void test29390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29390");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long23 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29391");
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
    public void test29392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29392");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
    }

    @Test
    public void test29393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29393");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList17 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap14, (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29394");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        org.activiti.engine.impl.db.PersistentObject persistentObject24 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29395");
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
        deploymentEntityManager0.close();
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
    public void test29396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29396");
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
    public void test29397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29397");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        java.lang.Class<?> wildcardClass17 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test29398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29398");
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
        deploymentEntityManager0.close();
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
    public void test29399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29399");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList15 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap12, (int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29400");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList19 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap16, (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29401");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.db.PersistentObject persistentObject23 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29402");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList25 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap22, (int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29403");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
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
    public void test29404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29404");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList11 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap8, 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29405");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long23 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29406");
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
    public void test29407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29407");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
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
    public void test29408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29408");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
    }

    @Test
    public void test29409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29409");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList27 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap24, (int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29410");
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
        deploymentEntityManager0.flush();
        java.lang.Class<?> wildcardClass14 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test29411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29411");
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
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long19 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29412");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
    }

    @Test
    public void test29413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29413");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList25 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap22, (int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29414");
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
        deploymentEntityManager0.flush();
    }

    @Test
    public void test29415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29415");
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
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList18 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap15, (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29416");
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
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList20 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap17, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29417");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
    }

    @Test
    public void test29418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29418");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.db.PersistentObject persistentObject19 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29419");
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
        deploymentEntityManager0.close();
        org.activiti.engine.impl.db.PersistentObject persistentObject21 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29420");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        java.lang.Class<?> wildcardClass23 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test29421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29421");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList19 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap16, (int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29422");
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
        deploymentEntityManager0.close();
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
    public void test29423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29423");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList21 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap18, 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29424");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
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
    public void test29425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29425");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
    }

    @Test
    public void test29426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29426");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
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
    public void test29427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29427");
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
        java.lang.Class<?> wildcardClass19 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test29428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29428");
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
    public void test29429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29429");
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
        deploymentEntityManager0.close();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl23 = null;
        org.activiti.engine.impl.Page page24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList25 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl23, page24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29430");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList16 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap13, (int) '#', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29431");
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
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long21 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29432");
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
    public void test29433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29433");
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
    public void test29434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29434");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList20 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap17, (int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29435");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList12 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap9, (int) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29436");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
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
    public void test29437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29437");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        java.lang.Class<?> wildcardClass24 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test29438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29438");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        java.lang.Class<?> wildcardClass7 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test29439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29439");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        java.lang.Class<?> wildcardClass20 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test29440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29440");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList18 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap15, (int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29441");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList23 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap20, (int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29442");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList19 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap16, (int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29443");
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
    public void test29444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29444");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList19 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap16, (int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29445");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
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
    public void test29446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29446");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList22 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap19, (int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29447");
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
        deploymentEntityManager0.close();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl23 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long24 = deploymentEntityManager0.findDeploymentCountByQueryCriteria(deploymentQueryImpl23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29448");
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
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList18 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap15, (int) (short) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29449");
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
        deploymentEntityManager0.close();
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
    public void test29450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29450");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.db.PersistentObject persistentObject19 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29451");
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
        deploymentEntityManager0.close();
    }

    @Test
    public void test29452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29452");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long21 = deploymentEntityManager0.findDeploymentCountByNativeQuery(strMap20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29453");
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
        deploymentEntityManager0.flush();
    }

    @Test
    public void test29454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29454");
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
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList19 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap16, 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29455");
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
    public void test29456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29456");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
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
    public void test29457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29457");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl16 = null;
        org.activiti.engine.impl.Page page17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList18 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl16, page17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29458");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList20 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap17, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29459");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
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
    public void test29460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29460");
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
    public void test29461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29461");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList24 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap21, (int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29462");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList19 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap16, (int) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29463");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity22 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insertDeployment(deploymentEntity22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29464");
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
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList18 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap15, (-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29465");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        java.lang.Class<?> wildcardClass21 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test29466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29466");
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
    public void test29467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29467");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList18 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap15, (int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29468");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList24 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap21, (int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29469");
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
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList11 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap8, (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29470");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        java.lang.Class<?> wildcardClass9 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test29471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29471");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        java.lang.Class<?> wildcardClass14 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test29472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29472");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
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
    public void test29473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29473");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
    }

    @Test
    public void test29474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29474");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
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
    public void test29475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29475");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
    }

    @Test
    public void test29476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29476");
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
        deploymentEntityManager0.close();
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
    public void test29477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29477");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.DeploymentQueryImpl deploymentQueryImpl21 = null;
        org.activiti.engine.impl.Page page22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList23 = deploymentEntityManager0.findDeploymentsByQueryCriteria(deploymentQueryImpl21, page22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29478");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.db.PersistentObject persistentObject20 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.delete(persistentObject20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29479");
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
    public void test29480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29480");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        java.lang.Class<?> wildcardClass16 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test29481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29481");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        org.activiti.engine.impl.persistence.entity.DeploymentEntity deploymentEntity23 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insertDeployment(deploymentEntity23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29482");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
    }

    @Test
    public void test29483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29483");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
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
    public void test29484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29484");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
    }

    @Test
    public void test29485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29485");
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
    public void test29486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29486");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
    }

    @Test
    public void test29487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29487");
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
    public void test29488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29488");
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
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList16 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap13, 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29489");
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
        deploymentEntityManager0.close();
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
    public void test29490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29490");
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
    public void test29491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29491");
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
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        org.activiti.engine.impl.db.PersistentObject persistentObject19 = null;
        // The following exception was thrown during execution in test generation
        try {
            deploymentEntityManager0.insert(persistentObject19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29492");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList20 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap17, (int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29493");
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
        deploymentEntityManager0.flush();
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
    public void test29494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29494");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
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
    public void test29495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29495");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
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
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList14 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap11, (int) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29496");
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
        deploymentEntityManager0.close();
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
    public void test29497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29497");
        org.activiti.engine.impl.persistence.entity.DeploymentEntityManager deploymentEntityManager0 = new org.activiti.engine.impl.persistence.entity.DeploymentEntityManager();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.flush();
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
    public void test29498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29498");
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
        deploymentEntityManager0.close();
        deploymentEntityManager0.flush();
        deploymentEntityManager0.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.activiti.engine.repository.Deployment> deploymentList21 = deploymentEntityManager0.findDeploymentsByNativeQuery(strMap18, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29499");
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
    public void test29500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest58.test29500");
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
        deploymentEntityManager0.flush();
        java.lang.Class<?> wildcardClass13 = deploymentEntityManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }
}

